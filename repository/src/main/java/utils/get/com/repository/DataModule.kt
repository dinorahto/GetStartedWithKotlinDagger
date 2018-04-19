package utils.get.com.repository

import com.google.firebase.database.FirebaseDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Dinorah Tovar on 2/14/17.
 * Provides Retrofit and Repositories
 */

@Module
class DataModule(private val mBaseUrl: String) {

    /**
     * Firebase Database Provider
     */
    @Provides
    @Singleton
    internal fun providerDatabaseFirebase (): FirebaseDatabase {
        return FirebaseDatabase.getInstance();
    }

}