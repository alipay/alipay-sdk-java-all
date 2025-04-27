package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务商抽佣信息
 *
 * @author auto create
 * @since 1.0, 2024-12-06 16:56:56
 */
public class IsvCommissionInfo extends AlipayObject {

	private static final long serialVersionUID = 2165331325937713553L;

	/**
	 * 合作伙伴(一级角色)抽佣信息
	 */
	@ApiListField("commission_first_role_list")
	@ApiField("commission_first_role_info")
	private List<CommissionFirstRoleInfo> commissionFirstRoleList;

	/**
	 * 抽佣结束时间
	 */
	@ApiField("commission_invalid_time")
	private String commissionInvalidTime;

	/**
	 * 抽佣模式，统一模式或商品模式
	 */
	@ApiField("commission_mode")
	private String commissionMode;

	/**
	 * 抽佣场景
	 */
	@ApiField("commission_scene")
	private String commissionScene;

	/**
	 * 抽佣开始时间
	 */
	@ApiField("commission_valid_time")
	private String commissionValidTime;

	/**
	 * 服务商抽佣比例，统一模式时传。无单位，如0.0400表示4%
	 */
	@ApiField("isv_rate")
	private String isvRate;

	/**
	 * 商品抽佣比例。选择商品模式时，传每个商品的比例。
	 */
	@ApiListField("item_mode_commission_list")
	@ApiField("item_mode_commission_info")
	private List<ItemModeCommissionInfo> itemModeCommissionList;

	/**
	 * 是否是长期模式场景模式，为true时不用传抽佣时间
	 */
	@ApiField("long_term")
	private Boolean longTerm;

	/**
	 * 商家应用appId，代开发场景需要
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	public List<CommissionFirstRoleInfo> getCommissionFirstRoleList() {
		return this.commissionFirstRoleList;
	}
	public void setCommissionFirstRoleList(List<CommissionFirstRoleInfo> commissionFirstRoleList) {
		this.commissionFirstRoleList = commissionFirstRoleList;
	}

	public String getCommissionInvalidTime() {
		return this.commissionInvalidTime;
	}
	public void setCommissionInvalidTime(String commissionInvalidTime) {
		this.commissionInvalidTime = commissionInvalidTime;
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

	public String getCommissionValidTime() {
		return this.commissionValidTime;
	}
	public void setCommissionValidTime(String commissionValidTime) {
		this.commissionValidTime = commissionValidTime;
	}

	public String getIsvRate() {
		return this.isvRate;
	}
	public void setIsvRate(String isvRate) {
		this.isvRate = isvRate;
	}

	public List<ItemModeCommissionInfo> getItemModeCommissionList() {
		return this.itemModeCommissionList;
	}
	public void setItemModeCommissionList(List<ItemModeCommissionInfo> itemModeCommissionList) {
		this.itemModeCommissionList = itemModeCommissionList;
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
