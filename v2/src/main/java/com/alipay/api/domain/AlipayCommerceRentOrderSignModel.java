package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单签约
 *
 * @author auto create
 * @since 1.0, 2025-08-06 21:16:08
 */
public class AlipayCommerceRentOrderSignModel extends AlipayObject {

	private static final long serialVersionUID = 8549876625727434864L;

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
	 * 租赁订单支付及信用产品签约信息（不传表示复用创建订单时传的数据）
	 */
	@ApiField("rent_sign_info")
	private RentDoSignInfoDTO rentSignInfo;

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
