package controller;

import service.OrderService;
import view.Mainview;
import java.awt.print.PrinterException;
import javax.swing.Timer;

public class OrderController {
	
	private OrderService service = new OrderService();
	private Mainview view;
	
	public OrderController(Mainview view) {
		this.view = view;
	
		init();
	}
	
	public void startClock() {

	    Timer timer = new Timer(1000, e -> {

	        String now = java.time.LocalDateTime.now()
	                .format(java.time.format.DateTimeFormatter.ofPattern(
	                        "yyyy-MM-dd HH:mm:ss"));

	        view.setTime(now);
	    });

	    timer.start();
	}
	
	private void init() {
		bindButtonEvents();
		refreshView();
	}
	
	
	
	private void bindButtonEvents() {
		
		view.getBtnAddChicken().addActionListener(e ->{
			service.add(0);
			refreshView();
		});
		
		view.getBtnAddPork().addActionListener(e ->{
			service.add(1);
			refreshView();
		});
		
		view.getBtnAddVeg().addActionListener(e ->{
			service.add(2);
			refreshView();
		});
		
		view.getBtnMinusChicken().addActionListener(e->{
			service.minus(0);
			refreshView();
		});			
		
		view.getBtnMinusPork().addActionListener(e ->{
			service.minus(1);
			refreshView();
		});
		
		view.getBtnMinusVeg().addActionListener(e->{
			service.minus(2);
			refreshView();
		});
		
		view.getBtnClear().addActionListener(e ->{
			service.reset();			
			view.getRdbtnDisposable().setSelected(false);
			view.getRdbtnRadish().setSelected(false);
			view.getRdbtnSoup().setSelected(false);

			view.getExtraGroup().clearSelection();
			
			refreshView();
		});
		
		
		view.getBtnConfirm().addActionListener(e ->{
			String msg =
					"=== 訂單明細 ===\n"+
					"雞腿飯:" + service.getQty(0) +"\n"+
					"排骨飯" +service.getQty(1) +"\n"+
					"菜 飯" +service.getQty(2) +"\n"+
					getEatTypeText()+"\n"+
					"附加:" + getExtraOptionsText()+"\n"+
					"總金額" + service.getTotal();
			
			view.getTxtResultArea().setText(msg);
			
		});
		
		view.getBtnPrint().addActionListener(e ->{
            try {
            	boolean ok = view.getTxtResultArea().print();
            	if(ok) {
            		System.out.print("輸出成功");
            	}
            }catch (PrinterException ex) {
            	ex.printStackTrace();
            }
		});
		
		view.getBtnExit().addActionListener(e -> {
			System.exit(0);
		});
	}
	
	private void refreshView() {
		
		view.getTxtChickenRice().setText(String.valueOf(service.getQty(0)));
		view.getTxtPorkRice().setText(String.valueOf(service.getQty(1)));
		view.getTxtVegRice().setText(String.valueOf(service.getQty(2)));
		
		view.getTxtResultArea().setText
		(
	            "雞腿:" + service.getQty(0) +
	            " 排骨:" + service.getQty(1) +
	            " 菜飯:" + service.getQty(2) +
	            " 總金額:" + service.getTotal()
		);
	}
	
	private String getExtraOptionsText() {

	    StringBuilder sb = new StringBuilder();

	    if (view.getRdbtnDisposable().isSelected()) {
	        sb.append("餐具 ");
	    }

	    if (view.getRdbtnRadish().isSelected()) {
	        sb.append("辣蘿蔔 ");
	    }

	    if (view.getRdbtnSoup().isSelected()) {
	        sb.append("例湯 ");
	    }

	    return sb.toString();
	}
	
	private String getEatTypeText() {

	    if (view.getRdbtnDineIn().isSelected()) return "內用";
	    if (view.getRdbtnTakeOut().isSelected()) return "外帶";

	    return "";
	}
	
}
	
	
