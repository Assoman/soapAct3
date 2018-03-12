package gov.noaa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NdfdXMLBindingStubTest {

    @Test
    void latLonListZipCode() throws Exception{
        NdfdXMLBindingStub binding = (NdfdXMLBindingStub) new NdfdXMLLocator().getndfdXMLPort();
        String reslut = binding.latLonListZipCode("53711");
        assertEquals("??", reslut);
    }
}