/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package audition;

/**
 *
 * @author ASUS
 */
public abstract class Participant {

    protected String name;
    protected int totalCrew;

    public Participant(String name, int totalCrew) {
        this.name = name;
        this.totalCrew = totalCrew;
    }

    public abstract void validateCrew() throws InvalidMemberException;

    public void performSoundcheck() {
        System.out.println(name + " sedang melakukan soundcheck.");
    }
}
