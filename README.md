# Jessica - Unsplash Image Gallery App

A modern Android application built with Jetpack Compose that displays beautiful images from Unsplash with search functionality and pagination support.

## 📱 Features

- **Browse Images**: View curated images from Unsplash in a grid layout
- **Search Functionality**: Search for specific images using keywords
- **Pagination**: Smooth infinite scrolling with efficient data loading
- **Modern UI**: Built with Jetpack Compose and Material Design 3
- **Offline Support**: Local caching with Room database
- **Clean Architecture**: MVVM pattern with Repository pattern

## 🛠 Tech Stack

### Core Technologies
- **Kotlin** - Primary programming language
- **Jetpack Compose** - Modern UI toolkit
- **Material Design 3** - UI components and theming

### Architecture & Libraries
- **MVVM Architecture** - Clean separation of concerns
- **Dagger Hilt** - Dependency injection
- **Room Database** - Local data persistence
- **Paging 3** - Efficient data loading and pagination
- **Retrofit** - HTTP client for API calls
- **Ktor Client** - Alternative HTTP client
- **Coil** - Image loading and caching
- **Navigation Compose** - In-app navigation

### API Integration
- **Unsplash API** - Source of high-quality images
- **Kotlinx Serialization** - JSON parsing

## 📋 Requirements

- **Minimum SDK**: 31 (Android 12)
- **Target SDK**: 34 (Android 14)
- **Compile SDK**: 34
- **Java Version**: 17
- **Gradle**: 8.12.1
- **Kotlin**: 1.9.21

## 🚀 Getting Started

### Prerequisites

1. **Android Studio** (latest stable version)
2. **JDK 17** or higher
3. **Unsplash API Key** (free from [Unsplash Developers](https://unsplash.com/developers))

### Installation

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd Jessica
   ```

2. **Configure API Key**
   - Open `app/src/main/java/com/example/jessicaSW/util/Constant.kt`
   - Replace the `API_KEY` value with your Unsplash API key:
   ```kotlin
   const val API_KEY = "Client-ID YOUR_UNSPLASH_ACCESS_KEY"
   ```

3. **Build and Run**
   ```bash
   ./gradlew assembleDebug
   ```
   Or open in Android Studio and run the project.

## 📁 Project Structure

```
app/src/main/java/com/example/jessicaSW/
├── data/                          # Data layer
│   ├── client/                    # API clients
│   ├── local/                     # Room database
│   │   ├── dao/                   # Data Access Objects
│   │   └── UnsplashDatabase.kt    # Database configuration
│   ├── model/                     # Data models
│   ├── paging/                    # Pagination sources
│   ├── remote/                    # API interfaces
│   ├── repository/                # Repository implementations
│   └── service/                   # Network services
├── di/                            # Dependency injection modules
├── navigation/                    # Navigation setup
├── ui/                            # UI layer
│   ├── application/               # Application class
│   ├── home/                      # Home screen components
│   ├── main/                      # Main activity
│   └── theme/                     # App theming
└── util/                          # Utility classes
```

## 🏗 Architecture

The app follows **Clean Architecture** principles with clear separation of concerns:

### Data Layer
- **Repository Pattern**: Centralized data access
- **Room Database**: Local caching and offline support
- **Retrofit/Ktor**: Network communication
- **Paging 3**: Efficient data loading

### Domain Layer
- **Use Cases**: Business logic encapsulation
- **Models**: Data representations

### Presentation Layer
- **MVVM Pattern**: ViewModels manage UI state
- **Jetpack Compose**: Declarative UI
- **Navigation Component**: Screen navigation

## 🔧 Configuration

### Build Configuration

The project uses **Version Catalogs** (`gradle/libs.versions.toml`) for dependency management:

- **AGP**: 8.12.1
- **Kotlin**: 1.9.21
- **Compose BOM**: 2024.04.00
- **Hilt**: 2.50
- **Room**: 2.5.0
- **Ktor**: 3.0.0-beta-1

### Proguard

Proguard rules are configured in `app/proguard-rules.pro` for release builds.

## 🧪 Testing

### Running Tests

```bash
# Unit tests
./gradlew test

# Instrumented tests
./gradlew connectedAndroidTest
```

### Test Structure
- **Unit Tests**: `app/src/test/`
- **Instrumented Tests**: `app/src/androidTest/`

## 📦 Build Variants

- **Debug**: Development build with debugging enabled
- **Release**: Production build with optimizations

## 🔐 Security

- API keys should be stored securely (consider using BuildConfig or local.properties)
- Network security configuration is handled by Android's default settings
- ProGuard obfuscation is applied in release builds

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

### Code Style

- Follow [Kotlin Coding Conventions](https://kotlinlang.org/docs/coding-conventions.html)
- Use meaningful variable and function names
- Add comments for complex logic
- Ensure all warnings are addressed (`allWarningsAsErrors = true`)

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- [Unsplash](https://unsplash.com/) for providing beautiful, free images
- [Android Jetpack](https://developer.android.com/jetpack) for modern Android development tools
- [Material Design](https://material.io/) for design guidelines

## 📞 Support

If you encounter any issues or have questions:

1. Check the [Issues](../../issues) section
2. Create a new issue with detailed information
3. Include device information and steps to reproduce

## 🔄 Version History

- **v1.0.0** - Initial release with core functionality
  - Unsplash image browsing
  - Search functionality
  - Pagination support
  - Offline caching

---

**Made with ❤️ using Jetpack Compose**