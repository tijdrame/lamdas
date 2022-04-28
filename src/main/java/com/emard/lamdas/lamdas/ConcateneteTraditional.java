package com.emard.lamdas.lamdas;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcateneteTraditional implements ConcateneteInterface{

    @Override
    public String sconcat(String a, String b) {
        return a + " "+b;
    }

    public static void main(String[] args) {
        ConcateneteTraditional traditional = new ConcateneteTraditional();
        log.info("[{}]",traditional.sconcat("Tidiane", "Dramé"));
    }
    
}
