Select Name As Customers
From Customers
Where id not in (
    Select customerId from Orders
);
