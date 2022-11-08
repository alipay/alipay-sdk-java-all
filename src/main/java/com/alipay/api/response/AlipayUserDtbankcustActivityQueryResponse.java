package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeliveryActivityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbankcust.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 17:16:35
 */
public class AlipayUserDtbankcustActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6838314574653777413L;

	/** 
	 * 活动信息列表
	 */
	@ApiListField("delivery_activity_infos")
	@ApiField("delivery_activity_info")
	private List<DeliveryActivityInfo> deliveryActivityInfos;

	/** 
	 * lastActivityId后还有没有活动
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 此次查询到的活动数据量
	 */
	@ApiField("item_count")
	private Long itemCount;

	/** 
	 * 当前页最后一条数据
	 */
	@ApiField("last_activity_id")
	private String lastActivityId;

	/** 
	 * 是否推荐展示
	 */
	@ApiField("recommend_display")
	private Boolean recommendDisplay;

	public void setDeliveryActivityInfos(List<DeliveryActivityInfo> deliveryActivityInfos) {
		this.deliveryActivityInfos = deliveryActivityInfos;
	}
	public List<DeliveryActivityInfo> getDeliveryActivityInfos( ) {
		return this.deliveryActivityInfos;
	}

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
	}

	public void setItemCount(Long itemCount) {
		this.itemCount = itemCount;
	}
	public Long getItemCount( ) {
		return this.itemCount;
	}

	public void setLastActivityId(String lastActivityId) {
		this.lastActivityId = lastActivityId;
	}
	public String getLastActivityId( ) {
		return this.lastActivityId;
	}

	public void setRecommendDisplay(Boolean recommendDisplay) {
		this.recommendDisplay = recommendDisplay;
	}
	public Boolean getRecommendDisplay( ) {
		return this.recommendDisplay;
	}

}
