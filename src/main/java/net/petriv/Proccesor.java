package net.petriv;

import net.petriv.annotation.Step;
import net.petriv.annotation.UI;
import org.json.simple.JSONObject;
import org.reflections.Reflections;
import org.reflections.scanners.FieldAnnotationsScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;

import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Proccesor {

    public static void main(String[] args) throws Exception {


        JSONObject json = new JSONObject();

        Path path = Paths.get("src\\main\\resources\\annotations.txt");

        System.out.println("Scanning using Reflections:");

        Reflections ref = new Reflections("net.petriv",
                            new FieldAnnotationsScanner(),
                                new TypeAnnotationsScanner(),
                                    new SubTypesScanner(false));

        try (BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-8"))) {

            for (Class<?> cl : ref.getTypesAnnotatedWith(Step.class)) {
                Step step = cl.getAnnotation(Step.class);
                UI ui = step.ui();

                // Adding attribute to json
                json.put("id", ui.id());
                json.put("type", step.type());
                json.put("name", ui.name());
                json.put("author", ui.author());
                json.put("category", ui.category());
                json.put("company", ui.company());

                // Write json in file
                writer.write("Annotations for: " + cl.getSimpleName());
                writer.newLine();
                writer.write(json.toJSONString());
                writer.newLine();
                writer.flush();
                json.clear();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}