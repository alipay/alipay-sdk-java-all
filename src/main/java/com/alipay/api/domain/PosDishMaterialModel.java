package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自建盒子菜品中的配菜的模型
 *
 * @author auto create
 * @since 1.0, 2018-12-20 11:37:52
 */
public class PosDishMaterialModel extends AlipayObject {

	private static final long serialVersionUID = 7181864297788378968L;

	/**
	 * 配菜的ID
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 配菜的名字
	 */
	@ApiField("material_name")
	private String materialName;

	/**
	 * 配菜的价格
	 */
	@ApiField("sell_price")
	private String sellPrice;

	/**
	 * 配料的排序号，新建，更新都是必传的
	 */
	@ApiField("sort")
	private Long sort;

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public String getMaterialName() {
		return this.materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getSellPrice() {
		return this.sellPrice;
	}
	public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Long getSort() {
		return this.sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}

}
