#sharedmodules

In this demo, I put everything in one repo is for easy code management purpose

Note: I didn't follow naming convention in this demo.

##shared business/feature modules
- moduleBase    : Router
- moduleService : Interface
- moduleHMC     : HMC    
- moduleSell    : Sell 
   
## API
- api
   -apilibbase : shared stuff
   -apilibHMC  : hmc api
   -apilibsell : sell api

## Debug/run single module
add gradle.properties to each module library and set `isLibModule = true`

see [build.gradle](moduleSell/build.gradle)

```gradle
if (isLibModule.toBoolean()) {
    apply plugin: 'com.android.library'    
} else {
    apply plugin: 'com.android.application'
}
```
   
   
I added this api folder after I finished the modules router. I think you guys can help with API part design.