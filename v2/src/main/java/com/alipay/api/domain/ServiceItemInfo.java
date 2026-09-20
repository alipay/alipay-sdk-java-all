package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-08 15:27:54
 */
public class ServiceItemInfo extends AlipayObject {

	private static final long serialVersionUID = 5417962678833246394L;

	/**
	 * 服务项id
	 */
	@ApiField("package_service_item_id")
	private String packageServiceItemId;

	/**
	 * 服务项名称
	 */
	@ApiField("package_service_item_name")
	private String packageServiceItemName;

	public String getPackageServiceItemId() {
		return this.packageServiceItemId;
	}
	public void setPackageServiceItemId(String packageServiceItemId) {
		this.packageServiceItemId = packageServiceItemId;
	}

	public String getPackageServiceItemName() {
		return this.packageServiceItemName;
	}
	public void setPackageServiceItemName(String packageServiceItemName) {
		this.packageServiceItemName = packageServiceItemName;
	}

}
