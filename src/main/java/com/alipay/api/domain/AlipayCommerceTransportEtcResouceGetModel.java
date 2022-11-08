package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC办理图片等其他资源获取
 *
 * @author auto create
 * @since 1.0, 2022-02-17 18:30:55
 */
public class AlipayCommerceTransportEtcResouceGetModel extends AlipayObject {

	private static final long serialVersionUID = 3622337233631992128L;

	/**
	 * 业务标识。 
"VIO_IDCARD_FRONT":"车主身份证正面照"
"VIO_IDCARD_BACK":"车主身份证反面照"
"VI_LICENSE_FRONT":"行驶证正页"
"VI_LICENSE_VICE":"行驶证副页"
"VI_PHOTO_45":"车头45度照片"
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 支付宝侧订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
