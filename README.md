# Whitelist By ID
Make server whitelist work by matching player's ID.
Works on minecraft version 1.19.2.

Code From [mcmod.cn](https://www.mcmod.cn/class/7542.html)@alltime2838

```java
import com.mojang.authlib.GameProfile;
import net.minecraft.server.players.UserWhiteList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(UserWhiteList.class)
public class MixinWhitelist {
   @Overwrite
   protected String getKeyForUser(GameProfile gameProfile) {
       return gameProfile.getName().toString();
   }
}
```

## Setup Process:

### Step 1: Open your command-line and browse to the folder where you extracted the zip file.

### Step 2: You're left with a choice.
If you prefer to use Eclipse:
1. Run the following command: `./gradlew genEclipseRuns`
2. Open Eclipse, Import > Existing Gradle Project > Select Folder 
   or run `gradlew eclipse` to generate the project.

If you prefer to use IntelliJ:
1. Open IDEA, and import project.
2. Select your build.gradle file and have it import.
3. Run the following command: `./gradlew genIntellijRuns`
4. Refresh the Gradle Project in IDEA if required.

If at any point you are missing libraries in your IDE, or you've run into problems you can 
run `gradlew --refresh-dependencies` to refresh the local cache. `gradlew clean` to reset everything 
{this does not affect your code} and then start the process again.
