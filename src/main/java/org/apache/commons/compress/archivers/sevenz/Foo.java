package org.apache.commons.compress.archivers.sevenz;

import java.io.File;

public class Foo {
  public static void main(String[] args) throws Exception {
    long s = System.currentTimeMillis();
    SevenZFile z = new SevenZFile(new File("d:\\data\\stackexchange\\apple.stackexchange.com.7z"));
    System.out.println(z.archive);
    for (SevenZArchiveEntry e = z.getNextEntry(); e != null; e = z.getNextEntry()) {
      System.out.println(e.getName());
    }
    
    System.out.println(System.currentTimeMillis() - s);
  }
}
