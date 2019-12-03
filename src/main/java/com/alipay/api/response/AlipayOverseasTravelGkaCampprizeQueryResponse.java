package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrizeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.gka.campprize.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOverseasTravelGkaCampprizeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2198458699226233316L;

	/** 
	 * 奖品信息列表，一定不为null，但是size可以为0
	 */
	@ApiListField("prizes")
	@ApiField("prize_info")
	private List<PrizeInfo> prizes;

	public void setPrizes(List<PrizeInfo> prizes) {
		this.prizes = prizes;
	}
	public List<PrizeInfo> getPrizes( ) {
		return this.prizes;
	}

}
