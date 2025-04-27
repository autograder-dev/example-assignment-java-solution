package com.pawtograder.example.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageTest {
    @Test
    void testCreateFunnyImage() throws IOException {
        // Create a new image
        BufferedImage image = new BufferedImage(400, 200, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();
        
        // Set background color
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, 400, 200);
        
        // Set text properties
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        
        // Draw the funny message
        String message = "Message: " + new Entrypoint().getMessage();
        FontMetrics metrics = g2d.getFontMetrics();
        int x = (400 - metrics.stringWidth(message)) / 2;
        int y = 100;
        
        g2d.drawString(message, x, y);
        g2d.dispose();
        
        // Save the image
        File output = new File("entrypoint_message.png");
        ImageIO.write(image, "png", output);
        
        // Verify the file was created
        assertTrue(output.exists());
        assertTrue(output.length() > 0);
    }
} 