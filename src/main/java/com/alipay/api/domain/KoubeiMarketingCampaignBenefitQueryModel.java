package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑权益查询接口
 *
 * @author auto create
 * @since 1.0, 2018-09-19 14:16:23
 */
public class KoubeiMarketingCampaignBenefitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6789228197453284488L;

	/**
	 * 权益id
	 */
	@ApiField("benefit_id")
	private String benefitId;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

}
