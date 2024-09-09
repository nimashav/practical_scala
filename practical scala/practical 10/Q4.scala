object BankSystem2{

  class Account(var accountHolder: String, var balance: Double) {

    def deposit(amount: Double): Unit = {
      if (amount > 0) {
        balance += amount
        println(s"Successfully deposited $$${amount}. New balance: $$${balance}")
      } else {
        println("Deposit amount must be positive.")
      }
    }

    def withdraw(amount: Double): Unit = {
      if (amount > 0 && balance >= amount) {
        balance -= amount
        println(s"Successfully withdrew $$${amount}. New balance: $$${balance}")
      } else if (amount > balance) {
        println(s"Insufficient balance! Current balance: $$${balance}")
      } else {
        println("Withdrawal amount must be positive.")
      }
    }

    def checkBalance(): Unit = {
      println(s"Account holder: $accountHolder, Balance: $$${balance}")
    }

    def applyInterest(): Unit = {
      if (balance > 0) {
        balance += balance * 0.05 
      } else {
        balance += balance * 0.1  
      }
    }
  }

  class Bank(val accounts: List[Account]) {

    def getNegativeBalances: List[Account] = {
      accounts.filter(_.balance < 0)
    }

    def sumOfBalances: Double = {
      accounts.map(_.balance).sum
    }

    def applyInterestToAll(): Unit = {
      accounts.foreach(_.applyInterest())
    }

    def printAllBalances(): Unit = {
      accounts.foreach(_.checkBalance())
    }
  }

  def main(args: Array[String]): Unit = {
    val account1 = new Account("Nethmi", 1000.0)
    val account2 = new Account("Thihansa", -50.0)
    val account3 = new Account("Sanuthma", 200.0)
    val account4 = new Account("Nadun", -500.0)

    val bank = new Bank(List(account1, account2, account3, account4))

    println("Accounts with negative balances:")
    bank.getNegativeBalances.foreach(_.checkBalance())

    val totalBalance = bank.sumOfBalances
    println(s"\nTotal sum of all account balances: $$${totalBalance}")

    bank.applyInterestToAll()
    println("\nBalances after applying interest:")
    bank.printAllBalances()
  }
}
