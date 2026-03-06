/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package audition;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void startAudition(Participant p) {

        try {

            p.performSoundcheck();
            p.validateCrew();

            System.out.println("Audisi berhasil\n");

        } catch (InvalidMemberException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Participant p1 = new Soloist("Aas Monika", 1);
        Participant p2 = new Band("Dream Band", 4);
        Participant p3 = new Soloist("Rina", 2);

        startAudition(p1);
        startAudition(p2);
        startAudition(p3);
    }
}