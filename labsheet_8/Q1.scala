def caesar_encrypt(plaintext: String, shift: Int) = {
  plaintext.map { char =>
    if (char.isLetter) {
      val ascioffset = if (char.isUpper) 'A' else 'a'
      ((char - ascioffset + shift) % 26 + ascioffset).toChar
    } else{
        char
    }
  }
}


def caesar_decrypt(text:String,shift:Int):String ={
    caesar_encrypt(text, -shift)
}

def caesarCipher(text: String, shift: Int, mode: String): String = {
  mode match {
    case "encrypt" => caesar_encrypt(text, shift)
    case "decrypt" => caesar_decrypt(text, shift)
    case _ => throw new IllegalArgumentException("Mode should be either 'encrypt' or 'decrypt'.")
  }
}


def main(args: Array[String]):Unit={

val plaintext = "Hello, World!"
val shift = 3

// Encrypt the plaintext
val encryptedText = caesarCipher(plaintext, shift, "encrypt")
println(s"Encrypted: $encryptedText")

// Decrypt the ciphertext
val decryptedText = caesarCipher(encryptedText, shift, "decrypt")
println(s"Decrypted: $decryptedText")

}
