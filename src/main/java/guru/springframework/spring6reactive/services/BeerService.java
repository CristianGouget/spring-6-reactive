package guru.springframework.spring6reactive.services;

import guru.springframework.spring6reactive.model.BeerDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.channels.FileChannel;

public interface BeerService {

    Flux<BeerDTO> listBeers();

    Mono<BeerDTO> getBeerById(Integer beerId);

    Mono<Void> deleteBeerById(Integer beerId);

    Mono<BeerDTO> patchBeer(Integer beerId, BeerDTO beerDTO);

    Mono<BeerDTO> updateBeer(Integer beerId, BeerDTO beerDTO);

    Mono<BeerDTO> saveNewBeer(BeerDTO beerDTO);
}