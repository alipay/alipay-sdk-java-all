package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校验验证码
 *
 * @author auto create
 * @since 1.0, 2022-04-26 19:03:46
 */
public class AnttechBlockchainDefinCustomerVerifycodeVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 5279588529895614481L;

	/**
	 * 自定义的action，比如：LOGIN，REGISTER，MODIFY_PASSWORD等
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
	 * 接受验证码的目标地址，可以是手机号或者邮箱号 133333333 test@example.com
	 */
	@ApiField("destination")
	private String destination;

	/**
	 * 待校验的验证码
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

	public String getDestination() {
		return this.destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getVerifyCode() {
		return this.verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

}
