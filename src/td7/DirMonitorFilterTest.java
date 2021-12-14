package td7;

public class DirMonitorFilterTest {
	import static org.junit.Assert.assertEquals;

	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.util.Random;

	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;

	public class DirMonitorFilterTest {

		private Path tmpDir;

		@Before
		public void before() throws IOException {
			tmpDir = Files.createTempDirectory("listfiles-test");
		}

		@After
		public void after() {
			tmpDir = null;
		}

		@Test
		public void testRecentFilter() throws IOException, InterruptedException {
			final Path directory = Files.createTempDirectory(tmpDir, null);
			DirMonitor dm = new DirMonitor(directory);

			Path last = null;
			for(int i=0;i<5;++i) {
				if(new Random().nextBoolean()) {
					Path tmpFile = Files.createTempFile(directory, null, null);
					Files.write(tmpFile, new byte[105]);
					last = tmpFile;
				}
				else {
					Files.createTempFile(directory, null, null);
				}
				Thread.sleep(1000);
			}
			assertEquals(last, dm.mostRecent2(100)); //test que sur les fichiers d'au moins 100 octets
		}


		@Test
		public void testSizeFilter() throws IOException {
			final Path directory = Files.createTempDirectory(tmpDir, null);
			DirMonitor dm = new DirMonitor(directory);

			long sizes = 0;

			for(int i=0;i<60;++i) {
				int s = new Random().nextInt(200);
				Path tmpFile;
				if(s>=100) {
					tmpFile = Files.createTempFile(directory, "miage", null);
					sizes+=s;
				}
				else {
					tmpFile = Files.createTempFile(directory, null, null);				
				}
				
				Files.write(tmpFile, new byte[s]);
			}
			assertEquals(sizes, dm.sizeOfFiles2(100));	//test sur les fichiers d'au moins 100 octets
		}
	}