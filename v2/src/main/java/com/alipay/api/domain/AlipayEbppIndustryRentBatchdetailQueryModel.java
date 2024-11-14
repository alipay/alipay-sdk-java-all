package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公积金租房直付查询对账单详情列表
 *
 * @author auto create
 * @since 1.0, 2024-08-27 17:10:19
 */
public class AlipayEbppIndustryRentBatchdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5382211746747946177L;

	/**
	 * 公积金中心给租赁企业分配的账户编号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 公积金中心-房租直付发包批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

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

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
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
