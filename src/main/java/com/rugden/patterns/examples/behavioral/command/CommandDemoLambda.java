package com.rugden.patterns.examples.behavioral.command;

//Client
public class CommandDemoLambda {

    public static void main(String args[]) {
        Light light = new Light();
        Switch lightSwitch = new Switch();

//        lightSwitch.storeAndExecute(new OnCommand(light));
//        lightSwitch.storeAndExecute(new OffCommand(light));
//
//        lightSwitch.storeAndExecute(() -> light.on());
//        lightSwitch.storeAndExecute(() -> light.off());

        // No need for concrete commands; behavior pass directly to receiver
        lightSwitch.storeAndExecute(light::on);
        lightSwitch.storeAndExecute(light::off);

    }
}
