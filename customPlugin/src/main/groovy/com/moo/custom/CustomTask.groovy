package com.moo.custom

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class CustomTask extends DefaultTask {

    CustomTask() {
        setGroup("custom")
    }

    @TaskAction
    def runTask() {
        def extention = project.extensions.findByType(CustomExtension)
        println extention.toString()
    }
}