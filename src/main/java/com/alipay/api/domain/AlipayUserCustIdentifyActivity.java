package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * alipay.user.customer.identify接口专用结果对象，维护接口查询结果中的活动信息
 *
 * @author auto create
 * @since 1.0, 2017-06-22 16:42:37
 */
public class AlipayUserCustIdentifyActivity extends AlipayObject {

	private static final long serialVersionUID = 8574611641384353668L;

	/**
	 * 活动扩展信息，预留字段。例如通过连接引导参加运营活动，包含活动链接（或者参与方式）及活动信息。
	 */
	@ApiField("activity_info")
	private String activityInfo;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	public String getActivityInfo() {
		return this.activityInfo;
	}
	public void setActivityInfo(String activityInfo) {
		this.activityInfo = activityInfo;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

}
