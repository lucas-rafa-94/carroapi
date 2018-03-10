package br.com.lucassantos.carroapi.controller

import br.com.lucassantos.carroapi.model.Carro
import br.com.lucassantos.carroapi.service.CarroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/carro")
class CarroController {
    @Autowired

    lateinit var carroService: CarroService;


    @GetMapping
    fun buscarTodos(): List<Carro>{
        return carroService.buscarTodosCarros();
    }

    @PostMapping
    fun salvar(@RequestBody carro: Carro){
        carroService.salvar(carro)
    }

    @RequestMapping("busca/placa/{placa}")
        fun buscarPorPlaca(@PathVariable(value="placa") placa: String) : List<Carro>{
        return carroService.buscarPorPlaca(placa)
    }
}