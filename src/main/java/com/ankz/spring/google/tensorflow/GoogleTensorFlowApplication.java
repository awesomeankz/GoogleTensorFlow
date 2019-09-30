package com.ankz.spring.google.tensorflow;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ankz.spring.google.dl4j.IrisClassifier;

@SpringBootApplication
public class GoogleTensorFlowApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(GoogleTensorFlowApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		IrisClassifier classifier = new IrisClassifier();
		classifier.classify("iris.csv","iris-test.csv");
		
	}

}
