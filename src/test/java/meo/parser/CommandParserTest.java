package meo.parser;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import meo.MeoException;
import meo.command.Command;
import meo.command.DeadlineCommand;
import meo.command.EventCommand;
import meo.command.TodoCommand;

public class CommandParserTest {
    private final CommandParser parser = new CommandParser();

    @Test
    public void parse_taskWithDescription_success() {
        try {
            // parse a todo command
            Command command = parser.parser("todo eat grass");
            assertTrue(command instanceof TodoCommand);

            // parse a deadline command
            command = parser.parser("deadline eat grass /by Monday");
            assertTrue(command instanceof DeadlineCommand);

            // parse an event command
            command = parser.parser("event eat grass /from Aug 2 /to Aug 3");
            assertTrue(command instanceof EventCommand);

        } catch (MeoException e) {
            fail();
        }
    }

    @Test
    public void parse_todoWithNoDescription_exceptionThrown() {
        assertThrows(MeoException.class, () -> parser.parser("todo"));
    }

    @Test
    public void parse_deadlineWithNoTime_exceptionThrown() {
        assertThrows(MeoException.class, () -> parser.parser("deadline eat grass"));
    }
}
