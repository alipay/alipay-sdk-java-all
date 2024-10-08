package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.flexiblestaffing.insuresign.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-01 23:02:05
 */
public class AlipayFundFlexiblestaffingInsuresignQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5163672315956125151L;

	/** 
	 * 签约企业支付宝账号id
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/** 
	 * 企业支付宝账号Id
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/** 
	 * 失效时间
	 */
	@ApiField("effect_end_time")
	private Date effectEndTime;

	/** 
	 * 生效时间
	 */
	@ApiField("effect_start_time")
	private Date effectStartTime;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}
	public String getAlipayId( ) {
		return this.alipayId;
	}

	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}
	public String getAlipayOpenId( ) {
		return this.alipayOpenId;
	}

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

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
