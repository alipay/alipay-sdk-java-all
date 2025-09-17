package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公积金租房直付查询对账单详情列表
 *
 * @author auto create
 * @since 1.0, 2024-12-19 22:31:52
 */
public class AlipayEbppIndustryRentBatchdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6322741478768215595L;

	/**
	 * 公积金中心编号
	 */
	@ApiField("accfund_center_no")
	private String accfundCenterNo;

	/**
	 * 公积金中心给租赁企业分配的账户编号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 公积金中心-房租直付发包批次号，当是按批次查询的时候，只需要传batch_no，page_num和page_size就不需要传
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 账单日期，格式：yyyy-mm-dd
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

	/**
	 * 查询页数，当是分页查询的时候，page_num和page_size就是必选字段，batch_no就不需要传
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 单页条数，当是分页查询的时候，page_num和page_size就是必选字段，batch_no就不需要传
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getAccfundCenterNo() {
		return this.accfundCenterNo;
	}
	public void setAccfundCenterNo(String accfundCenterNo) {
		this.accfundCenterNo = accfundCenterNo;
	}

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

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
