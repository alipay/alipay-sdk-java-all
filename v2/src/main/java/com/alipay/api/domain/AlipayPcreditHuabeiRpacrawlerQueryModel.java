package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * RPA业务查询
 *
 * @author auto create
 * @since 1.0, 2021-03-08 15:16:19
 */
public class AlipayPcreditHuabeiRpacrawlerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5239586492566221356L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 功能类型，区分接口内部业务类型（queryInitDeliveryList,updateDeliveryPublish,updateDeliveryOffline）
	 */
	@ApiField("function_type")
	private String functionType;

	/**
	 * 记录offset，function_type=queryInitDeliveryList参数有值
	 */
	@ApiField("offset")
	private Long offset;

	/**
	 * 外部业务号，更新任务状态时赋值为投放单元code值
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 查询列表最大返回记录数，function_type=queryInitDeliveryList参数有值
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询条件列表
	 */
	@ApiListField("query_criteria")
	@ApiField("rpa_crawler_query_criteria_v_o")
	private List<RpaCrawlerQueryCriteriaVO> queryCriteria;

	/**
	 * 同步任务结果状态
	 */
	@ApiField("sync_task_status")
	private String syncTaskStatus;

	/**
	 * 任务ID，同步单元成功和下线单元成功后需要传该参数
	 */
	@ApiField("task_id")
	private String taskId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getFunctionType() {
		return this.functionType;
	}
	public void setFunctionType(String functionType) {
		this.functionType = functionType;
	}

	public Long getOffset() {
		return this.offset;
	}
	public void setOffset(Long offset) {
		this.offset = offset;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<RpaCrawlerQueryCriteriaVO> getQueryCriteria() {
		return this.queryCriteria;
	}
	public void setQueryCriteria(List<RpaCrawlerQueryCriteriaVO> queryCriteria) {
		this.queryCriteria = queryCriteria;
	}

	public String getSyncTaskStatus() {
		return this.syncTaskStatus;
	}
	public void setSyncTaskStatus(String syncTaskStatus) {
		this.syncTaskStatus = syncTaskStatus;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
