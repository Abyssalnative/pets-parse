package com.testing.boot.velocity.parser.service;

import com.testing.boot.velocity.parser.model.Pet;
import com.testing.boot.velocity.parser.model.Pets;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class PetService {

    public List<Pet> getPets() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);
        Pets pets = null;
        try {
            Resource resource = new ClassPathResource("pets-data.json");
            InputStream inputStream = resource.getInputStream();
            pets = objectMapper.readValue(inputStream, Pets.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pets.getPets();
    }
}
