package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromotionInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.promotion.get response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-17 17:49:20
 */
public class AlipayOverseasTravelPromotionGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6671899745592746968L;

	/** 
	 * 优惠信息列表
	 */
	@ApiListField("promotions")
	@ApiField("promotion_info")
	private List<PromotionInfo> promotions;

	/** 
	 * 入参匹配的优惠总数，分页使用
	 */
	@ApiField("total")
	private Long total;

	public void setPromotions(List<PromotionInfo> promotions) {
		this.promotions = promotions;
	}
	public List<PromotionInfo> getPromotions( ) {
		return this.promotions;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
