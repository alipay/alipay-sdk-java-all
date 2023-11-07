package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动报名接口
 *
 * @author auto create
 * @since 1.0, 2018-09-01 09:21:05
 */
public class AntMerchantExpandActivitySignupCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3371379215354669698L;

	/**
	 * 参数名：活动标识
应用场景：天猫小二帮某商家报名活动
如何获取：该活动code需要由活动中心新增活动后运营提供给天猫。
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 报名信息扩展字段,可为空，具体传参由开发约定
	 */
	@ApiField("ext_info")
	private String extInfo;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

}
