package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘宝司法拍卖余额查询
 *
 * @author auto create
 * @since 1.0, 2022-12-06 17:07:34
 */
public class AlipayFundTransAuctionBalanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2713146387729275843L;

	/**
	 * 业务id，唯一业务标识
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 开户银行标识
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 支付宝userId
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 核身id，用于验证是否已经核身成功
	 */
	@ApiField("verify_id")
	private String verifyId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVerifyId() {
		return this.verifyId;
	}
	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

}
