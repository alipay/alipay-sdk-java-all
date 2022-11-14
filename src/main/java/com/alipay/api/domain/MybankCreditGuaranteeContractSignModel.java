package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 担保服务开通
 *
 * @author auto create
 * @since 1.0, 2022-02-15 15:26:16
 */
public class MybankCreditGuaranteeContractSignModel extends AlipayObject {

	private static final long serialVersionUID = 2738596368456348332L;

	/**
	 * 支付宝ID
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * Havana ID
	 */
	@ApiField("havana_id")
	private String havanaId;

	/**
	 * 会员站点：AE:速卖通，ALIPAY:支付宝，MYBANK:网商银行，TAOBAO：淘宝，B2B_CN：中文站，B2B_EN：国际站
	 */
	@ApiField("site")
	private String site;

	/**
	 * 会员站点ID
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public String getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getHavanaId() {
		return this.havanaId;
	}
	public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSiteUserId() {
		return this.siteUserId;
	}
	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}

}
