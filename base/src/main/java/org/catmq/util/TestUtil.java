package org.catmq.util;

import org.catmq.constant.FileConstant;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TestUtil {
    /**
     * commit-log的储存路径
     */
    public static void setCommitLogPathProperty() {
        System.setProperty(FileConstant.COMMIT_LOG_PATH, "F:\\JavaLearning\\MQ\\broker\\");
    }

    /**
     * 清除commit-log的储存路径
     */
    public static void clearCommitLogPathProperty() {
        System.clearProperty(FileConstant.COMMIT_LOG_PATH);
    }

    /**
     * 删除commit-log文件
     *
     * @throws IOException
     */
    public static void deleteCommitLogFiles() throws IOException {
        try (Stream<Path> walk = Files.walk(new File(System.getProperty(FileConstant.COMMIT_LOG_PATH)).toPath())) {
            walk.map(Path::toFile)
                    .filter(file -> file.isFile() && file.getName().length() == 20)
                    .forEach(file -> {
                        System.out.println(file.delete());
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
