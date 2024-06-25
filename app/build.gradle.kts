plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    namespace = "com.example.tousnaapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.tousnaapp"
        minSdk = 25
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    //first time
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    //noinspection GradleCompatible
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.android.gms:play-services-location:21.0.1")
    implementation("com.google.android.libraries.maps:maps:3.1.0-beta")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


    //for updated gradle
    implementation("androidx.core:core-splashscreen:1.0.1")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation("com.github.denzcoskun:ImageSlideshow:0.1.2")
    implementation("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.12.0")


    // Define Kotlin version
    val kotlin_version = "1.9.0"  // Use the latest version available

    //for goole maps
    implementation("com.google.android.gms:play-services-maps:18.2.0")
    implementation("com.google.android.gms:play-services-location:21.0.1")
    implementation("com.android.volley:volley:1.2.1")
//    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version")

    // Json
//    implementation 'com.fasterxml.jackson.core:jackson-databind:2.9.6'
//    implementation 'com.fasterxml.jackson.core:jackson-core:2.9.6'
//    implementation 'com.fasterxml.jackson.core:jackson-annotations:2.9.0'
//    implementation "com.fasterxml.jackson.module:jackson-module-kotlin:2.9.6"





}