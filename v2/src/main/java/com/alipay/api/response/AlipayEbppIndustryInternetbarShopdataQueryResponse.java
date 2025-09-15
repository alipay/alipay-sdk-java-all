package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InternetbarShopActivityData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.internetbar.shopdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-30 13:32:28
 */
public class AlipayEbppIndustryInternetbarShopdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2174373392698623381L;

	/** 
	 * null
	 */
	@ApiListField("shop_activity_data")
	@ApiField("internetbar_shop_activity_data")
	private List<InternetbarShopActivityData> shopActivityData;

	/** 
	 * 总数据量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setShopActivityData(List<InternetbarShopActivityData> shopActivityData) {
		this.shopActivityData = shopActivityData;
	}
	public List<InternetbarShopActivityData> getShopActivityData( ) {
		return this.shopActivityData;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
