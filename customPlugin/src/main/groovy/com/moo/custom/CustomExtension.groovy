package com.moo.custom

class CustomExtension {
    String path
    int number = 0

    @Override
    String toString() {
        return "$path --- $number"
    }
}