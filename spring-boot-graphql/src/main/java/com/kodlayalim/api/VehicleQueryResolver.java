package com.kodlayalim.api;
import java.util.Optional;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.kodlayalim.entity.Vehicle;
import com.kodlayalim.repo.IVehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
@RequiredArgsConstructor
public class VehicleQueryResolver implements GraphQLQueryResolver {

    private final IVehicleRepository vehicleRepository;


    public List<Vehicle> getVehicles(String type){
       return vehicleRepository.getByTypeLike(type);
    }


    public Optional<Vehicle> getById(Long id){
        return vehicleRepository.findById(id);
    }

}
