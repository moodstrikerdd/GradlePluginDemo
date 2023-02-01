package com.moo.buildsrc;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

/**
 * @author dingdong
 * @date 2023/1/30
 * description:
 */
public class JavaPluginTask extends DefaultTask {

    @TaskAction
    public void taskRun() {
        System.out.println("JavaPluginTask");
    }
}
