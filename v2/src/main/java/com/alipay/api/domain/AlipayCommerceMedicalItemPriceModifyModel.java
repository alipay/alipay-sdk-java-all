package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量修改商品价格
 *
 * @author auto create
 * @since 1.0, 2024-11-18 16:46:01
 */
public class AlipayCommerceMedicalItemPriceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2674215928762867525L;

	/**
	 * 商品sku价格的json数据
	 */
	@ApiListField("skus_data")
	@ApiField("sku_price_deatail")
	private List<SkuPriceDeatail> skusData;

	/**
	 * 门店编码
	 */
	@ApiField("store_code")
	private String storeCode;

	public List<SkuPriceDeatail> getSkusData() {
		return this.skusData;
	}
	public void setSkusData(List<SkuPriceDeatail> skusData) {
		this.skusData = skusData;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
