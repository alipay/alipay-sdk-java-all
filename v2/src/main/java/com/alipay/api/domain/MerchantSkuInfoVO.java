package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家侧商品SKU信息
 *
 * @author auto create
 * @since 1.0, 2024-07-05 11:40:02
 */
public class MerchantSkuInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4788781318342928793L;

	/**
	 * 商家侧商品属性信息
	 */
	@ApiListField("attrs")
	@ApiField("merchant_item_attr_v_o")
	private List<MerchantItemAttrVO> attrs;

	/**
	 * sku原价，分为单位。
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 商家侧sku ID，APPID 下全局唯一。
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * sku售价，分为单位。
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * sku售卖状态，包含以下两种状态： 已下架(DELISTING) 可售卖(AVAILABLE) 已下架: DELISTING 可售卖: AVAILABLE。
	 */
	@ApiField("sale_status")
	private String saleStatus;

	/**
	 * 当前sku在商家侧实际剩余的库存值。
	 */
	@ApiField("stock_num")
	private Long stockNum;

	public List<MerchantItemAttrVO> getAttrs() {
		return this.attrs;
	}
	public void setAttrs(List<MerchantItemAttrVO> attrs) {
		this.attrs = attrs;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public String getSaleStatus() {
		return this.saleStatus;
	}
	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

}
