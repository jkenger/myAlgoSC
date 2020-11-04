using CashierApplication;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ItemNamespace
{
    public abstract class Item 
    {
        protected string item_name;
        protected int item_quantity;
        private double item_price, total_price;
        public abstract double getTotalPrice();
        public abstract void setPayment(double amount);

        public Item(){}
        //Initiate the item
        public Item(string name, double price, int quantity)
        {
            this.item_name = name;
            this.item_price = price;
            this.item_quantity = quantity;
            // Console.WriteLine(item_name + " " + item_price + " " + item_quantity);
        }

        // Compute the user's payment
    }

    class DiscountedItem : Item
    {
        private double item_discount;
        private double discounted_price;

        private double payment_amount;
        private double change;

        public DiscountedItem(string name, double price, int quantity, double discount) : base(name, price, quantity)
        {
            this.item_discount = discount * 0.01;
            this.discounted_price = (price - (this.item_discount * price)) * quantity;
        }

        public override double getTotalPrice()
        {
            return discounted_price;
        }

        public override void setPayment(double amount)
        {
            this.payment_amount = amount;
            this.change = payment_amount - discounted_price;
        }

        public double getChange()
        {
            return this.change;
        }
    }
}



