
package com.harindra.pe.example;

import org.apache.streampipes.model.SpDataStream;
import org.apache.streampipes.model.graph.DataSourceDescription;
import org.apache.streampipes.sdk.builder.DataStreamBuilder;
import org.apache.streampipes.sdk.helpers.EpProperties;
import org.apache.streampipes.sdk.helpers.Formats;
import org.apache.streampipes.sdk.helpers.Protocols;
import org.apache.streampipes.sources.AbstractAdapterIncludedStream;


public class ExampleStream extends AbstractAdapterIncludedStream {

  @Override
  public SpDataStream declareModel(DataSourceDescription sep) {
    return DataStreamBuilder.create("com.harindra-example", "Example", "")
            .property(EpProperties.timestampProperty("timestamp"))

            // configure your stream here

            .format(Formats.jsonFormat())
            .protocol(Protocols.kafka("localhost", 9092, "TOPIC_SHOULD_BE_CHANGED"))
            .build();
  }

  @Override
  public void executeStream() {

  }
}
