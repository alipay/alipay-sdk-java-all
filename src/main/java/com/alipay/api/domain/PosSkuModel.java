package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自建盒子的sku的模型
 *
 * @author auto create
 * @since 1.0, 2018-12-20 11:37:51
 */
public class PosSkuModel extends AlipayObject {

	private static final long serialVersionUID = 1612673117814277333L;

	/**
	 * 餐盒费，除了删除，其他情况必传
	 */
	@ApiField("box_price")
	private String boxPrice;

	/**
	 * sku的销售价格，除了删除，其他情况必传
	 */
	@ApiField("sell_price")
	private String sellPrice;

	/**
	 * sku的ID，更新和删除的时候必传
更新时如果新增了sku，不用传
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * sku的排序字段，除了删除，其他情况必传
	 */
	@ApiField("sku_sort")
	private Long skuSort;

	/**
	 * 菜品规格的ID，如果是默认规格，可以不填，其余情况除了删除都需要填
	 */
	@ApiField("spec_code_01")
	private String specCode01;

	/**
	 * 规格的名字
	 */
	@ApiField("spec_name_01")
	private String specName01;

	/**
	 * sku的状态，除了删除，其他情况必传
open 启动 stop 停用
	 */
	@ApiField("status")
	private String status;

	public String getBoxPrice() {
		return this.boxPrice;
	}
	public void setBoxPrice(String boxPrice) {
		this.boxPrice = boxPrice;
	}

	public String getSellPrice() {
		return this.sellPrice;
	}
	public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public Long getSkuSort() {
		return this.skuSort;
	}
	public void setSkuSort(Long skuSort) {
		this.skuSort = skuSort;
	}

	public String getSpecCode01() {
		return this.specCode01;
	}
	public void setSpecCode01(String specCode01) {
		this.specCode01 = specCode01;
	}

	public String getSpecName01() {
		return this.specName01;
	}
	public void setSpecName01(String specName01) {
		this.specName01 = specName01;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
