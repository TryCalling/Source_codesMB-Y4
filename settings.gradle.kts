pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        //don't forget need add it
        maven ( url = "https://jitpack.io" )

    }
}

//for ImageSlider Kotlin
rootProject.name = "Auto_ImageSlider_kotlin_android"
include (":app")

rootProject.name = "TOUSNAAPP"
include(":app")
 