package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询商品售卖信息
 *
 * @author auto create
 * @since 1.0, 2024-07-10 11:15:50
 */
public class AlipayCloudCloudpromoMallItemstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5137373497141734512L;

	/**
	 * 地区码，查询商品在该区域是否可售。
	 */
	@ApiField("division_code")
	private String divisionCode;

	/**
	 * 商品id列表
	 */
	@ApiListField("product_ids")
	@ApiField("string")
	private List<String> productIds;

	/**
	 * 分销店铺id
	 */
	@ApiField("purchaser_id")
	private String purchaserId;

	public String getDivisionCode() {
		return this.divisionCode;
	}
	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public List<String> getProductIds() {
		return this.productIds;
	}
	public void setProductIds(List<String> productIds) {
		this.productIds = productIds;
	}

	public String getPurchaserId() {
		return this.purchaserId;
	}
	public void setPurchaserId(String purchaserId) {
		this.purchaserId = purchaserId;
	}

}
