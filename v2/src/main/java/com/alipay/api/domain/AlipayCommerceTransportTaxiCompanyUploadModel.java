package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 出租车公司信息上报
 *
 * @author auto create
 * @since 1.0, 2026-08-25 10:51:07
 */
public class AlipayCommerceTransportTaxiCompanyUploadModel extends AlipayObject {

	private static final long serialVersionUID = 2829925675862788474L;

	/**
	 * null
	 */
	@ApiListField("company_list")
	@ApiField("company_import_item")
	private List<CompanyImportItem> companyList;

	public List<CompanyImportItem> getCompanyList() {
		return this.companyList;
	}
	public void setCompanyList(List<CompanyImportItem> companyList) {
		this.companyList = companyList;
	}

}
