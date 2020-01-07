package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用承诺消费活动修改接口
 *
 * @author auto create
 * @since 1.0, 2019-12-21 12:06:09
 */
public class ZhimaMerchantActivityModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5244742698595542897L;

	/**
	 * 对活动的操作类型，合法的操作类型必须在如下枚举中，当前有：
FINISH - 结束活动.
	 */
	@ApiField("action")
	private String action;

	/**
	 * 活动号，取活动创建接口zhima.credit.pe.promise.activity.create的返回值
	 */
	@ApiField("activity_no")
	private String activityNo;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getActivityNo() {
		return this.activityNo;
	}
	public void setActivityNo(String activityNo) {
		this.activityNo = activityNo;
	}

}
