package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 跨境游优惠信息获取
 *
 * @author auto create
 * @since 1.0, 2022-10-27 10:37:50
 */
public class AlipayOverseasTravelPromotionGetModel extends AlipayObject {

	private static final long serialVersionUID = 8789987284979465527L;

	/**
	 * 蚂蚁LBS基础设施定义的商圈码列表
	 */
	@ApiListField("biz_area_codes")
	@ApiField("string")
	private List<String> bizAreaCodes;

	/**
	 * 多端统一渠道信息，与服务提供方协商分配，为空则默认取appId
	 */
	@ApiField("ch_info")
	private String chInfo;

	/**
	 * 蚂蚁LBS基础设施定义的城市码列表
	 */
	@ApiListField("city_codes")
	@ApiField("string")
	private List<String> cityCodes;

	/**
	 * ISO-3166标准三位数据国家码列表
	 */
	@ApiListField("country_codes")
	@ApiField("string")
	private List<String> countryCodes;

	/**
	 * 纬度，double类型，有效区间[-90, 90]
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 地理位置反查级别枚举：支持国家（COUNTRY）、城市（CITY）、商圈（BIZ_AREA），表示从指定级别开始向上级反查，直到定位成功。默认：商圈（BIZ_AREA）
	 */
	@ApiField("lbs_reverse_level")
	private String lbsReverseLevel;

	/**
	 * 经度，double类型，有效区间[-180, 180]
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 用户id，与user_id_type配合使用，暂时仅支持集团havanaId和支付宝2088开头的16位数字ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 分页数，从1开始，默认为1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页大小，最小为1，默认为3
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 搜索半径，与经纬度配合使用，单独传递无效。单位：米，默认不指定
	 */
	@ApiField("radius")
	private Long radius;

	/**
	 * 优惠推荐的场景码，通过此字段识别不同的业务场景，不同场景依赖的参数不同，且有不同的推荐策略。可选值：COMMON_RECOMMEND（默认场景，常规推荐，支持区域码等大多数参数）；SHOP_PROMO_LIST（店铺优惠列表，仅且必须接受shop_id参数）。
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 店铺id，当scene_code=SHOP_PROMO_LIST时，此字段必填
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 置顶券id列表，该列表中的券将被置顶返回，顺序与入参顺序一致，如果券状态非法，则默认丢弃
	 */
	@ApiListField("top_promotion_ids")
	@ApiField("string")
	private List<String> topPromotionIds;

	/**
	 * 请求唯一id，只能是大小写字母及数字。不带业务含义，可以由uuid等随机生成，用于唯一标识一笔业务，方便与外部排查问题
	 */
	@ApiField("unique_id")
	private String uniqueId;

	/**
	 * 用户id，与user_id_type配合使用，暂时仅支持集团havanaId和支付宝2088开头的16位数字ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户id类型枚举，与user_id配合使用。取值说明：HAVANA为集团havanaId，ALIPAY为支付宝2088开头16位用户id
	 */
	@ApiField("user_id_type")
	private String userIdType;

	public List<String> getBizAreaCodes() {
		return this.bizAreaCodes;
	}
	public void setBizAreaCodes(List<String> bizAreaCodes) {
		this.bizAreaCodes = bizAreaCodes;
	}

	public String getChInfo() {
		return this.chInfo;
	}
	public void setChInfo(String chInfo) {
		this.chInfo = chInfo;
	}

	public List<String> getCityCodes() {
		return this.cityCodes;
	}
	public void setCityCodes(List<String> cityCodes) {
		this.cityCodes = cityCodes;
	}

	public List<String> getCountryCodes() {
		return this.countryCodes;
	}
	public void setCountryCodes(List<String> countryCodes) {
		this.countryCodes = countryCodes;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLbsReverseLevel() {
		return this.lbsReverseLevel;
	}
	public void setLbsReverseLevel(String lbsReverseLevel) {
		this.lbsReverseLevel = lbsReverseLevel;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getRadius() {
		return this.radius;
	}
	public void setRadius(Long radius) {
		this.radius = radius;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public List<String> getTopPromotionIds() {
		return this.topPromotionIds;
	}
	public void setTopPromotionIds(List<String> topPromotionIds) {
		this.topPromotionIds = topPromotionIds;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserIdType() {
		return this.userIdType;
	}
	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}

}
