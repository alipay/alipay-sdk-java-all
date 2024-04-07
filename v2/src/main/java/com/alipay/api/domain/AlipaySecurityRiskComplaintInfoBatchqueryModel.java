package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询消费者投诉列表
 *
 * @author auto create
 * @since 1.0, 2024-03-11 15:05:34
 */
public class AlipaySecurityRiskComplaintInfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7722465363423476885L;

	/**
	 * 分页查询页码，不传则默认为1
	 */
	@ApiField("current_page_num")
	private Long currentPageNum;

	/**
	 * 按投诉时间范围进行查询：时间范围的上界
	 */
	@ApiField("gmt_complaint_end")
	private Date gmtComplaintEnd;

	/**
	 * 按投诉时间范围进行查询：时间范围的下界
	 */
	@ApiField("gmt_complaint_start")
	private Date gmtComplaintStart;

	/**
	 * 按处理时间范围进行查询：时间范围的上界
	 */
	@ApiField("gmt_process_end")
	private Date gmtProcessEnd;

	/**
	 * 按处理时间范围进行查询：时间范围的下界
	 */
	@ApiField("gmt_process_start")
	private Date gmtProcessStart;

	/**
	 * 分页查询每次查询的数据量，不传则默认为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询条件：投诉状态列表
	 */
	@ApiListField("status_list")
	@ApiField("string")
	private List<String> statusList;

	/**
	 * 投诉单号
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 查询条件：投诉单号列表
	 */
	@ApiListField("task_id_list")
	@ApiField("string")
	private List<String> taskIdList;

	/**
	 * 支付宝订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public Long getCurrentPageNum() {
		return this.currentPageNum;
	}
	public void setCurrentPageNum(Long currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

	public Date getGmtComplaintEnd() {
		return this.gmtComplaintEnd;
	}
	public void setGmtComplaintEnd(Date gmtComplaintEnd) {
		this.gmtComplaintEnd = gmtComplaintEnd;
	}

	public Date getGmtComplaintStart() {
		return this.gmtComplaintStart;
	}
	public void setGmtComplaintStart(Date gmtComplaintStart) {
		this.gmtComplaintStart = gmtComplaintStart;
	}

	public Date getGmtProcessEnd() {
		return this.gmtProcessEnd;
	}
	public void setGmtProcessEnd(Date gmtProcessEnd) {
		this.gmtProcessEnd = gmtProcessEnd;
	}

	public Date getGmtProcessStart() {
		return this.gmtProcessStart;
	}
	public void setGmtProcessStart(Date gmtProcessStart) {
		this.gmtProcessStart = gmtProcessStart;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getStatusList() {
		return this.statusList;
	}
	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public List<String> getTaskIdList() {
		return this.taskIdList;
	}
	public void setTaskIdList(List<String> taskIdList) {
		this.taskIdList = taskIdList;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
