package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字凭证初始化
 *
 * @author auto create
 * @since 1.0, 2026-09-07 17:11:09
 */
public class DatadigitalFincloudGeneralsaasDigitalcredentialInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 7243931745862527573L;

	/**
	 * 客户生成的业务唯一标识，用于查询用户完成数字凭证授权后生成的凭证单据。
	 */
	@ApiField("biz_id")
	private String bizId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

}
