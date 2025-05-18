MR&D Project Overview and Notes

Name: 
Plan Together

Idea:
A scheduling mobile application that allows users to add tasks, reminders, and deadlines to their personal online calendar. Users can also create group calendars with other users. By creating a group, each user can see when the other users are available and can create joint appointments and deadlines. Students and workers could find this app useful for group projects.

Sketch:


Execution:


Must Haves:
Login/Register/Logout
Add/Edit/Delete Personal Tasks
View Tasks on Calendar
Create/Edit/Delete Group Calendar
Invite Users to Join a Group
Accept/Decline Group Invites

Could Haves:
Color Coded Tasks
Notifications/Reminders
Set a Task to a User
Subtasks (checklists within tasks)
Repeating tasks (e.g. repeat every week)
Chat function
Modify User Permissions (Owner, Admin, Guest… Can Edit, or Can View)


Won't Haves:
Syncing with other calendars
AI assistant

[User] <-> [React App] <-> [Spring Boot API] <-> [PostGreSQL Database]

Backend Development: Java using SpringBoot
We use SpringBoot because it effectively makes creating the backend less extensive. SpringBoot allows us to create a prebuilt folder with all the dependencies required and makes it simpler to connect our PostGreSQL database.
https://spring.io/quickstart

Dependencies used:
Spring Web, Spring Data JPA, and PostGreSQL Driver

Used this website to connect our database to our program
https://hackernoon.com/using-postgres-effectively-in-spring-boot-applications

Frontend Development: React Native

We have to decide if we want to make the app on Android or Apple. 
If we do want to build an Android app we need to install Android Studio. To test the app we need an actual android phone (but can also use an android emulator such as Genymotion). We also need the React Native command line interface (CLI) and its dependencies (which we can find on the site, like Node.js).
If we want to build an iOS app… probably more difficult and costly so let’s not do it.
React Native website offers some things to download/use like Next.js, React Router, Expo, Node.js, and other sources recommend Android Studio and React Native CLI. I will explain each of these in depth below and explain which we need to use.

Since we are very new to React Native, it is recommended to use expo as it will be helpful with setting up React Native.. It can also help with testing our code.
https://docs.expo.dev/more/expo-cli/
https://reactnative.dev/docs/environment-setup

So I did some more research and found more about all of the above:
React vs React Native:
React Native is for mobile apps and React is for websites. We could use React as they use the same model, but we would be missing out on mobile features like notifications.
Expo is a framework for React Native (a sort of ‘toolbox’ to help get started with everything). React Native can be used without a framework, but the framework gives us all the necessary APIs required. To go more in depth, Expo provides features like file-based routing and high-quality universal libraries. Note that React Native CLI I listed above is just basically the raw React Native without a framework (i think) so I don't think we need to use that.
Next.js (App Router) vs React Router vs Expo:
These are all just a few of the many different full-stack frameworks for React (not only React Native). Next.js and React Router are more for web apps, and Expo is for mobile apps so we will use that. 
Node.js is a dependency of React. It is something we need to be able to use React because we need the npm (Node Package Manager) in order to install and manage the libraries.
So why is Expo better to use than say Android Studio. Expo has a mobile app called Expo Go which allows us to view the app live.

Database: PostGreSQL which can be directly linked to SpringBoot
Store users, tasks, groups, and group memberships

From what I understood from the TA, we need to use a Fetch API in order to link the frontend to the backend. We can make a request by calling fetch() from the frontend to the backend, allowing us to update the database (this is how they all connect).
https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API/Using_Fetch

I downloaded PostGreSQL on my laptop and created a user named scheduler_user with a random password. I also created a database called scheduler_app. I connected this database to the backend under the src/main/resources/application.properties.

Sources I used for some information:
- https://careerfoundry.com/en/blog/web-development/how-to-code-an-app/#step-one-plan



Progress:


Used SpringBoot to create a folder for our backend (named Schedule-App-Backend) which includes the general dependencies.
Created some folders for the Controllers, Models, and Repositories.
So after I installed Node.js and Expo I could create the app itself running the following in the code:
npx create-expo-app@latest
npx expo start
Which let me create a frontend app folder (named Plan-Together)
So now I have two files: Plan-Together for the front end, and Schedule-App-Backend for the backend (will rename later on).

