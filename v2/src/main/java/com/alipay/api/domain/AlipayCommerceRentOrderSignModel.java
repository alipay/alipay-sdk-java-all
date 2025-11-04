package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单签约
 *
 * @author auto create
 * @since 1.0, 2025-09-24 11:20:40
 */
public class AlipayCommerceRentOrderSignModel extends AlipayObject {

	private static final long serialVersionUID = 4896314862912233186L;

	/**
	 * 芝麻信用拓展信息
	 */
	@ApiField("credit_ext_info")
	private RentCreditExtInfoDTO creditExtInfo;

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
