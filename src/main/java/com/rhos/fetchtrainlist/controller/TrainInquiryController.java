package com.rhos.fetchtrainlist.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rhos.fetchtrainlist.model.TrainInfo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TrainInquiryController {
	
	
	@GetMapping("/getAllTrains")
	public List<TrainInfo> getTrainList() {
		List<TrainInfo> trainList = new ArrayList<TrainInfo>();
		trainList.add(new TrainInfo("Kolkata - Hyderabad Intercity Express", "Kolkata", "Hyderabad"));
		trainList.add(new TrainInfo("Kolkata - Hyderabad Maitri Express", "Kolkata", "Hyderabad"));
		trainList.add(new TrainInfo("Kolkata - Hyderabad SuperMail Express", "Kolkata", "Hyderabad"));
		trainList.add(new TrainInfo("Kolkata - Hyderabad Inetrgallop Express", "Kolkata", "Hyderabad"));
		trainList.add(new TrainInfo("Kolkata - Mumbai Intercity Express", "Kolkata", "Mumbai"));
		trainList.add(new TrainInfo("Kolkata - Mumbai Maitri Express", "Kolkata", "Mumbai"));
		trainList.add(new TrainInfo("Kolkata - Mumbai SuperMail Express", "Kolkata", "Mumbai"));
		trainList.add(new TrainInfo("Kolkata - Mumbai Inetrgallop Express", "Kolkata", "Mumbai"));
		trainList.add(new TrainInfo("Kolkata - Chennai Intercity Express", "Kolkata", "Chennai"));
		trainList.add(new TrainInfo("Kolkata - Chennai Maitri Express", "Kolkata", "Chennai"));
		trainList.add(new TrainInfo("Kolkata - Chennai SuperMail Express", "Kolkata", "Chennai"));
		trainList.add(new TrainInfo("Kolkata - Chennai Inetrgallop Express", "Kolkata", "Chennai"));
		return trainList;
	}

}
