package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻约定应约接口
 *
 * @author auto create
 * @since 1.0, 2020-03-18 19:58:11
 */
public class ZhimaMerchantContractCommonConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 2314346823442942485L;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 发约单单号
	 */
	@ApiField("offer_no")
	private String offerNo;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

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

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOfferNo() {
		return this.offerNo;
	}
	public void setOfferNo(String offerNo) {
		this.offerNo = offerNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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
