package td7;

public class DirMonitorTest {
	import static org.junit.Assert.assertEquals;

	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.util.Random;

	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;

	public class DirMonitorTest {

		private Path tmpDir;

		@Before
		public void before() throws IOException {
			tmpDir = Files.createTempDirectory("listfiles-test");
		}

		@After
		public void after() {
			tmpDir = null;
		}

		@Test(expected=IOException.class)
		public void testNotDir() throws IOException {
			Path notDir = Files.createTempFile(tmpDir, null, null);
			DirMonitor dm = new DirMonitor(notDir);
		}
		
		@Test
		public void testRecent() throws IOException, InterruptedException {
			final Path directory = Files.createTempDirectory(tmpDir, null);
			DirMonitor dm = new DirMonitor(directory);
			
			Path last = null;
			for(int i=0;i<6;++i) {
				Path tmpFile = Files.createTempFile(directory, null, null);
				last = tmpFile;
				Thread.sleep(1000);
			}
			
			assertEquals(last, dm.mostRecent());
		}
		
		
		@Test
		public void testSize() throws IOException {
			final Path directory = Files.createTempDirectory(tmpDir, null);
			DirMonitor dm = new DirMonitor(directory);
			
			long sizes = 0;
			
			for(int i=0;i<60;++i) {
				Path tmpFile = Files.createTempFile(directory, null, null);
				int s = new Random().nextInt(100);
				sizes+=s;
				Files.write(tmpFile, new byte[s]);
			}
			
			assertEquals(sizes, dm.sizeOfFiles());
		}

	}
