import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndRegisterTest {
  public static void main(String[] args) {
      // Set ChromeDriver path
      System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
      // Launch ChromeDriver
      WebDriver driver = new ChromeDriver();
      // Navigate to website
      driver.get("https://www.example.com");

      // Test Case 1: Successfully register with valid username and password
      driver.findElement(By.linkText("Register")).click();
      WebElement usernameInput = driver.findElement(By.id("username"));
      WebElement passwordInput = driver.findElement(By.id("password"));
      usernameInput.sendKeys("testuser");
      passwordInput.sendKeys("testpassword");
      passwordInput.submit();
      System.out.println("Test Case 1: Pass");



      // Test Case 2: Successfully log in with valid username and password
      driver.findElement(By.linkText("Login")).click();
      usernameInput = driver.findElement(By.id("username"));
      passwordInput = driver.findElement(By.id("password"));
      usernameInput.sendKeys("testuser");
      passwordInput.sendKeys("testpassword");
      passwordInput.submit();
      System.out.println("Test Case 2: Pass");

      // Test Case 3: Register with invalid username and/or password
      driver.findElement(By.linkText("Register")).click();
      usernameInput = driver.findElement(By.id("username"));
      passwordInput = driver.findElement(By.id("password"));
      usernameInput.sendKeys("");
      passwordInput.sendKeys("");
      passwordInput.submit();
      if (driver.getCurrentUrl().contains("register")) {
        System.out.println("Test Case 3: Pass");
      } else {
        System.out.println("Test Case 3: Fail");
      }




      // Test Case 4: Log in with invalid username and/or password
      driver.findElement(By.linkText("Login")).click();
      usernameInput = driver.findElement(By.id("username"));
      passwordInput = driver.findElement(By.id("password"));
      usernameInput.sendKeys("wronguser");
      passwordInput.sendKeys("wrongpassword");
      passwordInput.submit();
      if (driver.getCurrentUrl().contains("login")) {
        System.out.println("Test Case 4: Pass");
      } else {
        System.out.println("Test Case 4: Fail");
      }

      // Test Case 5: Register with an existing username
      driver.findElement(By.linkText("Register")).click();
      usernameInput = driver.findElement(By.id("username"));
      passwordInput = driver.findElement(By.id("password"));
      usernameInput.sendKeys("testuser");
      passwordInput.sendKeys("testpassword");
      passwordInput.submit();
      if (driver.getCurrentUrl().contains("register")) {
        System.out.println("Test Case 5: Pass");
      } else {
        System.out.println("Test Case 5: Fail");
      }

      // Test Case 6: Log in with a non-existent username
      driver.findElement(By.linkText("Login")).click();
      usernameInput = driver.findElement(By.id("username"));
      passwordInput = driver.findElement(By.id("password"));
      usernameInput.sendKeys("nonexistentuser");
      passwordInput.sendKeys("testpassword");
      passwordInput.submit();
      if (driver.getCurrentUrl().contains("login")) {
        System.out.println("Test Case 6: Pass");
      } else {
        System.out.println("Test Case 6: Fail");
      }
   
      // Test Case 7: Register with additional information
      driver.findElement(By.linkText("Register")).click();
      usernameInput = driver.findElement(By.id("username"));
      passwordInput = driver.findElement(By.id("password"));
      WebElement emailInput = driver.findElement(By.id("email"));
      WebElement ageInput = driver.findElement(By.id("age"));
      usernameInput.sendKeys("testuser2");
      passwordInput.sendKeys("testpassword");
      emailInput.sendKeys("testuser2@example.com");
      ageInput.sendKeys("30");
      passwordInput.submit();
      if (driver.getCurrentUrl().contains("login")) {
        System.out.println("Test Case 7: Pass");
      } else {
        System.out.println("Test Case 7: Fail");
      }
      This code navigates to the registration page, fills in the "username", "password", "email", and "age"
      fields with valid data, and submits the form.Then it checks
      if the page has redirected to the login page, indicating a successful registration.If the page URL contains "login", the test
      case is considered to have passed, otherwise it has failed.


      // Test Case 8: Log in with additional information
      driver.findElement(By.linkText("Login")).click();
      usernameInput = driver.findElement(By.id("username"));
      passwordInput = driver.findElement(By.id("password"));
      usernameInput.sendKeys("testuser");
      passwordInput.sendKeys("testpassword");
      passwordInput.submit();
      if (driver.getCurrentUrl().contains("dashboard")) {
        System.out.println("Test Case 8: Pass");
      } else {
        System.out.println("Test Case 8: Fail");
      }


      // Test Case 9: Log in with an email instead of a username
      driver.findElement(By.linkText("Login")).click();
      usernameInput = driver.findElement(By.id("username"));
      passwordInput = driver.findElement(By.id("password"));
      usernameInput.sendKeys("testuser@example.com");
      passwordInput.sendKeys("testpassword");
      passwordInput.submit();
      if (driver.getCurrentUrl().contains("login")) {
        System.out.println("Test Case 9: Pass");
      } else {
        System.out.println("Test Case 9: Fail");
      }

      // Test Case 10: Register with a weak password
      driver.findElement(By.linkText("Register")).click();
      usernameInput = driver.findElement(By.id("username"));
      passwordInput = driver.findElement(By.id("password"));
      usernameInput.sendKeys("testuser3");
      passwordInput.sendKeys("weak");
      passwordInput.submit();
      if (driver.getCurrentUrl().contains("register")) {
        System.out.println("Test Case 10: Pass");
      } else {
        System.out.println("Test Case 10: Fail");
      }

      // Test Case 11: Log in with a weak password
      driver.findElement(By.linkText("Login")).click();
      usernameInput = driver.findElement(By.id("username"));
      passwordInput = driver.findElement(By.id("password"));
      usernameInput.sendKeys("testuser");
      passwordInput.sendKeys("weak");
      passwordInput.submit();
      if (driver.getCurrentUrl().contains("login")) {
        System.out.println("Test Case 11: Pass");
      } else {
        System.out.println("Test Case 11: Fail");      }

      // Test Case 12: Log in with an empty password field
      driver.findElement(By.linkText("Login")).click();
      usernameInput = driver.findElement(By.id("username"));
      passwordInput = driver.findElement(By.id("password"));
      usernameInput.sendKeys("testuser");
      passwordInput.sendKeys("");
      passwordInput.submit();
      if (driver.getCurrentUrl().contains("login")) {
        System.out.println("Test Case 12: Pass");
      } else {
        System.out.println("Test Case 12: Fail");
      }

      // Test Case 13: Register with an empty username field
      driver.findElement(By.linkText("Register")).click();
      usernameInput = driver.findElement(By.id("username"));
      passwordInput = driver.findElement(By.id("password"));
      usernameInput.sendKeys("");
      passwordInput.sendKeys("testpassword");
      passwordInput.submit();
      if (driver.getCurrentUrl().contains("register")) {
        System.out.println("Test Case 13: Pass");
      } else {
        System.out.println("Test Case 13: Fail");      }

      // Test Case 14: Log in with an empty username field
      driver.findElement(By.linkText("Login")).click();
      usernameInput = driver.findElement(By.id("username"));
      passwordInput = driver.findElement(By.id("password"));
      usernameInput.sendKeys("");
      passwordInput.sendKeys("testpassword");
      passwordInput.submit();
      if (driver.getCurrentUrl().contains("login")) {
        System.out.println("Test Case 14: Pass");
      } else {
        System.out.println("Test Case 14: Fail");
      }

        
          // Test Case 15: Register with a username that contains special characters
          driver.findElement(By.linkText("Register")).click(); usernameInput = driver.findElement(By.id("username")); passwordInput = driver.findElement(By.id("password")); usernameInput.sendKeys("test#$%user"); passwordInput.sendKeys("testpassword"); passwordInput.submit();
          if (driver.getCurrentUrl().contains("register")) {
            System.out.println("Test Case 15: Pass");
          } else {
            System.out.println("Test Case 15: Fail");
          }


          // Test Case 16: Log in with a username that contains special characters
          driver.findElement(By.linkText("Login")).click(); usernameInput = driver.findElement(By.id("username")); passwordInput = driver.findElement(By.id("password")); usernameInput.sendKeys("test#$%user"); passwordInput.sendKeys("testpassword"); passwordInput.submit();
          if (driver.getCurrentUrl().contains("login")) {
            System.out.println("Test Case 16: Pass");
          } else {
            System.out.println("Test Case 16: Fail");
          }




          // Test Case 17: Register with an email that is already in use
 driver.findElement(By.linkText("Register")).click(); usernameInput = driver.findElement(By.id("username")); passwordInput = driver.findElement(By.id("password")); WebElement emailInput = driver.findElement(By.id("email")); usernameInput.sendKeys("testuser4"); passwordInput.sendKeys("testpassword"); emailInput.sendKeys("testuser@example.com"); passwordInput.submit();
          if (driver.getCurrentUrl().contains("register")) {
            System.out.println("Test Case 17: Pass");
          } else {
            System.out.println("Test Case 17: Fail");
          }




          // Test Case 18: Log in with an incorrect password
 driver.findElement(By.linkText("Login")).click(); usernameInput = driver.findElement(By.id("username")); passwordInput = driver.findElement(By.id("password")); usernameInput.sendKeys("testuser"); passwordInput.sendKeys("wrongpassword"); passwordInput.submit();
          if (driver.getCurrentUrl().contains("login")) {
            System.out.println("Test Case 18: Pass");
          } else {
            System.out.println("Test Case 18: Fail");
          }



          // Test Case 19: Log in with a username that does not exist
driver.findElement(By.linkText("Login")).click(); usernameInput = driver.findElement(By.id("username")); passwordInput = driver.findElement(By.id("password")); usernameInput.sendKeys("nonexistentuser"); passwordInput.sendKeys("testpassword"); passwordInput.submit();
          if (driver.getCurrentUrl().contains("login")) {
            System.out.println("Test Case 19: Pass");
          } else {
            System.out.println("Test Case 19: Fail");
          }
          
