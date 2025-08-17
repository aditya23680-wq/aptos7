module MyModule::SimpleWallet {

    use aptos_framework::signer;
    use aptos_framework::coin;
    use aptos_framework::aptos_coin::AptosCoin;

    /// A simple wallet resource bound to an account
    struct Wallet has key, store {
        balance: u64,
    }

    /// Deposit coins into the wallet
    public fun deposit(owner: &signer, amount: u64) {25
        let addr = signer::address_of(owner);

        // Create wallet if it does not exist
        if (!exists<Wallet>(addr)) {
            move_to(owner, Wallet { balance: 0 });
        };

        // Withdraw AptosCoin from the user
        let coins = coin::withdraw<AptosCoin>(owner, amount);
        coin::destroy_zero(coins); // Burn coins to simulate lock

        // Update wallet balance
        let wallet = borrow_global_mut<Wallet>(addr);
        wallet.balance = wallet.balance + amount;
    }

    /// Withdraw coins from the wallet
    public fun withdraw(owner: &signer, amount: u64) acquires Wallet {
        let addr = signer::address_of(owner);
        let wallet = borrow_global_mut<Wallet>(addr);

        // Check sufficient funds
        assert!(wallet.balance >= amount, 1);

        // Deduct and mint back coins
        wallet.balance = wallet.balance - amount;
        let coins = coin::mint<AptosCoin>(amount);
        coin::deposit<AptosCoin>(addr, coins);
    }
}
