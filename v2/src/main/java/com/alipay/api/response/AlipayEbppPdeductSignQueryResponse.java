package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SpecifiedSortChannelParam;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.sign.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-12 16:42:54
 */
public class AlipayEbppPdeductSignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6363289886296222743L;

	/** 
	 * 协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 出账机构
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 朗新协议ID
	 */
	@ApiField("out_agreement_id")
	private String outAgreementId;

	/** 
	 * 签约时间
	 */
	@ApiField("sign_date")
	private String signDate;

	/** 
	 * 协议过期时间
	 */
	@ApiField("sign_expire_date")
	private String signExpireDate;

	/** 
	 * 用户代扣协议设置的优先扣款渠道
	 */
	@ApiListField("specified_sort_channels")
	@ApiField("specified_sort_channel_param")
	private List<SpecifiedSortChannelParam> specifiedSortChannels;

	/** 
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}
	public String getBillKey( ) {
		return this.billKey;
	}

	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}
	public String getChargeInst( ) {
		return this.chargeInst;
	}

	public void setOutAgreementId(String outAgreementId) {
		this.outAgreementId = outAgreementId;
	}
	public String getOutAgreementId( ) {
		return this.outAgreementId;
	}

	public void setSignDate(String signDate) {
		this.signDate = signDate;
	}
	public String getSignDate( ) {
		return this.signDate;
	}

	public void setSignExpireDate(String signExpireDate) {
		this.signExpireDate = signExpireDate;
	}
	public String getSignExpireDate( ) {
		return this.signExpireDate;
	}

	public void setSpecifiedSortChannels(List<SpecifiedSortChannelParam> specifiedSortChannels) {
		this.specifiedSortChannels = specifiedSortChannels;
	}
	public List<SpecifiedSortChannelParam> getSpecifiedSortChannels( ) {
		return this.specifiedSortChannels;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
