package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询服务项权益详情链接
 *
 * @author auto create
 * @since 1.0, 2026-09-08 15:22:54
 */
public class AlipayCommerceMedicalRightUrlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2593782475639339286L;

	/**
	 * 履约单号
	 */
	@ApiField("fulfillment_no")
	private String fulfillmentNo;

	/**
	 * 服务项id
	 */
	@ApiField("service_item_id")
	private String serviceItemId;

	/**
	 * 服务包订单号
	 */
	@ApiField("service_package_order_no")
	private String servicePackageOrderNo;

	public String getFulfillmentNo() {
		return this.fulfillmentNo;
	}
	public void setFulfillmentNo(String fulfillmentNo) {
		this.fulfillmentNo = fulfillmentNo;
	}

	public String getServiceItemId() {
		return this.serviceItemId;
	}
	public void setServiceItemId(String serviceItemId) {
		this.serviceItemId = serviceItemId;
	}

	public String getServicePackageOrderNo() {
		return this.servicePackageOrderNo;
	}
	public void setServicePackageOrderNo(String servicePackageOrderNo) {
		this.servicePackageOrderNo = servicePackageOrderNo;
	}

}
