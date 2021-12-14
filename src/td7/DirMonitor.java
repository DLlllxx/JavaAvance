package td7;

public class DirMonitor {
	import java.io.File;
	import java.io.IOException;

	import java.util.Comparator;
	import java.util.Arrays;
	import java.util.Iterator;

	public class DirMonitor {
		
		private Path path;

		public DirMonitor(Path path) throws IOException {
			this.path = path;
			if(!Files.isReadable(path) || !Files.isDirectory(path)) {
				throw new IOException("Path can't be used");
			}
		}
		
		//inner class
//		public class PrefixFilter implements DirectoryStream.Filter<Path> {
//			private long size;
	//
//			public PrefixFilter(long size) {
//				this.size = size;
//			}
	//
//			@Override
//			public boolean accept(Path entry) throws IOException {
//				return entry.toFile().length() >= size;
//			}
//		}

		public void showAll() throws IOException{
			try (DirectoryStream<Path> ds = Files.newDirectoryStream(this.path)){
				Iterator<Path> iterator = ds.iterator();
				while (iterator.hasNext()) {
					Path p = iterator.next();
					System.out.println(p);
				}
			}
		}
		
		public void showAll2() throws IOException{
			final long minsize = 1;
			try (DirectoryStream<Path> ds = Files.newDirectoryStream(this.path, new DirectoryStream.Filter<Path>() {
				@Override
				public boolean accept(Path entry) throws IOException {
					return Files.size(entry) >= minsize;
				}
			})){
				Iterator<Path> iterator = ds.iterator();
				while (iterator.hasNext()) {
					Path p = iterator.next();
					System.out.println(p);
				}
			}
		}
		
		// Anonymous class
		public void showAll3(final long size) throws IOException{
			DirectoryStream<Path> paths = Files.newDirectoryStream(this.path);
			for(Path p : paths) {
				this.applyAction(p, new MyAction() {
					public void perform(Path path) throws IOException {
						// TODO Auto-generated method stub
							System.out.println(path);
					}

					@Override
					public Long valeur() {
						// TODO Auto-generated method stub
						return null;
					}
				}, size);
			}
		}
		
		public void applyAction(Path p, MyAction action, long size) throws IOException{
			if (Files.size(p)>= size) action.perform(p);
		}
		
		public long sizeOfFiles() throws IOException {
			long size = 0;
			DirectoryStream<Path> ds = Files.newDirectoryStream(this.path);
			for(Path p : ds) {
				size += Files.size(p);
			}
			return size;
		}

		public long sizeOfFiles2(final long minsize) throws IOException {
			MyAction ma = new MyAction(){
				
				long size;
				
				@Override
				public void perform(Path p) throws IOException {
					// TODO Auto-generated method stub
					size += Files.size(p);
				}
				
				public Long valeur() {			           
					return size;
				}
				 
			};
			
			DirectoryStream<Path> paths = Files.newDirectoryStream(this.path);
			for(Path p : paths) {
				this.applyAction(p, ma, minsize);
			}
			return (long) ma.valeur();
		}

//		public void mostRecent(File directory) {
//			File[] files = directory.listFiles();
//			Arrays.sort(files, new Comparator<File>() {
//				@Override
//				public int compare(File o1, File o2) {
	//
//					return (int)(o2.lastModified() - o1.lastModified());
//				}
//			});
//			System.out.println(files[0].getName());
//		}
		
		public Path mostRecent() throws IOException {
			File[] files = this.path.toFile().listFiles();
			Arrays.sort(files, new Comparator<File>() {
				
				@Override
				public int compare(File o1, File o2) {
					// TODO Auto-generated method stub
					return (int)(o2.lastModified() - o1.lastModified());
				}
				
			});
			return files[0].toPath();
		}
		
		public Path mostRecent2(long minsize) throws IOException {
			
			MyAction ma = new MyAction(){	
				File[] files = path.toFile().listFiles();
				@Override
				public void perform(Path p) throws IOException {
					// TODO Auto-generated method stub
					Arrays.sort(files, new Comparator<File>() {
						
						@Override
						public int compare(File o1, File o2) {
							// TODO Auto-generated method stub
							return (int)(o2.lastModified() - o1.lastModified());
						}	
					});
				}
						
				public Object valeur() {			           
					return files[0].toPath();
				}
			};
			return (Path) ma.valeur();
		}
		

		public Path getPath() {
			return path;
		}

		public void setPath(Path path) {
			this.path = path;
		}

	}