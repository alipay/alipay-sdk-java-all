package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.ai.donation.service.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-25 22:07:21
 */
public class AnttechAiDonationServiceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4337176166824359856L;

	/** 
	 * 业务回执，调用方需要
说明：
如果在提交创建任务的请求参数中传入了biz_receiet，则此处返回对应的biz_receiet
	 */
	@ApiField("biz_receipt")
	private String bizReceipt;

	/** 
	 * 捐瓦礼成的URI地址，附带捐瓦ID和Token查询指定捐瓦记录。
	 */
	@ApiField("donation_complete_link")
	private String donationCompleteLink;

	/** 
	 * 捐瓦记录ID，表明该条数据的唯一标识
	 */
	@ApiField("donation_id")
	private String donationId;

	/** 
	 * 创建捐瓦记录对应的请求ID
说明：
如果在提交创建任务的请求参数中传入了request_id，则此处返回对应的request_id
	 */
	@ApiField("request_id")
	private String requestId;

	public void setBizReceipt(String bizReceipt) {
		this.bizReceipt = bizReceipt;
	}
	public String getBizReceipt( ) {
		return this.bizReceipt;
	}

	public void setDonationCompleteLink(String donationCompleteLink) {
		this.donationCompleteLink = donationCompleteLink;
	}
	public String getDonationCompleteLink( ) {
		return this.donationCompleteLink;
	}

	public void setDonationId(String donationId) {
		this.donationId = donationId;
	}
	public String getDonationId( ) {
		return this.donationId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
