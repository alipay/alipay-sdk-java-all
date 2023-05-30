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
 * @since 1.0, 2023-05-29 20:11:56
 */
public class DatadigitalFincloudFinsaasInsuranceOutproductlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7711716313769811849L;

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
