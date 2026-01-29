package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询课时配置
 *
 * @author auto create
 * @since 1.0, 2025-06-09 09:58:55
 */
public class AlipayCommerceEducatePeriodInfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6373321835741938585L;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 分页页数，默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数量，默认为20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 课时ID
	 */
	@ApiField("period_id")
	private String periodId;

	/**
	 * 课时名称
	 */
	@ApiField("period_name")
	private String periodName;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
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

	public String getPeriodId() {
		return this.periodId;
	}
	public void setPeriodId(String periodId) {
		this.periodId = periodId;
	}

	public String getPeriodName() {
		return this.periodName;
	}
	public void setPeriodName(String periodName) {
		this.periodName = periodName;
	}

}
