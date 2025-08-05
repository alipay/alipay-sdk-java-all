package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单流水查询接口
 *
 * @author auto create
 * @since 1.0, 2023-01-04 17:35:46
 */
public class MybankCreditLoantradeBillListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1628838169228917964L;

	/**
	 * 账单编号列表，最多支持20条记录查询
	 */
	@ApiField("bill_no_list")
	private String billNoList;

	/**
	 * 账单状态，OVD逾期，CLE结清，NOR正常
	 */
	@ApiField("bill_status_list")
	private String billStatusList;

	/**
	 * 账单结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 分页偏移量
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小，最大50
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 方案合约编号
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 账单开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 用户的基本信息，包括支付宝id，site,steUserId等
	 */
	@ApiField("user")
	private UserVo user;

	public String getBillNoList() {
		return this.billNoList;
	}
	public void setBillNoList(String billNoList) {
		this.billNoList = billNoList;
	}

	public String getBillStatusList() {
		return this.billStatusList;
	}
	public void setBillStatusList(String billStatusList) {
		this.billStatusList = billStatusList;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public UserVo getUser() {
		return this.user;
	}
	public void setUser(UserVo user) {
		this.user = user;
	}

}
