package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CateringGoodInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordercatering.items.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-12 13:45:13
 */
public class AlipayOpenSpNordercateringItemsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6673843151482988475L;

	/** 
	 * 品牌跳转链接
	 */
	@ApiField("brand_action_url")
	private String brandActionUrl;

	/** 
	 * null
	 */
	@ApiListField("catering_goods")
	@ApiField("catering_good_info")
	private List<CateringGoodInfo> cateringGoods;

	/** 
	 * 会话截止时间
	 */
	@ApiField("expires_at")
	private String expiresAt;

	/** 
	 * 已曝光商品累计列表
	 */
	@ApiField("exposed_item_list")
	private String exposedItemList;

	/** 
	 * 是否还有更多套餐
	 */
	@ApiField("has_more")
	private Boolean hasMore;

	/** 
	 * 用户绑定状态
	 */
	@ApiField("identity_status")
	private String identityStatus;

	/** 
	 * 对外会话标识
	 */
	@ApiField("session_id")
	private String sessionId;

	/** 
	 * 店铺整体跳转链接
	 */
	@ApiField("shop_detail_url")
	private String shopDetailUrl;

	public void setBrandActionUrl(String brandActionUrl) {
		this.brandActionUrl = brandActionUrl;
	}
	public String getBrandActionUrl( ) {
		return this.brandActionUrl;
	}

	public void setCateringGoods(List<CateringGoodInfo> cateringGoods) {
		this.cateringGoods = cateringGoods;
	}
	public List<CateringGoodInfo> getCateringGoods( ) {
		return this.cateringGoods;
	}

	public void setExpiresAt(String expiresAt) {
		this.expiresAt = expiresAt;
	}
	public String getExpiresAt( ) {
		return this.expiresAt;
	}

	public void setExposedItemList(String exposedItemList) {
		this.exposedItemList = exposedItemList;
	}
	public String getExposedItemList( ) {
		return this.exposedItemList;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
	public Boolean getHasMore( ) {
		return this.hasMore;
	}

	public void setIdentityStatus(String identityStatus) {
		this.identityStatus = identityStatus;
	}
	public String getIdentityStatus( ) {
		return this.identityStatus;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionId( ) {
		return this.sessionId;
	}

	public void setShopDetailUrl(String shopDetailUrl) {
		this.shopDetailUrl = shopDetailUrl;
	}
	public String getShopDetailUrl( ) {
		return this.shopDetailUrl;
	}

}
