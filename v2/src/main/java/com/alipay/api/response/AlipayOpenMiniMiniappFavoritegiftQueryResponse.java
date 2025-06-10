package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ActivityQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.miniapp.favoritegift.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:28:48
 */
public class AlipayOpenMiniMiniappFavoritegiftQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6184545974419434654L;

	/** 
	 * 收藏有礼查询用户对应小程序的查询结果列表
	 */
	@ApiListField("result_list")
	@ApiField("activity_query_result")
	private List<ActivityQueryResult> resultList;

	public void setResultList(List<ActivityQueryResult> resultList) {
		this.resultList = resultList;
	}
	public List<ActivityQueryResult> getResultList( ) {
		return this.resultList;
	}

}
