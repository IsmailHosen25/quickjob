package com.quickjob.quickJob.Job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    private final JobRepository jobRepository;

    @Autowired
    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> getall() {
        return jobRepository.findAll();
    }

    public void creatJob(Job job) {
        jobRepository.save(job);
    }

    public Job getJobById(Long id) {
        return jobRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Job not found with id: " + id));
    }
    public Job updateJob(Long id, Job jobDetails) {
        Job job = getJobById(id);

        job.setTitle(jobDetails.getTitle());
        job.setDescription(jobDetails.getDescription());
        job.setLocation(jobDetails.getLocation());
        job.setSalary(jobDetails.getSalary());

        return jobRepository.save(job);
    }

    public void deleteJob(Long id) {
        Job job = getJobById(id);
        jobRepository.delete(job);
    }
}
