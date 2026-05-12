package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回收竞拍商信息
 *
 * @author auto create
 * @since 1.0, 2026-03-27 10:50:56
 */
public class RecycleAuctionMerchantInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7687345251665192711L;

	/**
	 * 竞拍商名称
	 */
	@ApiField("auction_merchant_name")
	private String auctionMerchantName;

	/**
	 * 竞拍商单号
	 */
	@ApiField("auction_merchant_no")
	private String auctionMerchantNo;

	/**
	 * 竞拍商PID
	 */
	@ApiField("auction_merchant_pid")
	private String auctionMerchantPid;

	public String getAuctionMerchantName() {
		return this.auctionMerchantName;
	}
	public void setAuctionMerchantName(String auctionMerchantName) {
		this.auctionMerchantName = auctionMerchantName;
	}

	public String getAuctionMerchantNo() {
		return this.auctionMerchantNo;
	}
	public void setAuctionMerchantNo(String auctionMerchantNo) {
		this.auctionMerchantNo = auctionMerchantNo;
	}

	public String getAuctionMerchantPid() {
		return this.auctionMerchantPid;
	}
	public void setAuctionMerchantPid(String auctionMerchantPid) {
		this.auctionMerchantPid = auctionMerchantPid;
	}

}
