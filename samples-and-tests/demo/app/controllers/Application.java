package controllers;

import com.greenlaw110.rythm.play.UseRythmTemplateEngine;
import org.apache.commons.lang3.StringUtils;
import play.mvc.Controller;

import java.util.Random;

public class Application extends Controller {

    public static void index() {
        String title = "Hello";
        render(title);
    }

    public static void callTemplate() {
        render();
    }

    public static void testDefaultEscape() {
        String body = "<h1>This is header one</h1>";
        render(body);
    }

    public static void testRenderSection() {
        render();
    }

    public static void testCache() {
        int val = new Random().nextInt(100);
        render(val);
    }

    public static void testTagCache() {
        int var = new Random().nextInt();
        int val = 100;
        render(val, var);
    }
}