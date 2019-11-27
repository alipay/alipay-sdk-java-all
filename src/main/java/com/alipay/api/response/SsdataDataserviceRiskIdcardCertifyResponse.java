package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.idcard.certify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class SsdataDataserviceRiskIdcardCertifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5165211847386637691L;

	/** 
	 * 令牌，由服务端生成后下发，手填信息校验时需透传此参数。
	 */
	@ApiField("bis_token")
	private String bisToken;

	/** 
	 * 图片识别的名字
	 */
	@ApiField("cert_name")
	private String certName;

	/** 
	 * 身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 图片本次检测情况，true：通过；false：未通过
	 */
	@ApiField("check_result")
	private Boolean checkResult;

	/** 
	 * 业务唯一识别码
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public void setBisToken(String bisToken) {
		this.bisToken = bisToken;
	}
	public String getBisToken( ) {
		return this.bisToken;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}
	public String getCertName( ) {
		return this.certName;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setCheckResult(Boolean checkResult) {
		this.checkResult = checkResult;
	}
	public Boolean getCheckResult( ) {
		return this.checkResult;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getUniqueId( ) {
		return this.uniqueId;
	}

}
