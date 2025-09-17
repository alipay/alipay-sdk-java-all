package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExtBrand;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.brand.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:28
 */
public class KoubeiItemExtitemBrandQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1833992288677684329L;

	/** 
	 * 品牌列表信息
	 */
	@ApiListField("brand_list")
	@ApiField("ext_brand")
	private List<ExtBrand> brandList;

	public void setBrandList(List<ExtBrand> brandList) {
		this.brandList = brandList;
	}
	public List<ExtBrand> getBrandList( ) {
		return this.brandList;
	}

}
