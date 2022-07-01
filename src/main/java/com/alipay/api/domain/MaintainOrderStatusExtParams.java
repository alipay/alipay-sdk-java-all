package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单状态扩展参数
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:29:02
 */
public class MaintainOrderStatusExtParams extends AlipayObject {

	private static final long serialVersionUID = 5741647194512581353L;

	/**
	 * 编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 快递发货商
	 */
	@ApiField("logistics_company")
	private String logisticsCompany;

	/**
	 * 快递单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 4S订单状态
	 */
	@ApiField("order_status_txt")
	private String orderStatusTxt;

	/**
	 * 收货地址
	 */
	@ApiField("receiver_addr")
	private String receiverAddr;

	/**
	 * 发货地址
	 */
	@ApiField("sender_addr")
	private String senderAddr;

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getLogisticsCompany() {
		return this.logisticsCompany;
	}
	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	public String getOrderStatusTxt() {
		return this.orderStatusTxt;
	}
	public void setOrderStatusTxt(String orderStatusTxt) {
		this.orderStatusTxt = orderStatusTxt;
	}

	public String getReceiverAddr() {
		return this.receiverAddr;
	}
	public void setReceiverAddr(String receiverAddr) {
		this.receiverAddr = receiverAddr;
	}

	public String getSenderAddr() {
		return this.senderAddr;
	}
	public void setSenderAddr(String senderAddr) {
		this.senderAddr = senderAddr;
	}

}
