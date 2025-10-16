interface IPrinter {
    void print(String message);
}

class ConsolePrinter implements IPrinter {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}

class Report {
    private final IPrinter printer; // Depends on the interface

    // The dependency is "injected" through the constructor
    public Report(IPrinter printer) {
        this.printer = printer;
    }

    void generate() {
        printer.print("Generating report...");
    }
}

