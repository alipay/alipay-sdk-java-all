package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询小助手快捷服务
 *
 * @author auto create
 * @since 1.0, 2024-08-13 16:34:27
 */
public class AlipayMerchantGroupAssistantServiceBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6378751159534318232L;

	/**
	 * 快捷服务名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页查询条数，最大50条
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 小助手消息状态 INIT (初始化), AUDITING (审核中), DENY (审核驳回), VALID (生效), INVALID (失效);
	 */
	@ApiField("status")
	private String status;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
