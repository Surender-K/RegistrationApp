# RegistrationApp
A pretty simple android app with Login, Register and Profile UI which uses MySQL database and PHP at backend to store user information into encrypted form. User can change the password using Forgot Password option in Login page or from profile section. The App uses DBOperations.php, Functions.php, and index.php files to communicate with MySQL database. You need to upload the PHP files on apache server and enter your DB information into DBOperations.php. Set the Base URL in Constants.java file and POST request URI in RequestInterface.java file.
For the Forgot Password feature to work, you need to extract the PHPMailer.zip file into the root of project directory where other files (DBOperations.php, Functions.php, and index.php) are located. Open functions.php, go to sendEmail function and change the following information:

  $mail->Host = 'localhost';  //your SMTP host
  $mail->SMTPAuth = true;   //SMTP requires authentication
  $mail->Username = 'info@myapp.com';   //SMTP username
  $mail->Password = 'Test123';    //Password
  $mail->SMTPSecure = 'ssl';  // or TLS
  $mail->Port = 587;  //port
