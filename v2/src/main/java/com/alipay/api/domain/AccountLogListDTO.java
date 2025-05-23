package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 本次分页账务内容 Base64(JSON(List<AccountLogVO>))
 *
 * @author auto create
 * @since 1.0, 2025-01-06 11:26:15
 */
public class AccountLogListDTO extends AlipayObject {

	private static final long serialVersionUID = 2297318382831411336L;

	/**
	 * 动作类型
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 余额, 单位为分
	 */
	@ApiField("balance")
	private String balance;

	/**
	 * 币种，CNY=人民币
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 业务流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 发生额,单位为分
	 */
	@ApiField("trans_amount")
	private String transAmount;

	/**
	 * 发生时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("trans_time")
	private Date transTime;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getBalance() {
		return this.balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

	public Date getTransTime() {
		return this.transTime;
	}
	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}

}
