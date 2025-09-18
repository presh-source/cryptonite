# Cryptonite

Cryptonite is a simple, command-line-based Java application designed to validate the strength of a password. It checks a given password against a set of configurable criteria to determine if it can be considered "strong".

## Strong Password Criteria

To be considered strong, a password must meet the following requirements:

*   **Minimum Length:** The password must be at least a certain number of characters long. The default is 8, but this can be configured.
*   **No Spaces:** The password cannot contain any space characters.
*   **Character Variety:** The password must contain at least one of each of the following:
    *   An uppercase letter (`A-Z`)
    *   A lowercase letter (`a-z`)
    *   A digit (`0-9`)
    *   A special character (e.g., `!`, `@`, `#`, `$`, `%`, etc.)

## Usage

Since the original Java source code is not available in this repository, you cannot compile the project from scratch. However, you can run the provided compiled Java class from the root of the repository.

### Prerequisites

*   Java Runtime Environment (JRE) installed on your system.

### Running the Application

You can run the password checker from the root of the repository with the following command:

```bash
java -cp out/production/cryptonite StrongPasswordV1 [password] [minimum_length]
```

### Arguments

*   `password` (optional): The password you want to validate. If not provided, it defaults to `"MyPassword1"`.
*   `minimum_length` (optional): The minimum required length for the password. If not provided, it defaults to `8`.

### Example

To check the password "P@ssw0rd123" with a minimum length of 10, you would run:

```bash
java -cp out/production/cryptonite StrongPasswordV1 "P@ssw0rd123" 10
```

The application will then print out the results of each check and a final determination of whether the password is strong.
