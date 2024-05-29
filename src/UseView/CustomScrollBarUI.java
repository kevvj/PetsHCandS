package UseView;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JScrollBar;


public class CustomScrollBarUI extends BasicScrollBarUI {

    private final Color thumbColor = new Color(91, 196, 175, 102);
    private final Color trackColor = new Color(220, 220, 220); // Gris claro

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        Graphics2D g2 = (Graphics2D) g.create();

        // Dibujar el thumb con un color sólido y transparente
        g2.setColor(thumbColor);
        g2.fillRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height);

        g2.dispose();
    }

    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
        // Dibujar el track con un color de fondo
        g.setColor(trackColor);
        g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        Dimension preferredSize = super.getPreferredSize(c);
        return new Dimension(10, preferredSize.height); // Ancho fijo para el scrollbar vertical
    }
}
