package com.katas.firstKata.RpgCombatKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @BeforeEach
    void setUp() {
    }

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

        villain.attacks(victim, 1010L);

        assertEquals(0L, victim.getHealth());
        assertEquals(false, victim.getIsAlive());
    }

    @Test
    void CharacterHealthToCharacter(){
        var victim = new Character();
        var doctor = new Character();

        doctor.health(victim, 940L, false);

        assertEquals(940L, victim.getHealth());
//        assertEquals(0L, victim.getHealth());
//        assertEquals(false, victim.getIsAlive());

    }

}