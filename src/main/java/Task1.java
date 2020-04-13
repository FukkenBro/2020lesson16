import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.util.List;

//1) Создать проект Maven. В корень проекта положить текстовый файл с таким содержимым:
//        {
//        "name": "java",
//        "persons": [
//        {
//        "name": "Alex",
//        "age": 22
//        },
//        {
//        "name": "Ben",
//        "age": 33
//        }
//        ]
//        }
//        Распарсить этот JSON и вывести обьекты через println().
//2*) Используя библиотеку Jackson сериализовать полученные обьекты в формате XML и записать в другой файл. Информация и необходимые библиотеки:

public class Task1 {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Group group = mapper.readValue(new File("Task1.json"), Group.class);
        System.out.println(group.toString());
        List<Person> p = group.getPersons();
        System.out.println(p);
        //Task2

        System.out.print("Serialized: " + serializeToXML(group));
    }

    /**
     * This function writes serializes the Java object into XML and writes it
     * into an XML file.
     */
    public static String serializeToXML(Group input) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            String xmlString = xmlMapper.writeValueAsString(input);
            File xmlOutput = new File("serialized.xml");
            FileWriter fileWriter = new FileWriter(xmlOutput);
            fileWriter.write(xmlString);
            fileWriter.close();
            return xmlString;
        } catch (JsonProcessingException e) {
            // handle exception
        } catch (IOException e) {
            // handle exception
        }
        return null;
    }

}
