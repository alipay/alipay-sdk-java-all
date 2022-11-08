package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.item.greenenergy.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 14:51:36
 */
public class AlipayCommerceItemGreenenergySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6595216762891913897L;

	/** 
	 * 能量数量,单位g
	 */
	@ApiField("energy_amount")
	private Long energyAmount;

	/** 
	 * 绿色行为描述文案
	 */
	@ApiField("energy_desc")
	private String energyDesc;

	/** 
	 * 能量流水id
	 */
	@ApiField("log_id")
	private String logId;

	/** 
	 * OK: 领取成功 OVER_ACTIVITY_LIMITATION: 超过活动配置限制 OVER_ENERGY_APPLY_LIMITATION: 超过能量获取限制 ACTIVITY_EXPIRED: 活动过期
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 能量领取失败的原因描述
	 */
	@ApiField("result_message")
	private String resultMessage;

	public void setEnergyAmount(Long energyAmount) {
		this.energyAmount = energyAmount;
	}
	public Long getEnergyAmount( ) {
		return this.energyAmount;
	}

	public void setEnergyDesc(String energyDesc) {
		this.energyDesc = energyDesc;
	}
	public String getEnergyDesc( ) {
		return this.energyDesc;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getLogId( ) {
		return this.logId;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
	}

}
