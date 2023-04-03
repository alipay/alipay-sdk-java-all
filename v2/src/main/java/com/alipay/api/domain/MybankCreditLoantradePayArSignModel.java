package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用支付统一签约接口
 *
 * @author auto create
 * @since 1.0, 2023-01-12 14:24:25
 */
public class MybankCreditLoantradePayArSignModel extends AlipayObject {

	private static final long serialVersionUID = 5734652821231457986L;

	/**
	 * 用户支付宝ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 签约动态参数
	 */
	@ApiField("sign_param")
	private String signParam;

	/**
	 * 客户授信基于什么维度产出，并不一定淘宝客户就写TAOBAO，要看具体情况
ALIPAY=支付宝
TAOBAO=淘系
	 */
	@ApiField("site")
	private String site;

	/**
	 * 根据站点的用户id，如果站点是淘宝或者天猫卖家，此处当填sellerId
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	/**
	 * 业务子场景
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

	public String getSignParam() {
		return this.signParam;
	}
	public void setSignParam(String signParam) {
		this.signParam = signParam;
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
