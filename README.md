# 🎮 Hangman Game

A simple **Hangman word guessing game built in Java**.
The player has **6 attempts** to guess a randomly selected word, one letter at a time.

## ✨ Features

* 🎲 Randomly selects a word from a predefined list
* 🔤 Guess the word one letter at a time
* ❤️ 6 attempts for each game
* ✅ Detects correct and incorrect guesses
* 🏆 Displays a congratulations message when you win
* 💀 Reveals the word when you run out of attempts

## 🛠️ Technologies Used

* **Java**
* `Random` — for selecting a random word
* `Scanner` — for taking user input

## 📂 Project Structure

```text
Hangman/
│
└── Hangman.java
```

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/your-username/Hangman.git
```

### 2. Open the project

Open the project in **VS Code**, **IntelliJ IDEA**, or any Java-supported IDE.

### 3. Compile the program

```bash
javac Hangman.java
```

### 4. Run the program

```bash
java Hangman
```

## 🎯 How to Play

1. The game randomly selects a word.
2. The word is displayed as underscores (`_`).
3. Enter one letter when prompted.
4. If the letter is present, it will be revealed.
5. An incorrect guess reduces your attempts by 1.
6. Guess the complete word before your attempts reach 0 to win!

### Example

```text
Word: _ _ _ _

Attempts Left: 6
Guess a letter: j

Word: j _ _ _

Attempts Left: 6
Guess a letter: x

Wrong guess!

Attempts Left: 5
```

## 🚀 Future Improvements

* Add a graphical Hangman drawing
* Add more words
* Prevent duplicate guesses
* Add difficulty levels
* Add score tracking
* Add a play-again option

## 📚 Learning Concepts

This project demonstrates basic Java concepts such as:

* Arrays
* Strings
* Character arrays
* Loops
* Conditional statements
* `Random`
* `Scanner`
* Methods and classes
* User input handling

## 👨‍💻 Author

**Raj Sharma**

A simple Java project created for learning and practicing programming fundamentals.
