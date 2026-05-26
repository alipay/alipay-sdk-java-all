package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店行业详细数据
 *
 * @author auto create
 * @since 1.0, 2026-05-18 15:43:22
 */
public class IndustryInfo extends AlipayObject {

	private static final long serialVersionUID = 5435971646252633387L;

	/**
	 * 门店油品信息列表
	 */
	@ApiListField("oil_product_list")
	@ApiField("oil_product_info")
	private List<OilProductInfo> oilProductList;

	public List<OilProductInfo> getOilProductList() {
		return this.oilProductList;
	}
	public void setOilProductList(List<OilProductInfo> oilProductList) {
		this.oilProductList = oilProductList;
	}

}
