package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CampDetailInfo;
import com.alipay.api.domain.ShopDiscountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.discount.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-23 09:51:16
 */
public class AlipayOfflineMarketShopDiscountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3186652299755177621L;

	/** 
	 * 返回商户正在进行中的活动摘要列表数据，注意：如果入参query_type不传递或者传递错误值，该参数将不会返回。
	 */
	@ApiListField("camp_list")
	@ApiField("camp_detail_info")
	private List<CampDetailInfo> campList;

	/** 
	 * 返回商户正在进行中的活动记录数，注意：如果入参query_type不传递或者传递错误值，该参数将不会返回。
	 */
	@ApiField("camp_num")
	private Long campNum;

	/** 
	 * 优惠信息列表，最大20条，按生效时间排序，注意：如果入参query_type传递了指定的值，该参数将不会返回。只有当query_type不传递时方可返回数据
	 */
	@ApiListField("discount_list")
	@ApiField("shop_discount_info")
	private List<ShopDiscountInfo> discountList;

	/** 
	 * 商品列表，最大20条，按申领数量排序，注意：如果入参query_type传递了指定的值，该参数将不会返回。只有当query_type不传递时方可返回数据
	 */
	@ApiListField("item_list")
	@ApiField("shop_discount_info")
	private List<ShopDiscountInfo> itemList;

	public void setCampList(List<CampDetailInfo> campList) {
		this.campList = campList;
	}
	public List<CampDetailInfo> getCampList( ) {
		return this.campList;
	}

	public void setCampNum(Long campNum) {
		this.campNum = campNum;
	}
	public Long getCampNum( ) {
		return this.campNum;
	}

	public void setDiscountList(List<ShopDiscountInfo> discountList) {
		this.discountList = discountList;
	}
	public List<ShopDiscountInfo> getDiscountList( ) {
		return this.discountList;
	}

	public void setItemList(List<ShopDiscountInfo> itemList) {
		this.itemList = itemList;
	}
	public List<ShopDiscountInfo> getItemList( ) {
		return this.itemList;
	}

}
