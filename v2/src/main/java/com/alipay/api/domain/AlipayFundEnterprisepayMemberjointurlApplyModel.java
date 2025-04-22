package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取企业邀请员工二维码链接
 *
 * @author auto create
 * @since 1.0, 2025-04-07 17:02:05
 */
public class AlipayFundEnterprisepayMemberjointurlApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6698391176914611889L;

	/**
	 * 共同账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 必填，如有不填协议号的需求，请联系支付宝同学
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 业务场景，联系支付宝分配
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 二维码链接的过期时间，以天为单位，传入的必须是正整数。默认最长过期时间为365天，如果有需要更改最长过期时间的，联系支付宝分配；
过期时间从当天的23:59:59分开始算。如在1号任意时间申请二维码链接且过期时间1天，那么到期时间为2号23:59:59
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
