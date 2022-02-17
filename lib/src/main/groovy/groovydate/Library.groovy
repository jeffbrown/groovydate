package groovydate

class Library {
    String myOrderDate(int nrOfDays) {
        def date = new Date()
        def datePlus = date.clone()
        datePlus = datePlus + nrOfDays
        return datePlus.format('YYYY-MM-dd')
    }
}
