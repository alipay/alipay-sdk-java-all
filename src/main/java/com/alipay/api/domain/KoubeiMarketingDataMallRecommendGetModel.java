package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 获取推荐商圈商品券接口
 *
 * @author auto create
 * @since 1.0, 2018-10-24 17:29:51
 */
public class KoubeiMarketingDataMallRecommendGetModel extends AlipayObject {

	private static final long serialVersionUID = 6525152822865837398L;

	/**
	 * 获取几条数据，最大值传入50，默认值10
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 获取的数据类型:big_item(商圈商品)、small_item(商圈下门店商品)、big_voucher(商圈券)、small_voucher(商圈下门店券)
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 设备ID
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 商圈ID
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 店铺类目ID
	 */
	@ApiListField("shop_category_ids")
	@ApiField("string")
	private List<String> shopCategoryIds;

	/**
	 * 起始数据下标，默认值0
	 */
	@ApiField("start")
	private Long start;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public List<String> getShopCategoryIds() {
		return this.shopCategoryIds;
	}
	public void setShopCategoryIds(List<String> shopCategoryIds) {
		this.shopCategoryIds = shopCategoryIds;
	}

	public Long getStart() {
		return this.start;
	}
	public void setStart(Long start) {
		this.start = start;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
