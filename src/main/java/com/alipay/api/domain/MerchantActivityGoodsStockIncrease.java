package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 快消百万小店项目活动商家单品活动库存变更
 *
 * @author auto create
 * @since 1.0, 2022-04-28 10:27:53
 */
public class MerchantActivityGoodsStockIncrease extends AlipayObject {

	private static final long serialVersionUID = 7189371826561236838L;

	/**
	 * 活动权益增补库存信息
	 */
	@ApiListField("goods_benefit_increase_stock")
	@ApiField("activity_goods_stock_increase")
	private List<ActivityGoodsStockIncrease> goodsBenefitIncreaseStock;

	/**
	 * 商户pid，唯一标识
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public List<ActivityGoodsStockIncrease> getGoodsBenefitIncreaseStock() {
		return this.goodsBenefitIncreaseStock;
	}
	public void setGoodsBenefitIncreaseStock(List<ActivityGoodsStockIncrease> goodsBenefitIncreaseStock) {
		this.goodsBenefitIncreaseStock = goodsBenefitIncreaseStock;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
