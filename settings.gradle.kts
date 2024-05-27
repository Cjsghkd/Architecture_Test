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
    }
}

rootProject.name = "Architecture_Test"

include(":app")
include(":core:data")
include(":core:model")
include(":core:designsystem")
include(":core:network")
include(":core:domain")
include(":feature:main")
include(":build-logic")
