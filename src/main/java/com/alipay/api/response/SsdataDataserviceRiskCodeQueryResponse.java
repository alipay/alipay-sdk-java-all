package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.code.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-10 16:15:13
 */
public class SsdataDataserviceRiskCodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5469869179819566154L;

	/** 
	 * 是否命中yes/no
	 */
	@ApiField("hit")
	private String hit;

	/** 
	 * 风险码,具体见接口文档
	 */
	@ApiListField("risk_code")
	@ApiField("string")
	private List<String> riskCode;

	/** 
	 * 调用订单号
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/** 
	 * 验证码, 具体见接口文档
	 */
	@ApiListField("verify_code")
	@ApiField("string")
	private List<String> verifyCode;

	public void setHit(String hit) {
		this.hit = hit;
	}
	public String getHit( ) {
		return this.hit;
	}

	public void setRiskCode(List<String> riskCode) {
		this.riskCode = riskCode;
	}
	public List<String> getRiskCode( ) {
		return this.riskCode;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getUniqueId( ) {
		return this.uniqueId;
	}

	public void setVerifyCode(List<String> verifyCode) {
		this.verifyCode = verifyCode;
	}
	public List<String> getVerifyCode( ) {
		return this.verifyCode;
	}

}
