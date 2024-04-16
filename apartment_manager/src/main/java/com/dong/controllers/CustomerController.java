package com.dong.controllers;

import com.dong.pojo.Customer;
import com.dong.service.CustomerService;
import com.dong.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService cusService;
    @Autowired
    private RoomService roomService;
    @GetMapping("/customers")
    public String list(Model model) {
        model.addAttribute("customer",new Customer());
        return "customers";
    }

    @ModelAttribute
        public void commonAttr(Model model) {
        model.addAttribute("room", this.roomService.getRoom());
    }
    @PostMapping("/customers")
    public String add(@ModelAttribute(value = "customer") @Valid Customer c,
                      BindingResult rs) {
        if (!rs.hasErrors())
            if (cusService.addOrUpdateCustomer(c) == true)
                return "redirect:/";

        return "customers";
    }
    @GetMapping("/customers/{id}")
    public String update(Model model, @PathVariable(value = "id") int id)  {
        model.addAttribute("customer", this.cusService.getCustomerById(id));
        return "customers";
    }
}