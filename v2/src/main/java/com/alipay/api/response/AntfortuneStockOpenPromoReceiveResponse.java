package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrizeReceiveDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.open.promo.receive response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-15 17:01:45
 */
public class AntfortuneStockOpenPromoReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 2339275331728594164L;

	/** 
	 * 奖品发奖明细列表
	 */
	@ApiListField("prize_receive_detail_list")
	@ApiField("prize_receive_detail")
	private List<PrizeReceiveDetail> prizeReceiveDetailList;

	public void setPrizeReceiveDetailList(List<PrizeReceiveDetail> prizeReceiveDetailList) {
		this.prizeReceiveDetailList = prizeReceiveDetailList;
	}
	public List<PrizeReceiveDetail> getPrizeReceiveDetailList( ) {
		return this.prizeReceiveDetailList;
	}

}
