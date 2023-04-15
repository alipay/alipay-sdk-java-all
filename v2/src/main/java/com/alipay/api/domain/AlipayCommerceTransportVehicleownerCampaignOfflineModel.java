package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销活动接口(下架)
 *
 * @author auto create
 * @since 1.0, 2020-01-10 17:34:52
 */
public class AlipayCommerceTransportVehicleownerCampaignOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 6541219535227951321L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 业务类型
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部流水号
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

}
