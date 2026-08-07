package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道测卡号绑定用户
 *
 * @author auto create
 * @since 1.0, 2026-08-04 11:27:54
 */
public class AlipayCommerceMedicalInsuranceFulfillmenttransitModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7657623627355613796L;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 卡号
	 */
	@ApiField("out_unique_biz_no")
	private String outUniqueBizNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutUniqueBizNo() {
		return this.outUniqueBizNo;
	}
	public void setOutUniqueBizNo(String outUniqueBizNo) {
		this.outUniqueBizNo = outUniqueBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
