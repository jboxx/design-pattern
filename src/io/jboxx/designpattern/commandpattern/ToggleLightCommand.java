package io.jboxx.designpattern.commandpattern;

public class ToggleLightCommand implements ICommand {

    private final Light light;
    private boolean isTurnedOn = false;

    public ToggleLightCommand(Light light, boolean isTurnedOn) {
        this.light = light;
        this.isTurnedOn = isTurnedOn;
    }

    @Override
    public void execute() {
        if (isTurnedOn) {
            light.on();
        } else {
            light.off();
        }
    }

    @Override
    public void unexecute() {
        if (isTurnedOn) {
            light.off();
        } else {
            light.on();
        }
    }
}
