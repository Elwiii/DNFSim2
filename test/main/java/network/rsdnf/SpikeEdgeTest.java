/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java.network.rsdnf;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author CARRARA Nicolas
 */
public class SpikeEdgeTest {
    private RSDNFTransmitter sender;
    private RSDNFTransmitter receiver;
    private SpikeEdge se;
    
    public SpikeEdgeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        sender = new RSDNFTransmitter(true,0.5);
        receiver = new RSDNFTransmitter(true,0.5);
        se = new SpikeEdge(sender, receiver);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testTransfert() {
        Spike s = new Spike();
        se.transfer(s);
        assertEquals(receiver.getBufferPacket().getLast(),s);
    }
    
}
