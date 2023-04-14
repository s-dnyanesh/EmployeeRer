package com.starterkit.springboot.brs.service;


import com.starterkit.springboot.brs.dto.model.user.JobsDto;
import com.starterkit.springboot.brs.dto.model.user.UserDto;
import com.starterkit.springboot.brs.model.user.Jobs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Dnyaneshwar Somwanshi.
 */
public interface JobsReservationService {

	ArrayList<Jobs> updateJobs(JobsDto jobsDto);

	ArrayList<Jobs> getAllJobs();

	/*
	 * JobPortal updateJobs(JobsDto jobsDto);
	 */

}
