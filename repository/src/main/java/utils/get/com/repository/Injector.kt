package utils.get.com.repository

import android.app.Application

/**
 * Created by Dinorah Tovar on 2/14/18.
 * Injects the App Component
 */

class Injector {

    /**
     * CompanionObject
     * Setting DaggerAppComponent and DataModule
     * @link https://github.com/google/dagger
     */
    companion object {
        lateinit var context: Application
        var dataComponent: DataComponent? = null
    }

}