package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 累计预提余额查询（openapi接口）
 *
 * @author auto create
 * @since 1.0, 2021-12-22 15:29:37
 */
public class AlipayBossFncGfaccruedprodCumpoaccbalamtQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7473188429152236738L;

	/**
	 * 会记月份
	 */
	@ApiField("account_period")
	private String accountPeriod;

	/**
	 * 采购系统PO单号
	 */
	@ApiField("po_no")
	private String poNo;

	public String getAccountPeriod() {
		return this.accountPeriod;
	}
	public void setAccountPeriod(String accountPeriod) {
		this.accountPeriod = accountPeriod;
	}

	public String getPoNo() {
		return this.poNo;
	}
	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}

}
