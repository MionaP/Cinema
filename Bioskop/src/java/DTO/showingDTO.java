
package DTO;
import java.util.Date;
public class showingDTO
{
    private int showingID;
    private screenDTO screen;
    private filmDTO film;
    private String timeslot;

    public showingDTO(int showingID, screenDTO screen, filmDTO film, String timeslot) {
        this.showingID = showingID;
        this.screen = screen;
        this.film = film;
        this.timeslot = timeslot;
    }

    public int getShowingID() {
        return showingID;
    }

    public screenDTO getScreen() {
        return screen;
    }

    public filmDTO getFilm() {
        return film;
    }

    public String getTimeslot() {
        return timeslot;
    }   
    
}
