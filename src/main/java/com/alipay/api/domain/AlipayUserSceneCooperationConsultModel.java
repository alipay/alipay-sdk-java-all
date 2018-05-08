package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝用户场景合作咨询
 *
 * @author auto create
 * @since 1.0, 2018-03-14 17:13:54
 */
public class AlipayUserSceneCooperationConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2434499179143537661L;

	/**
	 * 用户主体信息。要求AlipayUserPrincipalInfo中的user_id、mobile(不加国家码)、email属性，有且只有一个非空。否则接口会忽略除去优先级最高的属性之外的其他属性。user_id优先级最高，mobile次之，email最后
	 */
	@ApiField("principal")
	private AlipayUserPrincipalInfo principal;

	/**
	 * 商户的场景定义，需要支付宝对接入场景进行配置。
	 */
	@ApiField("scene")
	private String scene;

	public AlipayUserPrincipalInfo getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(AlipayUserPrincipalInfo principal) {
		this.principal = principal;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
