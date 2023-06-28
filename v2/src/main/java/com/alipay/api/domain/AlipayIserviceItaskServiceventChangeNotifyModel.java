package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发送服务事件变更信息
 *
 * @author auto create
 * @since 1.0, 2023-04-26 17:43:16
 */
public class AlipayIserviceItaskServiceventChangeNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 5514762838328348229L;

	/**
	 * 用户的标识数据，可以是手机号码、身份证号等
	 */
	@ApiField("customer_identity")
	private String customerIdentity;

	/**
	 * 用户标识类型，如手机号，身份证号
	 */
	@ApiField("customer_identity_type")
	private String customerIdentityType;

	/**
	 * 服务备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 机构编号
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 机构名称
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 外部机构侧的服务动作，如，升级专家，转接、完结等
	 */
	@ApiField("out_action_type")
	private String outActionType;

	/**
	 * 站在机构视角，外部的服务ID（蚂蚁的服务ID）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部服务评价结果
	 */
	@ApiField("out_service_assess")
	private String outServiceAssess;

	/**
	 * 外部机构侧服务结束时间；服务结束状态时，不可空
	 */
	@ApiField("out_service_end_time")
	private Date outServiceEndTime;

	/**
	 * 外部机构侧，表示一通服务的唯一ID
	 */
	@ApiField("out_service_record_id")
	private String outServiceRecordId;

	/**
	 * 外部机构服务开始时间；服务开始状态时必填
	 */
	@ApiField("out_service_start_time")
	private Date outServiceStartTime;

	/**
	 * 外部机构侧服务状态
	 */
	@ApiField("out_service_state")
	private String outServiceState;

	/**
	 * 服务类型，如：人工热线，人工在线
	 */
	@ApiField("out_service_type")
	private String outServiceType;

	/**
	 * 用于描述这个服务事件的摘要信息，如：用户反馈某笔交易未到账
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 服务转接来源
	 */
	@ApiField("transfer_source")
	private String transferSource;

	public String getCustomerIdentity() {
		return this.customerIdentity;
	}
	public void setCustomerIdentity(String customerIdentity) {
		this.customerIdentity = customerIdentity;
	}

	public String getCustomerIdentityType() {
		return this.customerIdentityType;
	}
	public void setCustomerIdentityType(String customerIdentityType) {
		this.customerIdentityType = customerIdentityType;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOutActionType() {
		return this.outActionType;
	}
	public void setOutActionType(String outActionType) {
		this.outActionType = outActionType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutServiceAssess() {
		return this.outServiceAssess;
	}
	public void setOutServiceAssess(String outServiceAssess) {
		this.outServiceAssess = outServiceAssess;
	}

	public Date getOutServiceEndTime() {
		return this.outServiceEndTime;
	}
	public void setOutServiceEndTime(Date outServiceEndTime) {
		this.outServiceEndTime = outServiceEndTime;
	}

	public String getOutServiceRecordId() {
		return this.outServiceRecordId;
	}
	public void setOutServiceRecordId(String outServiceRecordId) {
		this.outServiceRecordId = outServiceRecordId;
	}

	public Date getOutServiceStartTime() {
		return this.outServiceStartTime;
	}
	public void setOutServiceStartTime(Date outServiceStartTime) {
		this.outServiceStartTime = outServiceStartTime;
	}

	public String getOutServiceState() {
		return this.outServiceState;
	}
	public void setOutServiceState(String outServiceState) {
		this.outServiceState = outServiceState;
	}

	public String getOutServiceType() {
		return this.outServiceType;
	}
	public void setOutServiceType(String outServiceType) {
		this.outServiceType = outServiceType;
	}

	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTransferSource() {
		return this.transferSource;
	}
	public void setTransferSource(String transferSource) {
		this.transferSource = transferSource;
	}

}
