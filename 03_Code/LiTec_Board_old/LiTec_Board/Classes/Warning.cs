using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace LiTec_Board
{
    public class Warning
    {
        public string Description { get; set; }
        public int Id { get; set; }
        public string Name { get; set; }
        public string Symbol { get; set; }

        public Warning(string description, int id, string name, string symbol)
        {
            Description = description ?? throw new ArgumentNullException(nameof(description));
            Id = id;
            Name = name ?? throw new ArgumentNullException(nameof(name));
            Symbol = symbol ?? throw new ArgumentNullException(nameof(symbol));
        }
    }
}