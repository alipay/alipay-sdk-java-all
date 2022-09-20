package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家服务活动平台活动资格查询
 *
 * @author auto create
 * @since 1.0, 2019-07-24 13:02:01
 */
public class AntMerchantExpandActivityQualificationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1566889542418626719L;

	/**
	 * 商家活动平台活动编码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 业务扩展信息
	 */
	@ApiField("biz_ext")
	private String bizExt;

	/**
	 * 外部业务时间
	 */
	@ApiField("out_biz_time")
	private String outBizTime;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getBizExt() {
		return this.bizExt;
	}
	public void setBizExt(String bizExt) {
		this.bizExt = bizExt;
	}

	public String getOutBizTime() {
		return this.outBizTime;
	}
	public void setOutBizTime(String outBizTime) {
		this.outBizTime = outBizTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
