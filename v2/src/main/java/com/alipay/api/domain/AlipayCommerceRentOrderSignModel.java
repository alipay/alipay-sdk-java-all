package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单签约
 *
 * @author auto create
 * @since 1.0, 2026-08-19 14:55:53
 */
public class AlipayCommerceRentOrderSignModel extends AlipayObject {

	private static final long serialVersionUID = 2459739214616557654L;

	/**
	 * 芝麻信用拓展信息
	 */
	@ApiField("credit_ext_info")
	private RentCreditExtInfoDTO creditExtInfo;

	/**
	 * 无特殊需要请勿传入；买家实名信息。
传入后支付宝会比对买家在支付宝端的实名信息。包含如下可选key：
1.identity_hash，买家姓名拼接身份证号后，使用SHA256摘要方式与UTF8编码后的hash值，返回的十六进制字符串，例如 “张三4566498798498498498498”对应的identity_hash应为“acc2b92ffc5ed9b472faa19748f10045c30434132784f774b00216a56b8841c6”
	 */
	@ApiField("identity_params")
	private String identityParams;

	/**
	 * 是否需要人脸核身
true ：（默认）需要人脸核身
false：无需人脸核身
	 */
	@ApiField("need_face_validate_flag")
	private Boolean needFaceValidateFlag;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 租赁订单支付及信用产品签约信息
	 */
	@ApiField("rent_sign_info")
	private RentDoSignInfoDTO rentSignInfo;

	public RentCreditExtInfoDTO getCreditExtInfo() {
		return this.creditExtInfo;
	}
	public void setCreditExtInfo(RentCreditExtInfoDTO creditExtInfo) {
		this.creditExtInfo = creditExtInfo;
	}

	public String getIdentityParams() {
		return this.identityParams;
	}
	public void setIdentityParams(String identityParams) {
		this.identityParams = identityParams;
	}

	public Boolean getNeedFaceValidateFlag() {
		return this.needFaceValidateFlag;
	}
	public void setNeedFaceValidateFlag(Boolean needFaceValidateFlag) {
		this.needFaceValidateFlag = needFaceValidateFlag;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public RentDoSignInfoDTO getRentSignInfo() {
		return this.rentSignInfo;
	}
	public void setRentSignInfo(RentDoSignInfoDTO rentSignInfo) {
		this.rentSignInfo = rentSignInfo;
	}

}
