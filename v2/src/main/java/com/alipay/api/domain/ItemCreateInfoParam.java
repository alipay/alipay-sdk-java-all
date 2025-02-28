package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量创建商品, 商品信息
 *
 * @author auto create
 * @since 1.0, 2025-02-13 23:23:29
 */
public class ItemCreateInfoParam extends AlipayObject {

	private static final long serialVersionUID = 3415682414346351834L;

	/**
	 * 是否为医保商品, 0不是, 1是, 默认1
	 */
	@ApiField("insurance")
	private String insurance;

	/**
	 * 医保商品医保编码, 从国家医保目录获取
	 */
	@ApiField("insurance_code")
	private String insuranceCode;

	/**
	 * OMS厂商商品编码, 用于标识门店范围唯一一个商品, 厂商自行维护
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * sku信息
	 */
	@ApiListField("sku_list")
	@ApiField("sku_create_info_param")
	private List<SkuCreateInfoParam> skuList;

	/**
	 * 商品上下架状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商品供应链类型
	 */
	@ApiField("supply_chain_type")
	private String supplyChainType;

	/**
	 * 商品店内分类编码, 标准分类参照文档
	 */
	@ApiField("tag_code")
	private String tagCode;

	public String getInsurance() {
		return this.insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public String getInsuranceCode() {
		return this.insuranceCode;
	}
	public void setInsuranceCode(String insuranceCode) {
		this.insuranceCode = insuranceCode;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public List<SkuCreateInfoParam> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<SkuCreateInfoParam> skuList) {
		this.skuList = skuList;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSupplyChainType() {
		return this.supplyChainType;
	}
	public void setSupplyChainType(String supplyChainType) {
		this.supplyChainType = supplyChainType;
	}

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

}
