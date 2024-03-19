//package org.sakaiproject.tool.helloworld.controller;
//import org.sakaiproject.tool.helloworld.model.Employee;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
////import org.springframework.web.multipart.MultipartFile;
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//public class EmployeeController {
//
//    @GetMapping({"/", "/addEmployee"})
//    public String addEmployee(Model model) {
//        model.addAttribute("employee", new Employee());
//        List<String> listFavorite = new ArrayList<>();
//        listFavorite.add("Swimming");
//        listFavorite.add("Listening music");
//        listFavorite.add("Walking");
//        listFavorite.add("Watching movie");
//        listFavorite.add("Reading comic");
//        model.addAttribute("listFavorite", listFavorite);
//        List<String> listPosition = new ArrayList<>();
//        listPosition.add("Developer");
//        listPosition.add("Designer");
//        listPosition.add("Tester");
//        listPosition.add("QA");
//        model.addAttribute("listPosition", listPosition);
//        return "add_employee";
//    }
//
//    @PostMapping("/addEmployee")
//    public String doAddEmployee(@ModelAttribute("employee") Employee employee, Model model) {
//        model.addAttribute("employee", employee);
//        return "view_employee";
//    }
//}
//
