package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余利宝交易详情信息数据结构
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class YLBTransDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 2479183981948267233L;

	/**
	 * 余利宝交易金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 交易流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 交易到账时间
	 */
	@ApiField("trans_account_date")
	private Date transAccountDate;

	/**
	 * 交易时间
	 */
	@ApiField("trans_date")
	private Date transDate;

	/**
	 * 交易名称，如正常申购、正常赎回、收益发放、份额强增、份额强减
	 */
	@ApiField("trans_name")
	private String transName;

	/**
	 * 交易状态，如success-成功、failure-失败、inprocess-进行中等
	 */
	@ApiField("trans_status")
	private String transStatus;

	/**
	 * 交易类型，如正常申购、正常赎回、收益发放、份额强增、份额强减
	 */
	@ApiField("trans_type")
	private String transType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getTransAccountDate() {
		return this.transAccountDate;
	}
	public void setTransAccountDate(Date transAccountDate) {
		this.transAccountDate = transAccountDate;
	}

	public Date getTransDate() {
		return this.transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	public String getTransName() {
		return this.transName;
	}
	public void setTransName(String transName) {
		this.transName = transName;
	}

	public String getTransStatus() {
		return this.transStatus;
	}
	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}

	public String getTransType() {
		return this.transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}

}
