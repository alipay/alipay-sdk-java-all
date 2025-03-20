package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务监管账户查询
 *
 * @author auto create
 * @since 1.0, 2024-05-30 10:14:17
 */
public class AlipayEbppIndustrySupervisionAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2155982849157949655L;

	/**
	 * 子户账户户号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 不同的业务场景下对应不同的业务规则
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 企业支付宝的uid 对应open_id 用于查询对应的监管子户
	 */
	@ApiField("merchant_alipay_open_id")
	private String merchantAlipayOpenId;

	/**
	 * 企业支付宝中的uid 用于查询对应的监管子户
	 */
	@ApiField("merchant_alipay_uid")
	private String merchantAlipayUid;

	/**
	 * 协会、商户在银行侧自行创建的结算户账户户号
	 */
	@ApiField("parent_ext_account_no")
	private String parentExtAccountNo;

	/**
	 * 本次在银行侧创建的子户账户类型。根据业务诉求选择对应账户类型
	 */
	@ApiField("sub_account_type")
	private String subAccountType;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getMerchantAlipayOpenId() {
		return this.merchantAlipayOpenId;
	}
	public void setMerchantAlipayOpenId(String merchantAlipayOpenId) {
		this.merchantAlipayOpenId = merchantAlipayOpenId;
	}

	public String getMerchantAlipayUid() {
		return this.merchantAlipayUid;
	}
	public void setMerchantAlipayUid(String merchantAlipayUid) {
		this.merchantAlipayUid = merchantAlipayUid;
	}

	public String getParentExtAccountNo() {
		return this.parentExtAccountNo;
	}
	public void setParentExtAccountNo(String parentExtAccountNo) {
		this.parentExtAccountNo = parentExtAccountNo;
	}

	public String getSubAccountType() {
		return this.subAccountType;
	}
	public void setSubAccountType(String subAccountType) {
		this.subAccountType = subAccountType;
	}

}
