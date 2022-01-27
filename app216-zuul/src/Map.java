/**
 * The Map class stores an interconnected set of rooms used for the Zuul game.
 *
 * @author Nackshayan
 * @version 22/02/2022
 */
public class Map
{
    private Room startRoom, outside, theater, pub, lab, office, library, field, shop,
            studio, classroom, bathroom, gym, reception, cafeteria;

    /**
     * Constructor for a Map object.
     */
    public Map()
    {
        createRooms();
    }

    /**
     * Create all the rooms with descriptions and items.
     */
    private void createRooms()
    {
        outside = new Room(1, "outside", Items.BACKPACK);
        theater = new Room(2, "theater", Items.COIN);
        pub = new Room(3, "pub", Items.WATCH);
        lab = new Room(4, "lab", Items.NOTEPAD);
        office = new Room(5, "office", Items.WATER);
        library = new Room(6, "library", Items.NONE);
        field = new Room(7, "field", Items.NECKLACE);
        shop = new Room(8, "shop", Items.KEY);
        studio = new Room(9, "studio", Items.PHONE);
        // classroom is initially locked, requires item "Key" to unlock
        classroom = new Room(10, "lockedClassroom", Items.IDCARD);
        bathroom = new Room(11, "bathroom", Items.NONE);
        gym = new Room(12, "gym", Items.ENERGYBAR);
        reception = new Room(13, "reception", Items.COLA);
        cafeteria = new Room(14, "cafeteria", Items.BISCUIT);

        startRoom = outside;  // start game outside
        setDescriptions();
    }

    /**
     * Initialises the descriptions for each room.
     */
    private void setDescriptions()
    {
        outside.setDescription("outside the main entrance of the university");
        theater.setDescription("in a lecture theater");
        pub.setDescription("in the campus pub");
        lab.setDescription("in a computing lab");
        office.setDescription("in the computing admin office");
        library.setDescription("in the library");
        field.setDescription("on the university fields");
        shop.setDescription("in the campus shop");
        studio.setDescription("in a music studio");
        classroom.setDescription("in a standard classroom");
        bathroom.setDescription("in a bathroom");
        gym.setDescription("in the gym");
        reception.setDescription("in the university reception area");
        cafeteria.setDescription("in the cafeteria");

        setExits();
    }

    /**
     * Initialises the exits for each room.
     */
    private void setExits()
    {
        outside.setExit("north", field);
        outside.setExit("east", reception);
        outside.setExit("south", lab);
        outside.setExit("west", pub);

        field.setExit("south", outside);
        field.setExit("east", shop);
        field.setExit("north", gym);

        reception.setExit("west", outside);
        reception.setExit("north", theater);
        reception.setExit("east", cafeteria);

        theater.setExit("south", reception);
        theater.setExit("west", outside);

        cafeteria.setExit("west", reception);
        cafeteria.setExit("north", bathroom);

        bathroom.setExit("south", cafeteria);

        pub.setExit("east", outside);
        pub.setExit("west", shop);

        shop.setExit("west", field);
        shop.setExit("east", pub);

        lab.setExit("north", outside);
        lab.setExit("east", office);
        lab.setExit("west", classroom);

        office.setExit("west", lab);

        classroom.setExit("east", lab);
        classroom.setExit("west", studio);

        studio.setExit("east", classroom);

        gym.setExit("south", field);
    }

    /**
     * @return startRoom The starting room for the game.
     */
    public Room getStartRoom()
    {
        return startRoom;
    }
}
