package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支卡通-用户绑定
 *
 * @author auto create
 * @since 1.0, 2022-10-24 14:03:14
 */
public class AlipayFundZcardprodUserBindModel extends AlipayObject {

	private static final long serialVersionUID = 4499818956687691522L;

	/**
	 * 商户的账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 餐饮
	 */
	@ApiField("biz_scene_code")
	private String bizSceneCode;

	/**
	 * 扩展字段，key值固定为customParams，value值由商户传入。
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 签约方账号。
当签约方类型是ALIPAY_USER_ID时，本参数为用户的支付宝账号对应的支付宝唯一用户号，以2088开头的纯16位数字；
当签约方类型是ALIPAY_LOGON_ID时，本参数为用户的支付宝登录号。
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 签约方类型
ALIPAY_USER_ID：表示是支付宝账号对应的支付宝唯一用户号；ALIPAY_LOGON_ID：表示是支付宝登录号
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 外部卡号
	 */
	@ApiField("out_card_no")
	private String outCardNo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 用户真实姓名
当签约方类型是ALIPAY_LOGON_ID时，该参数必填，用于校验用户信息
	 */
	@ApiField("real_name")
	private String realName;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getBizSceneCode() {
		return this.bizSceneCode;
	}
	public void setBizSceneCode(String bizSceneCode) {
		this.bizSceneCode = bizSceneCode;
	}

	public String getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
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
