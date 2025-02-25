plugins {
  id("org.jetbrains.kotlin.jvm")
  id("com.apollographql.apollo")
}


apollo {
  service("service") {
    generateApolloMetadata.set(true)
    packageName.set("com.example")

    dependsOn(project(":schema"))
  }
}