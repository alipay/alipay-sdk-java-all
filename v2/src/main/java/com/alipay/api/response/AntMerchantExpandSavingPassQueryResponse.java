package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SCardQueryVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.saving.pass.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:01:47
 */
public class AntMerchantExpandSavingPassQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4545657457911223965L;

	/** 
	 * 省卡咨询结果可购买的商品信息
	 */
	@ApiListField("card_list")
	@ApiField("s_card_query_v_o")
	private List<SCardQueryVO> cardList;

	/** 
	 * 是否可以购买省卡
	 */
	@ApiField("enable")
	private Boolean enable;

	public void setCardList(List<SCardQueryVO> cardList) {
		this.cardList = cardList;
	}
	public List<SCardQueryVO> getCardList( ) {
		return this.cardList;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	public Boolean getEnable( ) {
		return this.enable;
	}

}
