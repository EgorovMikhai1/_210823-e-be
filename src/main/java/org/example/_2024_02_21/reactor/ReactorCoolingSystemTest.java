package main.java.org.example._2024_02_21.reactor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ReactorCoolingSystemTest {

    @InjectMocks
    ReactorCoolingSystem reactorCoolingSystem;

    @Mock
    Thermometer thermometer;

    @Test
    void checkReactorCoolingSystemON() {
        Mockito.when(thermometer.getTemperature()).thenReturn(250d);
        reactorCoolingSystem.setTemperatureThreshold(240);
        reactorCoolingSystem.checkReactorCoolingSystem();
        Assertions.assertTrue(reactorCoolingSystem.isOn());
        Mockito.verify(thermometer).getTemperature();
    }
}