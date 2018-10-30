<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Login.aspx.cs" Inherits="Login.Login" %>

<!DOCTYPE html>


<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>AUVA - Login</title>
 
    <link href="Style.css" rel="stylesheet" />
</head>
<body>
    <form id="form1" runat="server">    
    <section>
        <img src="Stock/login.png" class="panel"/>
   
        <div class="sec2">
            <div class="container">
                <div class="content">
                    <br />
                    <br />
                    <br />

                    <h2>Anmelden</h2>

                    <asp:TextBox ID="txtName" placeholder="Benutzername" runat="server"></asp:TextBox><br />
                    <asp:TextBox ID="txtPassword" placeholder="Passwort" type="password" runat="server"></asp:TextBox><br />

                    <div class="buttons">
                        <asp:Button ID="cmdLogin" runat="server" Text="Anmelden" OnClick="cmdLogin_Click"/>
                        <asp:Button ID="cmdLoginasGuest" runat="server" Text="Gast" OnClick="cmdLoginasGuest_Click"/>  

                    </div>
                      
                   
                </div>
                
            </div>
        </div>
        </section>
    </form>

</body>
</html>
