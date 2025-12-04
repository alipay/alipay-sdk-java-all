package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 因公付账户资产切换跳链申请
 *
 * @author auto create
 * @since 1.0, 2024-05-17 17:35:38
 */
public class AlipayTradeEnterprisepayAssetModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5793584513412284278L;

	/**
	 * 因公付企业账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 因公付账户需要切换的资产信息。没传则接口返回通用的资产切换链接，不限制指定资产。
	 */
	@ApiField("asset_info")
	private AssetInfoForm assetInfo;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public AssetInfoForm getAssetInfo() {
		return this.assetInfo;
	}
	public void setAssetInfo(AssetInfoForm assetInfo) {
		this.assetInfo = assetInfo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
