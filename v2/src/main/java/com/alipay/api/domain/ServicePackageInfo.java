package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务项信息
 *
 * @author auto create
 * @since 1.0, 2026-07-09 14:17:55
 */
public class ServicePackageInfo extends AlipayObject {

	private static final long serialVersionUID = 4586567733393954591L;

	/**
	 * 服务包到期时间
	 */
	@ApiField("service_package_end_time")
	private String servicePackageEndTime;

	/**
	 * 服务包ID
	 */
	@ApiField("service_package_id")
	private String servicePackageId;

	/**
	 * 服务项ID
	 */
	@ApiField("service_package_item_id")
	private String servicePackageItemId;

	/**
	 * 服务包项目名称
	 */
	@ApiField("service_package_item_name")
	private String servicePackageItemName;

	/**
	 * 服务包名称
	 */
	@ApiField("service_package_name")
	private String servicePackageName;

	/**
	 * 服务包订单ID
	 */
	@ApiField("service_package_order_id")
	private String servicePackageOrderId;

	/**
	 * 服务子项id N选M
	 */
	@ApiField("sub_package_item_id")
	private String subPackageItemId;

	public String getServicePackageEndTime() {
		return this.servicePackageEndTime;
	}
	public void setServicePackageEndTime(String servicePackageEndTime) {
		this.servicePackageEndTime = servicePackageEndTime;
	}

	public String getServicePackageId() {
		return this.servicePackageId;
	}
	public void setServicePackageId(String servicePackageId) {
		this.servicePackageId = servicePackageId;
	}

	public String getServicePackageItemId() {
		return this.servicePackageItemId;
	}
	public void setServicePackageItemId(String servicePackageItemId) {
		this.servicePackageItemId = servicePackageItemId;
	}

	public String getServicePackageItemName() {
		return this.servicePackageItemName;
	}
	public void setServicePackageItemName(String servicePackageItemName) {
		this.servicePackageItemName = servicePackageItemName;
	}

	public String getServicePackageName() {
		return this.servicePackageName;
	}
	public void setServicePackageName(String servicePackageName) {
		this.servicePackageName = servicePackageName;
	}

	public String getServicePackageOrderId() {
		return this.servicePackageOrderId;
	}
	public void setServicePackageOrderId(String servicePackageOrderId) {
		this.servicePackageOrderId = servicePackageOrderId;
	}

	public String getSubPackageItemId() {
		return this.subPackageItemId;
	}
	public void setSubPackageItemId(String subPackageItemId) {
		this.subPackageItemId = subPackageItemId;
	}

}
