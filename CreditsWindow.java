import javax.swing.*;
import java.awt.*;

public class CreditsWindow{
    JFrame frame = new JFrame();
    JTextArea area =
            new JTextArea
                    ("Leader:\nGo,Mark Andrei C.\n\nEncoder:\nCervantes,Elijah Gabe C.\n\nDesigner:\nPineda,Rosemarie G.\n\nDocumentation:" +
                            "\nLagman,Ian Carlo M." + "\n\n\nReference:\nhttps://www.youtube.com/playlist?list=PLVebSvXY44hFyJMAXmpzp9sTyupgCUaAn\n"
                            + "https://www.youtube.com/watch?v=HgkBvwgciB4&t=58s&ab_channel=BroCode\n" +
                            "https://www.youtube.com/watch?v=dfhmTyRTCSQ&t=12s&ab_channel=BroCode");

    CreditsWindow(){
        area.setBounds(0,0,1000,500);
        area.setFont(new Font(null,Font.PLAIN,18));

        frame.add(area);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(430,430);
        frame.setLayout(null);
        frame.setVisible(true);
    }



}
