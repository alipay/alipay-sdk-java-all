package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-04-02 10:52:24
 */
public class RecycleSkuDTO extends AlipayObject {

	private static final long serialVersionUID = 5869975474178593564L;

	/**
	 * 当前sku的过期时间，如果为空时，不同的场景平台会有默认的过期时间
	 */
	@ApiField("expired_time")
	private Date expiredTime;

	/**
	 * null
	 */
	@ApiListField("sku_attrs")
	@ApiField("recycle_sku_attr_d_t_o")
	private List<RecycleSkuAttrDTO> skuAttrs;

	/**
	 * 具体款式商品的价格，包含最低价与最高价
	 */
	@ApiField("sku_price")
	private RecycleSkuPriceDTO skuPrice;

	/**
	 * 描述某款式商品的上下架状态
	 */
	@ApiField("status")
	private String status;

	public Date getExpiredTime() {
		return this.expiredTime;
	}
	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public List<RecycleSkuAttrDTO> getSkuAttrs() {
		return this.skuAttrs;
	}
	public void setSkuAttrs(List<RecycleSkuAttrDTO> skuAttrs) {
		this.skuAttrs = skuAttrs;
	}

	public RecycleSkuPriceDTO getSkuPrice() {
		return this.skuPrice;
	}
	public void setSkuPrice(RecycleSkuPriceDTO skuPrice) {
		this.skuPrice = skuPrice;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
