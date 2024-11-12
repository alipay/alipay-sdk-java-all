package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量修改商品价格
 *
 * @author auto create
 * @since 1.0, 2024-09-29 16:05:17
 */
public class AlipayCommerceMedicalItemPriceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5425429639223789894L;

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
