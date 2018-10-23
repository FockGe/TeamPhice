using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace LiTec_Board
{
    public class Machine
    {
        public HashSet<int> MaschineAdministrators = new HashSet<int>();
        public HashSet<int> SecurityClothes = new HashSet<int>();
        public HashSet<int> Warnings = new HashSet<int>();
        public bool Defective { get; set; }
        public string Defects { get; set; }
        public string Description { get; set; }
        public string EmergencyPan { get; set; }
        public string Files { get; set; }
        public int Id { get; set; }
        public int LastMaintainedBy { get; set; }
        public string Name { get; set; }
        public string OperationManuel { get; set; }
        public string Picture { get; set; } //link of a picture as an URL
        public int Type { get; set; }
       



    }
}