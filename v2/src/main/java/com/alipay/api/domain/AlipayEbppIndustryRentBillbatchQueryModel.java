package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公积金租房直付查询对账单列表
 *
 * @author auto create
 * @since 1.0, 2024-08-27 17:10:39
 */
public class AlipayEbppIndustryRentBillbatchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2823257737133579772L;

	/**
	 * 账户编号，租赁机构与公积金中心签约时，公积金系统给租赁机构的账户编号。公积金中心根据此编号绑定租赁机构的收款监管账户
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账单日期，格式yyyy-mm-dd
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 公积金中心所在城市行政区划代码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 公积金中心编码
	 */
	@ApiField("org_code")
	private String orgCode;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

}
