package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告投放券商品输出接口
 *
 * @author auto create
 * @since 1.0, 2018-07-31 20:47:38
 */
public class KoubeiAdvertDeliveryDiscountBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4643214797269963331L;

	/**
	 * 媒体编号，使用前需要找业务申请 ，不申请直接调用会失败
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 城市国标码，比如310100是上海
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 手机号码，不能和user_id同时存在
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 当strategy为QUERY_AND_PURCHASE时，循环发送券列表中的券，直到发券量达到purchase_num。
	 */
	@ApiField("purchase_num")
	private String purchaseNum;

	/**
	 * 门店ID
如果提供门店ID，则优先查询门店下发的券。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 输出的券列表大小
	 */
	@ApiField("size")
	private String size;

	/**
	 * 查询策略，查询并发送策略，只有白名单内ISV才有权限使用，如果不在白名单内，则忽略该字段并默认查询
QUERY：查券（默认值）
QUERY_AND_PURCHASE：查并领，为了优化体验，在查询时进行发券处理，顺序发送券列表的券，直达发券量达到purchase_num。
	 */
	@ApiField("strategy")
	private String strategy;

	/**
	 * 支付宝账户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPurchaseNum() {
		return this.purchaseNum;
	}
	public void setPurchaseNum(String purchaseNum) {
		this.purchaseNum = purchaseNum;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getStrategy() {
		return this.strategy;
	}
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
