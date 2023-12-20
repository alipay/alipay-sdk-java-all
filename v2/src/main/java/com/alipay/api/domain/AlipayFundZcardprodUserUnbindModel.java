package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支卡通-用户解绑
 *
 * @author auto create
 * @since 1.0, 2023-12-05 13:57:53
 */
public class AlipayFundZcardprodUserUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 7539893874354786822L;

	/**
	 * 账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 资产id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 通用商店
	 */
	@ApiField("biz_scene_code")
	private String bizSceneCode;

	/**
	 * 当签约方类型是ALIPAY_USER_ID时，本参数为用户的支付宝账号userId，以2088开头的纯16位数字；
当签约方类型是ALIPAY_LOGON_ID时，本参数为用户的支付宝登录号。
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * ALIPAY_USER_ID：表示是支付宝账号userId；ALIPAY_LOGON_ID：表示是支付宝登录号
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 外部卡号
	 */
	@ApiField("out_card_no")
	private String outCardNo;

	/**
	 * 支卡通
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 用户真实姓名
	 */
	@ApiField("real_name")
	private String realName;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getBizSceneCode() {
		return this.bizSceneCode;
	}
	public void setBizSceneCode(String bizSceneCode) {
		this.bizSceneCode = bizSceneCode;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getOutCardNo() {
		return this.outCardNo;
	}
	public void setOutCardNo(String outCardNo) {
		this.outCardNo = outCardNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

}
