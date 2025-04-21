# Java A2A

Java implementation for the Agent-to-Agent Protocol (A2A), enabling interaction between AI agents through a standardized interface.

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## Project Description

The Java A2A project provides a complete Java implementation of the [Agent-to-Agent (A2A) Protocol](https://github.com/google/A2A), which is a standardized interface for enabling communication and interaction between AI agents. This implementation allows Java applications to integrate with AI agents that support the A2A protocol.

### Key Features

- Complete implementation of the A2A protocol specification
- JSON-RPC based messaging system for agent communication
- Support for task management (creation, status tracking, cancellation)
- Agent authentication and authorization
- Push notification support for task updates
- Comprehensive error handling

## Installation

### Prerequisites

- Java 24 or higher
- Maven 3.6 or higher

### Adding as a Dependency

Add the following to your `pom.xml`:

```xml
<dependency>
    <groupId>com.creativescenius</groupId>
    <artifactId>a2a</artifactId>
    <version>0.2-SNAPSHOT</version>
</dependency>
```

### Building from Source

1. Clone the repository:
   ```bash
   git clone https://github.com/creativescenius/java-a2a.git
   ```

2. Build the project:
   ```bash
   cd java-a2a
   mvn clean install
   ```

## Usage Examples

### Creating and Sending a Task

```java
import com.creativescenius.a2a.spec.*;

// Create a task with parameters
TaskSendParams taskParams = new TaskSendParams()
    .withAgent("agent-id")
    .withInput(new Message()
        .withParts(List.of(
            new TextPart().withText("Analyze this text")
        )));

// Create a send task request
SendTaskRequest request = new SendTaskRequest()
    .withParams(taskParams);

// Send the request and get a response
SendTaskResponse response = agentClient.sendTask(request);
String taskId = response.getResult().getTaskId();
```

### Checking Task Status

```java
// Create a get task request
GetTaskRequest request = new GetTaskRequest()
    .withParams(new TaskIdParams().withTaskId(taskId));

// Get the task status
GetTaskResponse response = agentClient.getTask(request);
TaskStatus status = response.getResult().getStatus();
```

### Cancelling a Task

```java
// Create a cancel task request
CancelTaskRequest request = new CancelTaskRequest()
    .withParams(new TaskIdParams().withTaskId(taskId));

// Cancel the task
CancelTaskResponse response = agentClient.cancelTask(request);
```

## Contribution Guidelines

We welcome contributions to the Java A2A project! Here's how you can contribute:

### Reporting Issues

- Use the [GitHub issue tracker](https://github.com/creativescenius/java-a2a/issues) to report bugs or suggest features
- Provide detailed information about the issue, including steps to reproduce

### Pull Requests

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

### Coding Standards

- Follow Java coding conventions
- Write unit tests for new features
- Update documentation as needed

## A2A Protocol Specification

The A2A protocol is a standardized interface for enabling communication between AI agents. It defines a set of JSON-RPC based methods for agent discovery, task management, and data exchange.

For more information about the A2A protocol, visit the [official A2A protocol repository](https://github.com/google/A2A).

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
