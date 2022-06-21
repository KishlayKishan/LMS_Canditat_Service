package com.bridgelabz.lms.configuration;

import com.bridgelabz.lms.model.Candidate;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomerProcessor implements ItemProcessor<Candidate, Candidate> {
    @Override
    public Candidate process(Candidate candidate) throws Exception {
        return candidate;
    }
}
