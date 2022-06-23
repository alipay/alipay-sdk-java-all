package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付引导视图
 *
 * @author auto create
 * @since 1.0, 2020-08-06 10:50:10
 */
public class CreditPayGuideVO extends AlipayObject {

	private static final long serialVersionUID = 5573958743876389712L;

	/**
	 * json字符串，表示引导信息
	 */
	@ApiField("guide_param")
	private String guideParam;

	/**
	 * 是否需要引导
	 */
	@ApiField("need_guide")
	private Boolean needGuide;

	public String getGuideParam() {
		return this.guideParam;
	}
	public void setGuideParam(String guideParam) {
		this.guideParam = guideParam;
	}

	public Boolean getNeedGuide() {
		return this.needGuide;
	}
	public void setNeedGuide(Boolean needGuide) {
		this.needGuide = needGuide;
	}

}
