package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT外部商户内容查询
 *
 * @author auto create
 * @since 1.0, 2022-10-24 15:46:10
 */
public class AlipayOpenIotContentBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7345756646163453412L;

	/**
	 * 分页页号，从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询条件，根据不同场景可能有所不同
	 */
	@ApiField("query_condition")
	private String queryCondition;

	/**
	 * 请求ID，标识唯一一次请求，串联调用方的内部链路
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 场景码，用于指定当前查询数据所属的业务场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

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

	public String getQueryCondition() {
		return this.queryCondition;
	}
	public void setQueryCondition(String queryCondition) {
		this.queryCondition = queryCondition;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
