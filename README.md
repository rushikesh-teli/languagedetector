# [Language Detection Using Apache Tika]

This java based program uses Apache Tika to find language of contents in text file passed in argument.

## Usage

Steps
* Set JAVA_HOME to JDK1.8 as it's written uing JDK 8 features
* clone repository "git clone https://github.com/rushikesh-teli/languagedetector.git"
* run "mvn clean install"
* mvn exec:java -Dexec.mainClass="viiew.nbn.App" -Dexec.args="{File Path}"

## Bugs and Issues

Detects languages only supported by Apache Tika.
Displays ISO 639 code of language
