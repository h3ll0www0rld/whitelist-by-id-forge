package io.h3ll0www0rld.whitelist.mixin;

import com.mojang.authlib.GameProfile;

import net.minecraft.server.players.UserWhiteList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(UserWhiteList.class)
public class MixinWhitelist
{
    // 修改UserWhiteList类中getKeyForUser方法的行为，使其使用玩家的用户名作为白名单中的唯一标识，而不是原本可能使用的UUID。
    @Overwrite
    protected String getKeyForUser(GameProfile gameProfile) {
        return gameProfile.getName();
    }
}
