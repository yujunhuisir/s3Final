package com.my;

import java.io.File;
import java.util.List;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectSummary;


public class Test {
	public static void main(String[] args) {
		FileStoreageUtil utils  = new FileStoreageUtil();
		utils.creatConnect();
		AmazonS3 amazonS3 = utils.getConnect();
		
		/*
		 * 创建桶
		 */
		//  utils.creatBucket("mybucket");
		
		//boolean ff= utils.deleteBucket("mybucket");
		
		//System.out.println(ff);
		/*
		 * 获取桶的信息
		 */
		List<Bucket> listBuckets = utils.getBuckets();
        for (Bucket bucket : listBuckets) {
            System.out.println(bucket.getName());
        }
        /*
		 * 上传对象的信息
		 */
//        long t = System.currentTimeMillis();
//        System.out.println("start......");
//        for(int i=0;i<20;i++) {
//        	utils.creatObject("mybucket", "you"+i, "topic.jpg", new File("D:\\002.jpg"));
//        }
//        System.out.println(System.currentTimeMillis()-t);
//        System.out.println("end......");
//        
//        ObjectListing objects = utils.getBacketObjects("owncloud","aacc",true);
//        do 
//        {
//            for (S3ObjectSummary objectSummary : objects.getObjectSummaries()) 
//            {
//            	System.out.println("Object: " + objectSummary.getKey());            	
//            }                            	
//            objects = amazonS3.listNextBatchOfObjects(objects);
//        } while (objects.isTruncated());
        
        
        /*
		 * 下载
		 */
 //       ObjectMetadata metadata = utils.download("mybucket", "you5topic.jpg", new File("D:/test/my.jpg"));
        /*
		 * 删除对象
		 */
//        boolean flag = utils.deleteObject("mybucket", "you5topic.jpg");
//        System.out.println(flag);
        
       
        
      
	}
}
