# Get Started #

The goal of this project is to help developers to pre-create a project in Kotlin with Dagger and Retrofit, saving all the boilerplate that is neccesary to create a project from scrach.

This project has being writed in Kotlin, for more information about Kotlin, please check the link below: https://kotlinlang.org

Minimal and Basic knowledge Requirements
=======

* Android SDK 
* Implementing Retrofit, Dagger, Kotlin Extensions
* Kotlin: https://github.com/JetBrains/kotlin

Basic Knowledge
=======

This is the basic knowledge of third party API need it for this project

| Base de datos |                                                                               |                                                              |
|:-------------:|-------------------------------------------------------------------------------|--------------------------------------------------------------|
| Realm         | Database for local changes                                                    | https://realm.io/docs/java/latest                            |
|       UI      |                                                                               |                                                              |
| Picasso       | A image downloading and caching library                                       | http://square.github.io/picasso/                             |
| RxJava        | Reactive Extensions for Java                                                  | https://github.com/ReactiveX/RxJava                          |
| Dagger 2      | A fast dependency injector for Android                                        | http://square.github.io/dagger/                              |
|   Networking  |                                                                               |                                                              |
| Gson y OkHttp | Networking library for HTTP requests                                          | https://github.com/codepath/android_guides/wiki/Using-OkHttp |
| Retrofit      | Rest type-safe client for Android                                             | http://square.github.io/retrofit/                            |


Architecture
=======

The architecture inside this application has two parts, the presentation layer, the one that handles the views, the listener for the clicks, scrolls views and all the interactions with the user, this part can be implement over MVP (Model View Presenter) or MVVM (Model View ViewModel) for the last one, a personal recomendation is to check out the Architectural Components that Google has provided, you can found it here: https://developer.android.com/topic/libraries/architecture/index.html (now stable)
For MVP (Model View Presenter) We are making a simple recomendation that every Android Developer must follow, don't make implementation of the business logic inside the Activities and Fragments, do it in the Presenter and make the connection with a Interface to speak to the Models. If you are using MVVM you can archive the Presenter-Interface model using a LiveData and ViewModels object from the Architectural components, we are planning to make a new version of this project with the AC.

![Image of Presentation Layer](https://raw.githubusercontent.com/MinttcodeCo/GetStartedWithKotlinDagger/master/Images/presentationlayer.jpg)

The last element of the architecture is the Data Layer part, is in charge of the web server connection and the local databases, everything in this part is implemented as a secondary module from the project, making it simple for testing, the Data Layer is divided in two, after the repository, which mean we have a Local repository and a Remote Repository. 
Local Repository: handle the writting and reading of the databases.
Remote Repository: web services connections and parsing objects of the response. We recommend the use of Observables for this part
Take in consideration that you can have as many modules as posible if you need it, so you can separate the Login Repository form the Checkout Repository.

![Image of DataLayer](https://raw.githubusercontent.com/MinttcodeCo/GetStartedWithKotlinDagger/master/Images/datalayer.jpg)

How to Contribute
=======

We welcome your contributions to this project. There are various ways to contribute:

**Reporting issues**

Help improve the project by reporting issues that you find by filing a new issue here in this repository

**Features suggestions**

You can also add feature suggestions by filing a new issue here

**Documentation**

You can help by adding or improving existing documentation. Simply send us a pull request for us to consider your proposed changes.

**Bug fixes**

Pull requests are welcome for minor bug fixes that do not involve any changes to existing API. These changes should ideally be accompanied by a test case that would have otherwise failed without the fix.

**New API or API changes**

Pull requests for new APIs or changes to existing APIs are welcome, but may require a bit of
discussion. Consider creating an issue to discuss any changes before you implement the change.

Before submitting
=======

* Check that lint, unit tests, and code style enforcement all pass by running `./gradlew check`. Use Lint to check the warning and errors you code can have, clean code is a happy code, Android studio counts with a Lint processor and analyzer, so please refer yourself to this link: (https://developer.android.com/studio/write/lint.html)
* Check that instrumentation tests pass by starting an API 26 or newer emulator and running
`./gradlew connectedCheck` 
* Make comments in every function that you are implementing
```
/**
* Created by Dinorah Tovar on 11/29/17.
* My Application, main activity to launch application
*/

@Module
class MyApplication : Application {

private var mApplication: Application? = null
/**
* Companion Object with static objects
*/
companion object {
var mAppComponent: AppComponent? = null
}
}
```

* Every method that was implemented in the Presentation Layer, must be tested, at least the Presenter of every Activity and every Fragment, if they dont have it, the pull will be rejected.
* Every method must be clean and sharpe, we don't need any boilerplate, so please make code readable


Handle of this project
=======

In order to use this project, please follow the next steps:

1. If you are using Android 3.0 or later, the project will be inserting by all ends the necesary plugins for Koltin
2. If not, you will require using the plugin of JetBrains, to solve Kotlin, you can found it inside Preferences -> Plugins and select Kotlin plugin
3. Then, you can simple import this project and you are ready to go

Documentation
=======
You are almost there! All the code for these library projects is based on:

1. Retrofit: http://square.github.io/retrofit/
2. Rx Java: https://github.com/ReactiveX/RxJava
3. Dagger: http://square.github.io/dagger/

Contact
=======
If you need help, We always happy to help, you can found me here:
Medium: https://medium.com/@dinorahto
StackoverFlow: https://stackoverflow.com/users/4613259/dinorah-tovar
Email: dinorahtovar@minttcode.com

License
=======
Copyright 2017

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0


