package org.opsli.plugins.redis.scripts.enums;


/**
 * @BelongsProject: opsli-boot
 * @BelongsPackage: org.opsli.plugins.redis.enums
 * @Author: Parker
 * @CreateTime: 2020-09-14 21:56
 * @Description: Redis 脚本枚举
 */
public enum RedisScriptsEnum {

    /** Redis加锁脚本 */
    REDIS_LOCK("/lua/redis_lock.lua"),
    /** Redis解锁脚本 */
    REDIS_UN_LOCK("/lua/redis_unlock.lua")
    ;

    /** 脚本路径 */
    private String path;

    RedisScriptsEnum(String path){
        this.path = path;
    }

    /**
     * 获得路径
     * @return path
     */
    public String getPath() {
        return path;
    }
}
