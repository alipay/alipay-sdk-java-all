package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.sign.add response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:09:15
 */
public class AlipayEbppPdeductSignAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 2293684672689572256L;

	/** 
	 * 支付宝代扣协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 支付宝协议状态。签约成功则返回success
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/** 
	 * 扩展参数，可为空
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 通知方式设置。
	 */
	@ApiField("notify_config")
	private String notifyConfig;

	/** 
	 * 商户生成的代扣协议ID
	 */
	@ApiField("out_agreement_id")
	private String outAgreementId;

	/** 
	 * 支付方式设置
	 */
	@ApiListField("pay_config")
	@ApiField("string")
	private List<String> payConfig;

	/** 
	 * 签约时间
	 */
	@ApiField("sign_date")
	private String signDate;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}
	public String getAgreementStatus( ) {
		return this.agreementStatus;
	}

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

	public void setNotifyConfig(String notifyConfig) {
		this.notifyConfig = notifyConfig;
	}
	public String getNotifyConfig( ) {
		return this.notifyConfig;
	}

	public void setOutAgreementId(String outAgreementId) {
		this.outAgreementId = outAgreementId;
	}
	public String getOutAgreementId( ) {
		return this.outAgreementId;
	}

	public void setPayConfig(List<String> payConfig) {
		this.payConfig = payConfig;
	}
	public List<String> getPayConfig( ) {
		return this.payConfig;
	}

	public void setSignDate(String signDate) {
		this.signDate = signDate;
	}
	public String getSignDate( ) {
		return this.signDate;
	}

}
