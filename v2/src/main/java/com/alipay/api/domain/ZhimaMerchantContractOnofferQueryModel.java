package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻约定按发约单号查询合约接口	
 *
 * @author auto create
 * @since 1.0, 2021-05-17 10:39:20
 */
public class ZhimaMerchantContractOnofferQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2744458223916319713L;

	/**
	 * 发约单单号
	 */
	@ApiField("offer_no")
	private String offerNo;

	/**
	 * 应约者id(淘宝id/支付宝user_id)
	 */
	@ApiField("sign_principal_id")
	private String signPrincipalId;

	/**
	 * 应约者类型:ZHIMA_ROLE:芝麻用户 ALIPAY_ROLE:支付宝用户 TAOBAO_ROLE:淘宝用户
	 */
	@ApiField("sign_principal_type")
	private String signPrincipalType;

	public String getOfferNo() {
		return this.offerNo;
	}
	public void setOfferNo(String offerNo) {
		this.offerNo = offerNo;
	}

	public String getSignPrincipalId() {
		return this.signPrincipalId;
	}
	public void setSignPrincipalId(String signPrincipalId) {
		this.signPrincipalId = signPrincipalId;
	}

	public String getSignPrincipalType() {
		return this.signPrincipalType;
	}
	public void setSignPrincipalType(String signPrincipalType) {
		this.signPrincipalType = signPrincipalType;
	}

}
