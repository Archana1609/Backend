package com.example.demo.Service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Models.Gadgets;
import com.example.demo.Repository.ApiRepo;
@Service
public class ApiService {
	@Autowired
	ApiRepo repository;
	public Optional<Gadgets>getGadgets(int model_no){
		return repository.findById(model_no);
	}
	public String updateDetails(Gadgets gt) {
		repository.save(gt);
		return "updated successfully";
	}
	public String deleteDetails(int model_no) {
		repository.deleteById(model_no);
		return "Deleted successfully";
	}
}
