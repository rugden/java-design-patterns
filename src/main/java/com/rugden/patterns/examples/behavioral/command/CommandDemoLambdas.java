package com.rugden.patterns.examples.behavioral.command;

/**
 * @author Walmart Technology
 */
public class CommandDemoLambdas {

    public static void main(String args[]) {
        Light light = new Light();
        Switch lightSwitch = new Switch();

        //No need for concrete commands; behavior pass directly to receiver

        // step 1
        //lightSwitch.storeAndExecute(new OnCommand(light));
        //lightSwitch.storeAndExecute(new OffCommand(light));

        //step 2; lambda expression
        //lightSwitch.storeAndExecute(() -> light.on());
        //lightSwitch.storeAndExecute(() -> light.off());

        //step 3; method reference
        lightSwitch.storeAndExecute(light::on);
        lightSwitch.storeAndExecute(light::off);

    }
}
