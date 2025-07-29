package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单支付产品签约通知信息
 *
 * @author auto create
 * @since 1.0, 2025-07-16 18:24:20
 */
public class RentSignNotifyVO extends AlipayObject {

	private static final long serialVersionUID = 3735449471719498983L;

	/**
	 * 预授权冻结单号
	 */
	@ApiField("auth_no")
	private String authNo;

	/**
	 * 用户签约产品
	 */
	@ApiField("sign_product")
	private String signProduct;

	/**
	 * 用户签约成功时间
	 */
	@ApiField("sign_time")
	private String signTime;

	public String getAuthNo() {
		return this.authNo;
	}
	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}

	public String getSignProduct() {
		return this.signProduct;
	}
	public void setSignProduct(String signProduct) {
		this.signProduct = signProduct;
	}

	public String getSignTime() {
		return this.signTime;
	}
	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

}
