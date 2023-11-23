package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景支付参与者业务参数模型
 *
 * @author auto create
 * @since 1.0, 2023-09-20 13:55:06
 */
public class ScenePayParticipantBizParamDTO extends AlipayObject {

	private static final long serialVersionUID = 7546186659829699666L;

	/**
	 * 由各业务场景定义，具体参考场景解决方案接入文档
	 */
	@ApiField("authorization_id")
	private String authorizationId;

	/**
	 * 外部卡号
	 */
	@ApiField("out_card_no")
	private String outCardNo;

	public String getAuthorizationId() {
		return this.authorizationId;
	}
	public void setAuthorizationId(String authorizationId) {
		this.authorizationId = authorizationId;
	}

	public String getOutCardNo() {
		return this.outCardNo;
	}
	public void setOutCardNo(String outCardNo) {
		this.outCardNo = outCardNo;
	}

}
