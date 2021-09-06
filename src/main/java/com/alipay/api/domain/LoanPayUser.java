package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户信息
 *
 * @author auto create
 * @since 1.0, 2018-10-25 15:25:04
 */
public class LoanPayUser extends AlipayObject {

	private static final long serialVersionUID = 1272815719951435435L;

	/**
	 * 支付宝Id,无需脱敏
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 1.ALIPAY(支付宝)，2.TAOBAO(淘宝)，3.CBU(中文站)，4.ICBU(国际站)
	 */
	@ApiField("site")
	private String site;

	/**
	 * 站点用户id
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
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
