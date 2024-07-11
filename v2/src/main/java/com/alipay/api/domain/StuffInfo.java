package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料基本信息
 *
 * @author auto create
 * @since 1.0, 2019-05-30 23:23:34
 */
public class StuffInfo extends AlipayObject {

	private static final long serialVersionUID = 8688823738891965938L;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 扩展字段，保留
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 物料商品SKU号
	 */
	@ApiField("sku_no")
	private String skuNo;

	/**
	 * 商品规格描述
	 */
	@ApiField("standard_description")
	private String standardDescription;

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getSkuNo() {
		return this.skuNo;
	}
	public void setSkuNo(String skuNo) {
		this.skuNo = skuNo;
	}

	public String getStandardDescription() {
		return this.standardDescription;
	}
	public void setStandardDescription(String standardDescription) {
		this.standardDescription = standardDescription;
	}

}
