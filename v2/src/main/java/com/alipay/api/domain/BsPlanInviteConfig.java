package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联营-计划-邀约配置
 *
 * @author auto create
 * @since 1.0, 2023-04-17 20:20:44
 */
public class BsPlanInviteConfig extends AlipayObject {

	private static final long serialVersionUID = 7795754639377749568L;

	/**
	 * 计划报名、邀约结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 计划报名、邀约开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
