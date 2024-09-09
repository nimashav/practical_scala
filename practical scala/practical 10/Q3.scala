object BankSystem {

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

    def transfer(amount: Double, toAccount: Account): Unit = {
      if (amount > 0 && balance >= amount) {
        this.withdraw(amount)
        toAccount.deposit(amount)
        println(s"Successfully transferred $$${amount} to ${toAccount.accountHolder}.")
      } else if (amount > balance) {
        println(s"Transfer failed! Insufficient balance to transfer $$${amount}.")
      } else {
        println("Transfer amount must be positive.")
      }
    }

    def checkBalance(): Unit = {
      println(s"Account holder: $accountHolder, Balance: $$${balance}")
    }
  }

  def main(args: Array[String]): Unit = {

    val account1 = new Account("Nethmi", 1000.0)
    val account2 = new Account("Thihansa", 500.0)

    account1.checkBalance()
    account2.checkBalance()

    account1.deposit(200.0)

    account2.withdraw(100.0)

    account1.transfer(300.0, account2)

    account1.checkBalance()
    account2.checkBalance()
  }
}
