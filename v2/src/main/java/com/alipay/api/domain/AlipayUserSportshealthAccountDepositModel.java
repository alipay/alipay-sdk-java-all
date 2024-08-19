package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝运动币账户发放
 *
 * @author auto create
 * @since 1.0, 2024-01-19 15:56:16
 */
public class AlipayUserSportshealthAccountDepositModel extends AlipayObject {

	private static final long serialVersionUID = 7372977247815464443L;

	/**
	 * 设备反查标识，风控需要
	 */
	@ApiField("apdid_token")
	private String apdidToken;

	/**
	 * 发放运动币数量
	 */
	@ApiField("award_amount")
	private Long awardAmount;

	/**
	 * 客户端IP，风控需要
	 */
	@ApiField("client_ip")
	private String clientIp;

	/**
	 * 是否直发，默认为false，如果为true的话，发放后直接自动领取
	 */
	@ApiField("is_award_directly")
	private Boolean isAwardDirectly;

	/**
	 * 支付宝用户开放id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部渠道
	 */
	@ApiField("out_biz_channel")
	private String outBizChannel;

	/**
	 * 外部业务号,用于幂等使用
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 发币子场景
	 */
	@ApiField("sub_scene")
	private String subScene;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getApdidToken() {
		return this.apdidToken;
	}
	public void setApdidToken(String apdidToken) {
		this.apdidToken = apdidToken;
	}

	public Long getAwardAmount() {
		return this.awardAmount;
	}
	public void setAwardAmount(Long awardAmount) {
		this.awardAmount = awardAmount;
	}

	public String getClientIp() {
		return this.clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public Boolean getIsAwardDirectly() {
		return this.isAwardDirectly;
	}
	public void setIsAwardDirectly(Boolean isAwardDirectly) {
		this.isAwardDirectly = isAwardDirectly;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizChannel() {
		return this.outBizChannel;
	}
	public void setOutBizChannel(String outBizChannel) {
		this.outBizChannel = outBizChannel;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSubScene() {
		return this.subScene;
	}
	public void setSubScene(String subScene) {
		this.subScene = subScene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
