package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻约定行为反馈
 *
 * @author auto create
 * @since 1.0, 2022-11-14 17:55:36
 */
public class ZhimaCustomerBehaviorSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3578927752191775526L;

	/**
	 * 反馈行为
	 */
	@ApiListField("behavior")
	@ApiField("string")
	private List<String> behavior;

	/**
	 * 行为所携带的内容,fulfillment:{"subjectDeltaNum":"1","subjectType":"subject"}
	 */
	@ApiField("behavior_content")
	private String behaviorContent;

	/**
	 * 约定编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 业务发生时间
	 */
	@ApiField("gmt_service")
	private Date gmtService;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 主体类型B或者C
	 */
	@ApiField("principal_type")
	private String principalType;

	/**
	 * 芝麻信用service_id,由芝麻信用提供
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 芝麻信用service_id,由芝麻信用提供
	 */
	@ApiField("subject_id")
	private String subjectId;

	/**
	 * 外部订单号，商户请求的唯一标志，64位长度的字母数字下划线组合。该标识作为对账的关键信息，商户要保证其唯一性
	 */
	@ApiField("transaction_id")
	private String transactionId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getBehavior() {
		return this.behavior;
	}
	public void setBehavior(List<String> behavior) {
		this.behavior = behavior;
	}

	public String getBehaviorContent() {
		return this.behaviorContent;
	}
	public void setBehaviorContent(String behaviorContent) {
		this.behaviorContent = behaviorContent;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public Date getGmtService() {
		return this.gmtService;
	}
	public void setGmtService(Date gmtService) {
		this.gmtService = gmtService;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getSubjectId() {
		return this.subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
