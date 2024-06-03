package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通代扣属性，当商户使用服务为商户代扣时，需要传入该值
 *
 * @author auto create
 * @since 1.0, 2023-11-08 15:54:29
 */
public class ZFTWithholdingInfo extends AlipayObject {

	private static final long serialVersionUID = 3268678762317678455L;

	/**
	 * 代扣签约场景码
	 */
	@ApiField("sign_scene")
	private String signScene;

	/**
	 * 代扣产品业务模式；
	 */
	@ApiField("withholding_service_feature_name")
	private String withholdingServiceFeatureName;

	public String getSignScene() {
		return this.signScene;
	}
	public void setSignScene(String signScene) {
		this.signScene = signScene;
	}

	public String getWithholdingServiceFeatureName() {
		return this.withholdingServiceFeatureName;
	}
	public void setWithholdingServiceFeatureName(String withholdingServiceFeatureName) {
		this.withholdingServiceFeatureName = withholdingServiceFeatureName;
	}

}
