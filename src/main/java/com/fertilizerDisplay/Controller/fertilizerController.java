package com.fertilizerDisplay.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.fertilizerDisplay.Exception.*;
import com.fertilizerDisplay.Entity.*;
import com.fertilizerDisplay.Services.*;

@RestController
@RequestMapping("/products")

public class fertilizerController {
	//@Autowired
	private fertilizerService fertilizerService;
    
	@PostMapping("/admin/fertilizer")
	public ResponseEntity<fertilizerDisplay> addNewFertilizer(@RequestBody fertilizerDisplay fertilizer) {
		fertilizerService.addNewFertilizer(fertilizer);
		return new ResponseEntity<fertilizerDisplay>(fertilizer, HttpStatus.CREATED);
	}
	@PutMapping({"/admin/fertilizer/id/{id}"})
	public ResponseEntity<fertilizerDisplay> updateFertilizer(@RequestBody fertilizerDisplay fertilizer, @PathVariable int id) {
		// logger.trace("updating the whole plant having id "+ id);  
		fertilizerService.updateFertilizer(fertilizer, id);
		return new ResponseEntity<fertilizerDisplay>(fertilizer, HttpStatus.ACCEPTED);
	}
	@GetMapping("/customers/fertilizer/id/{id}")
	public ResponseEntity<fertilizerDisplay> viewFertilizer(@PathVariable Integer id) 
	{
		//logger.trace("fetching the fertilizer with id "+ id);
		return new ResponseEntity<fertilizerDisplay>(fertilizerService.getFertilizerById(id), HttpStatus.OK);
	}
	/*@GetMapping("/customers/fertilizers")
	public ResponseEntity<List<fertilizerDisplay>> viewAllFertilizers() 
	{
		//logger.trace("fetching all the fertilizers");
		return new ResponseEntity<List<fertilizersDisplay>>(fertilizerService.getAllFertilizer(), HttpStatus.OK);
	}*/
	@DeleteMapping("/admin/fertilizer/id/{id}")
	public ResponseEntity<fertilizerDisplay> deleteFertilizer(@PathVariable int id) throws FertilizerIdNotFoundException{
		//logger.trace("deleting the whole fertilizer");	
		return new ResponseEntity<fertilizerDisplay>(fertilizerService.deleteFertilizer(id), HttpStatus.OK);
	}

	@GetMapping("/customers/fertilizers/costLowToHigh")
	public ResponseEntity<List<fertilizerDisplay>> costLowToHigh(){
		return new ResponseEntity<List<fertilizerDisplay>>(fertilizerService.costLowToHigh(),HttpStatus.OK);
	}
	@GetMapping("/customers/fertilizers/costHighToLow")
	public ResponseEntity<List<fertilizerDisplay>> costHighToLow(){
		return new ResponseEntity<List<fertilizerDisplay>>(fertilizerService.costHighToLow(),HttpStatus.OK);
	}
}
