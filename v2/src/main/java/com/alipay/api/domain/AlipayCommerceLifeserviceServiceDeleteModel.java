package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务项目删除
 *
 * @author auto create
 * @since 1.0, 2026-01-28 16:52:42
 */
public class AlipayCommerceLifeserviceServiceDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3571129194933478264L;

	/**
	 * 三方场地id【需保证唯一性】
	 */
	@ApiField("out_service_id")
	private String outServiceId;

	/**
	 * 服务项目id【和out_service_id二选一】
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getOutServiceId() {
		return this.outServiceId;
	}
	public void setOutServiceId(String outServiceId) {
		this.outServiceId = outServiceId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
