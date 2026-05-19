package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品查询
 *
 * @author auto create
 * @since 1.0, 2026-03-30 15:52:45
 */
public class AlipayTradeProductQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8822715695189168964L;

	/**
	 * 商品id，通过创建接口获取
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * null
	 */
	@ApiListField("query_options")
	@ApiField("string")
	private List<String> queryOptions;

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public List<String> getQueryOptions() {
		return this.queryOptions;
	}
	public void setQueryOptions(List<String> queryOptions) {
		this.queryOptions = queryOptions;
	}

}
