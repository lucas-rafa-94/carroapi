package br.com.lucassantos.carroapi.service

import br.com.lucassantos.carroapi.model.Carro
import br.com.lucassantos.carroapi.repository.CarroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CarroService {
    @Autowired
    lateinit var carroRespositoy: CarroRepository

    fun buscarCarroPorMarca(marca: String): List<Carro> {
        return carroRespositoy.findByMarcaContaining(marca)
    }

    fun buscarPorAno(ano: Int): List<Carro>{
        return carroRespositoy.findByAno(ano)
    }

    fun buscarPorPlaca(placa: String): List<Carro>{
        return carroRespositoy.findByPlaca(placa)
    }

    fun salvar(carro: Carro){
        carroRespositoy.save(carro)
    }

    fun buscarTodosCarros(): List<Carro>{
        return carroRespositoy.findAll();
    }
}