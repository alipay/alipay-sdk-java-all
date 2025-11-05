package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 抽奖平台二阶段领奖能力接口
 *
 * @author auto create
 * @since 1.0, 2025-05-14 16:02:27
 */
public class AlipayCommerceAcommunicationPromokernelPrizeReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 8317515569533265636L;

	/**
	 * 用户唯一标识，可以通过端内的jsApi进行获取。其实就是2088开头的支付宝ID。
	 */
	@ApiField("alipay_user_unique_identifier")
	private String alipayUserUniqueIdentifier;

	/**
	 * 活动平台活动ID，活动唯一标记。
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * null
	 */
	@ApiListField("receive_order_ids")
	@ApiField("string")
	private List<String> receiveOrderIds;

	public String getAlipayUserUniqueIdentifier() {
		return this.alipayUserUniqueIdentifier;
	}
	public void setAlipayUserUniqueIdentifier(String alipayUserUniqueIdentifier) {
		this.alipayUserUniqueIdentifier = alipayUserUniqueIdentifier;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public List<String> getReceiveOrderIds() {
		return this.receiveOrderIds;
	}
	public void setReceiveOrderIds(List<String> receiveOrderIds) {
		this.receiveOrderIds = receiveOrderIds;
	}

}
