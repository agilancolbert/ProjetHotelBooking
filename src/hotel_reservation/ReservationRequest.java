/*
 * Copyright (c) 2018, CGI.
 */
package hotel_reservation;

/**
 * @author agilan.colbert
 */
import java.util.Date;

public class ReservationRequest {
    private Date date;
    private int nbNight;
    private int nbRoom;

    /**
     * 
     */
    public ReservationRequest() {
        super();
    }

    /**
     * Getter for date.
     * 
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Setter for date.
     * 
     * @param date the date to set
     */
    public void setDate(final Date date) {
        this.date = date;
    }

    /**
     * Getter for nbNight.
     * 
     * @return the nbNight
     */
    public int getNbNight() {
        return nbNight;
    }

    /**
     * Setter for nbNight.
     * 
     * @param nbNight the nbNight to set
     */
    public void setNbNight(final int nbNight) {
        this.nbNight = nbNight;
    }

    /**
     * Getter for nbRoom.
     * 
     * @return the nbRoom
     */
    public int getNbRoom() {
        return nbRoom;
    }

    /**
     * Setter for nbRoom.
     * 
     * @param nbRoom the nbRoom to set
     */
    public void setNbRoom(final int nbRoom) {
        this.nbRoom = nbRoom;
    }

}
