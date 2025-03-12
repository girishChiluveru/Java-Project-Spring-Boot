package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller  // This tells Spring this class handles web requests
public class ProductController {

    @Autowired
    private ProductService productService;

    // This handles GET requests to "/products"
    // Similar to app.get('/products') in Node.js/Express
    @GetMapping("/products")
    public String listProducts(Model model) {
        // Add the list of products to the model (will be available in the HTML)
        model.addAttribute("products", productService.getAllProducts());
        // Return the name of the HTML template to render
        return "products";
    }

    // This handles GET requests to "/products/add"
    @GetMapping("/products/add")
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }

    // This handles POST requests to "/products"
    // Similar to app.post('/products') in Node.js/Express
    @PostMapping("/products")
    public String addProduct(@ModelAttribute Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
    }

    // This handles GET requests to "/products/edit/{id}"
    @GetMapping("/products/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("product", productService.getProductById(id));
        return "edit-product";
    }

    // This handles POST requests to "/products/{id}"
    @PostMapping("/products/{id}")
    public String updateProduct(@PathVariable Long id, @ModelAttribute Product product) {
        product.setId(id);
        productService.saveProduct(product);
        return "redirect:/products";
    }

    // This handles GET requests to "/products/delete/{id}"
    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "redirect:/products";
    }
} 