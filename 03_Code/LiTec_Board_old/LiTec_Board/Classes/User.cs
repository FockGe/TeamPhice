using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace LiTec_Board
{
    public class User
    {
        public string Email { get; set; }
        public string Firstname { get; set; }
        public int ID { get; set; }
        public string Lastname { get; set; }
        public HashSet<int> MaschineTypes = new HashSet<int>();
        public string Password { get; set; }
        public string Token { get; set; }
        public int Usergroup { get; set; }
        public string Username { get; set; }

        public User(string email, string firstname, int iD, string lastname, string password, string token, int usergroup, string username)
        {
            Email = email ?? throw new ArgumentNullException(nameof(email));
            Firstname = firstname ?? throw new ArgumentNullException(nameof(firstname));
            ID = iD;
            Lastname = lastname ?? throw new ArgumentNullException(nameof(lastname));
            Password = password ?? throw new ArgumentNullException(nameof(password));
            Token = token ?? throw new ArgumentNullException(nameof(token));
            Usergroup = usergroup;
            Username = username ?? throw new ArgumentNullException(nameof(username));
        }




    }
}