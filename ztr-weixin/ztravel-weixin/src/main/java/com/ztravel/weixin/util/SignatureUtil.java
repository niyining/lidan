package com.ztravel.weixin.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.travelzen.framework.config.tops.TopsConfReader;
import com.travelzen.framework.config.tops.TopsConfEnum.ConfScope;

public class SignatureUtil {

    // 与接口配置信息中的Token要一致
    private static String token = TopsConfReader.getConfContent("properties/wx-pay.properties", "token", ConfScope.R) ;

    /**
     * 验证签名
     * @param signature
     * @param timestamp
     * @param nonce
     * @return
     */
    public static boolean checkSignature(String signature, String timestamp,
        String nonce) {
        String[] arr = new String[] { token, timestamp, nonce };
        // 将token、timestamp、nonce三个参数进行字典序排序
        //Arrays.sort(arr);
        sort(arr);
        StringBuilder content = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            content.append(arr[i]);
        }
        MessageDigest md = null;
        String tmpStr = null;

        try {
            md = MessageDigest.getInstance("SHA-1");
            // 将三个参数字符串拼接成一个字符串进行sha1加密
            byte[] digest = md.digest(content.toString().getBytes());
            tmpStr = byteToStr(digest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        content = null;
        // 将sha1加密后的字符串可与signature对比，标识该请求来源于微信
        return tmpStr != null ? tmpStr.equals(signature.toUpperCase()) : false;
        }

     /**
      * 将字节数组转换为十六进制字符串
      * @param byteArray
      * @return
      */
     private static String byteToStr(byte[] byteArray) {
         String strDigest = "";
         for (int i = 0; i < byteArray.length; i++) {
             strDigest += byteToHexStr(byteArray[i]);
         }
         return strDigest;
     }

     /**
      * 将字节转换为十六进制字符串
      *
      * @param mByte
      * @return
      */
     private static String byteToHexStr(byte mByte) {
         char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
                 'B', 'C', 'D', 'E', 'F' };
         char[] tempArr = new char[2];
         tempArr[0] = Digit[(mByte >>> 4) & 0X0F];
         tempArr[1] = Digit[mByte & 0X0F];

         String s = new String(tempArr);
         return s;
     }

     public static void sort(String a[]) {
         for (int i = 0; i < a.length - 1; i++) {
             for (int j = i + 1; j < a.length; j++) {
                 if (a[j].compareTo(a[i]) < 0) {
                     String temp = a[i];
                     a[i] = a[j];
                     a[j] = temp;
                 }
             }
         }
     }

}
