package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.HealthCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.digitalidentity.healthcard.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 19:48:41
 */
public class AlipayUserDigitalidentityHealthcardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8756613338257472586L;

	/** 
	 * 健康卡输出聚合信息
	 */
	@ApiField("health_card_info")
	private HealthCardInfo healthCardInfo;

	public void setHealthCardInfo(HealthCardInfo healthCardInfo) {
		this.healthCardInfo = healthCardInfo;
	}
	public HealthCardInfo getHealthCardInfo( ) {
		return this.healthCardInfo;
	}

}
