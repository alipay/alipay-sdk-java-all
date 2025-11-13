package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业码门店池门店查询
 *
 * @author auto create
 * @since 1.0, 2024-08-23 09:50:16
 */
public class AlipayCommerceEcShoppoolShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7674836791239464952L;

	/**
	 * 查询地址信息，表示查询符合此地址规则的门店
	 */
	@ApiField("address_info")
	private AdressInfo addressInfo;

	/**
	 * 企业码门店搜索条件列表，支持多个条件，并按照优先级进行搜索匹配
	 */
	@ApiListField("condition_list")
	@ApiField("condition_info")
	private List<ConditionInfo> conditionList;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 查询电子围栏信息，表示查询在此范围内的门店
	 */
	@ApiField("fence_info")
	private FenceInfo fenceInfo;

	/**
	 * 企业码门店类型，可选值：餐饮门店 - MEAL；理赔医院 - HOSPITAL
	 */
	@ApiField("shop_type")
	private String shopType;

	public AdressInfo getAddressInfo() {
		return this.addressInfo;
	}
	public void setAddressInfo(AdressInfo addressInfo) {
		this.addressInfo = addressInfo;
	}

	public List<ConditionInfo> getConditionList() {
		return this.conditionList;
	}
	public void setConditionList(List<ConditionInfo> conditionList) {
		this.conditionList = conditionList;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public FenceInfo getFenceInfo() {
		return this.fenceInfo;
	}
	public void setFenceInfo(FenceInfo fenceInfo) {
		this.fenceInfo = fenceInfo;
	}

	public String getShopType() {
		return this.shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

}
