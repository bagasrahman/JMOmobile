package dependencies

import dependencies.android.androidX
import dependencies.android.vmLifecycle
import dependencies.kotlin.coroutine
import dependencies.retrofit_okhttp.gson
import dependencies.retrofit_okhttp.okHttp
import dependencies.retrofit_okhttp.retrofit
import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.appLibraries() {
    androidCore()
    materialDesign()
    testUnit()
    retrofit()
    okHttp()
    gson()
    coroutine()
    vmLifecycle()
    androidX()
    koinKotlin("3.2.0-beta-1")
    glide()
}