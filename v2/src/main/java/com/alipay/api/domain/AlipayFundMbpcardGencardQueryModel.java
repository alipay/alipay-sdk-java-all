package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预付卡制卡单据详情查询
 *
 * @author auto create
 * @since 1.0, 2024-03-27 11:15:50
 */
public class AlipayFundMbpcardGencardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1649283595884483813L;

	/**
	 * 支付宝会员号
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/**
	 * 制卡单号；out_request_no和gen_card_no二选一
	 */
	@ApiField("gen_card_no")
	private String genCardNo;

	/**
	 * 支付宝会员号openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部单号；out_request_no和gen_card_no二选一
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getBuyerUserId() {
		return this.buyerUserId;
	}
	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public String getGenCardNo() {
		return this.genCardNo;
	}
	public void setGenCardNo(String genCardNo) {
		this.genCardNo = genCardNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
