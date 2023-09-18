package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbdishSimplyInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.querydish.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:43:15
 */
public class KoubeiCateringDishQuerydishQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5217662982742523522L;

	/** 
	 * 菜品信息
	 */
	@ApiListField("dish_info_list")
	@ApiField("kbdish_simply_info")
	private List<KbdishSimplyInfo> dishInfoList;

	/** 
	 * 是否需要重试，true：是；false：不需要
	 */
	@ApiField("retry")
	private Boolean retry;

	public void setDishInfoList(List<KbdishSimplyInfo> dishInfoList) {
		this.dishInfoList = dishInfoList;
	}
	public List<KbdishSimplyInfo> getDishInfoList( ) {
		return this.dishInfoList;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}
