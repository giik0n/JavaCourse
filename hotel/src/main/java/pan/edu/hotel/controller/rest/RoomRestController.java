package pan.edu.hotel.controller.rest;
/*
 * @author Alexander Panyshchev
 * @since 13.08.2020
 * @version 1.0
 *Task: create REST controller for client model
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pan.edu.hotel.service.room.impls.RoomServiceImpl;


@RequestMapping("/api/room")
@RestController
public class RoomRestController {
    @Autowired
    RoomServiceImpl roomService;
}
