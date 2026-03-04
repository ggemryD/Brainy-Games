# Brainy Games 🧠🎮

A collection of fun and challenging terminal-based games written in Java. Developed as a final project during my first year of college.

##  Games Included

### 1. 🧩 Riddle Game (Easy)
Test your wit with a series of clever riddles!
- **Mechanics**: You start with **5 Hearts**. 
- **Goal**: Answer all riddles correctly to win.
- **Challenge**: Each wrong answer costs you a heart. Don't let them run out!

### 2. 🔡 Unscramble the Words (Medium)
Unscramble letters to find the hidden word!
- **Mechanics**: You have **2 attempts** per word.
- **Points**: 
  - **10 points** if guessed on the 1st attempt.
  - **5 points** if guessed on the 2nd attempt.
- **Goal**: Score as many points as possible across 10 rounds.

### 3. 🃏 Guess the Ace Card (Hard)
A classic game of chance and observation.
- **Mechanics**: Find the Ace ('A') among three shuffled cards ('J', 'A', 'Q').
- **Goal**: Reach **P1000** in cash by betting wisely.
- **Starting Cash**: P150.
- **Challenge**: If your cash hits 0, it's game over!

## 🚀 How to Run

1.  **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/brainy-games.git
    cd brainy-games
    ```

2.  **Compile the code**:
    ```bash
    javac BrainyGames.java
    ```

3.  **Run the game**:
    ```bash
    java BrainyGames
    ```

## ✨ Key Features
- **Player Profiles**: Enter your name at the start to "log in" (stored in `loginNames.txt`).
- **ASCII Art**: Retro terminal aesthetics for a more immersive experience.
- **Interactive UI**: Simple menu-driven navigation.
- **Cross-Platform**: Includes a `clearScreen()` method that works on both Windows and Unix-based systems.

## 🛠️ Built With
- **Language**: Java
- **Concepts Used**:
  - File I/O (FileWriter/FileReader)
  - Control Flow (Switch-case, If-else)
  - Loops (Do-while, While)
  - Random Number Generation
  - Static Methods for modularity

---
*Developed as a first-year college final project to demonstrate foundational Java programming skills.*
