package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单代客还款结果查询
 *
 * @author auto create
 * @since 1.0, 2023-06-09 11:13:43
 */
public class MybankCreditLoantradeBillRepayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5293178972733923846L;

	/**
	 * 支付宝Id,无需脱敏
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 方案合约编号，机构授权综合合约号
	 */
	@ApiField("auth_ar_no")
	private String authArNo;

	/**
	 * 支付宝Id,无需脱敏
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 提交代客还款时的请求编号
	 */
	@ApiField("repay_request_no")
	private String repayRequestNo;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAuthArNo() {
		return this.authArNo;
	}
	public void setAuthArNo(String authArNo) {
		this.authArNo = authArNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRepayRequestNo() {
		return this.repayRequestNo;
	}
	public void setRepayRequestNo(String repayRequestNo) {
		this.repayRequestNo = repayRequestNo;
	}

}
