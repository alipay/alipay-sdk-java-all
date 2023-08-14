package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量上传用户ID到OpenID转换工单
 *
 * @author auto create
 * @since 1.0, 2023-04-24 14:46:36
 */
public class AlipayOpenAppOpenidApplyorderUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4778393617417863821L;

	/**
	 * 工单唯一标识
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 用户ID列表
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
