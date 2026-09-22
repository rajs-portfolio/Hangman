# 🎮 Hangman Game – Java

A simple **Hangman word guessing game made with Java**.
The player needs to guess the hidden word by entering one letter at a time.

You have **6 chances** to guess the word correctly!

## ✨ Features

* 🎲 Picks a random word from a list
* 🔤 Allows you to guess one letter at a time
* ❤️ Gives you 6 chances
* ✅ Shows correctly guessed letters
* ❌ Reduces a chance when you guess the wrong letter
* 🏆 Shows a winning message when you guess the word
* 💀 Shows the correct word if you lose

## 🛠️ Technologies Used

* **Java**
* `Random` – to choose a random word
* `Scanner` – to get input from the player

## 📂 Project Structure

```text
Hangman/
│
└── Hangman.java
```

## ▶️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/Hangman.git
```

### 2. Open the Project

Open the project using **VS Code**, **IntelliJ IDEA**, or any other Java-supported IDE.

### 3. Compile the Program

Open the terminal inside the project folder and run:

```bash
javac Hangman.java
```

### 4. Start the Game

```bash
java Hangman
```

## 🎯 How to Play

1. The game chooses a random word.
2. The letters of the word are hidden using `_`.
3. Enter one letter when asked.
4. If the letter is correct, it will be shown.
5. If the letter is wrong, you lose one chance.
6. Keep guessing until you find the complete word.
7. Guess the word before you run out of chances to win!

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

Some features that can be added later:

* 🎨 Add a graphical Hangman drawing
* 📚 Add more words
* 🔄 Add a play-again option
* 🚫 Prevent guessing the same letter twice
* 🎯 Add different difficulty levels
* 🏆 Add a scoring system

## 📚 What I Learned

This project helped me practice basic Java concepts such as:

* Arrays
* Strings
* Character arrays
* Loops
* `if-else` statements
* Methods
* Classes
* `Random`
* `Scanner`
* Taking input from the user

## 👨‍💻 Author

**Raj Sharma**

A beginner-friendly Java project created to practice programming fundamentals and improve problem-solving skills.
