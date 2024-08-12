error id: file://<WORKSPACE>/labsheet_8/Q1.scala:[263..263) in Input.VirtualFile("file://<WORKSPACE>/labsheet_8/Q1.scala", "def caesar_encrypt(plaintext: String, shift: Int) = {
  plaintext.map { char =>
    if (char.isLetter) {
      val ascioffset = if (char.isUpper) "A" else 'a'
      ((char - ascioffset + shift) % 26 + ascioffset).toChar
    } else{
        char
    }
  }
}


def ")
file://<WORKSPACE>/labsheet_8/Q1.scala
file://<WORKSPACE>/labsheet_8/Q1.scala:13: error: expected identifier; obtained eof
def 
    ^
#### Short summary: 

expected identifier; obtained eof