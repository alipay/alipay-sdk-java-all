package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量更新商品接口, 商品信息
 *
 * @author auto create
 * @since 1.0, 2025-02-13 23:23:32
 */
public class ItemUpdateInfoParam extends AlipayObject {

	private static final long serialVersionUID = 1746515345653534825L;

	/**
	 * 是否医保商品
	 */
	@ApiField("insurance")
	private String insurance;

	/**
	 * 医保商品医保编码, 从医保部门获取
	 */
	@ApiField("insurance_code")
	private String insuranceCode;

	/**
	 * OMS厂商商品编码, 厂商自行维护
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * sku信息
	 */
	@ApiListField("sku_list")
	@ApiField("sku_update_info_param")
	private List<SkuUpdateInfoParam> skuList;

	/**
	 * 商品上下架状态
	 */
	@ApiField("status")
	private String status;

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

	public List<SkuUpdateInfoParam> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<SkuUpdateInfoParam> skuList) {
		this.skuList = skuList;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

}
