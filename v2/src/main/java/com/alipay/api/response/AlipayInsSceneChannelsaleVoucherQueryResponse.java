package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.channelsale.voucher.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:47:05
 */
public class AlipayInsSceneChannelsaleVoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1251268833314796847L;

	/** 
	 * 凭证失效时间
	 */
	@ApiField("effect_end_time")
	private Date effectEndTime;

	/** 
	 * 凭证生效时间
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	/** 
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/** 
	 * 凭证状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 凭证核销地址
	 */
	@ApiField("voucher_url")
	private String voucherUrl;

	public void setEffectEndTime(Date effectEndTime) {
		this.effectEndTime = effectEndTime;
	}
	public Date getEffectEndTime( ) {
		return this.effectEndTime;
	}

	public void setEffectStartTime(Date effectStartTime) {
		this.effectStartTime = effectStartTime;
	}
	public Date getEffectStartTime( ) {
		return this.effectStartTime;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyNo( ) {
		return this.policyNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setVoucherUrl(String voucherUrl) {
		this.voucherUrl = voucherUrl;
	}
	public String getVoucherUrl( ) {
		return this.voucherUrl;
	}

}
