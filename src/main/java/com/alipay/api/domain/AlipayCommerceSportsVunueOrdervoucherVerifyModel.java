package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单核销
 *
 * @author auto create
 * @since 1.0, 2021-04-06 16:15:41
 */
public class AlipayCommerceSportsVunueOrdervoucherVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 1111555524694153251L;

	/**
	 * 核销描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 支付宝业务订单唯一ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 服务商内部唯一订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 服务商提供的外部凭证ID
	 */
	@ApiField("out_voucher_id")
	private String outVoucherId;

	/**
	 * 剩余核销次数
	 */
	@ApiField("verify_count")
	private String verifyCount;

	/**
	 * 核销状态，1-未核销，2-核销完成
	 */
	@ApiField("verify_status")
	private String verifyStatus;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getOutVoucherId() {
		return this.outVoucherId;
	}
	public void setOutVoucherId(String outVoucherId) {
		this.outVoucherId = outVoucherId;
	}

	public String getVerifyCount() {
		return this.verifyCount;
	}
	public void setVerifyCount(String verifyCount) {
		this.verifyCount = verifyCount;
	}

	public String getVerifyStatus() {
		return this.verifyStatus;
	}
	public void setVerifyStatus(String verifyStatus) {
		this.verifyStatus = verifyStatus;
	}

}
