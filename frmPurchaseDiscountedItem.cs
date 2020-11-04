using ItemNamespace;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CashierApplication
{
    
    public partial class frmPurchaseDiscountedItem : Form
    {
        DiscountedItem ditm;
        public frmPurchaseDiscountedItem()
        {
            InitializeComponent();
        }

        private void frmPurchaseDiscountedItem_Load(object sender, EventArgs e)
        {
            
        }

        private void tbItem_TextChanged(object sender, EventArgs e)
        {
          
        }

        private void btnCompute_Click(object sender, EventArgs e)
        {
            string item = tbItem.Text;
            double discount = Convert.ToDouble(tbDiscount.Text);
            double price = Convert.ToDouble(tbPrice.Text);
            int quantity = Convert.ToInt32(tbQuantity.Text);
            ditm = new DiscountedItem(item, price, quantity, discount);

            lblTotalAm.Text = "P" + ditm.getTotalPrice().ToString();
        }

        private void btnSubmit_Click(object sender, EventArgs e)
        {
            double totalAmount = ditm.getTotalPrice();
            double payment = Convert.ToDouble(tbPaymentRec.Text);
            if (payment < totalAmount)
            {
                MessageBox.Show("Invalid amount", "Not enought payment", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            else
            {
                ditm.setPayment(payment);
                lblChange.Text = "P" + ditm.getChange();
            }
        }
    }
}



