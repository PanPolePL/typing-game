package com.typinggame;

public class Stopwatch {
    long s,f,time;
    boolean started,stopped;
    Stopwatch(){
        s=0;
        f=0;
        started=false;
        stopped=true;
    }
    void start(){
        s=System.currentTimeMillis();
        stopped=false;
    }
    void stop(){
        f=System.currentTimeMillis();
        time=f-s;
    }
}
