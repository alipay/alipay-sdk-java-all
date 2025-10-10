package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公益林浇水
 *
 * @author auto create
 * @since 1.0, 2025-02-08 16:27:40
 */
public class AlipaySocialAntforestWelfareforestTransferModel extends AlipayObject {

	private static final long serialVersionUID = 1769216946742917399L;

	/**
	 * 场景码，也由森林侧开发配置后提供出来
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 可以增加业务标识，如youku-shuochang-20240430-xxx，该字段用于浇水接口幂等。
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 公益林浇水能量值，为可选项
	 */
	@ApiField("energy")
	private Long energy;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 由森林同学提供，接口调用方传入相关信息
	 */
	@ApiField("source")
	private String source;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 公益林id
	 */
	@ApiField("welfare_forest_id")
	private String welfareForestId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public Long getEnergy() {
		return this.energy;
	}
	public void setEnergy(Long energy) {
		this.energy = energy;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getWelfareForestId() {
		return this.welfareForestId;
	}
	public void setWelfareForestId(String welfareForestId) {
		this.welfareForestId = welfareForestId;
	}

}
