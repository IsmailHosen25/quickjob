package com.quickjob.quickJob.Job;

import java.util.List;

public interface JobService {
    List<Job> getall();
    void creatJob(Job job);
}
