<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"
    android:padding="24dp"
    android:background="#101820">

    <!-- App Title -->
    <TextView
        android:id="@+id/appTitle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Fahim's Injector"
        android:textSize="26sp"
        android:textStyle="bold"
        android:textColor="#FFFFFF"
        android:layout_marginBottom="32dp"/>

    <!-- Username Input -->
    <EditText
        android:id="@+id/usernameInput"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Username"
        android:padding="12dp"
        android:background="@drawable/input_field"
        android:textColor="#FFFFFF"
        android:textColorHint="#AAAAAA"
        android:layout_marginBottom="16dp"/>

    <!-- Password Input -->
    <EditText
        android:id="@+id/passwordInput"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Password"
        android:inputType="textPassword"
        android:padding="12dp"
        android:background="@drawable/input_field"
        android:textColor="#FFFFFF"
        android:textColorHint="#AAAAAA"
        android:layout_marginBottom="24dp"/>

    <!-- Login Button -->
    <Button
        android:id="@+id/loginButton"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Login"
        android:textAllCaps="false"
        android:textSize="18sp"
        android:textColor="#FFFFFF"
        android:background="@drawable/login_button"/>

</LinearLayout>
