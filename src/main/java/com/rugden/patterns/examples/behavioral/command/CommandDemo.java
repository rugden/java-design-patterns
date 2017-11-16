package com.rugden.patterns.examples.behavioral.command;

//client
public class CommandDemo {

    public static void main(String args[]) {
        Light light = new Light();
        Switch lightSwitch = new Switch();

        //behavior passed around as Command Objects
        //wrapping functions into objects
        Command onCommand = new OnCommand(light);
        Command offCommand = new OffCommand(light);
        lightSwitch.storeAndExecute(onCommand);
        lightSwitch.storeAndExecute(offCommand);
    }
}
