package utils.get.com.developerutils

import javax.inject.Singleton
import dagger.Component
import utils.get.com.repository.DataComponent
import utils.get.com.repository.DataModule

/**
 * Created by Dinorah Tovar on 2/14/18.
 * Component to inject the Data Module and the App Module
 */

@Singleton
@Component(modules = [(DataModule::class), (AppModule::class)])
interface AppComponent : DataComponent {

}