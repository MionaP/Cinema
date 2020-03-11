
package DTO;


public class filmDTO
{
    private int filmID;
    private String title;
    private String AgeR;
    private String Runtime;
    private String Lead;

    public filmDTO(int filmID, String title, String bbfcAge, String Runtime, String Lead)
    {
        this.filmID = filmID;
        this.title = title;
        this.AgeR = AgeR;
        this.Runtime = Runtime;
        this.Lead = Lead;
    }

    public int getFilmID()
    {
        return filmID;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAgeR()
    {
        return AgeR;
    }

    public String getRuntime()
    {
        return Runtime;
    }

    public String getLead()
    {
        return Lead;
    }
    
    
}
