package org.eten.apiservicetemplate.core

enum class ConfigEnv {
  local,
  test,
  prod,
}

enum class KafkaTopics {
  InstanceInfo,
  Error,
}