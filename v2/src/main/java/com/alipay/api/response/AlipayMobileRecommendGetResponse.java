package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.recommend.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 20:52:34
 */
public class AlipayMobileRecommendGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4223899784827468828L;

	/** 
	 * 推荐结果的扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 推荐结果集合, json数组对象, 每个元素至少包含entity_id的属性,其他属性由推荐方案决定。
	 */
	@ApiField("items")
	private String items;

	/** 
	 * 本次推荐的唯一标识
	 */
	@ApiField("recommend_id")
	private String recommendId;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setItems(String items) {
		this.items = items;
	}
	public String getItems( ) {
		return this.items;
	}

	public void setRecommendId(String recommendId) {
		this.recommendId = recommendId;
	}
	public String getRecommendId( ) {
		return this.recommendId;
	}

}
