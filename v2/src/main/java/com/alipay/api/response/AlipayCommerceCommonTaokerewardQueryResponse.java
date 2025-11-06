package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaoKeRewardRecordDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.taokereward.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 10:02:53
 */
public class AlipayCommerceCommonTaokerewardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4167928643578966424L;

	/** 
	 * 激励记录信息
	 */
	@ApiListField("reward_record_list")
	@ApiField("tao_ke_reward_record_d_t_o")
	private List<TaoKeRewardRecordDTO> rewardRecordList;

	public void setRewardRecordList(List<TaoKeRewardRecordDTO> rewardRecordList) {
		this.rewardRecordList = rewardRecordList;
	}
	public List<TaoKeRewardRecordDTO> getRewardRecordList( ) {
		return this.rewardRecordList;
	}

}
