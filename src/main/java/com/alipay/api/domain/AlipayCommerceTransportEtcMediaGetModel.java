package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * etc办理资料接口
 *
 * @author auto create
 * @since 1.0, 2019-05-28 11:06:22
 */
public class AlipayCommerceTransportEtcMediaGetModel extends AlipayObject {

	private static final long serialVersionUID = 8785871178327412721L;

	/**
	 * 业务标识。
1：身份证正面照片；
2：身份证背面照片；
3：行驶证正页正面照片；
4：行驶证副页正面照片；
5：车头照片；
6：OBU车内照片；
7：OBU车外照片；
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 支付宝生成的申请单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务订单号
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
