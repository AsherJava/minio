package com.zhifa.minio;

import com.zhifa.minio.config.MinioData;
import io.minio.MinioClient;
import io.minio.errors.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@SpringBootTest
class MinioApplicationTests {

    @Autowired
    private MinioClient minioClient;

    @Autowired
    private MinioData minioData;

    /*创建一个Bucket 相当于根目录结构*/
    @Test
    void makeBucket() throws Exception {

        minioClient.makeBucket(minioData.getBucketName());

    }

    @Test
    void removeAllBucketNotification() throws Exception {
        minioClient.removeAllBucketNotification(minioData.getBucketName());
       // minioClient.removeBucket(minioData.getBucketName());
    }

}
