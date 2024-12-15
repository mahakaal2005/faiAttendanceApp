package com.example.fai_attenance_app

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:background="#E3CC9F"
tools:context=".MainActivity3">

<androidx.constraintlayout.widget.Guideline
android:id="@+id/guideline"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:orientation="vertical"
app:layout_constraintGuide_begin="25dp" />
<androidx.constraintlayout.widget.Guideline
android:id="@+id/guideline2"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:orientation="vertical"
app:layout_constraintGuide_end="25dp" />
<androidx.constraintlayout.widget.Guideline
android:id="@+id/guideline3"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:orientation="horizontal"
app:layout_constraintGuide_begin="25dp" />
<androidx.constraintlayout.widget.Guideline
android:id="@+id/guideline4"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:orientation="horizontal"
app:layout_constraintGuide_end="25dp" />

<TextView
android:id="@+id/textView"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginTop="68dp"
android:paddingTop="20dp"
android:text="Welcome "
android:textSize="40dp"
android:textStyle="bold"
app:layout_constraintEnd_toStartOf="@+id/guideline2"
app:layout_constraintHorizontal_bias="0.0"
app:layout_constraintStart_toStartOf="@+id/guideline"
app:layout_constraintTop_toTopOf="@id/guideline3" />


<TextView
android:id="@+id/textview6"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginTop="68dp"
android:paddingTop="20dp"
android:text="name"
android:textSize="40dp"
android:textStyle="bold"
app:layout_constraintStart_toEndOf="@+id/textView"
app:layout_constraintTop_toTopOf="@id/guideline3" />

<Button
android:id="@+id/attendance"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginStart="100dp"
android:layout_marginTop="300dp"
android:backgroundTint="@color/black"
android:text="Attendance "
android:textSize="20dp"
app:layout_constraintEnd_toStartOf="@+id/guideline2"
app:layout_constraintHorizontal_bias="0.009"
app:layout_constraintStart_toStartOf="@+id/guideline"
app:layout_constraintTop_toTopOf="@+id/guideline3" />

<Button
android:id="@+id/timetable"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginTop="184dp"
android:backgroundTint="@color/black"
android:text="Time Table"
android:textSize="20dp"
app:layout_constraintEnd_toEndOf="@id/guideline2"
app:layout_constraintHorizontal_bias="0.495"
app:layout_constraintStart_toStartOf="@id/guideline"
app:layout_constraintTop_toBottomOf="@+id/attendance" />
</androidx.constraintlayout.widget.ConstraintLayout>