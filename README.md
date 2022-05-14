jshell-mm2-client
=====

A simple gradle project for jshell with Apache Kafka MirrorClient dependencies. (based on: [jshell-on](https://gist.github.com/dongjinleekr/8c6a403f30b4207f6fb78bb584b860e7))

You can conveniently run Kafka DR tasks (like migrating `__consumer_offsets`) with this project.

# Prerequisites

- java (≥9)
- gradle

# How to Run

```sh
# open jshell with org.apache.kafka:connect-mirror-client
./jshell-mm2-client

# load properties file, with properties(String) defined in utils.jsh
Properties props = properties("xx.properties")

# instantiate MirrorClient from the Properties instance
# see: https://kafka.apache.org/31/javadoc/org/apache/kafka/connect/mirror/MirrorClient.html
MirrorMakerConfig mmConfig = new MirrorMakerConfig(props);
MirrorClientConfig mmClientConfig = mmConfig.clientConfig("cluster-name");
MirrorClient mmClient = new Mirrorclient(mmClientConfig);
```

To update the dependencies, update `build.gradle`.
To add or modify the utility functions, update `utils.jsh`.

# License

jshell-mm2-client is open-sourced and licenced under [GNU GENERAL PUBLIC LICENSE version 3](https://www.gnu.org/licenses/gpl-3.0.en.html), by Lee Dongjin (dongjin@apache.org).

