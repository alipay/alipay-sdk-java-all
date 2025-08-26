package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 淘系商家查询花呗合约订购关系
 *
 * @author auto create
 * @since 1.0, 2024-08-02 11:07:24
 */
public class AlipayPcreditHuabeiPcreditmerchantProductorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3595869617815687263L;

	/**
	 * 合约订购查询业务场景
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 请求来源应用
	 */
	@ApiField("from_app")
	private String fromApp;

	/**
	 * 支付宝商户ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 查询条件集合
	 */
	@ApiListField("product_order_query_items")
	@ApiField("product_order_query_item")
	private List<ProductOrderQueryItem> productOrderQueryItems;

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

	public String getFromApp() {
		return this.fromApp;
	}
	public void setFromApp(String fromApp) {
		this.fromApp = fromApp;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public List<ProductOrderQueryItem> getProductOrderQueryItems() {
		return this.productOrderQueryItems;
	}
	public void setProductOrderQueryItems(List<ProductOrderQueryItem> productOrderQueryItems) {
		this.productOrderQueryItems = productOrderQueryItems;
	}

}
