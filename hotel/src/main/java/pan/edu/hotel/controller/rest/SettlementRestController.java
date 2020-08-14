package pan.edu.hotel.controller.rest;
/*
 * @author Alexander Panyshchev
 * @since 13.08.2020
 * @version 1.0
 *Task:
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pan.edu.hotel.service.settlement.impls.SettlementServiceImpl;


@RequestMapping("/api/settlement")
@RestController
public class SettlementRestController {
@Autowired
    SettlementServiceImpl settlementService;
}
