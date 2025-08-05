package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.baseinfo.nftid.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 17:42:27
 */
public class AnttechNftBaseinfoNftidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8493773148389816191L;

	/** 
	 * 发行hash
	 */
	@ApiField("nft_hash")
	private String nftHash;

	/** 
	 * 商家后台产品的nft_id
	 */
	@ApiField("nft_id")
	private String nftId;

	/** 
	 * 发行时间
	 */
	@ApiField("nft_issue_time")
	private Date nftIssueTime;

	public void setNftHash(String nftHash) {
		this.nftHash = nftHash;
	}
	public String getNftHash( ) {
		return this.nftHash;
	}

	public void setNftId(String nftId) {
		this.nftId = nftId;
	}
	public String getNftId( ) {
		return this.nftId;
	}

	public void setNftIssueTime(Date nftIssueTime) {
		this.nftIssueTime = nftIssueTime;
	}
	public Date getNftIssueTime( ) {
		return this.nftIssueTime;
	}

}
