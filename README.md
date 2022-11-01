# Patrones 2-2022 Project

# Setup development environment

These system dependencies are required, **Linux OS** is preferred.

| System dependency | Version | Usage                   |
|-------------------|---------|-------------------------|
| docker            | >= 20   | Build images            |
| docker-compose    | >= 2    | Postgres |
| openjdk           | 19      | The programming language |
| maven             | 3       | Build Spring proyect     |

```bash
cp env.template .env
```

```bash
docker-compose up -d postgres
```

```bash
mvn spring-boot:run
```

Visit `http://localhost:8080`
