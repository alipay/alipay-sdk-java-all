package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安全-riskprofile 根据风险主体查询对应的风险分值
 *
 * @author auto create
 * @since 1.0, 2018-12-05 17:10:08
 */
public class AlipaySecurityRiskRiskprofileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7544945723759545167L;

	/**
	 * 请求来源，业务唯一标示；
	 */
	@ApiField("request_from")
	private String requestFrom;

	/**
	 * 请求唯一ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 风险对象枚举 可用值：userID,merchantID,tradeNO,phone,bankCard,IDCard,email;注意大小写敏感
枚举含义：userID：用户，merchantID：商户，tradeNO：交易号；phone：手机号，bankCard：银行卡，IDCard：身份证号，email：邮箱；
	 */
	@ApiListField("risk_object")
	@ApiField("string")
	private List<String> riskObject;

	/**
	 * 与字段risk_object 对应长度顺序一致，例如 ：risk_object值为["userID"] 则risk_object_value 值为["208830231508XXXX"];如 risk_object值为["userID",phone] 则risk_object_value 值为["208830231508XXXX","1856343XXXX"];
	 */
	@ApiListField("risk_object_value")
	@ApiField("string")
	private List<String> riskObjectValue;

	/**
	 * riskprofile 值接入时咨询业务PD 应该使用的riskprofile
	 */
	@ApiListField("risk_profile")
	@ApiField("string")
	private List<String> riskProfile;

	public String getRequestFrom() {
		return this.requestFrom;
	}
	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getRiskObject() {
		return this.riskObject;
	}
	public void setRiskObject(List<String> riskObject) {
		this.riskObject = riskObject;
	}

	public List<String> getRiskObjectValue() {
		return this.riskObjectValue;
	}
	public void setRiskObjectValue(List<String> riskObjectValue) {
		this.riskObjectValue = riskObjectValue;
	}

	public List<String> getRiskProfile() {
		return this.riskProfile;
	}
	public void setRiskProfile(List<String> riskProfile) {
		this.riskProfile = riskProfile;
	}

}
