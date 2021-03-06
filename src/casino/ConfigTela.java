package casino;

import javax.swing.JOptionPane;


@SuppressWarnings("serial")
public class ConfigTela extends javax.swing.JFrame {

    public ConfigTela() {
    	super(Casino.getWindowTitle());
        initComponents();
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        configPanel = new javax.swing.JPanel();
        balanceConfigTextField = new javax.swing.JTextField();
        tcValueConfigTextField = new javax.swing.JTextField();
        payoutConfigTextField = new javax.swing.JTextField();
        saveConfigButton = new javax.swing.JButton();
        backConfigButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        configPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Configurations"));
        configPanel.setMinimumSize(new java.awt.Dimension(0, 0));

        String balanceTextValue = String.valueOf(Casino.getBalance());
        if(Casino.getBalance() != 0){
        	balanceConfigTextField.setText(balanceTextValue);
        } else {
        	balanceConfigTextField.setText("");
        }
        balanceConfigTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Balance"));

        String tcValueTextValue = String.valueOf(Casino.getTcValue());
        if(Casino.getTcValue() != 0){
        	tcValueConfigTextField.setText(tcValueTextValue);
        } else {
        	tcValueConfigTextField.setText("");
        }
        tcValueConfigTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("TC Market Value"));

        String payoutTextValue = String.valueOf(Casino.getPayout());
        if(Casino.getPayout() != 0){
        	payoutConfigTextField.setText(payoutTextValue);
        } else {
        	payoutConfigTextField.setText("");
        }
        payoutConfigTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Payout (%)"));

        saveConfigButton.setText("Save");
        saveConfigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	saveButtonActionPerformed(evt);
            }
        });

        backConfigButton.setText("Back");
        backConfigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	cancelConfigButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(configPanel);
        configPanel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payoutConfigTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(balanceConfigTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(tcValueConfigTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveConfigButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backConfigButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(payoutConfigTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(balanceConfigTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(tcValueConfigTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveConfigButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backConfigButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        balanceConfigTextField.getAccessibleContext().setAccessibleName("Balance");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(configPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(configPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	try {
    		Casino.setBalance(Integer.parseInt(balanceConfigTextField.getText()));
    		Casino.setPayout(Double.parseDouble(payoutConfigTextField.getText()));
    		if(tcValueConfigTextField.getText().equals("")){
    			Casino.setTcValue(0);
    		} else {
    			Casino.setTcValue(Integer.parseInt(tcValueConfigTextField.getText()));
    		}
    		Casino.printStatus();
    		DashboardTela dashboardTela = new DashboardTela();
    		dashboardTela.setVisible(true);
    		this.dispose();
    	} catch(NumberFormatException nfe) {
    		nfe.printStackTrace();
    		JOptionPane.showMessageDialog(null, "Please enter a valid Balance, Payout and TC Market values!");
    	}
    }
    
    private void cancelConfigButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        DashboardTela dashboardTela = new DashboardTela();
        dashboardTela.setVisible(true);
        this.dispose();
    }

    private javax.swing.JTextField tcValueConfigTextField;
    private javax.swing.JTextField balanceConfigTextField;
    private javax.swing.JButton saveConfigButton;
    private javax.swing.JButton backConfigButton;
    private javax.swing.JPanel configPanel;
    private javax.swing.JTextField payoutConfigTextField;
}
