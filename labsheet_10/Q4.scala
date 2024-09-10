object BankAccountManager {

  case class Account(accountId: String, balance: Double)

  object Bank {
    
    private var accounts: List[Account] = List()

    
    def addAccount(account: Account): Unit = {
      accounts = account :: accounts
    }

    
    def listNegativeBalances: List[Account] = {
      accounts.filter(_.balance < 0)
    }

    
    def sumOfBalances: Double = {
      accounts.map(_.balance).sum
    }

    
    def applyInterest(): List[Account] = {
      accounts.map { account =>
        val updatedBalance = if (account.balance > 0) {
          account.balance * 1.05  // Apply 5% deposit interest
        } else {
          account.balance * 0.90  // Apply 10% overdraft interest
        }
        account.copy(balance = updatedBalance)
      }
    }
  }

  def main(args: Array[String]): Unit = {

    Bank.addAccount(Account("A001", 500.0))
    Bank.addAccount(Account("A002", -150.0))
    Bank.addAccount(Account("A003", 200.0))
    Bank.addAccount(Account("A004", -75.0))


    println("Accounts with negative balances:")
    Bank.listNegativeBalances.foreach(println)


    println(s"\nSum of all account balances: ${Bank.sumOfBalances}")


    println("\nFinal balances after applying interest:")
    Bank.applyInterest().foreach(println)
  }
}




