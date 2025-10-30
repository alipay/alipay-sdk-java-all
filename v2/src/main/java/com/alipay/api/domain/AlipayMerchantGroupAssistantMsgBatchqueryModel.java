package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小助手定向消息发送记录列表批量查询
 *
 * @author auto create
 * @since 1.0, 2024-09-11 15:37:15
 */
public class AlipayMerchantGroupAssistantMsgBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1532264752958356947L;

	/**
	 * 小助手类型列表，目前支持 activity_recommend (自定义活动)、benefit_recommend（优惠券推荐）
	 */
	@ApiListField("biz_type_list")
	@ApiField("string")
	private List<String> bizTypeList;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页查询条数，最大50条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 小助手消息状态 

INIT (初始化), 
AUDITING (审核中), 
DENY (审核驳回), 
PENDING (待生效), 
VALID (生效), 
INVALID (失效), 
DELETED (删除);
	 */
	@ApiField("status")
	private String status;

	public List<String> getBizTypeList() {
		return this.bizTypeList;
	}
	public void setBizTypeList(List<String> bizTypeList) {
		this.bizTypeList = bizTypeList;
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
