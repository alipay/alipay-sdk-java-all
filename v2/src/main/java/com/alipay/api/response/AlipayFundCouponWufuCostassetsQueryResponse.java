package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CardNumberVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.coupon.wufu.costassets.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:18
 */
public class AlipayFundCouponWufuCostassetsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7391471582422453653L;

	/** 
	 * 当前是否可消耗福卡
	 */
	@ApiField("can_cost")
	private Boolean canCost;

	/** 
	 * 用户持有的福卡数量列表
	 */
	@ApiListField("card_numbers")
	@ApiField("card_number_v_o")
	private List<CardNumberVO> cardNumbers;

	/** 
	 * 用户当前持有的福卡数量是否满足兑换条件
	 */
	@ApiField("have_enough_cards")
	private Boolean haveEnoughCards;

	/** 
	 * 福卡不足时的跳转链接
	 */
	@ApiField("not_enough_jump_url")
	private String notEnoughJumpUrl;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/** 
	 * 错误结果显示
	 */
	@ApiField("result_view")
	private String resultView;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setCanCost(Boolean canCost) {
		this.canCost = canCost;
	}
	public Boolean getCanCost( ) {
		return this.canCost;
	}

	public void setCardNumbers(List<CardNumberVO> cardNumbers) {
		this.cardNumbers = cardNumbers;
	}
	public List<CardNumberVO> getCardNumbers( ) {
		return this.cardNumbers;
	}

	public void setHaveEnoughCards(Boolean haveEnoughCards) {
		this.haveEnoughCards = haveEnoughCards;
	}
	public Boolean getHaveEnoughCards( ) {
		return this.haveEnoughCards;
	}

	public void setNotEnoughJumpUrl(String notEnoughJumpUrl) {
		this.notEnoughJumpUrl = notEnoughJumpUrl;
	}
	public String getNotEnoughJumpUrl( ) {
		return this.notEnoughJumpUrl;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

	public void setResultView(String resultView) {
		this.resultView = resultView;
	}
	public String getResultView( ) {
		return this.resultView;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
