package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集团电商资金管控
 *
 * @author auto create
 * @since 1.0, 2023-03-02 13:28:50
 */
public class AlipayTradeSettleEfundUnfreezeModel extends AlipayObject {

	private static final long serialVersionUID = 8392424252112599182L;

	/**
	 * 解冻金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 扩展字段
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 解冻资金备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部请求号，用于幂等控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 卖家openId
	 */
	@ApiField("seller_open_id")
	private String sellerOpenId;

	/**
	 * 卖家userId
	 */
	@ApiField("seller_user_id")
	private String sellerUserId;

	/**
	 * 资金解冻业务类型
	 */
	@ApiField("settle_biz_type")
	private String settleBizType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getSellerOpenId() {
		return this.sellerOpenId;
	}
	public void setSellerOpenId(String sellerOpenId) {
		this.sellerOpenId = sellerOpenId;
	}

	public String getSellerUserId() {
		return this.sellerUserId;
	}
	public void setSellerUserId(String sellerUserId) {
		this.sellerUserId = sellerUserId;
	}

	public String getSettleBizType() {
		return this.settleBizType;
	}
	public void setSettleBizType(String settleBizType) {
		this.settleBizType = settleBizType;
	}

}
