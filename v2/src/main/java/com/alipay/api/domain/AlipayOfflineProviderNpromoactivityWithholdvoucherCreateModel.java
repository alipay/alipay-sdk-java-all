package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建子活动代扣单
 *
 * @author auto create
 * @since 1.0, 2026-08-18 14:21:52
 */
public class AlipayOfflineProviderNpromoactivityWithholdvoucherCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8773164972463423861L;

	/**
	 * 创建代扣单业务时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

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

	public String getSubActivityId() {
		return this.subActivityId;
	}
	public void setSubActivityId(String subActivityId) {
		this.subActivityId = subActivityId;
	}

}
