package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融贴息方案查询接口
 *
 * @author auto create
 * @since 1.0, 2021-04-27 11:35:57
 */
public class MybankCreditSceneprodDiscountplanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7466192812678595969L;

	/**
	 * 合作机构编码，由网商分配
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * 外部站点，比如：ALIPAY：支付宝站点，MYBANK：银行会员，B2B_CN：B2B中文站，B2B_EN：B2B国际站，TAOBAO：淘宝
	 */
	@ApiField("site")
	private String site;

	/**
	 * 外部站点的userid，与site有关，如site为MYBANK时这里需要填写网商会员号
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
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
