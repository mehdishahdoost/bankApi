package com.github.mehdishahdoost.bankapi.datasource

import com.github.mehdishahdoost.bankapi.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>

}