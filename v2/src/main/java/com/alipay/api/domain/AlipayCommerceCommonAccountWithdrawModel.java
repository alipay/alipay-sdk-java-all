package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客账本提现
 *
 * @author auto create
 * @since 1.0, 2023-06-20 14:32:10
 */
public class AlipayCommerceCommonAccountWithdrawModel extends AlipayObject {

	private static final long serialVersionUID = 3894615654116153828L;

	/**
	 * 账本id
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 提现金额，大于0，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 签约账户id
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	/**
	 * 签约账户openid
	 */
	@ApiField("sign_user_open_id")
	private String signUserOpenId;

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

	public String getSignUserOpenId() {
		return this.signUserOpenId;
	}
	public void setSignUserOpenId(String signUserOpenId) {
		this.signUserOpenId = signUserOpenId;
	}

}
