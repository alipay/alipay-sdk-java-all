package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家银行托管账户开通接口
 *
 * @author auto create
 * @since 1.0, 2026-04-03 11:42:44
 */
public class AlipayCommerceLifeserviceBankaccountApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3154912594837967728L;

	/**
	 * 默认 false，设置为 true 的时候会忽略 brand 和 site
	 */
	@ApiField("auto_brand_site")
	private Boolean autoBrandSite;

	/**
	 * 指定本次请求所属的品牌业务线
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 商家账号 2088
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 指定品牌下的具体业务站点。该字段取值范围依赖于 brand的输入。
	 */
	@ApiField("site")
	private String site;

	public Boolean getAutoBrandSite() {
		return this.autoBrandSite;
	}
	public void setAutoBrandSite(Boolean autoBrandSite) {
		this.autoBrandSite = autoBrandSite;
	}

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

}
