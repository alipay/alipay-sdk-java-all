package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户子活动状态同步
 *
 * @author auto create
 * @since 1.0, 2024-11-29 15:43:53
 */
public class AlipayOfflineProviderNpromoactivityStatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1324949118336976738L;

	/**
	 * 子活动推进业务时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 提前推进附言
	 */
	@ApiField("in_advance_ps")
	private String inAdvancePs;

	/**
	 * 提前推进原因编码
	 */
	@ApiField("in_advance_reason_code")
	private String inAdvanceReasonCode;

	/**
	 * 操作类型，用于区分正常按期推进活动还是提前推进活动。
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 子活动的状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户单期子活动的id
	 */
	@ApiField("sub_activity_id")
	private String subActivityId;

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getInAdvancePs() {
		return this.inAdvancePs;
	}
	public void setInAdvancePs(String inAdvancePs) {
		this.inAdvancePs = inAdvancePs;
	}

	public String getInAdvanceReasonCode() {
		return this.inAdvanceReasonCode;
	}
	public void setInAdvanceReasonCode(String inAdvanceReasonCode) {
		this.inAdvanceReasonCode = inAdvanceReasonCode;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubActivityId() {
		return this.subActivityId;
	}
	public void setSubActivityId(String subActivityId) {
		this.subActivityId = subActivityId;
	}

}
