# Armored-Pigeon

Armored Pigeon is a Java desktop chat application focused on private communication using RSA-based encryption, desktop identity validation, and local chat/cache persistence. The project is implemented with Java Swing (NetBeans GUI forms) and communicates with a backend service through serialized socket packets.

## Project Overview

Armored Pigeon provides a traditional desktop instant messaging workflow:

- User registration and login.
- Friend discovery and friend request handling.
- 1-to-1 messaging.
- File/message backup on local disk.
- Local user cache for faster startup.
- Public/private key generation and RSA encryption utilities.

The desktop client UI is implemented under `src/com/armored/pigeon/frames` and coordinated around the main chat screen (`ChatFrame`) after authentication.

---

## Core Features

- **Authentication flow**
  - Login and registration screens with validation and server calls.
  - Dedicated desktop identity display/check flow.

- **Chat and contact management**
  - Friend list rendering, request handling, and profile/info dialogs.
  - Message send/receive and chat panel rendering.

- **Local persistence**
  - User-level cache files (`.apc`) for profile/friend/request data.
  - Conversation history files (`.cht`) under per-user chat-history directories.

- **Security primitives**
  - RSA key pair generation (`2048-bit`) via `keyDistributor`.
  - RSA encryption helpers for public/private key encryption via `encryptor`.

- **Client-server protocol wrapper models**
  - DTOs for operation routing and user payloads.
  - Serializable packet-driven interaction model.

---

## Tech Stack

- **Language:** Java 8
- **UI:** Java Swing + NetBeans GUI Builder (`.form` files)
- **Build Tooling:** Apache Ant (NetBeans project structure)
- **Networking:** Java Sockets with custom packet sender/receiver abstractions
- **Serialization:** Java object serialization for DTOs and cached data
- **Security:** Java Cryptography Architecture (`Cipher`, `KeyPairGenerator`, RSA)
- **Dependencies (bundled under `dist/lib`):**
  - MySQL Connector/J
  - AbsoluteLayout
  - Swing Layout

---

## Repository Structure

```text
src/com/armored/pigeon/
  DTO/            -> operation + user transfer objects
  cache/          -> user cache models and cache processor
  chatBackup/     -> message model, message processor, history reader/writer
  encryption/     -> RSA key distribution and encryption helpers
  exceptions/     -> custom exception(s)
  frames/         -> Swing UI screens/forms (login, chat, register, friend/request/info)

nbproject/        -> NetBeans/Ant build configuration
build/            -> compiled classes
dist/             -> distributable jar + runtime libs
Cache/            -> runtime-generated local cache files
```

---

## How to Run

### Option 1: Run prebuilt artifact

From project root:

```bash
java -jar dist/ArmoredPigeon.jar
```

### Option 2: Build with Ant (NetBeans project)

```bash
ant clean jar
java -jar dist/ArmoredPigeon.jar
```

> Note: The client expects the corresponding backend/server-side components and protocol endpoints to be available for full login/chat functionality.

---

## Data Storage Conventions

The client stores user data locally:

- **User cache:** `./Cache/User/<loginId>.apc`
- **Chat history:** `./Chat History/<currentUser>/<friendId>.cht`
- **Downloaded incoming files:** `./Downloads/` (created automatically when needed)

This allows local state recovery (friend list, requests, message history) across app restarts.

---

## Future Improvements

- Improve key management and end-to-end cryptography workflow documentation.
- Add automated tests for cache/message serialization routines.
- Introduce a portable path strategy (cross-platform separators and config-based directories).
- Add CI build pipeline for reproducible packaging.
- Add protocol/version docs for client-server compatibility.
