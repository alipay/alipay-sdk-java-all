package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NearbyGoods;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.member.data.item.nearby.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-28 18:01:30
 */
public class KoubeiMemberDataItemNearbyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3594411125568853662L;

	/** 
	 * 附近优惠商品列表,前端根据其中的字段展示即可
	 */
	@ApiListField("goods_list")
	@ApiField("nearby_goods")
	private List<NearbyGoods> goodsList;

	/** 
	 * 是否有下一页,用于分页展示
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 下页数据开始索引，请求下一页时作为请求参数start上传。
	 */
	@ApiField("next_start")
	private Long nextStart;

	public void setGoodsList(List<NearbyGoods> goodsList) {
		this.goodsList = goodsList;
	}
	public List<NearbyGoods> getGoodsList( ) {
		return this.goodsList;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setNextStart(Long nextStart) {
		this.nextStart = nextStart;
	}
	public Long getNextStart( ) {
		return this.nextStart;
	}

}
