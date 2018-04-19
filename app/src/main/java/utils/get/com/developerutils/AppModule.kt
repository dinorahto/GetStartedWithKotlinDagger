package utils.get.com.developerutils

import android.app.Application
import dagger.Module

/**
 * Created by Dinorah Tovar on 2/14/18.
 * Module to inject, provides Application
 */

@Module
class AppModule
/**
 * The constructor
 * @param mApplication the application
 */
(private var mApplication: Application)