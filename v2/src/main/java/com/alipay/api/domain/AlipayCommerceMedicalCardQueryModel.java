package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗机构根据用户userId查询该账户的医保卡相关信息
 *
 * @author auto create
 * @since 1.0, 2025-06-24 16:47:37
 */
public class AlipayCommerceMedicalCardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6243487248375554847L;

	/**
	 * 支付授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 买家支付宝账号对应的支付宝唯一用户号。
以2088开头的纯16位数字。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 卡颁发机构编号
	 */
	@ApiField("card_org_no")
	private String cardOrgNo;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 机构类型：医保(YB),人社(RS)
默认为RS
	 */
	@ApiField("ins_type")
	private String insType;

	/**
	 * 买家支付宝账号对应的支付宝唯一用户号。
以2088开头的纯16位数字。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 跳回的地址
	 */
	@ApiField("return_url")
	private String returnUrl;

	/**
	 * 支付场景
条码支付，取值：bar_code
声波支付，取值：wave_code
人脸支付，取值：face_code
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 版本号
	 */
	@ApiField("version_no")
	private String versionNo;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getCardOrgNo() {
		return this.cardOrgNo;
	}
	public void setCardOrgNo(String cardOrgNo) {
		this.cardOrgNo = cardOrgNo;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getInsType() {
		return this.insType;
	}
	public void setInsType(String insType) {
		this.insType = insType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}
	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getVersionNo() {
		return this.versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

}
