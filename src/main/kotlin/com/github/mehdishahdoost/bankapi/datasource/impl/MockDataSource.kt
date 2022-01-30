package com.github.mehdishahdoost.bankapi.datasource.impl

import com.github.mehdishahdoost.bankapi.datasource.BankDataSource
import com.github.mehdishahdoost.bankapi.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockDataSource: BankDataSource {

    val banks = listOf(
        Bank("100", 1.0, 1),
        Bank("101", 1.0, 1),
        Bank("102", 1.0, 1)
    )
    override fun retrieveBanks(): Collection<Bank> = banks
}