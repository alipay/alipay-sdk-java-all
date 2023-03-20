package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人群同步信息
 *
 * @author auto create
 * @since 1.0, 2023-03-01 10:33:54
 */
public class SyncCrowdInfo extends AlipayObject {

	private static final long serialVersionUID = 2118163112332584212L;

	/**
	 * 来源应用
	 */
	@ApiField("auth_info")
	private CrowdAuthInfo authInfo;

	/**
	 * 操作的人群对象
	 */
	@ApiListField("operations")
	@ApiField("crowd_operations")
	private List<CrowdOperations> operations;

	/**
	 * 目标账号
	 */
	@ApiField("target")
	private CrowdTarget target;

	public CrowdAuthInfo getAuthInfo() {
		return this.authInfo;
	}
	public void setAuthInfo(CrowdAuthInfo authInfo) {
		this.authInfo = authInfo;
	}

	public List<CrowdOperations> getOperations() {
		return this.operations;
	}
	public void setOperations(List<CrowdOperations> operations) {
		this.operations = operations;
	}

	public CrowdTarget getTarget() {
		return this.target;
	}
	public void setTarget(CrowdTarget target) {
		this.target = target;
	}

}
