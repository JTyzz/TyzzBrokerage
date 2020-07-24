import java.util.*

interface Brokerage {

    fun viewBalance(): Currency

    fun depositFunds(amt: Currency): Currency

    fun withdrawFunds(amt: Currency): Currency

    fun getLatestPrice(ticker: String): Tick

    fun buyStock(ticker: String, shares: Int, price: Currency): Int

    fun sellStock(ticker: String, shares: Int, price: Currency): Int
}