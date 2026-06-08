package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构代客户取消快递来报
 *
 * @author auto create
 * @since 1.0, 2026-06-04 13:52:55
 */
public class XingheLendassistCarfinOrgexpressCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1839589214927821414L;

	/**
	 * 星河快递单号
	 */
	@ApiField("express_no")
	private String expressNo;

	/**
	 * 抵押单号
	 */
	@ApiField("mortgage_no")
	private String mortgageNo;

	public String getExpressNo() {
		return this.expressNo;
	}
	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public String getMortgageNo() {
		return this.mortgageNo;
	}
	public void setMortgageNo(String mortgageNo) {
		this.mortgageNo = mortgageNo;
	}

}
