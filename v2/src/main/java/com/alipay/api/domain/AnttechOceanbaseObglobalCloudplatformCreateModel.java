package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户云平台创建
 *
 * @author auto create
 * @since 1.0, 2025-09-28 17:30:25
 */
public class AnttechOceanbaseObglobalCloudplatformCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1829266382761888591L;

	/**
	 * 创建客户云平台信息请求参数
	 */
	@ApiField("create_or_update_customer_cloud_platform_request")
	private FxiaokeCreateOrUpdateCustomerCloudPlatformRequest createOrUpdateCustomerCloudPlatformRequest;

	public FxiaokeCreateOrUpdateCustomerCloudPlatformRequest getCreateOrUpdateCustomerCloudPlatformRequest() {
		return this.createOrUpdateCustomerCloudPlatformRequest;
	}
	public void setCreateOrUpdateCustomerCloudPlatformRequest(FxiaokeCreateOrUpdateCustomerCloudPlatformRequest createOrUpdateCustomerCloudPlatformRequest) {
		this.createOrUpdateCustomerCloudPlatformRequest = createOrUpdateCustomerCloudPlatformRequest;
	}

}
