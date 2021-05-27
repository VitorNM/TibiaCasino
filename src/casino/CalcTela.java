package casino;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class CalcTela extends javax.swing.JFrame {

    public CalcTela() {
    	super(Casino.getWindowTitle());
        initComponents();
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        calcPanel = new javax.swing.JPanel();
        balanceCalcTextField = new javax.swing.JTextField();
        tcValueCalcTextField = new javax.swing.JTextField();
        payoutCalcTextField = new javax.swing.JTextField();
        betCalcTextField = new javax.swing.JTextField();
        tcBetCalcTextField = new javax.swing.JTextField();
        payCalcTextField = new javax.swing.JTextField();
        casinoWinCalcButton = new javax.swing.JButton();
        casinoLoseCalcButton = new javax.swing.JButton();
        cleanCalcButton = new javax.swing.JButton();
        backCalcButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calcPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Calculator"));

        String balanceTextValue = String.valueOf(Casino.getBalance());
        if(Casino.getBalance() != 0){
        	balanceCalcTextField.setText(balanceTextValue);
        } else {
        	balanceCalcTextField.setText("");
        }
        balanceCalcTextField.setEditable(false);
        balanceCalcTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Balance"));

        String tcValueCalcText = String.valueOf(Casino.getTcValue());
        if(Casino.getTcValue() != 0){
        	tcValueCalcTextField.setText(tcValueCalcText);
        } else {
        	tcValueCalcTextField.setText("");
        }
        tcValueCalcTextField.setEditable(false);
        tcValueCalcTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("TC Market Value"));

        String payoutTextValue = String.valueOf(Casino.getPayout());
        if(Casino.getPayout() != 0){
        	payoutCalcTextField.setText(payoutTextValue);
        } else {
        	payoutCalcTextField.setText("");
        }
        payoutCalcTextField.setEditable(false);
        payoutCalcTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Payout (%)"));

        betCalcTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Bet Value"));
        
        tcBetCalcTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("TC Bet Value"));

        payCalcTextField.setEditable(false);
        payCalcTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Pay Value"));

        casinoWinCalcButton.setText("Casino Win");
        casinoWinCalcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	casinoWinCalcButtonActionPerformed(evt);
            }
        });

        casinoLoseCalcButton.setText("Casino Lose");
        casinoLoseCalcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casinoLoseCalcButtonActionPerformed(evt);
            }
        });

        cleanCalcButton.setText("Clean");
        cleanCalcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	cleanCalcButtonActionPerformed(evt);
            }
        });

        backCalcButton.setText("Back");
        backCalcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	cancelCalcButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout calcPanelLayout = new javax.swing.GroupLayout(calcPanel);
        calcPanel.setLayout(calcPanelLayout);
        if(Casino.getTcValue() == 0){
        	calcPanelLayout.setHorizontalGroup(
                    calcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(calcPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(calcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(balanceCalcTextField)
                            .addComponent(payoutCalcTextField)
                            .addComponent(betCalcTextField)
                            .addComponent(payCalcTextField)
                            .addGroup(calcPanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(calcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(casinoWinCalcButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(cleanCalcButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(calcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(backCalcButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(casinoLoseCalcButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                .addGap(25, 25, 25)))
                        .addContainerGap())
                );
        	
        	calcPanelLayout.setVerticalGroup(
                    calcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(calcPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(balanceCalcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payoutCalcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(betCalcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payCalcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(calcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(casinoLoseCalcButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(casinoWinCalcButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(calcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(backCalcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cleanCalcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
        } else {
        	calcPanelLayout.setHorizontalGroup(
                    calcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(calcPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(calcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(balanceCalcTextField)
                            .addComponent(tcValueCalcTextField)
                            .addComponent(payoutCalcTextField)
                            .addComponent(betCalcTextField)
                            .addComponent(tcBetCalcTextField)
                            .addComponent(payCalcTextField)
                            .addGroup(calcPanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(calcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(casinoWinCalcButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(cleanCalcButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(calcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(backCalcButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(casinoLoseCalcButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                .addGap(25, 25, 25)))
                        .addContainerGap())
                );
        	
        	calcPanelLayout.setVerticalGroup(
                    calcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(calcPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(balanceCalcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tcValueCalcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payoutCalcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(betCalcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tcBetCalcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payCalcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(calcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(casinoLoseCalcButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(casinoWinCalcButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(calcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(backCalcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cleanCalcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calcPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calcPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void casinoWinCalcButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	try{
    		int betValue;
        	int balanceValue;
        	int tcValue = Casino.getTcValue();
        	
    		if(Casino.getTcValue() == 0 || !betCalcTextField.getText().equals("") && tcBetCalcTextField.getText().equals("")){
    			betValue = Integer.parseInt(betCalcTextField.getText());
            	balanceValue = Integer.parseInt(balanceCalcTextField.getText());
            	
            	balanceValue += betValue;
            	
            	Casino.setBalance(balanceValue);
            	balanceCalcTextField.setText(String.valueOf(balanceValue));
            	payCalcTextField.setText("");
    		} else if(betCalcTextField.getText().equals("") && !tcBetCalcTextField.getText().equals("")){
    			betValue = Integer.parseInt(tcBetCalcTextField.getText()) * tcValue;
            	balanceValue = Integer.parseInt(balanceCalcTextField.getText());
            	
            	balanceValue += betValue;
            	
            	Casino.setBalance(balanceValue);
            	balanceCalcTextField.setText(String.valueOf(balanceValue));
            	payCalcTextField.setText("");
    		} else if(!betCalcTextField.getText().equals("") && !tcBetCalcTextField.getText().equals("")){
    			JOptionPane.showMessageDialog(null, "Please bet just one type of coin!");
    		} else if(betCalcTextField.getText().equals("") && tcBetCalcTextField.getText().equals("")){
    			JOptionPane.showMessageDialog(null, "Please enter a valid Bet value!");
    		}
    	} catch(NumberFormatException nfe){
    		nfe.printStackTrace();
    		JOptionPane.showMessageDialog(null, "Please enter a valid Bet value!");
    	}
    }

    private void casinoLoseCalcButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	try{
    		int betValue;
        	int balanceValue;
        	double payoutValue;
        	int payValue;
        	int playerProfit;
        	int tcValue = Casino.getTcValue();
        	
        	if(Casino.getTcValue() == 0 || !betCalcTextField.getText().equals("") && tcBetCalcTextField.getText().equals("")){
        		betValue = Integer.parseInt(betCalcTextField.getText());
            	balanceValue = Integer.parseInt(balanceCalcTextField.getText());
            	payoutValue = Double.parseDouble(payoutCalcTextField.getText());
            	
            	playerProfit = (int)((payoutValue/100) * betValue);
            	payValue = betValue + playerProfit;
            	balanceValue -= playerProfit;
            	
            	Casino.setBalance(balanceValue);
            	balanceCalcTextField.setText(String.valueOf(balanceValue));
            	payCalcTextField.setText(String.valueOf(payValue));
    		} else if(betCalcTextField.getText().equals("") && !tcBetCalcTextField.getText().equals("")){
    			betValue = Integer.parseInt(tcBetCalcTextField.getText()) * tcValue;
            	balanceValue = Integer.parseInt(balanceCalcTextField.getText());
            	payoutValue = Double.parseDouble(payoutCalcTextField.getText());
            	
            	playerProfit = (int)((payoutValue/100) * betValue);
            	payValue = betValue + playerProfit;
            	balanceValue -= playerProfit;
            	
            	Casino.setBalance(balanceValue);
            	balanceCalcTextField.setText(String.valueOf(balanceValue));
            	payCalcTextField.setText(String.valueOf(payValue));
    		} else if(!betCalcTextField.getText().equals("") && !tcBetCalcTextField.getText().equals("")){
    			JOptionPane.showMessageDialog(null, "Please bet just one type of coin!");
    		} else if(betCalcTextField.getText().equals("") && tcBetCalcTextField.getText().equals("")){
    			JOptionPane.showMessageDialog(null, "Please enter a valid Bet value!");
    		}
    	} catch(NumberFormatException nfe){
    		nfe.printStackTrace();
    		JOptionPane.showMessageDialog(null, "Please enter a valid Bet value!");
    	}
    }

    private void cleanCalcButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	betCalcTextField.setText("");
    	tcBetCalcTextField.setText("");
    	payCalcTextField.setText("");
    }

    private void cancelCalcButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	DashboardTela dashboardTela = new DashboardTela();
        dashboardTela.setVisible(true);
        this.dispose();
    }

    private javax.swing.JTextField balanceCalcTextField;
    private javax.swing.JTextField tcValueCalcTextField;
    private javax.swing.JTextField betCalcTextField;
    private javax.swing.JTextField tcBetCalcTextField;
    private javax.swing.JPanel calcPanel;
    private javax.swing.JButton backCalcButton;
    private javax.swing.JButton casinoLoseCalcButton;
    private javax.swing.JButton casinoWinCalcButton;
    private javax.swing.JButton cleanCalcButton;
    private javax.swing.JTextField payCalcTextField;
    private javax.swing.JTextField payoutCalcTextField;
}
