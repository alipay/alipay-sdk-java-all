package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ConsumerProfile;
import com.alipay.api.domain.NearbyCrowdDensity;
import com.alipay.api.domain.RecommendGoods;
import com.alipay.api.domain.SalesData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.vendingmachine.profile.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 11:21:08
 */
public class AlipayCommerceIotVendingmachineProfileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4122191481757714999L;

	/** 
	 * 消费者画像列表
	 */
	@ApiListField("consumer_profile_list")
	@ApiField("consumer_profile")
	private List<ConsumerProfile> consumerProfileList;

	/** 
	 * 附近人群密度
	 */
	@ApiListField("nearby_crowd_density_list")
	@ApiField("nearby_crowd_density")
	private List<NearbyCrowdDensity> nearbyCrowdDensityList;

	/** 
	 * 推荐商品列表
	 */
	@ApiListField("recommend_goods_list")
	@ApiField("recommend_goods")
	private List<RecommendGoods> recommendGoodsList;

	/** 
	 * 货柜销售数据统计
	 */
	@ApiListField("sales_data_list")
	@ApiField("sales_data")
	private List<SalesData> salesDataList;

	public void setConsumerProfileList(List<ConsumerProfile> consumerProfileList) {
		this.consumerProfileList = consumerProfileList;
	}
	public List<ConsumerProfile> getConsumerProfileList( ) {
		return this.consumerProfileList;
	}

	public void setNearbyCrowdDensityList(List<NearbyCrowdDensity> nearbyCrowdDensityList) {
		this.nearbyCrowdDensityList = nearbyCrowdDensityList;
	}
	public List<NearbyCrowdDensity> getNearbyCrowdDensityList( ) {
		return this.nearbyCrowdDensityList;
	}

	public void setRecommendGoodsList(List<RecommendGoods> recommendGoodsList) {
		this.recommendGoodsList = recommendGoodsList;
	}
	public List<RecommendGoods> getRecommendGoodsList( ) {
		return this.recommendGoodsList;
	}

	public void setSalesDataList(List<SalesData> salesDataList) {
		this.salesDataList = salesDataList;
	}
	public List<SalesData> getSalesDataList( ) {
		return this.salesDataList;
	}

}
