package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 委托营销授权资源信息
 *
 * @author auto create
 * @since 1.0, 2022-04-20 16:51:42
 */
public class MarketingAuthorizedData extends AlipayObject {

	private static final long serialVersionUID = 8634559728776898912L;

	/**
	 * 营销活动ID，当type=PROMO_ACTIVITY即授权业务类别为营销活动时该值必填
限制:
1.当前只支持B、P站或openapi创建的支付券或商家券活动
2.部分通过报名招商方案创建的活动不支持授权给其他合作方。
3.活动的创建服务商和归属商户都可以调用接口发起授权

商家券文档:https://open.alipay.com/api/detail?abilityCode=AM010501000000089657
支付券:https://market.alipay.com/page.htm?_cpage=activity
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 授权业务类别，枚举值：
PROMO_ACTIVITY:营销活动
	 */
	@ApiField("type")
	private String type;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
