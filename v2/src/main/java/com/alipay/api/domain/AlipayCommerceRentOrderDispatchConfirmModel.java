package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁派单处理接口
 *
 * @author auto create
 * @since 1.0, 2026-04-24 13:27:46
 */
public class AlipayCommerceRentOrderDispatchConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 1249924586481311752L;

	/**
	 * 买家支付宝用户id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家支付宝用户id
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 操作类型
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 原因描述
	 */
	@ApiField("reason_desc")
	private String reasonDesc;

	/**
	 * 租赁派单ID，唯一标识一次派单请求
	 */
	@ApiField("rent_dispatch_id")
	private String rentDispatchId;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getReasonDesc() {
		return this.reasonDesc;
	}
	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}

	public String getRentDispatchId() {
		return this.rentDispatchId;
	}
	public void setRentDispatchId(String rentDispatchId) {
		this.rentDispatchId = rentDispatchId;
	}

}
