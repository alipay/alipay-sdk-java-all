package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-23 14:02:56
 */
public class SpecialtyDiseasePackage extends AlipayObject {

	private static final long serialVersionUID = 1229969579365338215L;

	/**
	 * 履约有效天数
	 */
	@ApiField("fulfillment_valid_days")
	private Long fulfillmentValidDays;

	/**
	 * null
	 */
	@ApiListField("items")
	@ApiField("right_info")
	private List<RightInfo> items;

	/**
	 * 服务包描述
	 */
	@ApiField("service_package_desc")
	private String servicePackageDesc;

	/**
	 * 服务包Id
	 */
	@ApiField("service_package_id")
	private String servicePackageId;

	/**
	 * 服务包名称，长度1-200
	 */
	@ApiField("service_package_name")
	private String servicePackageName;

	/**
	 * 服务包价格(分)
	 */
	@ApiField("service_package_price")
	private Long servicePackagePrice;

	public Long getFulfillmentValidDays() {
		return this.fulfillmentValidDays;
	}
	public void setFulfillmentValidDays(Long fulfillmentValidDays) {
		this.fulfillmentValidDays = fulfillmentValidDays;
	}

	public List<RightInfo> getItems() {
		return this.items;
	}
	public void setItems(List<RightInfo> items) {
		this.items = items;
	}

	public String getServicePackageDesc() {
		return this.servicePackageDesc;
	}
	public void setServicePackageDesc(String servicePackageDesc) {
		this.servicePackageDesc = servicePackageDesc;
	}

	public String getServicePackageId() {
		return this.servicePackageId;
	}
	public void setServicePackageId(String servicePackageId) {
		this.servicePackageId = servicePackageId;
	}

	public String getServicePackageName() {
		return this.servicePackageName;
	}
	public void setServicePackageName(String servicePackageName) {
		this.servicePackageName = servicePackageName;
	}

	public Long getServicePackagePrice() {
		return this.servicePackagePrice;
	}
	public void setServicePackagePrice(Long servicePackagePrice) {
		this.servicePackagePrice = servicePackagePrice;
	}

}
