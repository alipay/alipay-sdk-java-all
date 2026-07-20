package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-08 17:27:56
 */
public class ServiceItem extends AlipayObject {

	private static final long serialVersionUID = 7235482594319952317L;

	/**
	 * 是否支持顾问代下
	 */
	@ApiField("advisor_proxy")
	private Boolean advisorProxy;

	/**
	 * 折扣：8.0表示8折
	 */
	@ApiField("discounted")
	private String discounted;

	/**
	 * 医生id
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 是否为免费
	 */
	@ApiField("free")
	private Boolean free;

	/**
	 * 好大夫skuId
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 商品原价
	 */
	@ApiField("price")
	private Long price;

	/**
	 * 卖家ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 服务时长,单位见service_duration_unit字段
	 */
	@ApiField("service_duration")
	private String serviceDuration;

	/**
	 * 服务时长单位（如：天/小时/分钟）
	 */
	@ApiField("service_duration_unit")
	private String serviceDurationUnit;

	/**
	 * 服务项id
	 */
	@ApiField("service_package_item_id")
	private String servicePackageItemId;

	/**
	 * SaaS skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 商品名称
	 */
	@ApiField("sku_name")
	private String skuName;

	/**
	 * 标品id
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * 门店ID
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 服务子项id
N选M场景需求
	 */
	@ApiField("sub_package_item_id")
	private String subPackageItemId;

	public Boolean getAdvisorProxy() {
		return this.advisorProxy;
	}
	public void setAdvisorProxy(Boolean advisorProxy) {
		this.advisorProxy = advisorProxy;
	}

	public String getDiscounted() {
		return this.discounted;
	}
	public void setDiscounted(String discounted) {
		this.discounted = discounted;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public Boolean getFree() {
		return this.free;
	}
	public void setFree(Boolean free) {
		this.free = free;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getServiceDuration() {
		return this.serviceDuration;
	}
	public void setServiceDuration(String serviceDuration) {
		this.serviceDuration = serviceDuration;
	}

	public String getServiceDurationUnit() {
		return this.serviceDurationUnit;
	}
	public void setServiceDurationUnit(String serviceDurationUnit) {
		this.serviceDurationUnit = serviceDurationUnit;
	}

	public String getServicePackageItemId() {
		return this.servicePackageItemId;
	}
	public void setServicePackageItemId(String servicePackageItemId) {
		this.servicePackageItemId = servicePackageItemId;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSkuName() {
		return this.skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getSubPackageItemId() {
		return this.subPackageItemId;
	}
	public void setSubPackageItemId(String subPackageItemId) {
		this.subPackageItemId = subPackageItemId;
	}

}
