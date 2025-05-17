package com.quickjob.quickJob.Job.Impl;

import com.quickjob.quickJob.Job.Job;
import com.quickjob.quickJob.Job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    private List<Job> jobs = new ArrayList<>();
    private  long nextid=1L;

    @Override
    public List<Job> getall() {
        return jobs;
    }

    @Override
    public void creatJob(Job job) {
          job.setId(nextid++);
          jobs.add(job);
    }
}
