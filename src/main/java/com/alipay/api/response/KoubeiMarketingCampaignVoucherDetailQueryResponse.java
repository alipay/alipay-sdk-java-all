package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Voucher;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.voucher.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 15:44:02
 */
public class KoubeiMarketingCampaignVoucherDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5297177241557284526L;

	/** 
	 * 券状态列表如下：
VALID：可用；WRITED_OFF：已核销；EXPIRED：已过期；CLOSED：已关闭；WAIT_APPLY：已冻结；DELETED：已删除；
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 券详情对象
	 */
	@ApiField("voucher")
	private Voucher voucher;

	/** 
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}
	public Voucher getVoucher( ) {
		return this.voucher;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
