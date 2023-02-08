package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付解约接口
 *
 * @author auto create
 * @since 1.0, 2023-01-12 14:23:22
 */
public class MybankCreditLoantradePaySignCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5763415962267163386L;

	/**
	 * 支付宝ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 站点
	 */
	@ApiField("site")
	private String site;

	/**
	 * 站点用户ID
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	/**
	 * 子业务场景
	 */
	@ApiField("sub_biz_scene")
	private String subBizScene;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
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

	public String getSubBizScene() {
		return this.subBizScene;
	}
	public void setSubBizScene(String subBizScene) {
		this.subBizScene = subBizScene;
	}

}
