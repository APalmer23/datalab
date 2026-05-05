# **Student Stress Analyzer**
---

### **Overview**

The Student Stress Analyzer is an analysis tool that allows the analyst to access patterns within the study, sleep, and social media habits, and the resulting exam scores and stress levels, for a pool of students.

---

### **Installation**

1. Clone the repository
2. Interact with the console in the Main class to load data

---

### **Usage**

* **Load file of students with data:** `loadFromFile()`
    File format: ```"id,study_hours,sleep_hours,social_media_hours,exam_score,stress_level \n 1,2,6,5,55,High"```
* **List students in descending order by hours spent studying:** `listByStudyHours()`
* **List students in descending order by hours spent sleeping:** `listBySleepHours()`
* **List students in descending order by hours spent on social media:** `listByMediaHours()`
* **List students in descending order by exam score:** `listByScore()`
* **Get a list of all students who have a specific stress level:** `getByLevel(String str)`
* **Get a specific student's data:** `getStudent(int id)`
* **Mean, Median, and Modes of data by a specific variable:**
```
    getMeanSleepHours()
    getMedianStudyHours()
    getModeMediaHours()
    getMeanScore()
```

---

### **Resources**

* Utilized Kaggle for test data [Dataset](https://www.kaggle.com/datasets/hassanali789/student-stress-and-study-behavior-dataset?resource=download)

---