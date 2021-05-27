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

        jPanel1 = new javax.swing.JPanel();
        balanceTextField = new javax.swing.JTextField();
        tcValueTextField = new javax.swing.JTextField();
        payoutTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        backConfigButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Configurations"));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));

        String balanceTextValue = String.valueOf(Casino.getBalance());
        if(Casino.getBalance() != 0){
        	balanceTextField.setText(balanceTextValue);
        } else {
        	balanceTextField.setText("");
        }
        balanceTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Balance"));

        String tcValueTextValue = String.valueOf(Casino.getTcValue());
        if(Casino.getTcValue() != 0){
        	tcValueTextField.setText(tcValueTextValue);
        } else {
        	tcValueTextField.setText("");
        }
        tcValueTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("TC Market Value"));

        String payoutTextValue = String.valueOf(Casino.getPayout());
        if(Casino.getPayout() != 0){
        	payoutTextField.setText(payoutTextValue);
        } else {
        	payoutTextField.setText("");
        }
        payoutTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Payout (%)"));

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	saveButtonActionPerformed(evt);
            }
        });

        backConfigButton.setText("Cancel");
        backConfigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	cancelConfigButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payoutTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(balanceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(tcValueTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backConfigButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(payoutTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(balanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(tcValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backConfigButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        balanceTextField.getAccessibleContext().setAccessibleName("Balance");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	try {
    		Casino.setBalance(Integer.parseInt(balanceTextField.getText()));
    		Casino.setPayout(Double.parseDouble(payoutTextField.getText()));
    		if(tcValueTextField.getText().equals("")){
    			Casino.setTcValue(0);
    		} else {
    			Casino.setTcValue(Integer.parseInt(tcValueTextField.getText()));
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

    private javax.swing.JTextField tcValueTextField;
    private javax.swing.JTextField balanceTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton backConfigButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField payoutTextField;
}
