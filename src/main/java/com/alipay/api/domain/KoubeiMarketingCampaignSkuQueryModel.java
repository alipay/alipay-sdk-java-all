package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑活动sku查询接口
 *
 * @author auto create
 * @since 1.0, 2017-11-03 15:21:35
 */
public class KoubeiMarketingCampaignSkuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8594499858396954137L;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 模板号
	 */
	@ApiField("template_no")
	private String templateNo;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getTemplateNo() {
		return this.templateNo;
	}
	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
	}

}
