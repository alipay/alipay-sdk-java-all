package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务费信息列表
 *
 * @author auto create
 * @since 1.0, 2023-10-23 19:00:55
 */
public class ServiceFeeInfo extends AlipayObject {

	private static final long serialVersionUID = 2293361539659742384L;

	/**
	 * 服务费金额
单位：元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 企业码服务费单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 收费时间
	 */
	@ApiField("execute_dt")
	private Date executeDt;

	/**
	 * 服务费扩展信息
	 */
	@ApiField("ext_info")
	private ServiceFeeExtInfo extInfo;

	/**
	 * 关联的支付宝交易号
	 */
	@ApiField("pay_no")
	private String payNo;

	/**
	 * 收款方OpenId
	 */
	@ApiField("trans_in_open_id")
	private String transInOpenId;

	/**
	 * 收款方支付宝UID
	 */
	@ApiField("trans_in_user_id")
	private String transInUserId;

	/**
	 * 收款方支付宝名称
	 */
	@ApiField("trans_in_user_name")
	private String transInUserName;

	/**
	 * 付款方OpenId
	 */
	@ApiField("trans_out_open_id")
	private String transOutOpenId;

	/**
	 * 付款方支付宝UID
	 */
	@ApiField("trans_out_user_id")
	private String transOutUserId;

	/**
	 * 付款方支付宝名称
	 */
	@ApiField("trans_out_user_name")
	private String transOutUserName;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public Date getExecuteDt() {
		return this.executeDt;
	}
	public void setExecuteDt(Date executeDt) {
		this.executeDt = executeDt;
	}

	public ServiceFeeExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(ServiceFeeExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getPayNo() {
		return this.payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public String getTransInOpenId() {
		return this.transInOpenId;
	}
	public void setTransInOpenId(String transInOpenId) {
		this.transInOpenId = transInOpenId;
	}

	public String getTransInUserId() {
		return this.transInUserId;
	}
	public void setTransInUserId(String transInUserId) {
		this.transInUserId = transInUserId;
	}

	public String getTransInUserName() {
		return this.transInUserName;
	}
	public void setTransInUserName(String transInUserName) {
		this.transInUserName = transInUserName;
	}

	public String getTransOutOpenId() {
		return this.transOutOpenId;
	}
	public void setTransOutOpenId(String transOutOpenId) {
		this.transOutOpenId = transOutOpenId;
	}

	public String getTransOutUserId() {
		return this.transOutUserId;
	}
	public void setTransOutUserId(String transOutUserId) {
		this.transOutUserId = transOutUserId;
	}

	public String getTransOutUserName() {
		return this.transOutUserName;
	}
	public void setTransOutUserName(String transOutUserName) {
		this.transOutUserName = transOutUserName;
	}

}
