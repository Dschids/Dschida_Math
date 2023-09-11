import java.text.DecimalFormat
// takes user input for cost of items until user enters 0, totals it, calculates tax, total
// with tax, tip amount, and total with tip then displays those values.
fun main(args: Array<String>) {
    val tip = .175
    val tax = .025
    var cost = 0.00
    var totalCost = 0.00
    // setting up formatting for Dollar amount with commas and 2 decimal points
    var dollarFormat = DecimalFormat("$###,###,###.##")
    println("Enter the cost of your items, when all items have been entered enter 0.")
    // do while that reads input and adds it to total cost until user enters 0
    do{
        cost = readln()!!.toDouble()
        totalCost += cost

    } while(cost.toInt() != 0)
    // calculating total cost tax, total w tax, tip and total w tip
    var taxAmnt = totalCost * tax
    var totalwTax = totalCost + taxAmnt
    var tipAmnt = totalCost * tip
    var totalwTip = totalwTax + tipAmnt
    // print values using previously defined formatting
    println("Total cost is:       " + dollarFormat.format(totalCost))
    println("Tax is:              " + dollarFormat.format(taxAmnt))
    println("Total with tax is:   " + dollarFormat.format(totalwTax))
    println("Recommended tip is:  " + dollarFormat.format(tipAmnt))
    println("Total with tip is:   " + dollarFormat.format(totalwTip))
}