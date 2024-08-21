package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 根据支付宝用户ID批量获取用户OpenId和UnionId
 *
 * @author auto create
 * @since 1.0, 2023-12-28 11:23:51
 */
public class AlipayOpenAppOpenidBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4815441741513323366L;

	/**
	 * 工单唯一标识
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 支付宝用户userid列表
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
