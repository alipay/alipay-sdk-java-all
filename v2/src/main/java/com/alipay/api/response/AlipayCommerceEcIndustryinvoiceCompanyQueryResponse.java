package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CompanyProductInfo;
import com.alipay.api.domain.IndustryNatureInfo;
import com.alipay.api.domain.CompanyInvoiceClerk;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.industryinvoice.company.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-30 16:12:53
 */
public class AlipayCommerceEcIndustryinvoiceCompanyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5534787934756856489L;

	/** 
	 * 企业名称
	 */
	@ApiField("company_name")
	private String companyName;

	/** 
	 * 企业已开通产品列表
	 */
	@ApiListField("company_product_info_list")
	@ApiField("company_product_info")
	private List<CompanyProductInfo> companyProductInfoList;

	/** 
	 * 企业行业性质列表
	 */
	@ApiListField("industry_nature_list")
	@ApiField("industry_nature_info")
	private List<IndustryNatureInfo> industryNatureList;

	/** 
	 * 企业开票员信息
	 */
	@ApiField("invoice_clerk")
	private CompanyInvoiceClerk invoiceClerk;

	/** 
	 * 企业税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyName( ) {
		return this.companyName;
	}

	public void setCompanyProductInfoList(List<CompanyProductInfo> companyProductInfoList) {
		this.companyProductInfoList = companyProductInfoList;
	}
	public List<CompanyProductInfo> getCompanyProductInfoList( ) {
		return this.companyProductInfoList;
	}

	public void setIndustryNatureList(List<IndustryNatureInfo> industryNatureList) {
		this.industryNatureList = industryNatureList;
	}
	public List<IndustryNatureInfo> getIndustryNatureList( ) {
		return this.industryNatureList;
	}

	public void setInvoiceClerk(CompanyInvoiceClerk invoiceClerk) {
		this.invoiceClerk = invoiceClerk;
	}
	public CompanyInvoiceClerk getInvoiceClerk( ) {
		return this.invoiceClerk;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	public String getTaxNo( ) {
		return this.taxNo;
	}

}
