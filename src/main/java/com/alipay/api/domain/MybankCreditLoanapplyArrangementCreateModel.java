package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商银行融资平台协议签署接口
 *
 * @author auto create
 * @since 1.0, 2018-12-27 11:52:17
 */
public class MybankCreditLoanapplyArrangementCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6652127932366868563L;

	/**
	 * 产品代码，scene字段为空时必填，标识网商银行具体的产品，由网商银行预先分配好，接入方按网商银行的要求送。
	 */
	@ApiField("ar_pd_code")
	private String arPdCode;

	/**
	 * 扩展信息,JSON结构。具体需要送的内容需要根据业务场景定制。目前是备用，调用方不需要送值。
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 客户id，网商银行唯一标识一个客户的id。scene值为ENTRUST_ACCOUNT时可空，其他场景必填，此客户id是通过客户创建接口返回的。即调用此接口前必须先调用客户创建接口。
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 客户角色id，网商银行唯一标识一个客户角色的id。此客户id是通过客户创建接口返回的。即调用此接口前必须先调用客户创建接口。客户角色id+产品代码唯一确定一笔签约。
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 签约场景码，ar_pd_code为空时必填，例如：
ENTRUST_ACCOUNT：受托账户签约；
CREDIT_AUTH：征信授权签约；
INVESTIGATION_AUTH：信息调查授权；
SUPPLYCHAIN_BUYER：供应链买家协议；
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 站点类型，当前只支持ALIPAY。后续扩展可以支持TAOBAO等。目前这个字段必须传递ALIPAY。
	 */
	@ApiField("site")
	private String site;

	/**
	 * 站点数字id，例如支付宝id、淘宝id。接入方通过客户的支付宝或淘宝账号获取对应的userId。当site为ALIPAY时，site_user_id必须是支付宝userid
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public String getArPdCode() {
		return this.arPdCode;
	}
	public void setArPdCode(String arPdCode) {
		this.arPdCode = arPdCode;
	}

	public String getExtData() {
		return this.extData;
	}
	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
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
