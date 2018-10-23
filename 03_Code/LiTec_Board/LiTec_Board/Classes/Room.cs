using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace LiTec_Board
{
    public class Room
    {
        public int Id { get; set; }
        public string Description { get; set; }
        public string EmergencyPlan { get; set; }
        public string FirstResponders { get; set; }
        public string GuestInfo { get; set; }
        public HashSet<int> Maschines = new HashSet<int>();
        public string RoomNumber { get; set; }

        public Room(int id, string description, string emergencyPlan, string firstResponders, string guestInfo,string roomNumber)
        {
            Id = id;
            Description = description;
            EmergencyPlan = emergencyPlan;
            FirstResponders = firstResponders;
            GuestInfo = guestInfo;
            RoomNumber = roomNumber;
        }

        


    }
}