package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份核验服务对外开放接口
 *
 * @author auto create
 * @since 1.0, 2019-06-28 10:49:32
 */
public class AlipaySecurityRiskVerifyidentityInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 1275819651582116923L;

	/**
	 * 用户证件号，当前支持身份证号
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 用户姓名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 用户证件类型，需传入英文枚举常量，当前支持：CERT(大陆身份证)
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 核验后回调业务url
	 */
	@ApiField("biz_callback_url")
	private String bizCallbackUrl;

	/**
	 * 接入业务方业务唯一性id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 附加业务信息，Json结构
	 */
	@ApiField("biz_params")
	private String bizParams;

	/**
	 * 核验服务名称，同时请求多种服务用“|”连接，SMS：短信，FACE：人脸
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 身份核验场景CODE，商务谈判基础上，由支付宝来分配。
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBizCallbackUrl() {
		return this.bizCallbackUrl;
	}
	public void setBizCallbackUrl(String bizCallbackUrl) {
		this.bizCallbackUrl = bizCallbackUrl;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizParams() {
		return this.bizParams;
	}
	public void setBizParams(String bizParams) {
		this.bizParams = bizParams;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
