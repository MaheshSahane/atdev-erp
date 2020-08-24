package com.atdev.apps.common.service;

import com.axelor.common.ResourceUtils;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class GlobalConnectionApi {

  public File getResourceFile() {
    File file =
        new File(getClass().getClassLoader().getResource("application.properties").getFile());
    return file;
  }

  public static String getApplicationProperty(String key) throws IOException {
    GlobalConnectionApi obj = new GlobalConnectionApi();
    Properties prop = ResourceUtils.getProperties(obj.getResourceFile());
    String value = prop.getProperty(key);
    return value;
  }
}
