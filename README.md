# app-bundle-demo

The project contains 2 modules:
 * app-bundle-a --> a spring-boot application that is repackaged and contains all dependencies
 * app-bundle-b --> the modules that generates the DMG 

In ```JVMMainClassName``` is ```org.springframework.boot.loader.JarLauncher``` and not the application class of the application 
in ```app-bundle-a```, because the ```spring-boot-plugin``` repackages the jar.

If the dependency ```app-bundle-a``` in the ```pom.xml``` of ```app-bundle-b``` does not exclude the transient dependency 
```spring-boot-starter``` then ```spring-boot-starter``` and all dependencies of ```spring-boot-starter``` are packaged into 
the ```classpath``` directory. This results into a bigger size (and double classes on classpath) because the classes of the 
dependencies are in the repackaged jar of ```app-bundle-a``` already.

There should be an option available to not include transient dependencies.
