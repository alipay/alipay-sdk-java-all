package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 登录接口
 *
 * @author auto create
 * @since 1.0, 2022-04-27 09:23:40
 */
public class AnttechBlockchainDefinCustomerLoginConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 8788413177883611363L;

	/**
	 * 验证码场景
	 */
	@ApiField("action")
	private String action;

	/**
	 * DCHAIN("DCHAIN","供应链信用流转平台"),
    ABS("ABS","ABS资产流转平台"),
    BAMBOO("BAMBOO","BAMBOO项目"),
    LOGISTICS_FIN("LOGISTICS_FIN", "物流金融"),
    TRUSPLE("TRUSPLE", "跨境贸易金融平台");
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * "0": 密码登录
"1"：验证码登录
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 密码，一般需要对明文密码做哈希
	 */
	@ApiField("password")
	private String password;

	/**
	 * 用户名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 验证码
	 */
	@ApiField("verify_code")
	private String verifyCode;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getVerifyCode() {
		return this.verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

}
