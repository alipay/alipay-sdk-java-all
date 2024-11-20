package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.leads.data.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-26 18:12:04
 */
public class AlipayEcoMycarLeadsDataCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6625974196516733733L;

	/** 
	 * 支付宝线索id
	 */
	@ApiField("leads_id")
	private String leadsId;

	/** 
	 * 线索生成时间
单位:年月日时分秒
	 */
	@ApiField("leads_time")
	private String leadsTime;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 外部线索id
	 */
	@ApiField("out_leads_id")
	private String outLeadsId;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}
	public String getLeadsId( ) {
		return this.leadsId;
	}

	public void setLeadsTime(String leadsTime) {
		this.leadsTime = leadsTime;
	}
	public String getLeadsTime( ) {
		return this.leadsTime;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOutLeadsId(String outLeadsId) {
		this.outLeadsId = outLeadsId;
	}
	public String getOutLeadsId( ) {
		return this.outLeadsId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
