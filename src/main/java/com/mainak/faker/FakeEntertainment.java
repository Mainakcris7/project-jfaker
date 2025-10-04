package com.mainak.faker;

public class FakeEntertainment {
    // Function to generate movie names
    public String movieName(){
        String[] movieNames = {"Feluda", "Avengers", "Inception", "Interstellar", "The Dark Knight", "Pulp Fiction", "Forrest Gump", "The Matrix", "The Shawshank Redemption", "The Godfather", "The Lord of the Rings", "Fight Club", "Gladiator", "Titanic", "Jurassic Park", "The Lion King", "Toy Story", "Finding Nemo", "Up", "Coco", "Black Panther", "Spider Man", "Wonder Woman", "The Batman", "Dune", "Avatar", "The Avengers: Endgame", "Star Wars: The Force Awakens", "Harry Potter and the Sorcerer's Stone", "The Hunger Games", "Frozen", "Moana", "Zootopia", "Cinderella", "Aladdin", "Beauty and the Beast", "Pirates of the Caribbean", "Mission: Impossible", "John Wick", "Mad Max: Fury Road", "Deadpool", "Guardians of the Galaxy", "Doctor Strange", "Thor: Ragnarok"};
        return movieNames[(int) (Math.random() * movieNames.length)];
    }

    // Function to generate book titles
    public String bookTitle(){
        String[] bookTitles = {"Jungle Book", "Byomkesh Somogro", "Sherlock Holmes", "Harry Potter", "The Hobbit", "1984", "To Kill a Mockingbird", "The Great Gatsby", "Byomjatrir Diary", "Pather Panchali", "The Catcher in the Rye", "Brave New World", "The Lord of the Rings", "Animal Farm", "Fahrenheit 451", "War and Peace", "Crime and Punishment", "The Odyssey", "The Iliad", "The Divine Comedy", "Les Misérables", "The Count of Monte Cristo", "Don Quixote", "Ulysses", "The Brothers Karamazov", "One Hundred Years of Solitude", "The Picture of Dorian Gray", "Dracula", "Frankenstein", "The Metamorphosis", "The Stranger", "Heart of Darkness", "Wuthering Heights", "Jane Eyre", "Pride and Prejudice", "Rabindranath Tagore's Gitanjali", "Chokher Bali", "Gora", "Nastanirh", "The Alchemist", "The Little Prince"};
        return bookTitles[(int) (Math.random() * bookTitles.length)];
    }

    // Function to generate song names
    public String songName(){
        String[] songNames = {"Shape of You", "Blinding Lights", "Levitating", "Peaches", "Save Your Tears", "Watermelon Sugar", "Bad Guy", "Old Town Road", "Senorita", "Circles", "Drivers License", "Stay", "Good 4 U", "Montero (Call Me By Your Name)", "Kiss Me More", "Deja Vu", "Butter", "Dynamite", "Mood", "Rockstar", "WAP", "Havana", "Shallow", "Perfect", "Someone You Loved", "Memories", "Sunflower", "Believer", "Thunder", "Counting Stars", "Radioactive", "Let Her Go", "All of Me", "Thinking Out Loud", "Hello", "Tum hi ho", "Channa Mereya", "Tujh Mein Rab Dikhta Hai", "Kal Ho Naa Ho", "Agar Tum Saath Ho", "Kabira", "Dil Diyan Gallan", "Pee Loon", "Janam Janam", "Ghungroo", "Badtameez Dil", "Malhari", "Swag Se Swagat", "Despacito", "Taki Taki", "Dákiti", "Mi Gente", "Bailando"};
        return songNames[(int) (Math.random() * songNames.length)];
    }

    // Function to generate character names
    public String characterName() {
        String[] characterNames = {"Dwane Johnson", "Shah Rukh khan", "Vicky Kaushal", "Scarlett Johansson", "Chris Hemsworth", "Robert Downey Jr.", "Chris Evans", "Leonardo DiCaprio", "Brad Pitt", "Tom Cruise", "Jennifer Lawrence", "Emma Stone", "Natalie Portman", "Gal Gadot", "Margot Robbie", "Will Smith", "Johnny Depp", "Morgan Freeman", "Samuel L. Jackson", "Tom Hanks", "Aamir Khan", "Salman Khan", "Ranbir Kapoor", "Deepika Padukone", "Alia Bhatt", "Priyanka Chopra", "Katrina Kaif", "Anushka Sharma", "Hrithik Roshan", "Ranveer Singh", "Deepika Padukone", "Karan Johar", "Sanjay Leela Bhansali", "Rajkumar Hirani", "Zoya Akhtar", "Imtiaz Ali", "Kabir Khan", "Vikramaditya Motwane", "Anurag Kashyap", "Rohit Shetty", "Farah Khan", "Ashutosh Gowariker", "Madhur Bhandarkar", "S.S. Rajamouli", "Mani Ratnam", "Gautham Menon", "Yash Chopra", "Aditya Chopra", "Alexander Payne", "Wes Anderson", "Quentin Tarantino", "Martin Scorsese", "Steven Spielberg", "Christopher Nolan", "James Cameron", "Peter Jackson", "Ridley Scott", "Clint Eastwood"};
        return characterNames[(int) (Math.random() * characterNames.length)];
    }

    // Function to generate game titles
    public String gameTitle() {
        String[] gameTitles = {"Call Of Duty", "BGMI", "eFootball", "FIFA 25", "IGI", "Assassin's Creed", "The Witcher 3", "Cyberpunk 2077", "Red Dead Redemption 2", "God of War", "The Last of Us", "Minecraft", "Fortnite", "Apex Legends", "Overwatch", "League of Legends", "Dota 2", "Valorant", "Genshin Impact", "Elden Ring", "Hades", "Stardew Valley", "Among Us", "Rocket League", "Terraria", "Fall Guys", "Sea of Thieves", "Monster Hunter: World", "Dark Souls III", "Bloodborne", "Resident Evil Village", "Halo Infinite", "Forza Horizon 5", "Gran Turismo 7", "Mario Kart 8 Deluxe", "The Legend of Zelda: Breath of the Wild", "Super Mario Odyssey", "Animal Crossing: New Horizons", "Splatoon 3", "Metroid Dread", "Pokémon Sword and Shield", "Final Fantasy VII Remake", "Dragon Quest XI", "Persona 5 Royal", "Nier: Automata", "Bayonetta 2", "Fire Emblem: Three Houses", "Xenoblade Chronicles 2", "Yakuza: Like a Dragon", "Ghost of Tsushima", "Death Stranding"};
        return gameTitles[(int) (Math.random() * gameTitles.length)];
    }

    // Function to generate cricketer names
    public String cricketer() {
        String[] cricketers = {"Virat Kohli", "MS Dhoni", "Rohit Sharma", "Chris Gayle", "AB de Villiers", "Kane Williamson", "Steve Smith", "Joe Root", "David Warner", "Jacques Kallis", "Sachin Tendulkar", "Brian Lara", "Muttiah Muralitharan", "Shane Warne", "Glenn McGrath", "Anil Kumble", "Wasim Akram", "Waqar Younis", "Adam Gilchrist", "Yuvraj Singh", "Sourav Ganguly", "Rahul Dravid", "Kapil Dev", "Sunil Gavaskar", "Javed Miandad", "Inzamam-ul-Haq", "Hashim Amla", "Faf du Plessis", "Dale Steyn", "Lasith Malinga", "Brett Lee", "Michael Clarke", "Ricky Ponting", "Andrew Symonds", "Shikhar Dhawan", "Hardik Pandya", "Jasprit Bumrah", "Trent Boult", "Kagiso Rabada", "Ben Stokes", "Jos Buttler", "Quinton de Kock", "Martin Guptill", "Ross Taylor", "Kumar Sangakkara", "Mahela Jayawardene", "Tillakaratne Dilshan", "Chaminda Vaas", "Dinesh Chandimal", "Shane Watson", "Mithali Raj", "Smriti Mandhana", "Ellyse Perry", "Meg Lanning", "Jhulan Goswami", "Harmanpreet Kaur", "Sana Mir", "Suzie Bates", "Stafanie Taylor", "Alyssa Healy", "Beth Mooney", "Rachael Haynes", "Deepti Sharma", "Poonam Yadav", "Anya Shrubsole", "Natalie Sciver", "Laura Wolvaardt", "Marizanne Kapp", "Shabnim Ismail", "Sophie Devine", "Amy Satterthwaite", "Danielle Wyatt", "Ellyse Perry", "Sachin Tendulkar", "Kapil Dev", "Virendra Sehwag", "Brian Lara", "Jacques Kallis", "Muttiah Muralitharan", "Shane Warne", "Glenn McGrath", "Anil Kumble", "Wasim Akram", "Waqar Younis"};
        return cricketers[(int) (Math.random() * cricketers.length)];
    }

    // Function to generate footballer names
    public String footballer() {
        String[] footballers = {"Cristiano Ronaldo", "Lionel Messi", "Neymar Jr.", "Kylian Mbappe", "Mohamed Salah", "Kevin De Bruyne", "Robert Lewandowski", "Sadio Mane", "Virgil van Dijk", "Harry Kane", "Zlatan Ibrahimovic", "Eden Hazard", "Luis Suarez", "Sergio Aguero", "Antoine Griezmann", "Paul Pogba", "Gareth Bale", "Toni Kroos", "Luka Modric", "Raheem Sterling", "Jadon Sancho", "Bruno Fernandes", "Erling Haaland", "Phil Foden", "Mason Mount", "Trent Alexander-Arnold", "Alphonso Davies", "Joao Felix", "Frenkie de Jong", "Matthijs de Ligt", "Rodri Hernandez", "Aymeric Laporte", "Jan Oblak", "Marc-Andre ter Stegen", "Thibaut Courtois", "Manuel Neuer", "David Alaba", "Sergio Ramos", "Gerard Pique", "Thiago Silva", "Kalidou Koulibaly", "Raphael Varane", "Ciro Immobile", "Edin Dzeko", "Dries Mertens", "Lorenzo Insigne", "Marco Verratti", "Marco Reus", "Thomas Muller", "Joshua Kimmich", "Leon Goretzka", "Serge Gnabry", "Kingsley Coman", "N'Golo Kante", "Paulinho", "Oscar", "Ramires", "Hulk", "Alexis Sanchez", "Arturo Vidal", "Claudio Bravo", "Gary Medel", "James Rodriguez", "Radamel Falcao", "Alisha Lehmann", "Timo Werner", "Kai Havertz", "Mats Hummels", "Mesut Ozil", "Ilkay Gundogan", "Cesc Fabregas", "David Silva", "Sergio Busquets", "Jordi Alba", "Dani Carvajal", "Marcelo", "Casemiro", "Thiago Alcantara", "Fabinho", "Sunil Chhetri", "Sardar Singh", "Gurpreet Singh Sandhu", "Jeje Lalpekhlua", "Udanta Singh", "Anirudh Thapa", "Bhaichung Bhutia", "Claudio Pizarro", "Paolo Guerrero", "Jefferson Farfan", "Yoshinori Muto", "Takumi Minamino", "Shinji Kagawa", "Keisuke Honda", "Son Heung-min", "Park Ji-sung", "Hwang Hee-chan"};
        return footballers[(int) (Math.random() * footballers.length)];
    }
}
