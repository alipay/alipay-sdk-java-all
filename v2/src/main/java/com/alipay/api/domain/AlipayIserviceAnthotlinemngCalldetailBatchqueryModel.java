package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 热线渠道通话详情批量查询
 *
 * @author auto create
 * @since 1.0, 2023-12-11 10:40:59
 */
public class AlipayIserviceAnthotlinemngCalldetailBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1761354694635966275L;

	/**
	 * 业务码 ，用于校验业务权限
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 用作业务权限验签
	 */
	@ApiField("biz_sign")
	private String bizSign;

	/**
	 * 被叫号码过滤
	 */
	@ApiField("called_number")
	private String calledNumber;

	/**
	 * 按主叫号码过滤。
	 */
	@ApiField("calling_number")
	private String callingNumber;

	/**
	 * 通话id
	 */
	@ApiField("contact_id")
	private String contactId;

	/**
	 * 按通话类型过滤。
枚举值：
● Outbound：呼出。
● Back2Back：双呼。
● PrivacyDial：加密通话。
● Internal：内部呼叫。
● Predictive：预测式外呼。
● Inbound：呼入。
● Conference：会议。
	 */
	@ApiField("contact_type")
	private String contactType;

	/**
	 * 获取的历史数据的终止时间，默认为当前时间，格式为Unix时间戳，单位毫秒。
	 */
	@ApiField("end_time")
	private Long endTime;

	/**
	 * 热线渠道服务实例id
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 分页页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 排序方式，非必填，默认为降序。
枚举值：
● ASC：升序。
● DESC：降序。
	 */
	@ApiField("sort_order")
	private String sortOrder;

	/**
	 * 获取的历史数据的起始时间，默认为当天的0时，格式为Unix时间戳，单位毫秒。
	 */
	@ApiField("start_time")
	private Long startTime;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizSign() {
		return this.bizSign;
	}
	public void setBizSign(String bizSign) {
		this.bizSign = bizSign;
	}

	public String getCalledNumber() {
		return this.calledNumber;
	}
	public void setCalledNumber(String calledNumber) {
		this.calledNumber = calledNumber;
	}

	public String getCallingNumber() {
		return this.callingNumber;
	}
	public void setCallingNumber(String callingNumber) {
		this.callingNumber = callingNumber;
	}

	public String getContactId() {
		return this.contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getContactType() {
		return this.contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public Long getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
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

	public String getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public Long getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

}
