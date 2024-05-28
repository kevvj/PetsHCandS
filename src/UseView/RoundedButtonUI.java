
package UseView;

import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

public class RoundedButtonUI extends BasicButtonUI {

    private Color backgroundColor;
    private Color foregroundColor;

    public RoundedButtonUI(Color backgroundColor, Color foregroundColor) {
        this.backgroundColor = backgroundColor;
        this.foregroundColor = foregroundColor;
    }

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        JButton button = (JButton) c;
        button.setOpaque(false);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setForeground(foregroundColor);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        JButton button = (JButton) c;
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibujar el fondo del botón
        g2.setColor(backgroundColor);
        g2.fill(new RoundRectangle2D.Float(0, 0, button.getWidth(), button.getHeight(), 40, 40));

        // Dibujar el texto del botón
        g2.setColor(button.getForeground());
        g2.setFont(button.getFont());
        g2.drawString(button.getText(), (button.getWidth() - g.getFontMetrics().stringWidth(button.getText())) / 2,
                (button.getHeight() + g.getFontMetrics().getAscent()) / 2 - 2);

        g2.dispose();
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        Dimension size = super.getPreferredSize(c);
        size.width += 20;
        size.height = 40;
        return size;
    }
}
