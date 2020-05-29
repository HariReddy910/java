package com.harindra.main;

import org.apache.streampipes.container.init.DeclarersSingleton;
import org.apache.streampipes.container.standalone.init.StandaloneModelSubmitter;
import com.harindra.config.Config;
import com.harindra.pe.example.DataSource;

public class Init extends StandaloneModelSubmitter {

  public static void main(String[] args) throws Exception {
    DeclarersSingleton.getInstance()
            .add(new DataSource());

    new Init().init(Config.INSTANCE);

  }
}
