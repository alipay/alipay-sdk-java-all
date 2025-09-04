package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OuterProductVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.insurance.outproductlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-29 15:13:03
 */
public class DatadigitalFincloudFinsaasInsuranceOutproductlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3591642735847771653L;

	/** 
	 * 外部产品列表
	 */
	@ApiListField("outer_product_items")
	@ApiField("outer_product_v_o")
	private List<OuterProductVO> outerProductItems;

	public void setOuterProductItems(List<OuterProductVO> outerProductItems) {
		this.outerProductItems = outerProductItems;
	}
	public List<OuterProductVO> getOuterProductItems( ) {
		return this.outerProductItems;
	}

}
