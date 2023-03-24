package com.example.esempiorest.controller;


import com.example.esempiorest.model.HelloWorld;
import com.example.esempiorest.model.Name;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class helloWorldController {

    /**
     *
     * Esercizio, fare una rest api GET chiamata "/aggiungi", con un nome come parametro
     *                                           "/mostra"
     *                                           "/cancella"  con un nome come parametro
     */
    @GetMapping("/saluto")  //questo è l'url per accedere a questa API, dichiarata come tale con GetMapping
    public HelloWorld getHello(@RequestParam(value = "name", defaultValue = "World")String name){  //chiamata get in cui ho di default World
        return new HelloWorld(0, "Hello " + name + "!");             //value è il parametro passabile nell'url nome='default'
    }                                                                          //se non metto nulla altrimenti metto il nome

    @GetMapping("/add")
    public String setName(@RequestParam(value = "nome")String name){
        Name.getNames().add(name);
        return "ok";

    }
    @GetMapping("/get")
    public List<String> getList(){
        return Name.getNames();
    }
    @GetMapping("/remove")
    public String removeName(@RequestParam(value = "nome")String name){
        if(Name.getNames().contains(name)) {
            Name.getNames().remove(name);
            return "ok";
        }else{
            return "non esiste";
        }
    }
    @GetMapping("/deleteindex")
    public String removeName(@RequestParam(value = "num")int num){

            Name.getNames().remove(num);
            return "ok";

    }

}
