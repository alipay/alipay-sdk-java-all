package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据收件人信息查询物流信息
 *
 * @author auto create
 * @since 1.0, 2026-03-13 19:42:42
 */
public class AlipayOpenSpNcoilopenDeliverylogisticsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3117718631786491821L;

	/**
	 * 订单流水号
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 收件人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收件人手机号
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}

}
