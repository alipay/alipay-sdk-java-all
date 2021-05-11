package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 销售产品
 *
 * @author auto create
 * @since 1.0, 2013-12-17 15:55:22
 */
public class SaleProduct extends AlipayObject {

	private static final long serialVersionUID = 4382651751229454417L;

	/**
	 * 宝贝来源 例如：TAOBAO ALIPAY
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 销售产品DB ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 面额
	 */
	@ApiField("market_price")
	private String marketPrice;

	/**
	 * 充值产品提供商
	 */
	@ApiField("product_provider")
	private ProductProvider productProvider;

	/**
	 * 销售价格
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 产品状态, 0为不可用，1为可用
	 */
	@ApiField("status")
	private String status;

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMarketPrice() {
		return this.marketPrice;
	}
	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}

	public ProductProvider getProductProvider() {
		return this.productProvider;
	}
	public void setProductProvider(ProductProvider productProvider) {
		this.productProvider = productProvider;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
