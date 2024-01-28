package JavaSocketProgramming;

import java.io.*;
 import java.net.*;
 import java.util.Date;

11 public class Server extends Application {
12 @Override // Override the start method in the Application class
13 public void start(Stage primaryStage) {
14 // Text area for displaying contents
15 TextArea ta = new TextArea();
16
17 // Create a scene and place it in the stage
18 Scene scene = new Scene(new ScrollPane(ta), 450, 200);
19 primaryStage.setTitle("Server"); // Set the stage title
20 primaryStage.setScene(scene); // Place the scene in the stage
21 primaryStage.show(); // Display the stage
22
23 new Thread(() -> {
24 try {
25 // Create a server socket
26 ServerSocket serverSocket = new ServerSocket(8000);
27 Platform.runLater(() ->
28 ta.appendText("Server started at " + new Date() + '\n'));
29
30 // Listen for a connection request
31 Socket socket = serverSocket.accept();
32
33 // Create data input and output streams
34 DataInputStream inputFromClient = new DataInputStream(
35 socket.getInputStream());
36 DataOutputStream outputToClient = new DataOutputStream(
37 socket.getOutputStream());
38
39 while (true) {
40 // Receive radius from the client
41 double radius = inputFromClient.readDouble();
42
43 // Compute area
44 double area = radius * radius * Math.PI;
45
46 // Send area back to the client
47 outputToClient.writeDouble(area);
48
49 Platform.runLater(() -> {
50 ta.appendText("Radius received from client: "
51 + radius + '\n');
52 ta.appendText("Area is: " + area + '\n');
53 });
54 }
55 }
56 catch(IOException ex) {
57 ex.printStackTrace();
58 }
59 }).start();
60 }
61 }