package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaxCategoryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.invoice.taxcategory.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-09 18:02:40
 */
public class AlipayCommerceEcInvoiceTaxcategoryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5888325286456936139L;

	/** 
	 * 税收分类编码列表
	 */
	@ApiListField("tax_category_list")
	@ApiField("tax_category_info")
	private List<TaxCategoryInfo> taxCategoryList;

	public void setTaxCategoryList(List<TaxCategoryInfo> taxCategoryList) {
		this.taxCategoryList = taxCategoryList;
	}
	public List<TaxCategoryInfo> getTaxCategoryList( ) {
		return this.taxCategoryList;
	}

}
