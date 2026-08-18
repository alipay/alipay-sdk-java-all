package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV同步样本检测子单信息
 *
 * @author auto create
 * @since 1.0, 2026-08-13 15:57:48
 */
public class AlipayCommerceMedicalFulfillmentSampletestSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5228634385113865742L;

	/**
	 * 履约单号
	 */
	@ApiField("fulfillment_id")
	private String fulfillmentId;

	/**
	 * 关联订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 事件数据
	 */
	@ApiField("sample_status")
	private String sampleStatus;

	/**
	 * 样本状态变更时间，格式：yyyy-MM-dd hh:mm:ss
	 */
	@ApiField("sample_status_time")
	private String sampleStatusTime;

	/**
	 * 履约类型
	 */
	@ApiField("type")
	private String type;

	public String getFulfillmentId() {
		return this.fulfillmentId;
	}
	public void setFulfillmentId(String fulfillmentId) {
		this.fulfillmentId = fulfillmentId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSampleStatus() {
		return this.sampleStatus;
	}
	public void setSampleStatus(String sampleStatus) {
		this.sampleStatus = sampleStatus;
	}

	public String getSampleStatusTime() {
		return this.sampleStatusTime;
	}
	public void setSampleStatusTime(String sampleStatusTime) {
		this.sampleStatusTime = sampleStatusTime;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
