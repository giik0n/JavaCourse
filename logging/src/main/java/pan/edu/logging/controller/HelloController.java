package pan.edu.logging.controller;    /*
 * @author Alexander Panyshchev
 * @since 19.08.2020
 * @version 1.0
 *Task:
 */


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    Logger logger = LogManager.getLogger(HelloController.class);

    @RequestMapping("/hello")
    String helloWorld(){
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return "Hello world";
    }
}
