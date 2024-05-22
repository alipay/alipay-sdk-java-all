package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻约定BC场景履约事件同步
 *
 * @author auto create
 * @since 1.0, 2022-11-16 15:38:15
 */
public class ZhimaCustomerFulfillmentSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4332949679783513684L;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

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
	 * 芝麻信用service_id,由芝麻信用提供
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 标的变化值
	 */
	@ApiField("subject_delta_num")
	private String subjectDeltaNum;

	/**
	 * 标的ID，比如淘票票场景标识电影ID，公益场景则标识某种类型公益，判断约定内容是否完成均在此标的ID上做计算，若不传则系统取默认配置值
	 */
	@ApiField("subject_id")
	private String subjectId;

	/**
	 * 标的类型枚举，TIMES(次数)/AMT(金额)
	 */
	@ApiField("subject_type")
	private String subjectType;

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

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getSubjectDeltaNum() {
		return this.subjectDeltaNum;
	}
	public void setSubjectDeltaNum(String subjectDeltaNum) {
		this.subjectDeltaNum = subjectDeltaNum;
	}

	public String getSubjectId() {
		return this.subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectType() {
		return this.subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
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
