package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二方签约信息查询接口
 *
 * @author auto create
 * @since 1.0, 2022-05-09 15:02:55
 */
public class AlipayUserSignatoryInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4382179888861356383L;

	/**
	 * 场景码，需要在ione平台申请
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 租户名，ione平台申请的参数。如果默认从cif查询数据，则租户默认为semantic_custcore，可以不填。其他租户则必填。
	 */
	@ApiField("tenant_name")
	private String tenantName;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getTenantName() {
		return this.tenantName;
	}
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
