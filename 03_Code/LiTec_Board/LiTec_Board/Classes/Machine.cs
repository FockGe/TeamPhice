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

       public Machine(bool defective, string defects, string description, string emergencyPan, string files, int id, int lastMaintainedBy, string name, string operationManuel, string picture, int type)
        {
            Defective = defective;
            Defects = defects ?? throw new ArgumentNullException(nameof(defects));
            Description = description ?? throw new ArgumentNullException(nameof(description));
            EmergencyPan = emergencyPan ?? throw new ArgumentNullException(nameof(emergencyPan));
            Files = files ?? throw new ArgumentNullException(nameof(files));
            Id = id;
            LastMaintainedBy = lastMaintainedBy;
            Name = name ?? throw new ArgumentNullException(nameof(name));
            OperationManuel = operationManuel ?? throw new ArgumentNullException(nameof(operationManuel));
            Picture = picture ?? throw new ArgumentNullException(nameof(picture));
            Type = type;
        }



    }
}