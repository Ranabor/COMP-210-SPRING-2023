# A0: Hello World

If you're reading this then you've successfully accepted your first COMP 210 assignment!

When you clicked the assignment link the assignment template was cloned into your own private repository.

By now you should have
* Install Java
* Install IntelliJ IDEA
* Install Git
* Created a GitHub account
* Accepted the A0 assignment link.

If you missed one of these steps go over to the Tools and Software page on the class Sakai for instructions on how to install everything.

Now its time to clone this assignment. 

## Cloning the assignment
Here is video demo on how to clone your repository into Intellij: https://www.youtube.com/watch?v=xx9GLxo6Y9M&feature=youtu.be  
The steps are also listed below:  
1. Click on the green Code button in the top right of your Github repository
2. Select HTTPS
3. Copy the GitHub link
4. Open IntelliJ
5. Click 'Get from version control'
6. Make sure the version control selected is Git
7. Paste the link and click clone (you may need to log in to github)

You now should see a file in the A0 package called Main.java. If a banner comes up at the top
telling you to setup SDK, click on that and select your Java version (should be 10 or higher).

## Assignment Instructions
In Main.java you'll see a main method with a line that prints your Java version. Run your program by right clicking on the Main.java file and clicking run. You should see your Java version printed at the bottom of the screen. Make sure it is at least 10. 
If not head over to office hours or post on Piazza and we can help you out!

**Task 1:**  
Below the task 1 comment you will be writing your first Java method. The method's name is sayHello and returns the String "Hello World". It should be public, static, and have 0 parameters.

**Task 2:**  
Task 2 is to print the return value of the sayHello method you just wrote. An example of how to print is shown above where the Java version is printed. Now run
your program and you should see Hello World printed at the bottom of the screen below the Java version.

Once you have this working you are ready to submit a0!

## Submission
To submit to Gradescope you first must push your code. To do this open up the terminal in IntelliJ. You should see a 
tab at the bottom left of the screen that says terminal. The first command to enter is  
```
git add .
```
and then hit enter. This adds all of your changed files to the staging area of git. For future assignments you may instead do  

```
git add fileName 
```
to only add one file to the staging area rather than all of them. However, for this assignment we only have 1 file so we can use the first command.

The next step is to actually commit your changes to your local repository. You do this by typing  
~~~
git commit -m "your message here"
~~~

Your commit message should be a small message explaining what your changes were
to your code. 

Once you have done that, you must upload your local repository to your remote repository on GitHub using the command:  
```
git push
```
After all these steps are done you should be able to see your changes in your GitHub repository when you refresh the page. 

If you struggled with these steps, refer to the video liked in the Helpful Resources section, it shows another way to push to gradescope through IntelliJ (around time 6:20)

Now go to Gradescope and click on assignment 0. Select GitHub as your submission method. If you have never
used GitHub with Gradescope it will prompt you to connect your GitHub. Once you are logged in, a dropdown will appear
and you can select which repository and branch to submit. If you pass the one test you are good to go! 

## Helpful Resources 

If you are having trouble with some of the instructions here there is a video linked below on the entire process. This video is made by the 
COMP 301 instructor but follows the same workflow. The only difference is that when cloning the repo into InelliJ **you do
not need to log in through a token, just use your username and password.**  This video also shows a different way to push to GitHub using IntelliJ rather than the terminal. You can use whichever way is easier for you!
https://www.youtube.com/watch?v=KQ2v47r44NY&feature=youtu.be  


We also have a great team of TAs and LAs that have office hours that you can go to for help. The office hours schedule
is on Sakai on the office hours tab, and you can join them through MyDigitalHand

Piazza is also a useful way to get help from us and your peers.




