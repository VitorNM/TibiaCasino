package casino;

import javax.swing.JOptionPane;

public class Casino {

	private static String version = "v1.0";
	private static String windowTitle = "Tibia Casino - " + version;
	private static int balance = 0;
	private static double payout = 0;
	private static int tcValue = 0;
	
	public Casino(int balance) {
		Casino.balance = balance;
	}
	
	public Casino(int balance, double payout) {
		Casino.balance = balance;
		Casino.payout = payout;
	}
	
	public static int getBalance() {
		return balance;
	}
	
	public static void setBalance(int newBalance) {
		balance = newBalance;
	}

	public static int getTcValue() {
		return tcValue;
	}
	
	public static void setTcValue(int newTcValue) {
		tcValue = newTcValue;
	}
	
	public static double getPayout() {
		return payout;
	}
	
	public static void setPayout(double newPayout) {
		payout = newPayout;
	}

	public static String getWindowTitle(){
		return windowTitle;
	}
	
	public static void printStatus() {
		JOptionPane.showMessageDialog(null, "Payout: " + getPayout() + "%\nBalance: " + getBalance() + "\nTC Market Value: " + getTcValue() + "\n");
	}
	
	public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardTela().setVisible(true);
            }
        });
    }
}
