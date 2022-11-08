package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群列表查询
 *
 * @author auto create
 * @since 1.0, 2022-06-27 21:21:35
 */
public class DatadigitalFincloudFinsaasCrowdListBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8597893458888295767L;

	/**
	 * 操作人ID+唯一+人群列表查询
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 页数+不唯一+人群列表查询
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小+不唯一+人群列表查询
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 人群名称+不唯一+人群列表查询
	 */
	@ApiField("query_key")
	private String queryKey;

	/**
	 * 人群状态+不唯一+人群列表查询
	 */
	@ApiField("status")
	private String status;

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
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

	public String getQueryKey() {
		return this.queryKey;
	}
	public void setQueryKey(String queryKey) {
		this.queryKey = queryKey;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
