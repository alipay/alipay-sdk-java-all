package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转化类型查询
 *
 * @author auto create
 * @since 1.0, 2025-05-12 14:24:18
 */
public class AlipayDataDataserviceAdconversionConversiontypeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7216295512122143449L;

	/**
	 * 广告计划id。可通过灯火广告平台或者MAPI获取
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 商家标志。获取方法：<a href="https://opendocs.alipay.com/xlight/0eucvz?pathHash=dc01fadb">principalTag自助获取</a>
	 */
	@ApiField("principal_tag")
	private String principalTag;

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

}
