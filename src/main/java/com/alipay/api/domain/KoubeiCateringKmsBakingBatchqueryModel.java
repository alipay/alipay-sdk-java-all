package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 烘焙销量回传接口
 *
 * @author auto create
 * @since 1.0, 2020-11-24 15:51:55
 */
public class KoubeiCateringKmsBakingBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3149673221233982927L;

	/**
	 * 预测日期，目前只支持预测当天日期
	 */
	@ApiField("forecast_date")
	private String forecastDate;

	/**
	 * 口碑门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 商品skuId，数组结构，目前批量最多只支持100个sku
	 */
	@ApiListField("sku_id")
	@ApiField("string")
	private List<String> skuId;

	public String getForecastDate() {
		return this.forecastDate;
	}
	public void setForecastDate(String forecastDate) {
		this.forecastDate = forecastDate;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public List<String> getSkuId() {
		return this.skuId;
	}
	public void setSkuId(List<String> skuId) {
		this.skuId = skuId;
	}

}
