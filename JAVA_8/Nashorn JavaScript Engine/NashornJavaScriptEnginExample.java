

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornJavaScriptEnginExample {
    public static void main(String[] args) {
        // Nashorn JavaScript engine to execute JavaScript code from Java
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        try {
            engine.eval("print('Hello from JavaScript');");
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
// Pros: Allows embedding and running JavaScript within Java applications.
// Cons: Nashorn has been deprecated in later versions of Java.
