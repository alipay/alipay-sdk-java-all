package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.cooperation.productlist.agentproduct.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayInsCooperationProductlistAgentproductQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6715855749251557281L;

	/** 
	 * 返回的内容是JSON数组格式的字符串，内容包含0个或多个对象。如果没有线下产品，返回内容是：[]   至少有一个JSON对象时，其中包含4个属性，productId数字类型，productVersion, productName, codeUrl字符串类型
	 */
	@ApiField("product_list")
	private String productList;

	public void setProductList(String productList) {
		this.productList = productList;
	}
	public String getProductList( ) {
		return this.productList;
	}

}
