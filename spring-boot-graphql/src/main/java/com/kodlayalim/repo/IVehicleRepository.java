package com.kodlayalim.repo;

import com.kodlayalim.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface IVehicleRepository extends JpaRepository<Vehicle,Long>
{

    List<Vehicle> getByTypeLike(String type);

}
