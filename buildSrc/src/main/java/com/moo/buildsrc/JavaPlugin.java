package com.moo.buildsrc;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class JavaPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getTasks().create("javaTask", JavaPluginTask.class);
    }
}