package dependencies.android

import org.gradle.api.artifacts.dsl.DependencyHandler
import dependencies.implementation

fun DependencyHandler.androidX() {
    implementation("androidx.core:core-ktx:1.1.0-alpha05")
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.annotation:annotation:1.1.0")
    implementation("androidx.activity:activity-ktx:1.3.1")
    implementation("androidx.fragment:fragment-ktx:1.3.6")
}