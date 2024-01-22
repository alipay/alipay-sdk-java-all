package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT商家自发券查询
 *
 * @author auto create
 * @since 1.0, 2021-07-20 13:55:43
 */
public class AlipayOpenContentIotCouponQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4535976668644361795L;

	/**
	 * 活动ID，用于获取相应的活动信息，来源于商家在B站的配置
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 配置商家发券时使用的商家信息，需要和进入商家中心（B站）时使用的相同
	 */
	@ApiField("auth_pid")
	private String authPid;

	/**
	 * 刷脸token，用于获取用户相关信息，来源于刷脸成功返回的一次性消费码
	 */
	@ApiField("ftoken")
	private String ftoken;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getAuthPid() {
		return this.authPid;
	}
	public void setAuthPid(String authPid) {
		this.authPid = authPid;
	}

	public String getFtoken() {
		return this.ftoken;
	}
	public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}

}
