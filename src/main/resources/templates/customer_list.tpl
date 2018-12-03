yieldUnescaped '<!DOCTYPE html>'
html(lang:'en') {
    head {
        meta('http-equiv':'"Content-Type" content="text/html; charset=utf-8"')
        title('Person List')
    }
    body {
        h2 ('A Groovy View with Spring Boot')
         
        h3 ("$message")
        
        table (border: "1")  {
            tr {
               th("Customer ID")
               th("Name")
               th("Phone")
               th("Country")
            }
            customers.each { customer ->
                tr {
                   td("$customer.custID")
                   td("$customer.name")
                   td("$customer.phoneNo")
                   td("$customer.country")
                }
            }
        }
    }
}