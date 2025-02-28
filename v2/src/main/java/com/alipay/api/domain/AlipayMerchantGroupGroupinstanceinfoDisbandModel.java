package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解散群聊
 *
 * @author auto create
 * @since 1.0, 2024-09-30 17:56:25
 */
public class AlipayMerchantGroupGroupinstanceinfoDisbandModel extends AlipayObject {

	private static final long serialVersionUID = 5199373468197569562L;

	/**
	 * 群id
	 */
	@ApiField("group_instance_id")
	private String groupInstanceId;

	public String getGroupInstanceId() {
		return this.groupInstanceId;
	}
	public void setGroupInstanceId(String groupInstanceId) {
		this.groupInstanceId = groupInstanceId;
	}

}
