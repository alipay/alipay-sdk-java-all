package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AgreementTextInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.service.sign.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:12
 */
public class AlipayTradeServiceSignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3372395413284547427L;

	/** 
	 * 如果协议未签约时，会返回协议文本对应的标题和URL
	 */
	@ApiListField("agreement_text_infos")
	@ApiField("agreement_text_info")
	private List<AgreementTextInfo> agreementTextInfos;

	/** 
	 * 产品是否已经签约。
已签约-SIGNED
未签约-UNSIGNED
未签约且未开通网商二类户-UNSIGNED_UNOPEN_ANTBANK_ACCOUNT
	 */
	@ApiField("sign_result")
	private String signResult;

	/** 
	 * 子业务类型，标识该场景下的渠道模式。
SHBANK:上海银行模式
ANTBANK:网商银行模式
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public void setAgreementTextInfos(List<AgreementTextInfo> agreementTextInfos) {
		this.agreementTextInfos = agreementTextInfos;
	}
	public List<AgreementTextInfo> getAgreementTextInfos( ) {
		return this.agreementTextInfos;
	}

	public void setSignResult(String signResult) {
		this.signResult = signResult;
	}
	public String getSignResult( ) {
		return this.signResult;
	}

	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}
	public String getSubBizType( ) {
		return this.subBizType;
	}

}
