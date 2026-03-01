# 🚗 Smart Parking Lot System (Core Java Implementation)

## 📌 Project Overview

This project is a Low-Level Design (LLD) implementation of a Smart Parking Lot System using Core Java.

The system manages:
- Vehicle entry (Check-in)
- Automatic parking spot allocation
- Vehicle exit (Check-out)
- Parking fee calculation
- Real-time spot availability updates

This project demonstrates object-oriented design principles and clean code structure.

---

## 🎯 Features

- ✅ Automatic parking spot allocation based on vehicle type
- ✅ Tracks entry and exit time
- ✅ Calculates parking fee based on duration and vehicle type
- ✅ Updates parking spot availability in real time
- ✅ Multi-layered design (Model, Service, Enums)

---

## 🏗️ Project Structure
SmartParkingLot
└── src
├── enums
│ ├── VehicleType.java
│ ├── SpotType.java
│ └── TicketStatus.java
│
├── model
│ ├── Vehicle.java
│ ├── ParkingSpot.java
│ ├── ParkingFloor.java
│ ├── ParkingLot.java
│ └── Ticket.java
│
├── service
│ ├── FeeCalculator.java
│ └── ParkingService.java
│
└── Main.java


---

## 🚘 Vehicle Types Supported

- MOTORCYCLE
- CAR
- BUS

---

## 🅿️ Parking Spot Types

- SMALL
- MEDIUM
- LARGE

---

## 💰 Fee Structure

| Vehicle Type | Rate per Hour |
|--------------|--------------|
| Motorcycle   | ₹10          |
| Car          | ₹20          |
| Bus          | ₹50          |

Minimum billing duration: 1 hour

---

## ⚙️ How It Works

### 🔹 Parking Flow
1. Vehicle enters
2. System finds available matching spot
3. Spot is marked as occupied
4. Ticket is generated with entry time

### 🔹 Unparking Flow
1. Ticket ID is provided
2. Exit time is recorded
3. Duration is calculated
4. Fee is calculated
5. Spot is marked free

---

## ▶️ How to Run the Project

### Using IntelliJ IDEA

1. Open IntelliJ
2. Open the `SmartParkingLot` project
3. Navigate to `Main.java`
4. Right-click → Run

---

## 🧠 Design Principles Used

- Object-Oriented Programming
- Separation of Concerns
- Clean Package Structure
- Enum-based Type Safety
- Service Layer Abstraction

---

## 🔮 Future Enhancements

- Add multiple floors dynamically
- Add concurrency handling
- Add console-based interactive menu
- Integrate database support
- Add REST API layer

---

## 📚 Assignment Context

This project is created as a Low-Level Design (LLD) assignment to demonstrate:
- System design thinking
- Object modeling
- Algorithm implementation
- Clean architecture

---

## 👨‍💻 Author

Kundan Kumar