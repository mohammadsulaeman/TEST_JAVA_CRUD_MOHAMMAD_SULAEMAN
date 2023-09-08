package springboot.movie.collection.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springboot.movie.collection.entity.MovieCollection;
import springboot.movie.collection.service.delete.DeleteMovieService;
import springboot.movie.collection.service.insert.InsertMovieService;
import springboot.movie.collection.service.listall.ListAllMovieService;
import springboot.movie.collection.service.search.SearchMovieService;
import springboot.movie.collection.service.update.UpdateMovieService;

@Controller
@AllArgsConstructor
public class MovieCollectionController {
    InsertMovieService insertMovieService;
    UpdateMovieService updateMovieService;
    SearchMovieService searchMovieService;
    ListAllMovieService listAllMovieService;
    DeleteMovieService deleteMovieService;

    @GetMapping("/")
    public String viewHomePage(Model model, @ModelAttribute("movieCollectionSearch") MovieCollection movieCollection){
        System.out.println("movieCollectionSearch : "+movieCollection.toString());
        model.addAttribute("movieCollection",listAllMovieService.listMovieCollectionAll());
        return "index";
    }

    @GetMapping("search")
    public String searchMovieCollectionByTitle(@RequestParam(value = "title") String title,Model model){
        MovieCollection movieCollection = searchMovieService.searchMovieByTitle(title);
        model.addAttribute("movieCollectionSearch",movieCollection);
        return "search";
    }

    @GetMapping("showMovieCollectionForm")
    public String showMovieCollectionForm(Model model){
        MovieCollection movieCollection = new MovieCollection();
        model.addAttribute("movie",movieCollection);
        return "new_movie";
    }

    @PostMapping("saveMovie")
    public String saveMovie(@ModelAttribute("movie") MovieCollection movieCollection){
        System.out.println("movieCollection : "+movieCollection.toString());
        //System.exit(1);
        insertMovieService.saveMovieCollection(movieCollection);
        return "redirect:/";
    }

    @GetMapping("showFormUpdateMovie/{id}")
    public String showFormUpdateMovie(@PathVariable("id") Long id,Model model){
        MovieCollection movieCollection = updateMovieService.EmployeeById(id);
        model.addAttribute("movie",movieCollection);
        return "update_movie";
    }

    @PostMapping("updateMovie")
    public String updateMovie(@ModelAttribute("movie") MovieCollection movieCollection){
        updateMovieService.updateEmployee(movieCollection);
        return "redirect:/";
    }
    @GetMapping("deleteMovie/{id}")
    public String deleteMovie(@PathVariable("id") Long id){
        deleteMovieService.deleteMovieCollection(id);
        return "redirect:/";
    }
}
