package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.channelsale.voucher.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-17 14:12:04
 */
public class AlipayInsSceneChannelsaleVoucherCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7115719267118936817L;

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
	 * 凭证编码
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	/** 
	 * 凭证领取URL
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

	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}
	public String getVoucherCode( ) {
		return this.voucherCode;
	}

	public void setVoucherUrl(String voucherUrl) {
		this.voucherUrl = voucherUrl;
	}
	public String getVoucherUrl( ) {
		return this.voucherUrl;
	}

}
