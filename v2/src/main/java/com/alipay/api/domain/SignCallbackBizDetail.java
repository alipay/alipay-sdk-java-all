package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约结果明细
 *
 * @author auto create
 * @since 1.0, 2026-07-20 16:32:51
 */
public class SignCallbackBizDetail extends AlipayObject {

	private static final long serialVersionUID = 1533422797285324996L;

	/**
	 * 支付宝订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 绑定支付宝结果
	 */
	@ApiField("bind_results")
	private String bindResults;

	/**
	 * 冻结金额，单位：CNY
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 请求流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 签约时间，yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("sign_time")
	private String signTime;

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBindResults() {
		return this.bindResults;
	}
	public void setBindResults(String bindResults) {
		this.bindResults = bindResults;
	}

	public String getFreezeAmount() {
		return this.freezeAmount;
	}
	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getSignTime() {
		return this.signTime;
	}
	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

}
