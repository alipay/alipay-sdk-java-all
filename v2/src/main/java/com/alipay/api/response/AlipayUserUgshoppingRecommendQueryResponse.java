package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemCardOpenapi;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.ugshopping.recommend.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-02 14:17:56
 */
public class AlipayUserUgshoppingRecommendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7626257449116534347L;

	/** 
	 * null
	 */
	@ApiListField("item_cards")
	@ApiField("item_card_openapi")
	private List<ItemCardOpenapi> itemCards;

	/** 
	 * 下一页(到底时返回0)
	 */
	@ApiField("next_page_num")
	private Long nextPageNum;

	public void setItemCards(List<ItemCardOpenapi> itemCards) {
		this.itemCards = itemCards;
	}
	public List<ItemCardOpenapi> getItemCards( ) {
		return this.itemCards;
	}

	public void setNextPageNum(Long nextPageNum) {
		this.nextPageNum = nextPageNum;
	}
	public Long getNextPageNum( ) {
		return this.nextPageNum;
	}

}
