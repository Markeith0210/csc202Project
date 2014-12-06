mkdir \output
dir /s /B *.java > sources.txt
javac @sources.txt -d ./output/