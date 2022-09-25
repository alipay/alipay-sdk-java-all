package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.antdao.mypoints.publish response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-03 13:21:25
 */
public class AnttechBlockchainFinanceAntdaoMypointsPublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 7475631554181947779L;

	/** 
	 * 集分宝卡密短链
	 */
	@ApiField("card_url")
	private String cardUrl;

	/** 
	 * 额外备注信息，非json形式
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 总数量
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/** 
	 * 总费用
	 */
	@ApiField("total_ccost")
	private Long totalCcost;

	public void setCardUrl(String cardUrl) {
		this.cardUrl = cardUrl;
	}
	public String getCardUrl( ) {
		return this.cardUrl;
	}

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Long getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTotalCcost(Long totalCcost) {
		this.totalCcost = totalCcost;
	}
	public Long getTotalCcost( ) {
		return this.totalCcost;
	}

}
