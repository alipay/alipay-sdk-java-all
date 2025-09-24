package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 高校运动保险广告回调任务保持
 *
 * @author auto create
 * @since 1.0, 2025-08-26 16:21:32
 */
public class AlipayCommerceEducateSportsInsurancetrainCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3646215767724291545L;

	/**
	 * 广告资源位ID
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 回调加密参数
	 */
	@ApiField("security_data")
	private String securityData;

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getSecurityData() {
		return this.securityData;
	}
	public void setSecurityData(String securityData) {
		this.securityData = securityData;
	}

}
