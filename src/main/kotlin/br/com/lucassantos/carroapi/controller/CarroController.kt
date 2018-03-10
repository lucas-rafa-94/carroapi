package br.com.lucassantos.carroapi.controller

import br.com.lucassantos.carroapi.model.Carro
import br.com.lucassantos.carroapi.service.CarroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/carro")
class CarroController {
    @Autowired
    lateinit var carroService: CarroService;

    @GetMapping
    fun buscarTodos(): List<Carro>{
        return carroService.buscarTodosCarros();
    }

}