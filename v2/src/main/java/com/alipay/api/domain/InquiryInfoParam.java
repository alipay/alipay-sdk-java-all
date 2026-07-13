package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问诊类商品信息
 *
 * @author auto create
 * @since 1.0, 2026-04-20 16:12:11
 */
public class InquiryInfoParam extends AlipayObject {

	private static final long serialVersionUID = 1419328238539564734L;

	/**
	 * 额外赠送次数
	 */
	@ApiField("gift_num")
	private Long giftNum;

	/**
	 * 医院城市
	 */
	@ApiField("hospital_city")
	private String hospitalCity;

	/**
	 * 医院级别，文本展示非枚举类型
	 */
	@ApiField("hospital_level")
	private String hospitalLevel;

	/**
	 * 商品描述
	 */
	@ApiField("product_desc")
	private String productDesc;

	/**
	 * 产品场景
	 */
	@ApiField("product_scene")
	private String productScene;

	/**
	 * 服务说明
	 */
	@ApiField("service_desc")
	private String serviceDesc;

	/**
	 * 服务时长，分、小时、天、月、年
	 */
	@ApiField("service_time")
	private String serviceTime;

	/**
	 * 服务时长单位，分、小时、天、月、年
	 */
	@ApiField("service_time_unit")
	private String serviceTimeUnit;

	/**
	 * 是否展示服务适用情况
	 */
	@ApiField("show_applicability")
	private String showApplicability;

	/**
	 * SKU标签
	 */
	@ApiField("sku_tag")
	private String skuTag;

	/**
	 * 服务提供者
	 */
	@ApiField("supplier")
	private String supplier;

	public Long getGiftNum() {
		return this.giftNum;
	}
	public void setGiftNum(Long giftNum) {
		this.giftNum = giftNum;
	}

	public String getHospitalCity() {
		return this.hospitalCity;
	}
	public void setHospitalCity(String hospitalCity) {
		this.hospitalCity = hospitalCity;
	}

	public String getHospitalLevel() {
		return this.hospitalLevel;
	}
	public void setHospitalLevel(String hospitalLevel) {
		this.hospitalLevel = hospitalLevel;
	}

	public String getProductDesc() {
		return this.productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductScene() {
		return this.productScene;
	}
	public void setProductScene(String productScene) {
		this.productScene = productScene;
	}

	public String getServiceDesc() {
		return this.serviceDesc;
	}
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	public String getServiceTime() {
		return this.serviceTime;
	}
	public void setServiceTime(String serviceTime) {
		this.serviceTime = serviceTime;
	}

	public String getServiceTimeUnit() {
		return this.serviceTimeUnit;
	}
	public void setServiceTimeUnit(String serviceTimeUnit) {
		this.serviceTimeUnit = serviceTimeUnit;
	}

	public String getShowApplicability() {
		return this.showApplicability;
	}
	public void setShowApplicability(String showApplicability) {
		this.showApplicability = showApplicability;
	}

	public String getSkuTag() {
		return this.skuTag;
	}
	public void setSkuTag(String skuTag) {
		this.skuTag = skuTag;
	}

	public String getSupplier() {
		return this.supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

}
