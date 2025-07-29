package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通过商品ID修改商品入参
 *
 * @author auto create
 * @since 1.0, 2025-05-20 16:54:19
 */
public class ItemUpdateByIdParam extends AlipayObject {

	private static final long serialVersionUID = 7234372329598137649L;

	/**
	 * 病种编码, 厂商自行维护
	 */
	@ApiField("disease_code")
	private String diseaseCode;

	/**
	 * 病种名称,厂商自行维护
	 */
	@ApiField("disease_name")
	private String diseaseName;

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
	 * 支付宝内部商品编码ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * sku信息
	 */
	@ApiListField("sku_list")
	@ApiField("sku_update_by_code_param")
	private List<SkuUpdateByCodeParam> skuList;

	/**
	 * 商品店内分类编码, 标准分类参照文档
	 */
	@ApiField("tag_code")
	private String tagCode;

	public String getDiseaseCode() {
		return this.diseaseCode;
	}
	public void setDiseaseCode(String diseaseCode) {
		this.diseaseCode = diseaseCode;
	}

	public String getDiseaseName() {
		return this.diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

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

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public List<SkuUpdateByCodeParam> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<SkuUpdateByCodeParam> skuList) {
		this.skuList = skuList;
	}

	public String getTagCode() {
		return this.tagCode;
	}
	public void setTagCode(String tagCode) {
		this.tagCode = tagCode;
	}

}
