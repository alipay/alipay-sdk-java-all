package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CreditPayRefuseVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.payee.ar.consult response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-13 15:03:10
 */
public class MybankCreditLoantradePayeeArConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6324176286237354939L;

	/** 
	 * 是否准入
	 */
	@ApiField("admit")
	private Boolean admit;

	/** 
	 * 准入的支付宝登录号
	 */
	@ApiField("admit_alipay_login_id")
	private String admitAlipayLoginId;

	/** 
	 * 准入支付宝UID
	 */
	@ApiField("admit_alipay_user_id")
	private String admitAlipayUserId;

	/** 
	 * 是否已签约
	 */
	@ApiField("is_signed")
	private Boolean isSigned;

	/** 
	 * admit为false时才会出现拒绝信息
	 */
	@ApiField("refuse_info")
	private CreditPayRefuseVO refuseInfo;

	/** 
	 * 卖家方案合约号
	 */
	@ApiField("scheme_ar_no")
	private String schemeArNo;

	/** 
	 * 签约引导URL
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}
	public Boolean getAdmit( ) {
		return this.admit;
	}

	public void setAdmitAlipayLoginId(String admitAlipayLoginId) {
		this.admitAlipayLoginId = admitAlipayLoginId;
	}
	public String getAdmitAlipayLoginId( ) {
		return this.admitAlipayLoginId;
	}

	public void setAdmitAlipayUserId(String admitAlipayUserId) {
		this.admitAlipayUserId = admitAlipayUserId;
	}
	public String getAdmitAlipayUserId( ) {
		return this.admitAlipayUserId;
	}

	public void setIsSigned(Boolean isSigned) {
		this.isSigned = isSigned;
	}
	public Boolean getIsSigned( ) {
		return this.isSigned;
	}

	public void setRefuseInfo(CreditPayRefuseVO refuseInfo) {
		this.refuseInfo = refuseInfo;
	}
	public CreditPayRefuseVO getRefuseInfo( ) {
		return this.refuseInfo;
	}

	public void setSchemeArNo(String schemeArNo) {
		this.schemeArNo = schemeArNo;
	}
	public String getSchemeArNo( ) {
		return this.schemeArNo;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
