package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安全回收-用户风险等级查询接口
 *
 * @author auto create
 * @since 1.0, 2023-02-23 17:36:16
 */
public class AlipayCommerceRecycleSecurityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3791228187316533389L;

	/**
	 * 风险咨询主体设备号
	 */
	@ApiField("apdidtoken")
	private String apdidtoken;

	/**
	 * 用来标识咨询场景，错误的传入业务场景可能会导致错误的咨询结果！
valueRecycle 有价回收
noValueRecycle 无价回收
blackOrderSync 黑名单回流
petRecycle 宠物领养咨询
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 风险咨询主体身份证号，非必选，有该字段风险结果更可靠。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 风险咨询主体用户手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 风险咨询主体的支付宝账号
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 预估回收价格，单位元。
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 下单时间，标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 风险咨询主体的支付宝账号
	 */
	@ApiField("user_id")
	private String userId;

	public String getApdidtoken() {
		return this.apdidtoken;
	}
	public void setApdidtoken(String apdidtoken) {
		this.apdidtoken = apdidtoken;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
