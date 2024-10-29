package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务市场产品授权升级
 *
 * @author auto create
 * @since 1.0, 2024-03-06 13:45:51
 */
public class AlipayOpenServicemarketOrderUpgradeModel extends AlipayObject {

	private static final long serialVersionUID = 8666358645251129911L;

	/**
	 * 订单号
	 */
	@ApiField("commodity_order_id")
	private String commodityOrderId;

	/**
	 * 需要授权的代操作产品列表，传入code集合，一次最多10个，如果授权时三方应用关联的产品有变化也会同步重新授权
	 */
	@ApiListField("product_codes")
	@ApiField("string")
	private List<String> productCodes;

	public String getCommodityOrderId() {
		return this.commodityOrderId;
	}
	public void setCommodityOrderId(String commodityOrderId) {
		this.commodityOrderId = commodityOrderId;
	}

	public List<String> getProductCodes() {
		return this.productCodes;
	}
	public void setProductCodes(List<String> productCodes) {
		this.productCodes = productCodes;
	}

}
