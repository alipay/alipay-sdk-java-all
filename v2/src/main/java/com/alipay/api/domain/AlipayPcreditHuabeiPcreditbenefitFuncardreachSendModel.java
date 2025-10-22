package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗饿了么fun卡发送触达消息接口
 *
 * @author auto create
 * @since 1.0, 2024-12-25 10:48:12
 */
public class AlipayPcreditHuabeiPcreditbenefitFuncardreachSendModel extends AlipayObject {

	private static final long serialVersionUID = 6399626445746946973L;

	/**
	 * alipay_user_id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务ID
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 触达的饭卡奖励金额信息
	 */
	@ApiField("funka_dollar")
	private Long funkaDollar;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 触达业务id
	 */
	@ApiField("solution_id")
	private String solutionId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public Long getFunkaDollar() {
		return this.funkaDollar;
	}
	public void setFunkaDollar(Long funkaDollar) {
		this.funkaDollar = funkaDollar;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSolutionId() {
		return this.solutionId;
	}
	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}

}
