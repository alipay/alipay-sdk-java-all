package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EstimateDishInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.estimate.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-08 17:10:11
 */
public class KoubeiCateringDishEstimateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8543627273536557328L;

	/** 
	 * 菜品估清信息
	 */
	@ApiListField("dish_info_list")
	@ApiField("estimate_dish_info")
	private List<EstimateDishInfo> dishInfoList;

	/** 
	 * 失败下是否可以重试，true：需要；false：不需要
	 */
	@ApiField("retry")
	private Boolean retry;

	public void setDishInfoList(List<EstimateDishInfo> dishInfoList) {
		this.dishInfoList = dishInfoList;
	}
	public List<EstimateDishInfo> getDishInfoList( ) {
		return this.dishInfoList;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}
