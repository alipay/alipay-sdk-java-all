package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品简化接口套餐组明细信息
 *
 * @author auto create
 * @since 1.0, 2020-12-10 14:08:02
 */
public class KbdishGroupDetailSimplifyInfo extends AlipayObject {

	private static final long serialVersionUID = 5411774874282476938L;

	/**
	 * 加价
	 */
	@ApiField("add_price")
	private String addPrice;

	/**
	 * 可选组子菜最大可选数量，不传默认为1，传值必须为大于0的数字
	 */
	@ApiField("detail_count")
	private String detailCount;

	/**
	 * 外部菜品id
	 */
	@ApiField("out_dish_id")
	private String outDishId;

	/**
	 * 外部菜品skuId
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 套餐明细规格，default：是否默认；true：默认；false：不默认；cost_inclusive：子菜是否计算入套餐价格内，true：计算，false（默认）：不计算
	 */
	@ApiField("rule")
	private String rule;

	/**
	 * 排序值
	 */
	@ApiField("sort")
	private String sort;

	public String getAddPrice() {
		return this.addPrice;
	}
	public void setAddPrice(String addPrice) {
		this.addPrice = addPrice;
	}

	public String getDetailCount() {
		return this.detailCount;
	}
	public void setDetailCount(String detailCount) {
		this.detailCount = detailCount;
	}

	public String getOutDishId() {
		return this.outDishId;
	}
	public void setOutDishId(String outDishId) {
		this.outDishId = outDishId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getRule() {
		return this.rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}

	public String getSort() {
		return this.sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}

}
