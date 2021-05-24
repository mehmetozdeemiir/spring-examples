package com.kodlayalim.api;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.kodlayalim.dto.VehicleDto;
import com.kodlayalim.entity.Vehicle;
import com.kodlayalim.repo.IVehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class VehicleMutationResolver implements GraphQLMutationResolver
{
    private final IVehicleRepository vehicleRepository;

     public Vehicle createVehicle(VehicleDto vehicleDto)
     {
       return vehicleRepository.save(dtoToEntity(vehicleDto)); //dtoToEntity e vehicleDto yu verdim entity e dönüştü save metoduna gitti save metodundan dönen vehicleıda geri döndürdüm
     }

     private Vehicle dtoToEntity(VehicleDto vehicleDto)
     {
         Vehicle vehicle=new Vehicle();
         vehicle.setBrandName(vehicleDto.getBrandName());
         vehicle.setLaunchDate(new Date());
         vehicle.setModelCode(vehicleDto.getModelCode());
         vehicle.setType(vehicleDto.getType());
         return vehicle;
     }
}
