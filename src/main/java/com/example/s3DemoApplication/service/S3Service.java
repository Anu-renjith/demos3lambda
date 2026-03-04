package com.example.s3DemoApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.s3.S3Client;

@Service
public class S3Service {



    @Autowired
    private S3Client s3Client;

}
