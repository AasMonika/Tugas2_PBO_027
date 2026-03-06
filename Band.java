/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package audition;

/**
 *
 * @author ASUS
 */
public class Band extends Participant {

    public Band(String name, int totalCrew) {
        super(name, totalCrew);
    }

    @Override
    public void validateCrew() throws InvalidMemberException {

        if (totalCrew < 2) {
            throw new InvalidMemberException("Band minimal 2 orang.");
        }

        System.out.println("Band valid.");
    }

    @Override
    public void performSoundcheck() {
        System.out.println("Band " + name + " melakukan soundcheck alat musik.");
    }
}
