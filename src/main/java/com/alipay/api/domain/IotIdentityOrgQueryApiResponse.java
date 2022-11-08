package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构单个查询响应，没有组件信息
 *
 * @author auto create
 * @since 1.0, 2022-03-16 21:34:21
 */
public class IotIdentityOrgQueryApiResponse extends AlipayObject {

	private static final long serialVersionUID = 4182186729119151197L;

	/**
	 * 业务人脸库id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 弹性人脸库id
	 */
	@ApiField("logic_group_id")
	private String logicGroupId;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getLogicGroupId() {
		return this.logicGroupId;
	}
	public void setLogicGroupId(String logicGroupId) {
		this.logicGroupId = logicGroupId;
	}

}
