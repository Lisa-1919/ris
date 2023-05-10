package org.example.main;

import org.example.service.StringHandlerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class App {
    private static final String CONFIGURATION_PATH = "context.xml";
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CONFIGURATION_PATH);
        StringHandlerService service = (StringHandlerService) context.getBean("stringService");
        Scanner scanner = new Scanner(System.in);
        System.out.println("For exit enter '0000'");
        System.out.println("Text: " + service.text());
        System.out.println("Enter substring: ");
        String str = scanner.nextLine();
        while(!str.equals("0000")){
            System.out.println(service.search(str));
            str = scanner.nextLine();
        }
    }
}
