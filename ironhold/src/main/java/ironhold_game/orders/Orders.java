package ironhold_game.orders;

public enum Orders {

    BUILD("build","Construct a building of the available types." ),
    REASSIGN("reassign","Reassign x workers form one building to another."),
    ASSIGN("assign","Assign x unemployed workers to a building."),
    SELL("sell","Sell a resource for gold."),
    BUY("buy","Buy a resource for gold."),
    RATE("rate","Print the current buy/sell rate."),
    LOG("log","Print the last 10 commands."),
    HELP("help","Print all the available commands"),
    SKIP("skip","Skip this turn.");

    private String details;
    private String name;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Orders(String name, String details) {
        this.name = name;
        this.details = details;

    }
}
