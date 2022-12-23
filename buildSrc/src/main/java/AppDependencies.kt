import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.setupDependencies() {
    implementation(Library.coreKtx)
    implementation("androidx.compose.ui:ui:${Versions.compose}")
    implementation("androidx.compose.material:material:${Versions.compose}")
    implementation("androidx.compose.ui:ui-tooling-preview:${Versions.compose}")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}")
    implementation("androidx.activity:activity-compose:${Versions.activityCompose}")

    implementation("androidx.navigation:navigation-compose:${Versions.navigationCompose}")

    implementation("androidx.room:room-runtime:${Versions.room}")
    // To use Kotlin annotation processing tool (kapt)
    kapt("androidx.room:room-compiler:${Versions.room}")
    // optional - Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:${Versions.room}")
    implementation("androidx.room:room-paging:${Versions.room}")

    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0")

    // optional - Jetpack Compose integration
    implementation("androidx.paging:paging-compose:1.0.0-alpha16")

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")

    implementation("androidx.datastore:datastore-preferences:1.0.0")

    implementation("com.google.dagger:hilt-android:2.38.1")
    kapt("com.google.dagger:hilt-android-compiler:2.38.1")
    kapt("androidx.hilt:hilt-compiler:1.0.0")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")

    implementation("io.coil-kt:coil-compose:2.2.0")

    // Horizontal Pager and Indicators - Accompanist
    implementation("com.google.accompanist:accompanist-pager:${Versions.accompanistCompose}")
    implementation("com.google.accompanist:accompanist-pager-indicators:${Versions.accompanistCompose}")

    // Swipe to Refresh - Accompanist
    implementation("com.google.accompanist:accompanist-swiperefresh:${Versions.accompanistCompose}")

    // System UI Controller - Accompanist
    implementation("com.google.accompanist:accompanist-systemuicontroller:${Versions.accompanistCompose}")

    // Palette API
    implementation("androidx.palette:palette-ktx:1.0.0")

    implementation("com.google.code.gson:gson:2.9.1")

    implementation("com.google.android.material:material:1.7.0-beta01")
}

fun DependencyHandler.test() {
    testImplementation(Library.junit)
    androidTestImplementation(Library.extJUnit)
    androidTestImplementation(Library.espressoCore)
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:${Versions.compose}")
    debugImplementation("androidx.compose.ui:ui-tooling:${Versions.compose}")
    debugImplementation("androidx.compose.ui:ui-test-manifest:${Versions.compose}")
}

fun DependencyHandler.implementation(dependency: String) {
    add("implementation", dependency)
}

fun DependencyHandler.androidTestImplementation(dependency: String) {
    add("androidTestImplementation", dependency)
}

fun DependencyHandler.testImplementation(dependency: String) {
    add("testImplementation", dependency)
}

fun DependencyHandler.debugImplementation(dependency: String) {
    add("debugImplementation", dependency)
}

fun DependencyHandler.kapt(dependency: String) {
    add("kapt", dependency)
}