using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Configuration;

namespace Login
{
    public partial class Login : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void cmdLogin_Click(object sender, EventArgs e)
        {
            using (SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["DBCS"].ConnectionString))
            {
                con.Open();
                SqlCommand cmd = new SqlCommand("Select * from dbo.users where username='" + txtName.Text + "' and pwd='" + txtPassword.Text + "'", con);
                SqlDataReader dr = cmd.ExecuteReader();
                if (dr.HasRows == true)
                {
                    dr.Read();
                    Session["username"] = dr["username"].ToString();
                    Response.Redirect("Homepage.aspx");
                }
                else
                {
                    ScriptManager.RegisterStartupScript(Page, Page.GetType(), "popup", "alert('Invalid Password')", true);
                }
            }
        }

        protected void cmdLoginasGuest_Click(object sender, EventArgs e)
        {
            Session["username"] = "Gast";
            Response.Redirect("Homepage.aspx");
        }
    }
}