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
		trainList.add(new TrainInfo("Kolkata", "Hyderabad","Intercity"));
		trainList.add(new TrainInfo("Kolkata", "Hyderabad","Maitri"));
		trainList.add(new TrainInfo("Kolkata", "Hyderabad","SuperMail"));
		trainList.add(new TrainInfo("Kolkata", "Hyderabad","Inetrgallop"));
		trainList.add(new TrainInfo("Kolkata", "Mumbai","Intercity"));
		trainList.add(new TrainInfo("Kolkata", "Mumbai","Maitri"));
		trainList.add(new TrainInfo("Kolkata", "Mumbai","SuperMail"));
		trainList.add(new TrainInfo("Kolkata", "Mumbai","Inetrgallop"));
		trainList.add(new TrainInfo("Kolkata", "Chennai","Intercity"));
		trainList.add(new TrainInfo("Kolkata", "Chennai","Maitri"));
		trainList.add(new TrainInfo("Kolkata", "Chennai","SuperMail"));
		trainList.add(new TrainInfo("Kolkata", "Chennai","Inetrgallop"));
		return trainList;
	}

}
