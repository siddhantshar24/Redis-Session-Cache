# RedisSessionCache
A Redis based session cache to maintain user records in server during logins.

Technologies used: Java, SpringBoot, Redis.

- Redis is being used to save the server login information during the subsequent logins in the application.
  
To start the project in your local:

-Start Redis at port 6379 and keep the server running during entire duration.

-Go to main folder in Intellij/Eclipse and run the application as a SpringBoot Application.

-Login once and do not turn off the Redis server.

-Next time when you try to access the localhost it will not ask for login credentials despite restarting the application.

Thanks.

