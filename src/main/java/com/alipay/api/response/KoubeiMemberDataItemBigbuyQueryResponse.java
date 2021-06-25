package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IndexBigbuyItem;
import com.alipay.api.domain.IndexBlockBanner;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.member.data.item.bigbuy.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMemberDataItemBigbuyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7776411697854216251L;

	/** 
	 * 超值抢购商品信息
	 */
	@ApiListField("big_buy_item_list")
	@ApiField("index_bigbuy_item")
	private List<IndexBigbuyItem> bigBuyItemList;

	/** 
	 * 当前时间
	 */
	@ApiField("current_time")
	private Long currentTime;

	/** 
	 * 排期结束时间
	 */
	@ApiField("gmt_end")
	private Long gmtEnd;

	/** 
	 * 排期开始时间
	 */
	@ApiField("gmt_start")
	private Long gmtStart;

	/** 
	 * 营销展位码，如果运营配置了对应的展位码并且这些展位码能够查询到推按信息的话第一个会展示此展位码
	 */
	@ApiField("index_block_banner")
	private IndexBlockBanner indexBlockBanner;

	/** 
	 * 区块跳转链接
	 */
	@ApiField("promo_schema")
	private String promoSchema;

	public void setBigBuyItemList(List<IndexBigbuyItem> bigBuyItemList) {
		this.bigBuyItemList = bigBuyItemList;
	}
	public List<IndexBigbuyItem> getBigBuyItemList( ) {
		return this.bigBuyItemList;
	}

	public void setCurrentTime(Long currentTime) {
		this.currentTime = currentTime;
	}
	public Long getCurrentTime( ) {
		return this.currentTime;
	}

	public void setGmtEnd(Long gmtEnd) {
		this.gmtEnd = gmtEnd;
	}
	public Long getGmtEnd( ) {
		return this.gmtEnd;
	}

	public void setGmtStart(Long gmtStart) {
		this.gmtStart = gmtStart;
	}
	public Long getGmtStart( ) {
		return this.gmtStart;
	}

	public void setIndexBlockBanner(IndexBlockBanner indexBlockBanner) {
		this.indexBlockBanner = indexBlockBanner;
	}
	public IndexBlockBanner getIndexBlockBanner( ) {
		return this.indexBlockBanner;
	}

	public void setPromoSchema(String promoSchema) {
		this.promoSchema = promoSchema;
	}
	public String getPromoSchema( ) {
		return this.promoSchema;
	}

}
