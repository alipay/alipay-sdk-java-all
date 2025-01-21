package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流信息。发票种类为纸质发票和专票会有物流信息
 *
 * @author auto create
 * @since 1.0, 2019-10-17 14:53:53
 */
public class IsvLogisticsInfo extends AlipayObject {

	private static final long serialVersionUID = 5631384229728741645L;

	/**
	 * 快递公司
	 */
	@ApiField("express_company")
	private String expressCompany;

	/**
	 * 快递公司运单号
	 */
	@ApiField("express_company_bill_no")
	private String expressCompanyBillNo;

	public String getExpressCompany() {
		return this.expressCompany;
	}
	public void setExpressCompany(String expressCompany) {
		this.expressCompany = expressCompany;
	}

	public String getExpressCompanyBillNo() {
		return this.expressCompanyBillNo;
	}
	public void setExpressCompanyBillNo(String expressCompanyBillNo) {
		this.expressCompanyBillNo = expressCompanyBillNo;
	}

}
