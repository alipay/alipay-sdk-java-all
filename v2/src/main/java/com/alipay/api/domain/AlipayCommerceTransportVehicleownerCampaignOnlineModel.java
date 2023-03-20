package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主服务营销活动上架接口
 *
 * @author auto create
 * @since 1.0, 2020-01-10 17:34:41
 */
public class AlipayCommerceTransportVehicleownerCampaignOnlineModel extends AlipayObject {

	private static final long serialVersionUID = 3349633851216469319L;

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
	 * 外部订单号,商户端唯一
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
