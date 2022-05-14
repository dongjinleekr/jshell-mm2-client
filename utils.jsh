// see: https://github.com/openjdk/jdk/blob/3955b037da8a0981d8efc67f28caaacdef7dfb31/src/jdk.jshell/share/classes/jdk/internal/jshell/tool/JShellTool.java
// see: https://github.com/openjdk/jdk/blob/3955b037da8a0981d8efc67f28caaacdef7dfb31/src/jdk.jshell/share/classes/jdk/jshell/tool/resources/PRINTING.jsh

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

Properties properties(String path) {
  Properties prop = new Properties();

  try (InputStream input = new FileInputStream(path)) {
    prop.load(input);
  } catch (IOException ex) {
    ex.printStackTrace();
  }

  return prop;
}

