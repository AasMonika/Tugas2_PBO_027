/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package audition;

/**
 *
 * @author ASUS
 */
public class Soloist extends Participant {

    public Soloist(String name, int totalCrew) {
        super(name, totalCrew);
    }

    @Override
    public void validateCrew() throws InvalidMemberException {

        if (totalCrew != 1) {
            throw new InvalidMemberException("Soloist harus 1 orang.");
        }

        System.out.println("Soloist valid.");
    }

    @Override
    public void performSoundcheck() {
        System.out.println("Soloist " + name + " melakukan soundcheck vokal.");
    }
}
