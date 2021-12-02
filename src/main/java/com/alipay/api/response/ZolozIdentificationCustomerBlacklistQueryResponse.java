package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.identification.customer.blacklist.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:45
 */
public class ZolozIdentificationCustomerBlacklistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6372167831277826383L;

	/** 
	 * 详细原因
	 */
	@ApiField("detail_reason")
	private String detailReason;

	/** 
	 * 黑名单过期时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/** 
	 * 是否在黑名单中
	 */
	@ApiField("in_black_list")
	private String inBlackList;

	public void setDetailReason(String detailReason) {
		this.detailReason = detailReason;
	}
	public String getDetailReason( ) {
		return this.detailReason;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public String getExpireTime( ) {
		return this.expireTime;
	}

	public void setInBlackList(String inBlackList) {
		this.inBlackList = inBlackList;
	}
	public String getInBlackList( ) {
		return this.inBlackList;
	}

}
