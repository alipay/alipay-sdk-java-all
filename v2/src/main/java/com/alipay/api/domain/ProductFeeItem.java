package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 产品计费项详情
 *
 * @author auto create
 * @since 1.0, 2023-08-29 17:51:49
 */
public class ProductFeeItem extends AlipayObject {

	private static final long serialVersionUID = 1884435418659444211L;

	/**
	 * 计费项列表
	 */
	@ApiListField("fee_items")
	@ApiField("fee_item")
	private List<FeeItem> feeItems;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	public List<FeeItem> getFeeItems() {
		return this.feeItems;
	}
	public void setFeeItems(List<FeeItem> feeItems) {
		this.feeItems = feeItems;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
