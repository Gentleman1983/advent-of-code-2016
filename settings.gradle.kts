plugins {
    id("com.gradle.develocity") version("4.0.2")
}

rootProject.name = "advent-of-code-2016"

include("aoc2016")
include("aoc2016:aoc2016-java")
include("aoc2016:aoc2016-kotlin")

include("utils")
include("utils:utils-java")
include("utils:utils-kotlin")
