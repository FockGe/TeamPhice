using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace LiTec_Board
{
    public class MachineType
    {
        public int Id { get; set; }
        public string SafetyInstructions { get; set; }
        public string Type { get; set; }

        public MachineType(int id, string safetyInstructions, string type)
        {
            Id = id;
            SafetyInstructions = safetyInstructions ?? throw new ArgumentNullException(nameof(safetyInstructions));
            Type = type ?? throw new ArgumentNullException(nameof(type));
        }
    }
}