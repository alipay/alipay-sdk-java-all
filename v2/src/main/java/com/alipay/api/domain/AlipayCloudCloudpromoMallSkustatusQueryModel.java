package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询sku售卖信息
 *
 * @author auto create
 * @since 1.0, 2024-07-10 11:15:52
 */
public class AlipayCloudCloudpromoMallSkustatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5621482872345285373L;

	/**
	 * 地区码，查询商品在该区域是否可售
	 */
	@ApiField("division_code")
	private String divisionCode;

	/**
	 * 分销店铺id
	 */
	@ApiField("purchaser_id")
	private String purchaserId;

	/**
	 * sku查询请求信息
	 */
	@ApiListField("sku_query_params")
	@ApiField("sku_query_param")
	private List<SkuQueryParam> skuQueryParams;

	public String getDivisionCode() {
		return this.divisionCode;
	}
	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public String getPurchaserId() {
		return this.purchaserId;
	}
	public void setPurchaserId(String purchaserId) {
		this.purchaserId = purchaserId;
	}

	public List<SkuQueryParam> getSkuQueryParams() {
		return this.skuQueryParams;
	}
	public void setSkuQueryParams(List<SkuQueryParam> skuQueryParams) {
		this.skuQueryParams = skuQueryParams;
	}

}
