package com.example.demo.Controllers;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Models.Gadgets;
import com.example.demo.Repository.ApiRepo;
import com.example.demo.Service.ApiService;
@RestController
@CrossOrigin
public class ApiController {
	@Autowired
	ApiRepo serviceRepository;
    @Autowired
    ApiService service;
    @GetMapping("/get")
    List<Gadgets>getList(){
  	  return serviceRepository.findAll();
    }
    @PostMapping("/post")
    public Gadgets create(@RequestBody Gadgets gt) {
  	  return serviceRepository.save(gt);
    }
    @GetMapping("/get/{model_no}")
	  public Optional<Gadgets>getbyid(@PathVariable int model_no){
		  return service.getGadgets(model_no);
	  }
    @PutMapping("/put")
    public String update(@RequestBody Gadgets gt) {
  	  return service.updateDetails(gt);
    }
    @DeleteMapping("/del/{model_no}")
    public String delete(@PathVariable int model_no) {
  	  return service.deleteDetails(model_no);
    }
}
