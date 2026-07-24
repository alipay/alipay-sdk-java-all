package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行业信息详情
 *
 * @author auto create
 * @since 1.0, 2026-05-18 15:47:48
 */
public class SelfIndustryInfo extends AlipayObject {

	private static final long serialVersionUID = 4476789843371123868L;

	/**
	 * null
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
