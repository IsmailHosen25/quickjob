package com.quickjob.quickJob.Job;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JobController {

    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public List<Job> findall(){
        return jobService.getall();
    }
    @PostMapping("/jobs")
    public String creatJobs(@RequestBody Job job){
       jobService.creatJob(job);
       return "Job added successfully";
    }
}
