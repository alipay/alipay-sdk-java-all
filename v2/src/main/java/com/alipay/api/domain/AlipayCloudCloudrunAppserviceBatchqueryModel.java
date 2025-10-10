package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝小程序云云托管产品查询实例列表
 *
 * @author auto create
 * @since 1.0, 2024-08-15 11:51:04
 */
public class AlipayCloudCloudrunAppserviceBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2598348544549338697L;

	/**
	 * 应用服务的唯一标识
	 */
	@ApiField("app_service_uuid")
	private String appServiceUuid;

	public String getAppServiceUuid() {
		return this.appServiceUuid;
	}
	public void setAppServiceUuid(String appServiceUuid) {
		this.appServiceUuid = appServiceUuid;
	}

}
