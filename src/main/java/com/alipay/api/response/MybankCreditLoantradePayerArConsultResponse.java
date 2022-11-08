package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CreditPayRefuseVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.payer.ar.consult response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-05 19:10:39
 */
public class MybankCreditLoantradePayerArConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5526786479454937292L;

	/** 
	 * 是否准入
	 */
	@ApiField("admit")
	private Boolean admit;

	/** 
	 * 网商会员ipId
	 */
	@ApiField("ip_id")
	private String ipId;

	/** 
	 * 网商会员ipRoleId
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/** 
	 * admit为false时才会出现拒绝信息
	 */
	@ApiField("refuse_info")
	private CreditPayRefuseVO refuseInfo;

	/** 
	 * 外部感知的签约号
	 */
	@ApiField("scheme_ar_no")
	private String schemeArNo;

	/** 
	 * 签约流程所处状态
	 */
	@ApiField("sign_status")
	private String signStatus;

	/** 
	 * 签约引导URL
	 */
	@ApiField("sign_url")
	private String signUrl;

	/** 
	 * 是否已签约
	 */
	@ApiField("signed")
	private Boolean signed;

	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}
	public Boolean getAdmit( ) {
		return this.admit;
	}

	public void setIpId(String ipId) {
		this.ipId = ipId;
	}
	public String getIpId( ) {
		return this.ipId;
	}

	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}
	public String getIpRoleId( ) {
		return this.ipRoleId;
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

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
	public String getSignStatus( ) {
		return this.signStatus;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

	public void setSigned(Boolean signed) {
		this.signed = signed;
	}
	public Boolean getSigned( ) {
		return this.signed;
	}

}
