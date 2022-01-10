package com.example.demoGradle.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* 
 * Las anotaciones son meta-dato. Informaci�n adicional al c�digo.
 * Por ejemplo @Override (su funcion es documentaria) se utiliza para declarar
 * la sobreescritura de un m�todo padre. Si no la usamos no pasa nada.
 * 
 * Por ejemplo @SpringBootApplication
 * Esta tiene la funci�n de habilitar la autoconfiguraci�n de Spring Boot, el escaneo de componentes,
 * y el registro de beans adicionales. Si la quitamos la aplicaci�n no funciona.
 * 
 * Por lo tanto, hay dos tipos. Las documentarias como @Override y las que modifican el funcionamiento
 * de la aplicaci�n como @SpringBootApplication
 * 
 * En este caso, las anotaciones de SpringFramework se usan para aprovechar las capacidades
 * de el nucleo de Spring. Conceptos como Inversi�n de Control o Inyecci�n de Dependencias son importantes,
 * pues con las anotaciones los mismos se aprovechan al m�ximo.
 * 
 * Estas anotaciones facilitan la implementacion de las funciones del sistema. Algunas nos ayudan a mapear
 * la estructura de la base de datos @Entity, @Data, @Id. Otras para realizar las validaciones del modelo,
 * otras para evitar codigo repetitivo.
 * */

@RestController
@RequestMapping("/")
public class FirstController {
    @GetMapping("")
    public String helloWorld() {
    	return "Hello World";
    }
    
    @GetMapping("{nom}")
    public String helloYou(@PathVariable(name="nom") String nom) {
    	return "Hello, " + nom;
    }
}
