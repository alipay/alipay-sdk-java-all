package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 因公账单详情
 *
 * @author auto create
 * @since 1.0, 2022-07-20 10:12:22
 */
public class JointAccountBillDetail extends AlipayObject {

	private static final long serialVersionUID = 4223925386198368578L;

	/**
	 * 消费金额，单位：元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 账单业务号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 业务时间
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 订单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 1-退款，2-支付
	 */
	@ApiField("in_out")
	private String inOut;

	/**
	 * 账单标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 用户支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getInOut() {
		return this.inOut;
	}
	public void setInOut(String inOut) {
		this.inOut = inOut;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
