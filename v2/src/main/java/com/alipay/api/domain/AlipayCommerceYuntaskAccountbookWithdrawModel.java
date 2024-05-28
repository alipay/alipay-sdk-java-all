package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 记账本回流提现
 *
 * @author auto create
 * @since 1.0, 2022-12-28 16:49:49
 */
public class AlipayCommerceYuntaskAccountbookWithdrawModel extends AlipayObject {

	private static final long serialVersionUID = 1366484751596956624L;

	/**
	 * 记账本id
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 处理金额数量
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 处理业务号，用作幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 签约商户id
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	public String getAccountBookId() {
		return this.accountBookId;
	}
	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSignUserId() {
		return this.signUserId;
	}
	public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
	}

}
