package gov.noaa;

import com.sun.jmx.remote.internal.Unmarshal;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.io.File;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnmarshall {
    @Test
    void testUnmarshallResult() throws Exception{
        JAXBContext jaxbContext = JAXBContext.newInstance(DwmlType.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        //String filePath = "/home/osamah/IdeaProjects/soapserviceact3/src/main/resources/response.xml";
        File XMLfile = new File("/home/osamah/IdeaProjects/soapserviceact3/src/main/resources/response.xml");
        //DwmlType dwml = (DwmlType) jaxbUnmarshaller.unmarshal(new StringReader(filePath));
        DwmlType dwmlType = (DwmlType)jaxbUnmarshaller.unmarshal(XMLfile);
        String lat = dwmlType.getLatLonList();
        assertEquals("43.0798,-89.3875", lat);
    }

}
