package pan.edu.welcome_spring.controller.web;
/*
 * @author Alexander Panyshchev
 * @since 17.08.2020
 * @version 1.0
 *Task: create web controller for Group model
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pan.edu.welcome_spring.form.GroupForm;
import pan.edu.welcome_spring.model.Cafedra;
import pan.edu.welcome_spring.model.Group;
import pan.edu.welcome_spring.service.cafedra.impls.CafedraServiceImpl;
import pan.edu.welcome_spring.service.group.impls.GroupServiceImpl;

import javax.annotation.PostConstruct;
import java.util.*;

@Controller
@RequestMapping("/web/group")
public class GroupWebController {
    @Autowired
    CafedraServiceImpl cafedraService;
    @Autowired
    GroupServiceImpl groupService;

    Map<String, String> movs;

    @PostConstruct
    void init(){

        movs = new HashMap<>();


    }
    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String getAll(Model model){
       model.addAttribute("list",groupService.getAll());
       return "groupList";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createGroup(Model model){
        GroupForm groupForm = new GroupForm();
        for (Cafedra cafedra:cafedraService.getAll()) {
            movs.put(cafedra.getId(), cafedra.getName());
        }
        model.addAttribute("movs",movs);
        model.addAttribute("groupForm", groupForm);
        return "addGroup";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createGroup(Model model, @ModelAttribute("groupForm") GroupForm groupForm){
        Group group = new Group();//создаем новую группу для добавление в БД
        group.setName(groupForm.getName());//устанавливаем ей значение имени из формы
        group.setDesc(groupForm.getDesc());//устанавливаем ей значение описания из формы
        group.setCafedra(groupForm.getCafedra());//устанавливаем  нашей группе значение новой кафедры
        groupService.create(group);
        model.addAttribute("groups", groupService.getAll());
        return "redirect:/web/group/get/list";
    }

}
