# SGui (Server Gui)
This is a port of the SGui Library that is a small, jij-able library that allows creation of server side guis.

The goal is to allow Fabric mods that uses the original [SGui]([https://github.com/Patbox/sgui](https://github.com/Patbox/sgui)) to be ported on Neoforge, using this build.

## Usage (for mod developpers):
Add it to your dependencies like this:

- create a `lib` directory and put the jar in it.
- Add the local repository to your build.gradle:

```
repositories {
    flatDir { 
        dir 'libs'
    }
}

dependencies {
	modImplementation include("eu.pb4:sgui:1.9.1+1.21.5-neoforge") // Adapt it, it should match the jar your are using
}
```

Example of a mod using it: [AuctionHouse](https://github.com/jblemee/AuctionHouse/)

After that you are ready to go! You can use SimpleGUI and other classes directly for simple ones or extend
them for more complex guis.