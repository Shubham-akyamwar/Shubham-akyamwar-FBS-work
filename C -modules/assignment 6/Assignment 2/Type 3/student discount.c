#include<stdio.h>
void discount(double, char); // declaration

int main() {
    double price;
    char ch;

    printf("Enter the Price: ");
    scanf("%lf", &price);
    printf("Are you student? (y/n): ");
    scanf(" %c", &ch);

    discount(price, ch); // call
    return 0;
}

void discount(double price, char ch) // definition
{
    double discount, netprice;

    if(ch == 'y') {
        printf("User is Student\n");
        if(price > 500) {
            discount = price * 0.20;
            netprice = price - discount;
            printf("Total Discount: %.2lf\n", discount);
            printf("Net Price: %.2lf", netprice);
        } else {
            discount = price * 0.10;
            netprice = price - discount;
            printf("Total Discount: %.2lf\n", discount);
            printf("Net Price: %.2lf", netprice);
        }
    } else {
        printf("User not Student\n");
        if(price > 600) {
            discount = price * 0.15;
            netprice = price - discount;
            printf("Total Discount: %.2lf\n", discount);
            printf("Net Price: %.2lf", netprice);
        } else {
            printf("Discount not available");
        }
    }
}