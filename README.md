products-service

A small Spring Boot microservice that exposes product lists for three categories: Food items, Infused Ice options, and Speciality Drinks. The service uses Spring Data MongoDB for persistence and includes OpenAPI/Swagger UI for API exploration.

## Checklist
- [x] Add a clear project overview
- [x] Document prerequisites and configuration
- [x] Provide build and run instructions (PowerShell-friendly)
- [x] List available API endpoints and example requests
- [x] Explain how to configure MongoDB connection and where to find the OpenAPI UI

## Project layout (important files)
- `pom.xml` — Maven project descriptor
- `src/main/java/burhasthchs/products` — Java sources
  - `food`, `infusedIce`, `specialityDrink` — feature packages (controllers, models, repositories, services)
- `src/main/resources/application.properties` — default configuration (MongoDB URI)

## Prerequisites
- Java JDK 25 or compatible (POM sets maven.compiler.source/target to 25)
- Maven 3.6+ (or newer)
- A running MongoDB instance (default in `application.properties` points to `mongodb://localhost:27017/productsdb`)

## Configuration
The default MongoDB connection is in `src/main/resources/application.properties`:

```
spring.data.mongodb.uri=mongodb://localhost:27017/productsdb
spring.data.mongodb.database=productsdb
```

Override via environment variable or command line if needed. Example PowerShell usage when running:

```powershell
$env:SPRING_DATA_MONGODB_URI = 'mongodb://user:pass@db-host:27017/yourdb'
$env:SPRING_DATA_MONGODB_DATABASE = 'yourdb'
mvn spring-boot:run
```

## Build

From the repository root run (PowerShell):

```powershell
mvn clean package
```

## Run

Run with Maven (hot-reload during development):

```powershell
mvn spring-boot:run
```

Or run the packaged jar after a successful `mvn package`:

```powershell
java -jar .\target\products-service-1.0-SNAPSHOT.jar
```

## API

The service exposes simple read endpoints (GET) for each product category:

- GET /api/food — returns all food items
- GET /api/infused-ice — returns all infused ice options
- GET /api/speciality-drink — returns all speciality drinks

Examples (PowerShell / curl):

```powershell
curl.exe http://localhost:8080/api/food
curl.exe http://localhost:8080/api/infused-ice
curl.exe http://localhost:8080/api/speciality-drink
```

## OpenAPI / Swagger UI

This project includes `springdoc-openapi-starter-webmvc-ui`. Once the application is running, open the Swagger UI to explore the API and see request/response schemas:

```
http://localhost:8080/swagger-ui/index.html
```

## Notes about the data model
- `FoodItem` — fields include id, name, category, ingredients (list), and isVegan flag
- `InfusedIce` — fields include id, drinkName, iceType, alcoholCompatible, and giftBundleAvailable
- `SpecialityDrink` — fields include id, name, tagline, limitedEdition, dealCompatible

## Seeding sample data
There are no built-in data seeds. Use the Mongo shell, MongoDB Compass, or your own scripts to insert documents into the collections used by the models:
- `food_items`
- `infused_ice`
- `special_drinks`

Example (mongo shell):

```js
use productsdb
db.special_drinks.insertOne({ name: 'Mango Breeze', tagline: 'Tropical twist', limitedEdition: false, dealCompatible: true })
```

## Development notes
- Controllers are minimal and return lists from corresponding services which delegate to Spring Data MongoDB repositories.
- OpenAPI annotations (io.swagger / io.swagger.v3) are present on controllers to improve generated docs.

## Troubleshooting
- If the app cannot connect to MongoDB, verify `spring.data.mongodb.uri` and that your MongoDB instance is reachable.
- If you have a different Java version, update the `maven.compiler.source` and `target` in `pom.xml` or install a matching JDK.

## Contributing
- Feel free to open issues or pull requests. Keep changes small and focused; add unit/integration tests where appropriate.

## License
- No license file is included in this repository. Add one (for example, MIT) if you plan to publish.

## Contact
- For questions about the codebase, open an issue describing the problem, or contact the repository owner.

