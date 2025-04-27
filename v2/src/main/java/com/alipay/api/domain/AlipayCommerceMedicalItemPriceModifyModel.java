package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量修改商品价格
 *
 * @author auto create
 * @since 1.0, 2025-04-14 15:47:11
 */
public class AlipayCommerceMedicalItemPriceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2252982652322732788L;

	/**
	 * 商品sku价格的json数据
	 */
	@ApiListField("skus_data")
	@ApiField("sku_price_deatail")
	private List<SkuPriceDeatail> skusData;

	/**
	 * OMS厂商门店编码, 录入门店时填写的值, 厂商自行维护
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
