package org.apache.commons.compress.archivers.sevenz;

import java.io.File;

import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;

public class DumpAllEntries {
  public static void main(String[] args) throws Exception {
    long s = System.currentTimeMillis();
    SevenZFile z = new SevenZFile(new File(args[0]));
    System.out.println(z.archive);
    byte [] buf = new byte [1024 * 8];
    for (SevenZArchiveEntry e = z.getNextEntry(); e != null; e = z.getNextEntry()) {
      System.out.println(e.getName());
      
       int r;
       while ((r = z.read(buf)) > 0) {
       }
    }

    System.out.println("Time: " + (System.currentTimeMillis() - s));
  }
}
