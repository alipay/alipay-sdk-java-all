package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CompanyProduct;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.recyclinginvoice.company.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-13 14:17:28
 */
public class AlipayCommerceEcRecyclinginvoiceCompanyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6719379565598956838L;

	/** 
	 * 企业（商户）ID
	 */
	@ApiField("company_id")
	private String companyId;

	/** 
	 * 企业（商户）公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/** 
	 * 企业（商户）已开通产品列表
	 */
	@ApiListField("company_product_list")
	@ApiField("company_product")
	private List<CompanyProduct> companyProductList;

	/** 
	 * 企业（商户）税号
	 */
	@ApiField("company_tax_no")
	private String companyTaxNo;

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyId( ) {
		return this.companyId;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName( ) {
		return this.companyName;
	}

	public void setCompanyProductList(List<CompanyProduct> companyProductList) {
		this.companyProductList = companyProductList;
	}
	public List<CompanyProduct> getCompanyProductList( ) {
		return this.companyProductList;
	}

	public void setCompanyTaxNo(String companyTaxNo) {
		this.companyTaxNo = companyTaxNo;
	}
	public String getCompanyTaxNo( ) {
		return this.companyTaxNo;
	}

}
