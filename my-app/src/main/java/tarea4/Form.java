package tarea4;

interface Strategy {
    String execute();
}

class ConcreteStrategySimple implements Strategy {

    String infoSimple;

    ConcreteStrategySimple() {
        this.infoSimple = "CLP $3000, corte simple.";
    }

    public String execute() {
        return this.infoSimple;
    }

}

class ConcreteStrategyFull implements Strategy {

    String infoFull;

    ConcreteStrategyFull() {
        this.infoFull = "CLP $8000, corte mas lavado y peinado.";
    }

    public String execute() {
        return this.infoFull;
    }

}

class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeStrategy() {
        return strategy.execute();
    }

}

public class Form {

    String date;
    String type;
    String info;

    Form(Context context, String type, String date) {

        switch (type) {
            case "Simple":
                context.setStrategy(new ConcreteStrategySimple());
                break;
            case "Full":
                context.setStrategy(new ConcreteStrategyFull());
                break;
            default:
                this.info = "Opción invalida";
                break;
        }

        this.date = date;
        this.type = type;
        if (this.info != "Opción invalida") {
            this.info = context.executeStrategy();
        }
    }

    public void view() {
        System.out.println(" \n viewForm -> \n");
        System.out.println(" date ->");
        System.out.println(this.date);
        System.out.println(" type ->");
        System.out.println(this.type);
        System.out.println(" info ->");
        System.out.println(this.info);

    }

    public String getDate() {
        return this.date;
    };

    public String getType() {
        return this.type;
    };

    public String getInfo() {
        return this.info;
    };

    public boolean getValidInfo() {
        return this.info != "Opción invalida";
    }

}