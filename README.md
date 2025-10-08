# Milestone 1 - News Article Preprocessing

## Team Members
- Derek Maxim
- Kobichdi Ezeokoli
- Isabela Arteaga

## Project Description
This project preprocesses news articles by removing stop words, calculating statistics, and ranking words by frequency.

## Classes

### 1. TextPreprocessor
Handles reading files and removing stop words.

**Methods:**
- `loadStopWords(String file)` - loads stop words from a text file
- `processFile(String file)` - reads a file and removes stop words and punctuation
- `processDirectory(String path)` - processes all .txt files in a folder

### 2. StatisticsCalculator
Calculates word statistics.

**Methods:**
- `countWords()` - returns total number of words
- `countUnique()` - returns number of unique words
- `countFrequency()` - counts how many times each word appears
- `show()` - displays the statistics

### 3. WordFrequencyRanker
Ranks words by how often they appear.

**Methods:**
- `sort()` - sorts words by frequency (highest first)
- `showTop(int num)` - displays top N most frequent words

### 4. Main
Runs the program and coordinates all the classes.

## How to Run
1. Compile: `javac -d bin src/*.java`
2. Run: `java -cp bin Main`

## Files
- News articles are in `data/news_articles/`
- Stop words list is in `data/resources/stopwords.txt`

