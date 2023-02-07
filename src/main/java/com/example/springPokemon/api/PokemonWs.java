package com.example.springPokemon.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springPokemon.pojo.Pokemon;

@RestController
@RequestMapping(ApiRegistration.REST_PREFIX + ApiRegistration.REST_POKEMON)
public class PokemonWs {
    
    @GetMapping
    public List<Pokemon> getAllPokemon() {
        return null;
    }

    @PostMapping
    public void createPokemon(@RequestBody Pokemon pokemon){
        return null,
    }
}
