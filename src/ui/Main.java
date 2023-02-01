package ui;

import ast.Event;
import ast.Program;
import ast.evaluators.Evaluator;
import ast.helpers.Date;
import ast.helpers.Time;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import parser.CalendarLexer;
import parser.CalendarParser;
import parser.ParseTreeToAST;

import java.io.IOException;
import java.text.Format;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        CalendarLexer lexer = new CalendarLexer(CharStreams.fromFileName("input.cal"));
        for (Token token : lexer.getAllTokens()) {
            System.out.println(token);
        }
        lexer.reset();
        TokenStream tokens = new CommonTokenStream(lexer);
        System.out.println("Done tokenizing");

        CalendarParser parser = new CalendarParser(tokens);
        ParseTreeToAST visitor = new ParseTreeToAST();
        Program parsedProgram = visitor.visitProgram(parser.program());
        System.out.println("Done parsing");

        Evaluator e = new Evaluator();
        StringBuilder s = new StringBuilder();
        parsedProgram.accept(s, e);
        if(s.isEmpty()) {
            System.out.println("Evaluation completed successfully");
        } else {
            System.out.println("Error during runtime: \n" + s);
        }
        Map<Date, Map<Time, ArrayList<String>>> schedule = e.getSchedule();
        Map<String, Event> events = e.getEvents();
        for (Map.Entry<Date, Map<Time, ArrayList<String>>> t : schedule.entrySet()){
            System.out.println(t.getKey() + "-------------------");
            List<Time> time =new ArrayList(t.getValue().keySet());
            Collections.sort(time);
            for (Time z : time) {
                System.out.print(z + " | ");
                for (String event : t.getValue().get(z)) {
                    System.out.print(events.get(event).getName() + " | ");
                }
                System.out.print("\n");
            }
        }

        List<String> addedEventAliases = e.getAddedEvents();
        List<Event> addedEvents = new ArrayList<>();

        for (String alias: addedEventAliases) {
            addedEvents.add(events.get(alias));
        }

        System.out.println();
        System.out.println("Events added to schedule:");
        for (Event event: addedEvents) {
            event.print();
        }
        //System.out.println(e.getSchedule());
    }
}
