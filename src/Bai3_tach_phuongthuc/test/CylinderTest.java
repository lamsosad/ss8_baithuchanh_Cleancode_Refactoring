package Bai3_tach_phuongthuc.test;

import Bai3_tach_phuongthuc.Cylinder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CylinderTest {
    @Test
    @DisplayName("test getVolume(0,0)")
    void testVolume0(){
        int radius = 0;
        int height = 0;
        double expected = 0;
        double result = Cylinder.getVolume(radius,height);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("test getVolume(0,0)")
    void testVolume1(){
        int radius = 4;
        int height = 3;
        double expected = 18.84324524;
        double result = Cylinder.getVolume(radius,height);
        assertEquals(expected,result);
    }

}
