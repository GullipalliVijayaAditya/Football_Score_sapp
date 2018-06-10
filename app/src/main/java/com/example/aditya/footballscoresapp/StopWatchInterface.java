package com.example.aditya.footballscoresapp;

public interface StopWatchInterface {
    /**
     * This method displaying stopwatch time in TextView
     */
    void displayStopwatchTime(String timeToDisplay);

    /**
     * After end of time set flat isRunning to false
     */
    void reportFinish();
}