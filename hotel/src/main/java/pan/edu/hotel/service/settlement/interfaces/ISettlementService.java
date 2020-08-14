package pan.edu.hotel.service.settlement.interfaces;
/*
 * @author Alexander Panyshchev
 * @since 13.08.2020
 * @version 1.0
 *Task: create interface for settlement service
 */

import pan.edu.hotel.model.Room;
import pan.edu.hotel.model.Settlement;

import java.util.List;

public interface ISettlementService {
    Settlement create(Settlement settlement);
    Settlement get(String id);
    Settlement delete(String id);
    Settlement update(Settlement settlement);
    List<Settlement> getAll();
}
