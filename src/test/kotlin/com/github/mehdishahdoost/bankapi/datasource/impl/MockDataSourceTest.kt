package com.github.mehdishahdoost.bankapi.datasource.impl

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test


internal class MockDataSourceTest {


    private val mockDataSource = MockDataSource()

    @Test
    fun `should provide a collection of banks`() {
        //when
        val banks = mockDataSource.retrieveBanks()
        //then
        Assertions.assertThat(banks).isNotEmpty
        Assertions.assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `should provide some data`() {
        //when
        val banks = mockDataSource.retrieveBanks()

        //then
        Assertions.assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        Assertions.assertThat(banks).allMatch { it.transactionFee != 0 }
    }


}