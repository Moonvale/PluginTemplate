# Plugin Template

This repository provides a basic structure for a Moonvale Paper 1.21 plugin made in Kotlin. It includes Paper and Twilight dependencies.

## Getting Started

To start a new plugin for Moonvale, follow these steps:

1. **Clone the Repository**:
    ```sh
    git clone https://github.com/Moonvale/PluginTemplate.git <your-new-project-folder>
    cd <your-new-project-folder>
    ```

2. **Update Project Settings**:
    - Open `settings.gradle.kts` and change the root project name to your new plugin name.
    - Rename the package in the `src/main/kotlin` directory to match your new plugin's package structure.
    - Rename the main class file to match your new plugin's main class name.
    - Update the `plugin.yml` file with your new plugin's name, version, and main class path.

3. **Change GitHub Repository**:
    - Remove the existing remote repository link:
        ```sh
        git remote remove origin
        ```
    - Add your new GitHub repository link:
        ```sh
        git remote add origin <your-new-repo-url>
        ```
    - Push the changes to your new repository:
        ```sh
        git push -u origin main
        ```

## Project Structure

- `build.gradle.kts`: Gradle build script with dependencies and build configurations.
- `settings.gradle.kts`: Gradle settings file.
- `src/main/kotlin`: Source directory for Kotlin code.
- `src/main/resources/plugin.yml`: Plugin configuration file.
- `.gitignore`: Git ignore file to exclude certain files from version control.

## Dependencies

- **Paper**: Minecraft server software.
- **Twilight**: A library to simplify the development of Kotlin plugins for Minecraft.

## GitHub Actions Workflow

This project includes a GitHub Actions workflow that builds the Gradle project and runs Diktat for linting. The workflow is defined in the `.github/workflows/build-lint-doc.yml` file and runs on all branches.

## Using the Linter Locally

To use the Diktat linter locally for checking and fixing code style issues, follow these steps:

1. **Run Diktat Check**:
   To check for code style issues, use the following command:
   ```sh
   ./gradlew diktatCheck
   ```

2. **Run Diktat Fix**:
   To automatically fix code style issues, use the following command:
   ```sh
   ./gradlew diktatFix
   ```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Author

Moonvale Development - [https://moonvale.eu](https://moonvale.eu)