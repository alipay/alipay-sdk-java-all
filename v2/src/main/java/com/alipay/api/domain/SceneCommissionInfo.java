package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-01-07 13:42:22
 */
public class SceneCommissionInfo extends AlipayObject {

	private static final long serialVersionUID = 7344226223423668698L;

	/**
	 * 抽佣结束时间
	 */
	@ApiField("commission_invalid_time")
	private Date commissionInvalidTime;

	/**
	 * null
	 */
	@ApiListField("commission_list")
	@ApiField("commission_info")
	private List<CommissionInfo> commissionList;

	/**
	 * 抽佣模式，统一模式或商品模式
	 */
	@ApiField("commission_mode")
	private String commissionMode;

	/**
	 * 抽佣场景，周期卡代开发
	 */
	@ApiField("commission_scene")
	private String commissionScene;

	/**
	 * 抽佣开始时间
	 */
	@ApiField("commission_valid_time")
	private Date commissionValidTime;

	/**
	 * 代表长期模式场景模式不用传抽佣时间
	 */
	@ApiField("long_term")
	private Boolean longTerm;

	/**
	 * 商家应用appId，代开发场景需要
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	public Date getCommissionInvalidTime() {
		return this.commissionInvalidTime;
	}
	public void setCommissionInvalidTime(Date commissionInvalidTime) {
		this.commissionInvalidTime = commissionInvalidTime;
	}

	public List<CommissionInfo> getCommissionList() {
		return this.commissionList;
	}
	public void setCommissionList(List<CommissionInfo> commissionList) {
		this.commissionList = commissionList;
	}

	public String getCommissionMode() {
		return this.commissionMode;
	}
	public void setCommissionMode(String commissionMode) {
		this.commissionMode = commissionMode;
	}

	public String getCommissionScene() {
		return this.commissionScene;
	}
	public void setCommissionScene(String commissionScene) {
		this.commissionScene = commissionScene;
	}

	public Date getCommissionValidTime() {
		return this.commissionValidTime;
	}
	public void setCommissionValidTime(Date commissionValidTime) {
		this.commissionValidTime = commissionValidTime;
	}

	public Boolean getLongTerm() {
		return this.longTerm;
	}
	public void setLongTerm(Boolean longTerm) {
		this.longTerm = longTerm;
	}

	public String getMerchantAppId() {
		return this.merchantAppId;
	}
	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}

}
