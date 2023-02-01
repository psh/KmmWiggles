plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
    id("co.touchlab.faktory.kmmbridge") version "0.3.4"
    `maven-publish`
}

kotlin {
    android()
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        version = "1.0"
        ios.deploymentTarget = "14.1"
        framework {
            baseName = "SharedPuppyDB"
        }
    }
    
    sourceSets {
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting
        val androidTest by getting
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
        val iosX64Test by getting
        val iosArm64Test by getting
        val iosSimulatorArm64Test by getting
        val iosTest by creating {
            dependsOn(commonTest)
            iosX64Test.dependsOn(this)
            iosArm64Test.dependsOn(this)
            iosSimulatorArm64Test.dependsOn(this)
        }
    }
}

android {
    namespace = "co.touchlab.shared"
    compileSdk = 33
    defaultConfig {
        minSdk = 26
        targetSdk = 33
    }
}

kmmbridge {
    mavenPublishArtifacts()
    gitTagVersions()
    spm()
    frameworkName.set("SharedPuppyDB")
    versionPrefix.set("1.0")
}

publishing {
    // Externally set these values. Generally ~/.gradle/gradle.properties or CI Secrets
    val publishUsername: String by project
    val publishToken: String by project
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/psh/KmmWiggles")
            credentials {
                username = publishUsername
                password = publishToken
            }
        }
    }
}

