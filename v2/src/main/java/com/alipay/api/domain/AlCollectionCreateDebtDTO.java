package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建法催案件时欠款信息请求体
 *
 * @author auto create
 * @since 1.0, 2023-03-21 20:43:56
 */
public class AlCollectionCreateDebtDTO extends AlipayObject {

	private static final long serialVersionUID = 4225417353132495459L;

	/**
	 * 法催案件信息：包括 结算附件、合同、附件
	 */
	@ApiListField("files")
	@ApiField("collection_file_d_t_o")
	private List<CollectionFileDTO> files;

	/**
	 * 截止统计日期
	 */
	@ApiField("overdue_end_date")
	private Date overdueEndDate;

	/**
	 * 开始逾期日期
	 */
	@ApiField("overdue_start_date")
	private Date overdueStartDate;

	/**
	 * 逾期情况说明
	 */
	@ApiField("overdue_statement")
	private String overdueStatement;

	/**
	 * 逾期金额(元)
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public List<CollectionFileDTO> getFiles() {
		return this.files;
	}
	public void setFiles(List<CollectionFileDTO> files) {
		this.files = files;
	}

	public Date getOverdueEndDate() {
		return this.overdueEndDate;
	}
	public void setOverdueEndDate(Date overdueEndDate) {
		this.overdueEndDate = overdueEndDate;
	}

	public Date getOverdueStartDate() {
		return this.overdueStartDate;
	}
	public void setOverdueStartDate(Date overdueStartDate) {
		this.overdueStartDate = overdueStartDate;
	}

	public String getOverdueStatement() {
		return this.overdueStatement;
	}
	public void setOverdueStatement(String overdueStatement) {
		this.overdueStatement = overdueStatement;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
