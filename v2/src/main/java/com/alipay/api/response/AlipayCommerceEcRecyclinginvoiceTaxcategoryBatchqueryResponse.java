package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaxCategory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.taxcategory.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-03 16:32:28
 */
public class AlipayCommerceEcRecyclinginvoiceTaxcategoryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1567239346782196353L;

	/** 
	 * 税收分类编码
	 */
	@ApiListField("tax_category_list")
	@ApiField("tax_category")
	private List<TaxCategory> taxCategoryList;

	public void setTaxCategoryList(List<TaxCategory> taxCategoryList) {
		this.taxCategoryList = taxCategoryList;
	}
	public List<TaxCategory> getTaxCategoryList( ) {
		return this.taxCategoryList;
	}

}
