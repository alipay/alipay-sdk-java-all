package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阶梯价格
 *
 * @author auto create
 * @since 1.0, 2025-06-30 20:23:03
 */
public class MallLadderPriceDTO extends AlipayObject {

	private static final long serialVersionUID = 6715917214944987892L;

	/**
	 * 阶梯价格关联的商品报价Id值
	 */
	@ApiField("goods_quotation_id")
	private Long goodsQuotationId;

	/**
	 * 规格报价的最小采购量数字从 1开始, 根据报价单位进行度量
如天、个、块等
	 */
	@ApiField("minimum_purchase_quantity")
	private String minimumPurchaseQuantity;

	/**
	 * 规格报价数量单价,通过报价单上币种来确定具体价格，
这里只进行价格数字的透出, 具体单价币种需要取
currency_code字段返回的值
	 */
	@ApiField("unit_price")
	private String unitPrice;

	public Long getGoodsQuotationId() {
		return this.goodsQuotationId;
	}
	public void setGoodsQuotationId(Long goodsQuotationId) {
		this.goodsQuotationId = goodsQuotationId;
	}

	public String getMinimumPurchaseQuantity() {
		return this.minimumPurchaseQuantity;
	}
	public void setMinimumPurchaseQuantity(String minimumPurchaseQuantity) {
		this.minimumPurchaseQuantity = minimumPurchaseQuantity;
	}

	public String getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

}
