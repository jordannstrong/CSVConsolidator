package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import consolidator.Consolidator;
import keystroke.Keystroke;
import net.lingala.zip4j.exception.ZipException;
import renameandorganize.*;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListModel;

import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.GridLayout;
import javax.swing.JList;

public class Main {

	private JFrame frame;
	private JTextField txtAddNewOrder;
	private ArrayList<String> orders = new ArrayList<>();
	private DefaultListModel<String> model = new DefaultListModel<>();
			 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 693, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File("orders.txt")));
			
			for(String s; (s = in.readLine()) != null; ) {
				orders.add(s);
			}
			
			for(String s : orders) {
				model.addElement(s);
			}
			
			in.close();
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		Action startAction = new AbstractAction()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	Keystroke key = new Keystroke();
		    	try {
					key.sendKeystrokes(orders);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		    	
		    	Consolidator consolidate = new Consolidator();
		    	try {
					consolidate.consolidate();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		    	
		    }
		};
		
		
		
		Action mergeAction = new AbstractAction()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	Consolidator consolidate = new Consolidator();
		    	try {
					consolidate.consolidate();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		    }
		};
		
		Action button3Action = new AbstractAction()
		{
		    @Override
		    public void actionPerformed(ActionEvent e)
		    {
		    	Consolidator consolidate = new Consolidator();
		    }
		};
		
		txtAddNewOrder = new JTextField();
		txtAddNewOrder.setToolTipText("Add new order by order number");
		GridBagConstraints gbc_txtAddNewOrder = new GridBagConstraints();
		gbc_txtAddNewOrder.gridwidth = 6;
		gbc_txtAddNewOrder.insets = new Insets(0, 0, 5, 0);
		gbc_txtAddNewOrder.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAddNewOrder.gridx = 3;
		gbc_txtAddNewOrder.gridy = 0;
		panel.add(txtAddNewOrder, gbc_txtAddNewOrder);
		txtAddNewOrder.setColumns(10);
		
		JButton startButton = new JButton("Start");
		GridBagConstraints gbc_startButton = new GridBagConstraints();
		gbc_startButton.insets = new Insets(0, 0, 5, 5);
		gbc_startButton.gridx = 0;
		gbc_startButton.gridy = 1;
		panel.add(startButton, gbc_startButton);
		
		startButton.addActionListener(startAction);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 12;
		gbc_panel_1.gridwidth = 8;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 1;
		panel.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel_1.add(scrollPane);
		
		JList orderList = new JList(model);
		scrollPane.setViewportView(orderList);
		
		JButton mergeButton = new JButton("Merge spreadsheets");
		GridBagConstraints gbc_mergeButton = new GridBagConstraints();
		gbc_mergeButton.insets = new Insets(0, 0, 5, 5);
		gbc_mergeButton.gridx = 0;
		gbc_mergeButton.gridy = 3;
		panel.add(mergeButton, gbc_mergeButton);
		
		mergeButton.addActionListener(mergeAction);
		
		JButton unzipButton = new JButton("Unzip");
		unzipButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Unzip unzip = new Unzip();
				Rename rename = new Rename();
				try {
					unzip.unzip(orders);
					rename.rename(orders);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ZipException e1) {
					//TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		JButton scripterButton = new JButton("Scripter");
		scripterButton.setEnabled(false);
		GridBagConstraints gbc_scripterButton = new GridBagConstraints();
		gbc_scripterButton.insets = new Insets(0, 0, 5, 5);
		gbc_scripterButton.gridx = 0;
		gbc_scripterButton.gridy = 5;
		panel.add(scripterButton, gbc_scripterButton);
		GridBagConstraints gbc_unzipButton = new GridBagConstraints();
		gbc_unzipButton.insets = new Insets(0, 0, 5, 5);
		gbc_unzipButton.gridx = 0;
		gbc_unzipButton.gridy = 7;
		panel.add(unzipButton, gbc_unzipButton);
		
		Action addOrderAction = new AbstractAction()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				orders.add(txtAddNewOrder.getText());
				for(String s : orders)
				{
					model.addElement(s);
				}
				txtAddNewOrder.setText("");
				orderList.repaint();
			}
			
		};
		txtAddNewOrder.addActionListener(addOrderAction);
		
		
	}

}
