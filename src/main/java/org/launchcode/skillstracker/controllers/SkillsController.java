package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    // TODO: STEP 1:
    // You need to have a h1 with the title “Skills Tracker”,
    // a h2, and an ol containing three programming languages of your choosing.

    // TODO: STEP 2:
    // At localhost:8080/form, add a form that lets the user enter their name and choose their favorite,
    // second favorite, and third favorite programming languages on your list. Use select elements for
    // each of the rankings. Just as with the exercises, we will use @GetMapping().

    // TODO: STEP 3:
    // Also at localhost:8080/form, use @PostMapping and @RequestParam to update the HTML with an h1
    // stating the user’s name and an ol showing the three programming languages in the order they chose.

    // BONUS:
    // Reformat your form page to use a table instead of an ordered list.
    // Add a new path to the site to display the information from the completed form

    @GetMapping                                                 // STEP 1
    public String topThreePrograms() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<tr>" +
                "<td>Java</td>" +
                "</tr>" +
                "<tr>" +
                "<td>JavaScript</td>" +
                "</tr>" +
                "<tr>" +
                "<td>Python</td>" +
                "</tr>";
    }

    @GetMapping("form")                                         // STEP 2
    public String topThreeForm() {
        return "<html>" +
                "<body>" +
                "<form action='fillOut' method='post'" +
                "<h2>Name:</h2>" +
                "<input type='text' name='name'/>" +
                "<h2>My favorite language:</h2>" +
                "<select name='lang1' id='lang-select1'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<h2>My second favorite language:</h2>" +
                "<select name='lang2' id='lang-select2'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<h2>My third favorite language:</h2>" +
                "<select name='lang3' id='lang-select3'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<input type='submit' value='Submit'" +
                "</body>" +
                "</html>";
    }

    @GetMapping("fillOut")
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "fillOut")
    public String fillOut(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + lang1 + "</li>" +
                "<li>" + lang2 + "</li>" +
                "<li>" + lang3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
