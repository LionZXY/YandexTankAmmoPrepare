import java.io.BufferedReader
import java.io.File
import java.io.FileOutputStream

val DELIMETER = "FKdzXphPUwSEkUl1TGWcJBk1mpyRTTyJZgacsCtkf6C0OhtH4aMWykIuiQ0vMJkIAq28aNNdGF7dD9EB"

fun main(args: Array<String>) {
    val reader = File("ammo.prepare").bufferedReader()
    val outputStream = FileOutputStream("ammo.ready")

    while (!readFragment(reader, outputStream));

    reader.close()
    outputStream.close()
}


/**
 * @return true if file end
 */
fun readFragment(reader: BufferedReader, outputStream: FileOutputStream): Boolean {
    val tag = reader.readLine().trim()
    val request = StringBuilder()
    var tmpstr = reader.readLine()
    do {
        request.append(tmpstr).append('\n')
        tmpstr = reader.readLine()
    } while (tmpstr != DELIMETER && tmpstr != null)

    val ammoBytes = request.toString().trim(' ', '\n').toByteArray()
    val ammoSize = ammoBytes.size
    outputStream.write("$ammoSize $tag\n".toByteArray())
    outputStream.write(ammoBytes)
    outputStream.write("\n\r".toByteArray())

    return tmpstr == null
}