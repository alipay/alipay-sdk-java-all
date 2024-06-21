package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份验真预咨询服务
 *
 * @author auto create
 * @since 1.0, 2024-03-15 15:21:50
 */
public class ZhimaCustomerJobworthAuthenticationPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 3463323386629893662L;

	/**
	 * 身份类型
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 验真订单id
	 */
	@ApiField("once_token")
	private String onceToken;

	/**
	 * 用户的授权单号，与一次用户授权结果绑定
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	/**
	 * 验真精度
	 */
	@ApiField("query_type")
	private String queryType;

	/**
	 * 商户入驻芝麻的标识
	 */
	@ApiField("zm_service_id")
	private String zmServiceId;

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getOnceToken() {
		return this.onceToken;
	}
	public void setOnceToken(String onceToken) {
		this.onceToken = onceToken;
	}

	public String getOutAgreementNo() {
		return this.outAgreementNo;
	}
	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getZmServiceId() {
		return this.zmServiceId;
	}
	public void setZmServiceId(String zmServiceId) {
		this.zmServiceId = zmServiceId;
	}

}
