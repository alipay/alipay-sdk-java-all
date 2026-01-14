package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CareertrainingsaasCategoryVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.category.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-21 14:12:42
 */
public class AlipayEbppIndustryCareertrainingCategoryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6295439495483914121L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("careertrainingsaas_category_v_o")
	private List<CareertrainingsaasCategoryVO> list;

	public void setList(List<CareertrainingsaasCategoryVO> list) {
		this.list = list;
	}
	public List<CareertrainingsaasCategoryVO> getList( ) {
		return this.list;
	}

}
