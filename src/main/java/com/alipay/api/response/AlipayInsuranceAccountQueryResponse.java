package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.insurance.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayInsuranceAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6226979627662884819L;

	/** 
	 * 保险服务结束时间
	 */
	@ApiField("effect_end_date")
	private Date effectEndDate;

	/** 
	 * 保险服务开始时间
	 */
	@ApiField("effect_start_date")
	private Date effectStartDate;

	/** 
	 * 用户是否已投保
	 */
	@ApiField("insured")
	private Boolean insured;

	/** 
	 * 保费
	 */
	@ApiField("premium")
	private String premium;

	/** 
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setEffectEndDate(Date effectEndDate) {
		this.effectEndDate = effectEndDate;
	}
	public Date getEffectEndDate( ) {
		return this.effectEndDate;
	}

	public void setEffectStartDate(Date effectStartDate) {
		this.effectStartDate = effectStartDate;
	}
	public Date getEffectStartDate( ) {
		return this.effectStartDate;
	}

	public void setInsured(Boolean insured) {
		this.insured = insured;
	}
	public Boolean getInsured( ) {
		return this.insured;
	}

	public void setPremium(String premium) {
		this.premium = premium;
	}
	public String getPremium( ) {
		return this.premium;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
