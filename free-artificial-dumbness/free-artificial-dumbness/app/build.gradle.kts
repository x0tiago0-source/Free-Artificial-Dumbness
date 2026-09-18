plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    // Configurações de SDK exigidas
    compileSdk = 34 // Target SDK 34 conforme requerido
    
    defaultConfig {
        applicationId = "com.x0tiago.fad" // Mantém o ID do teu app
        minSdk = 29 // Mínimo exigido
        targetSdk = 34 // Alvo: Android 14
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17 // Kotlin 1.9.24 usa Java 17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17" // Garante que o código é compilado para JVM 17
    }
}

dependencies {
    // Dependências essenciais do Compose e Kotlin
    implementation("androidx.core:core-ktx:1.12.0") 
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    
    // Adiciona aqui todas as outras dependências do teu projeto (ex: Retrofit, etc.)
}
