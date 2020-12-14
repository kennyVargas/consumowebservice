using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsForms_with_webService
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

 

        private void Form1_Load(object sender, EventArgs e)
        {
            
        }

        private void button2_Click(object sender, EventArgs e)
        {
           
            if (!string.IsNullOrEmpty(textBox1.Text))
            {

                int id = Convert.ToInt32(textBox1.Text);
                ServiceReference1.WebService1SoapClient ws = new ServiceReference1.WebService1SoapClient();
                this.dataGridView1.DataSource = ws.alumno_examlple(id);

                this.label2.Text = ws.Nombre_alumno(id);
                this.dataGridView1.DataMember = "Asignatura";
               
            }
            else
            {
                MessageBox.Show("Introducir C.I", "Error");
            }

            
        }

  

        /*
        public String suma2nro()
        {
            int a, b, c;
            a = Convert.ToInt32(textBox1.Text);
            b = Convert.ToInt32(textBox2.Text);
            ServiceReference1.WebService1SoapClient ws1 = new ServiceReference1.WebService1SoapClient();
            c = ws1.suma(a, b);
            return c.ToString();
        }
        */
    }
}
