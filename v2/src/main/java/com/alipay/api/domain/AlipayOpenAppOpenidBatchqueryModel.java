package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 根据支付宝用户ID批量获取用户OpenId和UnionId
 *
 * @author auto create
 * @since 1.0, 2023-04-24 14:46:37
 */
public class AlipayOpenAppOpenidBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7838864129858387537L;

	/**
	 * 工单唯一标识
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 支付宝用户ID列表
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<String> getUserIdList() {
		return this.userIdList;
	}
	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}

}
