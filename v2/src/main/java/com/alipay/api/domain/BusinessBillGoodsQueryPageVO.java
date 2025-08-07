package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营收款单商品查询模型
 *
 * @author auto create
 * @since 1.0, 2025-04-15 14:33:40
 */
public class BusinessBillGoodsQueryPageVO extends AlipayObject {

	private static final long serialVersionUID = 7384348835966776256L;

	/**
	 * 一级分类
	 */
	@ApiField("category")
	private String category;

	/**
	 * 能效等级
	 */
	@ApiField("energy_efficiency_level")
	private String energyEfficiencyLevel;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 商品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 商品型号
	 */
	@ApiField("goods_model_number")
	private String goodsModelNumber;

	/**
	 * 商品名称
	 */
	@ApiField("goods_title")
	private String goodsTitle;

	/**
	 * 商品id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 商品价格，单位：元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 二级分类
	 */
	@ApiField("sub_category")
	private String subCategory;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getEnergyEfficiencyLevel() {
		return this.energyEfficiencyLevel;
	}
	public void setEnergyEfficiencyLevel(String energyEfficiencyLevel) {
		this.energyEfficiencyLevel = energyEfficiencyLevel;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getGoodsCode() {
		return this.goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodsModelNumber() {
		return this.goodsModelNumber;
	}
	public void setGoodsModelNumber(String goodsModelNumber) {
		this.goodsModelNumber = goodsModelNumber;
	}

	public String getGoodsTitle() {
		return this.goodsTitle;
	}
	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSubCategory() {
		return this.subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

}
