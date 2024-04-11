package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 接收单行信息
 *
 * @author auto create
 * @since 1.0, 2023-09-15 09:58:53
 */
public class RcvLineResultOutDTO extends AlipayObject {

	private static final long serialVersionUID = 4627722167254693816L;

	/**
	 * 费用归属月份
	 */
	@ApiField("expense_month")
	private String expenseMonth;

	/**
	 * 物品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * QUANTITY/AMOUNT(按金额/按数量)
	 */
	@ApiField("line_type")
	private String lineType;

	/**
	 * po行号
	 */
	@ApiField("po_line_num")
	private Long poLineNum;

	/**
	 * 可执行金额或数量
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 接受日期
	 */
	@ApiField("rcv_date")
	private Date rcvDate;

	/**
	 * 接收单行ID
	 */
	@ApiField("rcv_line_id")
	private String rcvLineId;

	/**
	 * 接收单行号
	 */
	@ApiField("rcv_line_num")
	private Long rcvLineNum;

	/**
	 * 已接收金额/元
	 */
	@ApiField("received_amount")
	private String receivedAmount;

	/**
	 * 已接收金额或数量
	 */
	@ApiField("received_quantity")
	private String receivedQuantity;

	public String getExpenseMonth() {
		return this.expenseMonth;
	}
	public void setExpenseMonth(String expenseMonth) {
		this.expenseMonth = expenseMonth;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getLineType() {
		return this.lineType;
	}
	public void setLineType(String lineType) {
		this.lineType = lineType;
	}

	public Long getPoLineNum() {
		return this.poLineNum;
	}
	public void setPoLineNum(Long poLineNum) {
		this.poLineNum = poLineNum;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Date getRcvDate() {
		return this.rcvDate;
	}
	public void setRcvDate(Date rcvDate) {
		this.rcvDate = rcvDate;
	}

	public String getRcvLineId() {
		return this.rcvLineId;
	}
	public void setRcvLineId(String rcvLineId) {
		this.rcvLineId = rcvLineId;
	}

	public Long getRcvLineNum() {
		return this.rcvLineNum;
	}
	public void setRcvLineNum(Long rcvLineNum) {
		this.rcvLineNum = rcvLineNum;
	}

	public String getReceivedAmount() {
		return this.receivedAmount;
	}
	public void setReceivedAmount(String receivedAmount) {
		this.receivedAmount = receivedAmount;
	}

	public String getReceivedQuantity() {
		return this.receivedQuantity;
	}
	public void setReceivedQuantity(String receivedQuantity) {
		this.receivedQuantity = receivedQuantity;
	}

}
