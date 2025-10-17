package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户云平台修改
 *
 * @author auto create
 * @since 1.0, 2025-09-28 17:36:48
 */
public class AnttechOceanbaseObglobalCloudplatformModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4367124251683331128L;

	/**
	 * 更新客户云平台信息请求参数
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
