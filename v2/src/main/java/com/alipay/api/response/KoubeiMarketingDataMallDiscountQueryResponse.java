package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CardInfo;
import com.alipay.api.domain.CodeCouponInfo;
import com.alipay.api.domain.ConsumeInfo;
import com.alipay.api.domain.ReduceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.mall.discount.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:38
 */
public class KoubeiMarketingDataMallDiscountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3543698111144947844L;

	/** 
	 * 集卡信息列表（最多50条）
	 */
	@ApiListField("card_list")
	@ApiField("card_info")
	private List<CardInfo> cardList;

	/** 
	 * 口令信息列表（最多50条）
	 */
	@ApiListField("code_coupon_list")
	@ApiField("code_coupon_info")
	private List<CodeCouponInfo> codeCouponList;

	/** 
	 * 消费送信息列表（最多50条）
	 */
	@ApiListField("consume_list")
	@ApiField("consume_info")
	private List<ConsumeInfo> consumeList;

	/** 
	 * 订单优惠信息列表（最多50条）
	 */
	@ApiListField("reduce_list")
	@ApiField("reduce_info")
	private List<ReduceInfo> reduceList;

	public void setCardList(List<CardInfo> cardList) {
		this.cardList = cardList;
	}
	public List<CardInfo> getCardList( ) {
		return this.cardList;
	}

	public void setCodeCouponList(List<CodeCouponInfo> codeCouponList) {
		this.codeCouponList = codeCouponList;
	}
	public List<CodeCouponInfo> getCodeCouponList( ) {
		return this.codeCouponList;
	}

	public void setConsumeList(List<ConsumeInfo> consumeList) {
		this.consumeList = consumeList;
	}
	public List<ConsumeInfo> getConsumeList( ) {
		return this.consumeList;
	}

	public void setReduceList(List<ReduceInfo> reduceList) {
		this.reduceList = reduceList;
	}
	public List<ReduceInfo> getReduceList( ) {
		return this.reduceList;
	}

}
