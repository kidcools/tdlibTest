package org.drinkless.tdlib.utils;

import org.drinkless.tdlib.Client;
import org.drinkless.tdlib.TdApi;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileDownloadUtils {
    // 下载视频
//    private static void downloadVideo(Client client, TdApi.LocalFile videoFile) {
//        try {
//            // 创建文件输出流
//            FileOutputStream outputStream = new FileOutputStream("video.mp4");
//
//            // 通过TDLib下载视频文件
//            byte[] buffer = new byte[4096];
//            int bytesRead;
//            while ((bytesRead = (int) videoFile.downloadedSize) != 0) {
//                TdApi.Object result = client.execute(new TdApi.ReadFilePart(videoFile.id, videoFile.downloadOffset, videoFile.downloadedSize));
//                if (result instanceof TdApi.Error) {
//                    // 处理下载错误
//                    System.out.println("Error downloading video: " + ((TdApi.Error) result).message);
//                    return;
//                }
//                TdApi.FilePart filePart = (TdApi.FilePart) result;
//                outputStream.write(filePart.data);
//                videoFile.downloadOffset += bytesRead;
//            }
//
//            // 关闭文件输出流
//            outputStream.close();
//
//            System.out.println("Video downloaded successfully.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
