package ru.balcon.MyProject.controller.NoteApp;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.ServerRequest;
import ru.balcon.MyProject.model.Note;

@RestController
public class NoteAppRESTController {
    Note note = new Note();


    @GetMapping("/get")
    @ResponseBody
    public Note getMethod(HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        return note;
    }


    @PostMapping("/post")
    @ResponseBody
    public String postMethod(@RequestBody Note note, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        this.note = note;
        return "{\"Save\":\"OK\"}";
    }
}
