package com.ecommerce.Ecommerce.controller;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.Ecommerce.model.Producto;

import org.slf4j.*;

@Controller
@RequestMapping("/productos")
public class ProductoController {
    
     final org.jboss.logging.Logger logger = LoggerFactory.logger(ProductoController.class);



    @GetMapping("")
    public String show(){
        return "productos/show";
    }

    @GetMapping("/create")
    public String create(){
        return "productos/create";
    }

    @PostMapping("/save")
    public String save(Producto producto){
       logger.info("Este es el objeto producto"+producto);
        return "redirect:/productos";
    }
}
