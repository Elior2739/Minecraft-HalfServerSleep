# HalfServerSleep

For Example: Let's say you have 4 players in the server and night has came.. with this plugin you need only 2 players to skip the night!.

Another Example: You have uneven players amount so its splits to .5 the plugin automatically rounding the number down

# Configuration

```
Messages: # Available Placeholders: %player_name%, %players_sleeping%, %players_sleeping_needed%.
   player-went-to-sleep: "&6%player_name% &7Went To Sleep. &a%players_sleeping%/%players_sleeping_needed%"
   player-exited-from-sleep: "&6%player_name% &7Exited From Bed. &a%players_sleeping%/%players_sleeping_needed%"
   all-needed-players-sleep: "&a%players_sleeping%/%players_sleeping_needed% &7Are Sleeping. Changing To Morning..."
 
Settings:
   cancel-rain: true # Cancel Rain When Is Morning (After Sleep)
   morning-time: 24000 # You Can Check It Here (In "24-hour Minecraft day" Section): https://minecraft.gamepedia.com/Daylight_cycle
   time-before-change: 3 # Time Before Changing To Morning
   reguler-world: "world"
```

the configuration splits to 2 sections messages, settings.

### Messages:

player-went-to-sleep: When a player entering the bed
player-exited-from-sleep: When a player exists from the bed
all-needed-players-sleeping: When All Players That Needed To Skip The Night Are Sleeping


### Settings:

cancel-rain: if true and all needed players are sleeping its cancelling the rain when its morning
morning-time: Change to how much ticks to change when all players needed are sleeping (default is 24000).
time-before-change: How much time to wait when the last player is sleeping (default is 3 seconds).
reguler-world: You reguler world name (default is "world")

# Support
for discord support content me: Elior#0590.
