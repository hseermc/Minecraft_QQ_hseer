@echo off

mkdir "build"
mkdir ".gradle"

mklink /j "server/src/main/java/com/coloryr/minecraft_qq/core" "core"

mklink /j "server/build" "build"

mklink /j "server/.gradle" ".gradle"