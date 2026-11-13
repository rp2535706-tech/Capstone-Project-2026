package com.ripplemap.ripplemap.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimulationRun {
    private Long id;
    private int radius;
    private int speed;
    private int ticks;
    private String timestamp;

    public SimulationRun() {}

    public SimulationRun(Long id, int radius, int speed, int ticks) {
        this.id = id;
        this.radius = radius;
        this.speed = speed;
        this.ticks = ticks;
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius = radius; }
    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }
    public int getTicks() { return ticks; }
    public void setTicks(int ticks) { this.ticks = ticks; }
    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }
}
