import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
}
kotlin {
    listOf(
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "common"
            isStatic = true
        }
    }
    jvm("desktop")
    androidTarget {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }
    sourceSets {
        val desktopMain by getting
        commonMain.dependencies {
            api(libs.kotlinx.coroutines.core)
            implementation(libs.napier)
        }
        commonTest.dependencies {
            //implementation(libs.kotlin.test)
        }
        androidMain.dependencies {
            //implementation(libs.ktor.client.okhttp)
        }
        iosMain.dependencies {
            //implementation(libs.ktor.client.darwin)
        }
        desktopMain.dependencies {
            //implementation(libs.ktor.client.cio)
        }
    }
}
android {
    namespace = "com.sergiocrespotoubesspotifyskeletonkmp.common"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}
