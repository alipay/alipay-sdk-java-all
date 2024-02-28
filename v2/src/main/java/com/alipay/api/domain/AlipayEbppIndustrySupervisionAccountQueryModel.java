package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务监管账户查询
 *
 * @author auto create
 * @since 1.0, 2023-03-28 13:51:33
 */
public class AlipayEbppIndustrySupervisionAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6543453482444223536L;

	/**
	 * 业务场景 + 待开通子户类型。 确定开通的子户账号
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 驾校在支付宝中的uid 对应open_id 用于创建对应驾校的监管子户
	 */
	@ApiField("merchant_alipay_open_id")
	private String merchantAlipayOpenId;

	/**
	 * 驾校在支付宝中的uid 用于创建对应驾校的监管子户
	 */
	@ApiField("merchant_alipay_uid")
	private String merchantAlipayUid;

	/**
	 * 待开子户的关联账户号。 驾校在网商申请的最终结算户。
	 */
	@ApiField("parent_ext_account_no")
	private String parentExtAccountNo;

	/**
	 * 业务场景+ 开通子户类型 biz_scene +sub_account_type 最终确定唯一的对应子户。
	 */
	@ApiField("sub_account_type")
	private String subAccountType;

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
