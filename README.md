# Smart Campus Activity Booking System — Procedural Paradigm

## Overview
This is the procedural-paradigm implementation of the Smart Campus Activity Booking System, built in Java. It manages student registration for a campus activity using static methods and arrays, without object-oriented structuring.

## Features
- **Add Participant:** Registers a student if the activity has not reached capacity (20 students max).
- **Remove Participant:** Removes a student from the registration count.
- **Check Participant:** Checks whether a given student is registered.
- **Display Participants:** Sorts and displays all currently registered students alphabetically.
- **Activity Details:** Stores and prints the activity's title, schedule, and location.

## Structure
All data (activity details, participant list, counters) is stored in `static` variables shared across the class's methods — a hallmark of the procedural paradigm, where data and behavior are kept separate rather than bundled into objects.

## Tools Used
- Java

## File
- `ProceduralBooking.java` — full source code with a runnable `main` method demonstrating all features
