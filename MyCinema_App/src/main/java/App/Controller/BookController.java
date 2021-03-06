package App.Controller;

import App.Controller.ServiceController.CookieHandler;
import App.Database.Entities.Movie;
import App.Database.Service.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    IRepository repository;

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String book(HttpServletRequest request, HttpServletResponse response, Model model) {
        CookieHandler cookieHandler = new CookieHandler(request, response);
        if (!cookieHandler.isCoonected()) return "error403";
        List<Movie> listOfMovie = repository.getAllMovie();
        model.addAttribute("movies", listOfMovie);
        return "Movies";
    }

}
