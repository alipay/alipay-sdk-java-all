package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.nftid.owner.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-22 18:12:55
 */
public class AnttechNftNftidOwnerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8354653746143217823L;

	/** 
	 * 藏品的 hash 值
	 */
	@ApiField("mold_hash")
	private String moldHash;

	/** 
	 * 藏品的链上铸造时间
	 */
	@ApiField("mold_time")
	private String moldTime;

	/** 
	 * 藏品的nftId
	 */
	@ApiField("nft_id")
	private String nftId;

	/** 
	 * 藏品接收时间
	 */
	@ApiField("receive_time")
	private String receiveTime;

	/** 
	 * 持有人用户ID
	 */
	@ApiField("third_id")
	private String thirdId;

	public void setMoldHash(String moldHash) {
		this.moldHash = moldHash;
	}
	public String getMoldHash( ) {
		return this.moldHash;
	}

	public void setMoldTime(String moldTime) {
		this.moldTime = moldTime;
	}
	public String getMoldTime( ) {
		return this.moldTime;
	}

	public void setNftId(String nftId) {
		this.nftId = nftId;
	}
	public String getNftId( ) {
		return this.nftId;
	}

	public void setReceiveTime(String receiveTime) {
		this.receiveTime = receiveTime;
	}
	public String getReceiveTime( ) {
		return this.receiveTime;
	}

	public void setThirdId(String thirdId) {
		this.thirdId = thirdId;
	}
	public String getThirdId( ) {
		return this.thirdId;
	}

}
