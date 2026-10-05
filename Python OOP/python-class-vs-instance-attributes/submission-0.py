class BankAccount:
    total_accounts = 0
    total_balance = 0

    def __init__(self, name: str, balance: float) -> None:
        self.name = name
        self.balance = balance
        BankAccount.total_accounts += 1
        BankAccount.total_balance += balance


account1 = BankAccount("Alice", 1000)
account2 = BankAccount("Bob", 2000)

print(f"Alice's balance: ${account1.balance}")
print(f"Bob's balance: ${account2.balance}")
print(f"Total Accounts: {BankAccount.total_accounts}")
print(f"Total Balance: ${BankAccount.total_balance}")
