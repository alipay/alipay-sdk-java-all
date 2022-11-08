package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户开通账户
 *
 * @author auto create
 * @since 1.0, 2022-10-14 01:33:49
 */
public class AlipayFundZcardprodMerchantSignModel extends AlipayObject {

	private static final long serialVersionUID = 1861733728482227538L;

	/**
	 * 账户名称
该名称会显示在账单和收银台
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 餐饮
	 */
	@ApiField("biz_scene_code")
	private String bizSceneCode;

	/**
	 * 场景id（商户自己控制幂等维度）
注意：商户在同一场景id下只能生成一个账户
	 */
	@ApiField("biz_scene_id")
	private String bizSceneId;

	/**
	 * 扩展字段
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 支卡通
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getBizSceneCode() {
		return this.bizSceneCode;
	}
	public void setBizSceneCode(String bizSceneCode) {
		this.bizSceneCode = bizSceneCode;
	}

	public String getBizSceneId() {
		return this.bizSceneId;
	}
	public void setBizSceneId(String bizSceneId) {
		this.bizSceneId = bizSceneId;
	}

	public String getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
