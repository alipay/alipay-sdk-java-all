package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境游商户店铺推荐接口
 *
 * @author auto create
 * @since 1.0, 2019-08-19 13:58:26
 */
public class AlipayOverseasTravelShopBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2176487539955334569L;

	/**
	 * 多端统一渠道信息，与服务提供方协商分配，为空则默认取appId
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 用户位置信息
	 */
	@ApiField("location")
	private OverseaLocation location;

	/**
	 * 分页配置，默认第1页，数量为5
	 */
	@ApiField("paginate_options")
	private PaginateOptions paginateOptions;

	/**
	 * 搜索半径，与经纬度配合使用，单独传递无效。单位：米，默认不指定
	 */
	@ApiField("radius")
	private Long radius;

	/**
	 * 店铺下优惠活动查询配置： 1. 店铺下是否做优惠券推荐（默认推荐） 2. 每个店铺推荐几个优惠券信息（默认5个）
	 */
	@ApiField("shop_promo_options")
	private ShopPromoOptions shopPromoOptions;

	/**
	 * 请求唯一id，只能是大小写字母及数字。不带业务含义，可以由uuid等随机生成，用于唯一标识一笔业务，方便排查问题
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/**
	 * 用户信息，个性化推荐的时候需要填写
	 */
	@ApiField("user_info")
	private OverseaUserInfo userInfo;

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public OverseaLocation getLocation() {
		return this.location;
	}
	public void setLocation(OverseaLocation location) {
		this.location = location;
	}

	public PaginateOptions getPaginateOptions() {
		return this.paginateOptions;
	}
	public void setPaginateOptions(PaginateOptions paginateOptions) {
		this.paginateOptions = paginateOptions;
	}

	public Long getRadius() {
		return this.radius;
	}
	public void setRadius(Long radius) {
		this.radius = radius;
	}

	public ShopPromoOptions getShopPromoOptions() {
		return this.shopPromoOptions;
	}
	public void setShopPromoOptions(ShopPromoOptions shopPromoOptions) {
		this.shopPromoOptions = shopPromoOptions;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public OverseaUserInfo getUserInfo() {
		return this.userInfo;
	}
	public void setUserInfo(OverseaUserInfo userInfo) {
		this.userInfo = userInfo;
	}

}
