package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灯火广告定向已转化事件查询
 *
 * @author auto create
 * @since 1.0, 2025-05-12 11:28:00
 */
public class AlipayDataDataserviceAdtargetConvertedeventBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5279558741172569994L;

	/**
	 * 该参数表明计划id，可通过计划查询接口获取，或通过计划创建接口的返回值中获取
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 该参数为灯火商家唯一标识
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 该参数表明排除已转化人群可选择的转化事件的查询维度，包括同计划、同账户
同主体和同商品。
	 */
	@ApiField("scope")
	private String scope;

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getScope() {
		return this.scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}

}
