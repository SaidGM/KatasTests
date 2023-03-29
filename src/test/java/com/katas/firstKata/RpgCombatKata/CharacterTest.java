package com.katas.firstKata.RpgCombatKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @BeforeEach
    void setUp() {
    }

    // Iteración I

    @Test
    void characterStartsWithCorrectProps(){
        var sonGohan = new Character();
        assertEquals(1000L,sonGohan.getHealth());
        assertEquals(1L,sonGohan.getLevel());
        assertEquals(true,sonGohan.getIsAlive());
    }

    @Test
    void damageToCharacter(){
        var victim = new Character();
        var villain = new Character();

        villain.attacks(victim, villain, 1010L, 950l);

        assertEquals(0L, victim.getHealth());
        assertEquals(false, victim.getIsAlive());
    }

    @Test
    void characterHealthToCharacter(){
        var victim = new Character();
        var doctor = new Character();

        doctor.health(victim, victim, 940L, true);

        assertEquals(940L, victim.getHealth());

    }

    // Iteración II

    @Test
    void selfHarm(){

        var victim = new Character();
        var villain = new Character();

        villain.attacks(villain, villain, 950L, 950L);

        assertEquals(950L, villain.getHealth());
    }

    @Test
    void healThemselves(){
        var victim = new Character();
        var doctor = new Character();

        doctor.health(victim, doctor, 940L, true);

        assertEquals(990L, victim.getHealth());

    }

}