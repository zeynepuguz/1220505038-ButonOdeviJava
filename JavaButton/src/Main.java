import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Swing GUI'nin düzenlenmesi için iş parçacığında çalıştırma
        SwingUtilities.invokeLater(() -> {
            ButonPaneli panel = new ButonPaneli();
            panel.setVisible(true); // panelin setVisible özelliğini true yaparak görünür olmasına izin vermiş oldum.
        });
    }
}