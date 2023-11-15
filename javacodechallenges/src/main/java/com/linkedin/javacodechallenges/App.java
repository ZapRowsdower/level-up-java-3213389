package com.linkedin.javacodechallenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
        public static List<String> findStudentsWithIncompleteVolunteerEvents(
                        List<String> students,
                        Map<String, List<String>> attendeesMapping) {
                var studentEventCount = new HashMap<String, Integer>();
                // Set up a hash map of students and their event counts
                students.forEach((student) -> {
                        studentEventCount.put(student, 0);
                });
                // Now check attendance by getting a Collection of attendees per volunteer event
                var iterAttendeesMapping = attendeesMapping.values();
                List<String> results = new ArrayList<String>();
                for (List<String> attenddeesList : iterAttendeesMapping) {
                        attenddeesList.forEach((attendee) -> {
                                if (!studentEventCount.containsKey(attendee)) {
                                        return;
                                }
                                var attendeeCount = studentEventCount.get(attendee);
                                studentEventCount.put(attendee, attendeeCount + 1);
                        });
                }
                // If a given student's attendance count is below 2, report that
                studentEventCount.forEach((student, count) -> {
                        if (count < 2) {
                                results.add(student);
                        }
                });
                return results;
        }

        public static void main(String[] args) {
                List<String> students = List.of("Sally", "Polly", "Molly",
                                "Tony", "Harry");

                Map<String, List<String>> attendeesMapping = Map.of("Farmer's Market", List.of("Sally", "Polly"),
                                "Car Wash Fundraiser", List.of("Molly", "Tony", "Polly"),
                                "Cooking Workshop", List.of("Sally", "Molly", "Polly"),
                                "Midnight Breakfast", List.of("Polly", "Molly"));

                System.out.println(findStudentsWithIncompleteVolunteerEvents(
                                students, attendeesMapping));
        }

}
