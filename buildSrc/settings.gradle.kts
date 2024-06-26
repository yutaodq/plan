/*
 * This file was generated by the Gradle 'init' task.
 *
 * This settings file is used to specify which projects to include in your build-logic build.
 */
pluginManagement {
       repositories {
           gradlePluginPortal()
           maven { 
            url = uri("https://maven.aliyun.com/repository/gradle-plugin")
           }

       }
}

dependencyResolutionManagement {
    // Reuse version catalog from the main build.
    versionCatalogs {
        create("libs", { from(files("../gradle/libs.versions.toml")) })
    }
}

rootProject.name = "buildSrc"
