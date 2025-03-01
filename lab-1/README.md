# README - Principles of Programming
## 1. DRY (Don't Repeat Yourself)
The DRY principle is adhered to by reducing code duplication across the project. For example, the `Document` interface provides a common contract for various document types (`Passport`, `DriverLicense`, `MilitaryID`), allowing the same methods like `getInfo()`, `getName()`, and `generateQR()` to be reused across these classes.

### Code Reference:
- [Document Interface](lab-1/src/main/java/com/education/ztu/Interfaces/Document.java)
- [Passport Class](lab-1/src/main/java/com/education/ztu/Classes/Passport.java)
- [DriverLicense Class](lab-1/src/main/java/com/education/ztu/Classes/DriverLicense.java)
- [MilitaryID Class](lab-1/src/main/java/com/education/ztu/Classes/MilitaryID.java)

## 2. KISS (Keep It Simple, Stupid)
I aimed to keep the code simple and avoid unnecessary complexity. For instance, method like `getInfo()` in the `Document` classes are simple, self-explanatory, and avoid additional logic or complexity.
### Code Reference:
- [Passport Class](lab-1/src/main/java/com/education/ztu/Classes/Passport.java#L31-L39) - Method: `getInfo()`

## 3. SOLID Principles
I applied all five SOLID principles to ensure the system is robust, maintainable, and extensible.

### a. **Single Responsibility Principle (SRP)**
Each class has a single responsibility. For instance, `DocumentContainer` handles the collection of documents, while each document class (`Passport`, `DriverLicense`, etc.) is responsible for its own properties and behavior.

### b. **Open/Closed Principle (OCP)**
The system is open for extension but closed for modification. For example, you can add new document types (like `Passport`, `DriverLicense`, `MilitaryID`) without modifying existing classes, adhering to the OCP.

### c. **Liskov Substitution Principle (LSP)**
You can substitute any subclass of `Document` (e.g., `Passport`, `DriverLicense`) in place of the `Document` interface, and the code will still function correctly. This is demonstrated in the methods of `DocumentContainer`.

### d. **Interface Segregation Principle (ISP)**
The interfaces are designed to be small and client-specific. For example, `Document` interface provides only necessary methods related to documents, while `Identifiable` and `VehicleRegistrable` interfaces provide specific behaviors for other actions.

### e. **Dependency Inversion Principle (DIP)**
High-level modules (like `DocumentContainer`) do not depend on low-level modules (`Passport`, `DriverLicense`), but both depend on abstractions (`Document` interface). This ensures better flexibility and easier testing.

### Code Reference:
- [Document Interface](lab-1/src/main/java/com/education/ztu/Interfaces/Document.java)
- [Passport Class](lab-1/src/main/java/com/education/ztu/Classes/Passport.java)
- [DriverLicense Class](lab-1/src/main/java/com/education/ztu/Classes/DriverLicense.java)

## 4. YAGNI (You Aren't Gonna Need It)
I avoided adding unnecessary features or complexity that were not required for the task at hand. The `DocumentContainer` class, for example, only provides the methods that are essential to manage documents, avoiding any features that might not be necessary in the scope of the project.

### Code Reference:
- [DocumentContainer Class](lab-1/src/main/java/com/education/ztu/Classes/DocumentContainer.java)

## 5. Composition Over Inheritance
I favored composition over inheritance by using interfaces such as `Document`, `Identifiable`, and `VehicleRegistrable`. Instead of using inheritance, I composed objects that can implement multiple behaviors, ensuring greater flexibility.
### Code Reference:
- [Document Interface](lab-1/src/main/java/com/education/ztu/Interfaces/Document.java)
- [Identifiable Interface](lab-1/src/main/java/com/education/ztu/Interfaces/Identifiable.java)
- [VehicleRegistrable Interface](lab-1/src/main/java/com/education/ztu/Interfaces/VehicleRegistrable.java)

## 6. Program to Interfaces, Not Implementations
By programming to interfaces rather than concrete implementations, I ensured that the system is more flexible and can easily accommodate changes or additions to document types. For example, `DocumentContainer` interacts with the `Document` interface, not specific document classes.

### Code Reference:
- [DocumentContainer Class](lab-1/src/main/java/com/education/ztu/Classes/DocumentContainer.java)

## 7. Fail Fast
The code implements fail-fast behavior by throwing exceptions when invalid operations are attempted. For instance, the `addDocument()` and `removeDocument()` methods in `DocumentContainer` immediately throw an exception if an invalid document is added or removed.

### Code Reference:
- [DocumentContainer Class](lab-1/src/main/java/com/education/ztu/Classes/DocumentContainer.java#L13) - Methods: `addDocument()`, `removeDocument()`
