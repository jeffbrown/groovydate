package groovydate

import spock.lang.Specification

class LibraryTest extends Specification {
    def "test order date"() {
        given:
        def lib = new Library()

        when:
        lib.myOrderDate(4)

        then:
        noExceptionThrown()
    }
}
