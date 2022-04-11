package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共同账户账单明细
 *
 * @author auto create
 * @since 1.0, 2021-01-25 21:13:44
 */
public class JointAccountBillDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 4644623734382961716L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 消费金额
	 */
	@ApiField("amount")
	private String amount;

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
	 * 账单标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 共同账户消费的成员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
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
