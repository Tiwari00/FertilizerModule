package com.fertilizerDisplay.Services;

import java.util.List;

import com.fertilizerDisplay.Entity.*;

public interface fertilizerService {
	
fertilizerDisplay addNewFertilizer(fertilizerDisplay fertilizer);

	fertilizerDisplay updateFertilizer(fertilizerDisplay fertilizer, int id);
	
	fertilizerDisplay getFertilizerById(int fertilizerId);
	
	List<fertilizerDisplay> getAllFertilizers();

	//List<plantDisplay> getAllPlantsByType(String typeOfPlant);
	
	fertilizerDisplay deleteFertilizer(int fertilizerId);
	
	List<fertilizerDisplay> costLowToHigh();
	
	List<fertilizerDisplay> costHighToLow();
}
