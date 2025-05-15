package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 接收单行信息
 *
 * @author auto create
 * @since 1.0, 2023-08-18 10:18:16
 */
public class RcvLineDto extends AlipayObject {

	private static final long serialVersionUID = 4419544274697394855L;

	/**
	 * 费用归属月份
	 */
	@ApiField("expense_month")
	private Date expenseMonth;

	/**
	 * 物品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * po行的id
	 */
	@ApiField("po_line_id")
	private String poLineId;

	/**
	 * po行的行号
	 */
	@ApiField("po_line_num")
	private Long poLineNum;

	/**
	 * 接收单id
	 */
	@ApiField("rcv_line_id")
	private String rcvLineId;

	/**
	 * 接收单行号
	 */
	@ApiField("rcv_line_num")
	private Long rcvLineNum;

	/**
	 * 要接收的金额或数量/元
	 */
	@ApiField("received_amount")
	private String receivedAmount;

	public Date getExpenseMonth() {
		return this.expenseMonth;
	}
	public void setExpenseMonth(Date expenseMonth) {
		this.expenseMonth = expenseMonth;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getPoLineId() {
		return this.poLineId;
	}
	public void setPoLineId(String poLineId) {
		this.poLineId = poLineId;
	}

	public Long getPoLineNum() {
		return this.poLineNum;
	}
	public void setPoLineNum(Long poLineNum) {
		this.poLineNum = poLineNum;
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

}
