/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String jeffy = "cymbal.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component dy;
		// 3. use the "createImage()" method below to initialize your Component
		dy = createImage(jeffy);
		// 4. add the image to the quiz windoww
		quizWindow.add(dy);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String r = JOptionPane
				.showInputDialog("Which of these terrorists manufactures these drums? Bin laden,Obama,or alibaba");
		// 7. print "CORRECT" if the user gave the right answer
		if (r.equalsIgnoreCase("Obama")) {
			JOptionPane.showMessageDialog(null, "you are correct");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "get played boy");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(dy);
		// 10. find another image and create it (might take more than one line of code)
		String pup = "puupy.jpg";
		// 11. add the second image to the quiz window
		Component puppy;
		puppy = createImage(pup);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String s = JOptionPane.showInputDialog("What breed is this dog?");
		if (s.equalsIgnoreCase("Weimaraner")) {
			JOptionPane.showMessageDialog(null, "you're correct");
		}
		// 14+ check answer, say if correct or incorrect, etc.
		else {
			JOptionPane.showMessageDialog(null, "get played boy!");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
