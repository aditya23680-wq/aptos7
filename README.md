Alright ✅ Here’s the upgraded **README.md** with a **Usage Section** so it looks GitHub-ready:

---

# SimpleWallet

## 📌 Description

**SimpleWallet** is a lightweight Move smart contract on the Aptos blockchain that allows users to securely **deposit** and **withdraw** AptosCoin.

* **Deposit**: Coins are withdrawn from the user’s account and added to their on-chain wallet resource.
* **Withdraw**: Coins are minted back to the user if they have sufficient balance.

This acts as a **basic wallet system**, simulating a lock-and-unlock mechanism for coins.

---

## 🌍 Vision

The vision behind SimpleWallet is to provide a **minimal, transparent, and educational contract** for learning how wallets can be implemented on Aptos using the Move language.
It aims to help developers and learners understand:

* Resource management (`move_to`, `borrow_global_mut`)
* Token operations (`withdraw`, `mint`, `deposit`)
* Safe balance handling with assertions

---

## 🔮 Future Scope

Planned improvements and possible extensions for the SimpleWallet:

* Multi-coin support (not just AptosCoin).
* Event logging for deposits and withdrawals.
* Access control and shared wallets (multi-signature support).
* Integration with front-end dApps for user-friendly interfaces.
* Adding interest or staking features for deposited coins.

---

## 📜 Contract Address

```
0x8409629e251f7e8d4c30ee02a8cb37d10cd80b107d1b0c523fce1db6e9e28df3
```

---

## ⚡ Usage

### 1. **Deposit Coins**

Run the following command to deposit coins into your SimpleWallet:

```bash
aptos move run-function \
  --function 0x8409629e251f7e8d4c30ee02a8cb37d10cd80b107d1b0c523fce1db6e9e28df3::SimpleWallet::deposit \
  --args u64:1000
```

👉 This deposits `1000` AptosCoins into your wallet.

---

### 2. **Withdraw Coins**

Run the following command to withdraw coins from your SimpleWallet:

```bash
aptos move run-function \
  --function 0x8409629e251f7e8d4c30ee02a8cb37d10cd80b107d1b0c523fce1db6e9e28df3::SimpleWallet::withdraw \
  --args u64:500
```

👉 This withdraws `500` AptosCoins back to your account (if you have enough balance).

---

### 3. **Check Wallet Resource**

To check your wallet balance stored on-chain, run:

```bash
aptos account resource \
  --account <your_account_address> \
  --resource-type 0x8409629e251f7e8d4c30ee02a8cb37d10cd80b107d1b0c523fce1db6e9e28df3::SimpleWallet::Wallet
```

---

✨ With this, developers can **deploy, interact, and extend** the SimpleWallet contract easily.

---

