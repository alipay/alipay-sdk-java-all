package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbank.qrcodedata.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:25:16
 */
public class AlipayUserDtbankQrcodedataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3852539786743189538L;

	/** 
	 * 引导绑卡数量
	 */
	@ApiField("bind_card")
	private String bindCard;

	/** 
	 * 查询的数据日期
	 */
	@ApiField("data_date")
	private String dataDate;

	/** 
	 * 引导关注数量
	 */
	@ApiField("lead_to_follow")
	private String leadToFollow;

	/** 
	 * 二维码Id
	 */
	@ApiField("qrcode_id")
	private String qrcodeId;

	/** 
	 * 二维码外部Id
	 */
	@ApiField("qrcode_out_id")
	private String qrcodeOutId;

	/** 
	 * 发券金额
	 */
	@ApiField("send_voucher_amt")
	private String sendVoucherAmt;

	/** 
	 * 发券数量
	 */
	@ApiField("send_voucher_cnt")
	private String sendVoucherCnt;

	/** 
	 * 核销券金额
	 */
	@ApiField("write_off_voucher_amt")
	private String writeOffVoucherAmt;

	/** 
	 * 核销券数量
	 */
	@ApiField("write_off_voucher_cnt")
	private String writeOffVoucherCnt;

	public void setBindCard(String bindCard) {
		this.bindCard = bindCard;
	}
	public String getBindCard( ) {
		return this.bindCard;
	}

	public void setDataDate(String dataDate) {
		this.dataDate = dataDate;
	}
	public String getDataDate( ) {
		return this.dataDate;
	}

	public void setLeadToFollow(String leadToFollow) {
		this.leadToFollow = leadToFollow;
	}
	public String getLeadToFollow( ) {
		return this.leadToFollow;
	}

	public void setQrcodeId(String qrcodeId) {
		this.qrcodeId = qrcodeId;
	}
	public String getQrcodeId( ) {
		return this.qrcodeId;
	}

	public void setQrcodeOutId(String qrcodeOutId) {
		this.qrcodeOutId = qrcodeOutId;
	}
	public String getQrcodeOutId( ) {
		return this.qrcodeOutId;
	}

	public void setSendVoucherAmt(String sendVoucherAmt) {
		this.sendVoucherAmt = sendVoucherAmt;
	}
	public String getSendVoucherAmt( ) {
		return this.sendVoucherAmt;
	}

	public void setSendVoucherCnt(String sendVoucherCnt) {
		this.sendVoucherCnt = sendVoucherCnt;
	}
	public String getSendVoucherCnt( ) {
		return this.sendVoucherCnt;
	}

	public void setWriteOffVoucherAmt(String writeOffVoucherAmt) {
		this.writeOffVoucherAmt = writeOffVoucherAmt;
	}
	public String getWriteOffVoucherAmt( ) {
		return this.writeOffVoucherAmt;
	}

	public void setWriteOffVoucherCnt(String writeOffVoucherCnt) {
		this.writeOffVoucherCnt = writeOffVoucherCnt;
	}
	public String getWriteOffVoucherCnt( ) {
		return this.writeOffVoucherCnt;
	}

}
