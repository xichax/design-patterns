package com.example;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private int temperature;
    private List<Display> displays;
    
    public WeatherStation() {
        this.displays = new ArrayList<>();
    }
    
    public void addDisplay(Display display) {
        displays.add(display);
    }
    
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        for (Display display : displays) {
            display.update(temperature);
        }
    }
}
