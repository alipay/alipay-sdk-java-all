package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WaitRateAlgoItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.arater.waitratealgorank.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-21 11:21:27
 */
public class AlipayOpenAppAraterWaitratealgorankQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6435194151639487678L;

	/** 
	 * 待评价列表打分结果
	 */
	@ApiListField("wait_rate_rank_items")
	@ApiField("wait_rate_algo_item")
	private List<WaitRateAlgoItem> waitRateRankItems;

	public void setWaitRateRankItems(List<WaitRateAlgoItem> waitRateRankItems) {
		this.waitRateRankItems = waitRateRankItems;
	}
	public List<WaitRateAlgoItem> getWaitRateRankItems( ) {
		return this.waitRateRankItems;
	}

}
