package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.entry.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:17
 */
public class AlipayMerchantGroupEntryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5425819155964674193L;

	/** 
	 * 申请单状态
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/** 
	 * 绑定账号uid
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 绑定账号uid
	 */
	@ApiField("uid")
	private String uid;

	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}
	public String getBizStatus( ) {
		return this.bizStatus;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUid( ) {
		return this.uid;
	}

}
