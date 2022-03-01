package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构单个查询响应，没有组件信息
 *
 * @author auto create
 * @since 1.0, 2022-01-22 14:15:12
 */
public class IotIdentityOrgQueryApiResponse extends AlipayObject {

	private static final long serialVersionUID = 3499578275878925111L;

	/**
	 * 人脸库id
	 */
	@ApiField("group_id")
	private String groupId;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
