package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁发票平台发票信息查询
 *
 * @author auto create
 * @since 1.0, 2020-06-18 22:33:55
 */
public class AlipayEbppInvoiceResultGetModel extends AlipayObject {

	private static final long serialVersionUID = 8768655361762569385L;

	/**
	 * 开票申请id
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 业务平台对应的订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 销售方税号
	 */
	@ApiField("payee_register_no")
	private String payeeRegisterNo;

	/**
	 * 业务平台code, 由发票中台分配
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 业务平台商户id
	 */
	@ApiField("platform_user_id")
	private String platformUserId;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPayeeRegisterNo() {
		return this.payeeRegisterNo;
	}
	public void setPayeeRegisterNo(String payeeRegisterNo) {
		this.payeeRegisterNo = payeeRegisterNo;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getPlatformUserId() {
		return this.platformUserId;
	}
	public void setPlatformUserId(String platformUserId) {
		this.platformUserId = platformUserId;
	}

}
