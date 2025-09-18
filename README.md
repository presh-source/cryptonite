# 🔐 Strong Password Checker (Java)

This repository contains a simple Java utility for validating password strength. It checks a given password against a set of configurable security rules to determine if it meets common strength requirements.

## Features

The checker validates the following password criteria:
- **Minimum Length**: Ensures the password is long enough.
- **No Spaces**: Rejects passwords containing whitespace.
- **Uppercase Letters**: Requires at least one uppercase letter (`A-Z`).
- **Lowercase Letters**: Requires at least one lowercase letter (`a-z`).
- **Digits**: Requires at least one number (`0-9`).
- **Special Characters**: Requires at least one special character (e.g., `!@#$%^&*`).

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed (version 8 or higher).

### Compilation
To compile the password checker, navigate to the root directory of the project and run the following command:
```bash
javac src/Main.java
```

## Usage

You can run the checker from the command line, providing the password and minimum length as arguments.

### Syntax
```bash
java -cp src Main "YourPassword" <MinimumLength>
```
- `"YourPassword"`: The password you want to check.
- `<MinimumLength>`: (Optional) The minimum required length for the password. Defaults to 8.

### Examples

1. **Check a custom password and length**:
   ```bash
   java -cp src Main "MyP@ssw0rd!" 10
   ```

2. **Check a password with the default minimum length (8)**:
   ```bash
   java -cp src Main "Str0ngP@ss!"
   ```

3. **Run with default example values**:
   If you run the program without any arguments, it will use a default password (`MyPassword1`) and minimum length (`8`).
   ```bash
   java -cp src Main
   ```

### Example Output
When you run the checker, it will print a detailed breakdown of each check:
```
Has minimum length: true
Contains space: false
Has upper case: true
Has lower case: true
Has digit: true
Has special character: true
Is overall strong: true
```
