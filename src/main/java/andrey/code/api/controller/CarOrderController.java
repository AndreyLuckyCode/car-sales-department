package andrey.code.api.controller;

import andrey.code.api.dto.CarOrderDTO;
import andrey.code.api.service.CarOrderService;
import andrey.code.store.entity.CarEntity;
import andrey.code.store.entity.CarOrderEntity;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RestController
public class CarOrderController {

    CarOrderService carOrderService;

    private static final String CREATE_ORDER = "/api/managers/{manager_id}/orders";


    @PostMapping(CREATE_ORDER)
    public CarOrderDTO createCarOrder(
            @PathVariable("manager_id") Long managerId,
            @ModelAttribute CarOrderEntity carOrder){

        return carOrderService.createCarOrder(managerId,carOrder);
    }
}
