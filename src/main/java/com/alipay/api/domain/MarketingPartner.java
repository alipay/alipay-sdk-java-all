package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 委托营销合作方相关信息
 *
 * @author auto create
 * @since 1.0, 2022-04-20 16:51:22
 */
public class MarketingPartner extends AlipayObject {

	private static final long serialVersionUID = 7757618966326617757L;

	/**
	 * 行业合作方案ID，合作方类别为INDUSTRY_PLAN时必传。
暂未开放
	 */
	@ApiField("industry_plan_id")
	private String industryPlanId;

	/**
	 * 合作方商户ID，合作方类别为MERCHANT时必填。
限制:
1.当前只支持直连商户
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 合作方APPID，合作方类别为APPID时必填。
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 合作方类别，枚举值：
APPID：合作方为APPID
MERCHANT：合作方为商户
NDUSTRY_PLAN:行业合作方案(暂未开放)
	 */
	@ApiField("type")
	private String type;

	public String getIndustryPlanId() {
		return this.industryPlanId;
	}
	public void setIndustryPlanId(String industryPlanId) {
		this.industryPlanId = industryPlanId;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
