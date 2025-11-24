package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兑换券核销接口
 *
 * @author auto create
 * @since 1.0, 2025-09-16 10:59:51
 */
public class AlipayMarketingExchangevoucherUseModel extends AlipayObject {

	private static final long serialVersionUID = 4225831378679995953L;

	/**
	 * 业务上下文
	 */
	@ApiField("biz_context")
	private String bizContext;

	/**
	 * 是否需要校验规则
	 */
	@ApiField("need_rule_check")
	private Boolean needRuleCheck;

	/**
	 * 支付宝用户ID(映射的openId) ，必须保证待使用的券ID归属于该支付宝用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号，用户幂等控制。相同voucher_id和out_biz_no被认为是同一次核销
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝用户ID ，必须保证待使用的券ID归属于该支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 待使用的券id ，来自发券接口alipay.marketing.voucher.send
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getBizContext() {
		return this.bizContext;
	}
	public void setBizContext(String bizContext) {
		this.bizContext = bizContext;
	}

	public Boolean getNeedRuleCheck() {
		return this.needRuleCheck;
	}
	public void setNeedRuleCheck(Boolean needRuleCheck) {
		this.needRuleCheck = needRuleCheck;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
