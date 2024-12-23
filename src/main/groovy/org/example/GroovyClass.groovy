package org.example

class GroovyClass {

    def calculateFrequency(int[] arr) {
        def frequencyMap = [:].withDefault { 0 }

        arr.each { element ->
            frequencyMap[element]++
        }
        println frequencyMap
    }

}
