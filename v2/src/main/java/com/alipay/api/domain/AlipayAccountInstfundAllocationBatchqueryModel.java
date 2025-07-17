package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金调拨执行结果查询
 *
 * @author auto create
 * @since 1.0, 2025-02-12 15:38:51
 */
public class AlipayAccountInstfundAllocationBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7328383967736421987L;

	/**
	 * 最晚执行时间，单位秒
	 */
	@ApiField("max_gmt_execute_time")
	private Date maxGmtExecuteTime;

	/**
	 * 最早执行时间，单位秒
	 */
	@ApiField("min_gmt_execute_time")
	private Date minGmtExecuteTime;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小，单位条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 执行结果状态，SUCCESS/FAIL
	 */
	@ApiField("status")
	private String status;

	public Date getMaxGmtExecuteTime() {
		return this.maxGmtExecuteTime;
	}
	public void setMaxGmtExecuteTime(Date maxGmtExecuteTime) {
		this.maxGmtExecuteTime = maxGmtExecuteTime;
	}

	public Date getMinGmtExecuteTime() {
		return this.minGmtExecuteTime;
	}
	public void setMinGmtExecuteTime(Date minGmtExecuteTime) {
		this.minGmtExecuteTime = minGmtExecuteTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
