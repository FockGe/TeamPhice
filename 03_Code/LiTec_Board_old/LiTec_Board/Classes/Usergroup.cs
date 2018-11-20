using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace LiTec_Board
{
    public class Usergroup
    {

        public string Description { get; set; }
        public int Id { get; set; }
        public string Name { get; set; }
        public Usertype Usertype { get; set; }

        public Usergroup(string description, int id, string name, Usertype usertype)
        {
            Description = description ?? throw new ArgumentNullException(nameof(description));
            Id = id;
            Name = name ?? throw new ArgumentNullException(nameof(name));
            Usertype = usertype ?? throw new ArgumentNullException(nameof(usertype));
        }
    }
}