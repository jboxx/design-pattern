package io.jboxx.designpattern.commandpattern;

public class ImplementationCommandPattern {

    Light light = new Light();

    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        Light light = new Light();

        ICommand turnOnLight = new ToggleLightCommand(light, true);
        ICommand turnOffLight = new ToggleLightCommand(light, false);

        toggleActionLight(light, invoker, turnOnLight, turnOffLight);
        toggleActionLight(light, invoker, turnOnLight, turnOffLight);
        toggleActionLight(light, invoker, turnOnLight, turnOffLight);
        toggleActionLight(light, invoker, turnOnLight, turnOffLight);
        toggleActionLight(light, invoker, turnOnLight, turnOffLight);

        System.out.println("+++++++++++++Undo++++++++++++++++++");

        invoker.undoCommandAndPop();
        invoker.undoCommandAndPop();
        invoker.undoCommandAndPop();
        invoker.undoCommandAndPop();
        invoker.undoCommandAndPop();
        invoker.undoCommandAndPop();

    }

    private static void toggleActionLight(Light light, Invoker invoker, ICommand turnOnLight, ICommand turnOffLight) {
        if (light.isTurnedOn()) {
            invoker.addCommandAndExecute(turnOffLight);
        } else {
            invoker.addCommandAndExecute(turnOnLight);
        }
    }
}
