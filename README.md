# Yandex Tank Ammo prepare

Small tools on Kotlin which counting bytes in request, add `\r\n` after requests and put it in file.

## Usage and Download
See in [releases](https://github.com/LionZXY/YandexTankAmmoPrepare/releases) last jar version. 

Put ammo.prepare near with `.jar` file and run `java -jar ammoprepare.jar` 

## Examples
From this:
```text
userget
GET /api/user/ HTTP/1.0
Host: eventbird.glitchless.ru
Connection: close
User-Agent: Tank

FKdzXphPUwSEkUl1TGWcJBk1mpyRTTyJZgacsCtkf6C0OhtH4aMWykIuiQ0vMJkIAq28aNNdGF7dD9EB
userput
POST /api/user/ HTTP/1.0
Host: eventbird.glitchless.ru
Connection: close
User-Agent: Tank

Some post body here
```

Tools generate this:
```text
88 userget
GET /api/user/ HTTP/1.0
Host: eventbird.glitchless.ru
Connection: close
User-Agent: Tank

110 userput
POST /api/user/ HTTP/1.0
Host: eventbird.glitchless.ru
Connection: close
User-Agent: Tank

Some post body here


```
