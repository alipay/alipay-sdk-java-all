package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品发放参数
 *
 * @author auto create
 * @since 1.0, 2023-09-15 16:56:43
 */
public class TargetSendOrderParam extends AlipayObject {

	private static final long serialVersionUID = 7451325138418596518L;

	/**
	 * 主单据号
	 */
	@ApiField("camp_order_id")
	private String campOrderId;

	/**
	 * 证券营销活动id
	 */
	@ApiField("interest_id")
	private String interestId;

	/**
	 * 发奖单据号
	 */
	@ApiField("send_order_id")
	private String sendOrderId;

	public String getCampOrderId() {
		return this.campOrderId;
	}
	public void setCampOrderId(String campOrderId) {
		this.campOrderId = campOrderId;
	}

	public String getInterestId() {
		return this.interestId;
	}
	public void setInterestId(String interestId) {
		this.interestId = interestId;
	}

	public String getSendOrderId() {
		return this.sendOrderId;
	}
	public void setSendOrderId(String sendOrderId) {
		this.sendOrderId = sendOrderId;
	}

}
