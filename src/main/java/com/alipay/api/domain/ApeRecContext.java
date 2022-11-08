package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 推荐上下文
 *
 * @author auto create
 * @since 1.0, 2022-11-02 16:36:15
 */
public class ApeRecContext extends AlipayObject {

	private static final long serialVersionUID = 7343993236151376659L;

	/**
	 * 类目列表，推荐结果只会包含该类目的商品，为空时代表返回所有的商品。多个条件是与的关系。
	 */
	@ApiListField("cate")
	@ApiField("string")
	private List<String> cate;

	/**
	 * 用户当前城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 客户端环境
	 */
	@ApiField("client_env")
	private String clientEnv;

	/**
	 * 商品详情页当前商品的id，用于商品详情页的相关推荐（猜你喜欢）场景。
	 */
	@ApiField("current_item_id")
	private String currentItemId;

	/**
	 * 用户设备id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 承接的itemId列表
	 */
	@ApiListField("landing_item_list")
	@ApiField("string")
	private List<String> landingItemList;

	/**
	 * 用户当前位置纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 通过LBS召回的距离，范围是[100,50 000],如果不传则会默认是5000米。此数据单位为米。
	 */
	@ApiField("lbs_distance")
	private Long lbsDistance;

	/**
	 * 用户当前位置经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 指定召回的索引列表，例如：["crowdType#新客", "crowdType#老客"]，多个条件是与的关系。
	 */
	@ApiListField("other_index_list")
	@ApiField("string")
	private List<String> otherIndexList;

	/**
	 * 选品池id list
	 */
	@ApiListField("select_id_list")
	@ApiField("string")
	private List<String> selectIdList;

	/**
	 * 标签列表，推荐结果只会包含该标签的商品，为空时代表返回所有的商品。多个条件是与的关系。
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	public List<String> getCate() {
		return this.cate;
	}
	public void setCate(List<String> cate) {
		this.cate = cate;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getClientEnv() {
		return this.clientEnv;
	}
	public void setClientEnv(String clientEnv) {
		this.clientEnv = clientEnv;
	}

	public String getCurrentItemId() {
		return this.currentItemId;
	}
	public void setCurrentItemId(String currentItemId) {
		this.currentItemId = currentItemId;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public List<String> getLandingItemList() {
		return this.landingItemList;
	}
	public void setLandingItemList(List<String> landingItemList) {
		this.landingItemList = landingItemList;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public Long getLbsDistance() {
		return this.lbsDistance;
	}
	public void setLbsDistance(Long lbsDistance) {
		this.lbsDistance = lbsDistance;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public List<String> getOtherIndexList() {
		return this.otherIndexList;
	}
	public void setOtherIndexList(List<String> otherIndexList) {
		this.otherIndexList = otherIndexList;
	}

	public List<String> getSelectIdList() {
		return this.selectIdList;
	}
	public void setSelectIdList(List<String> selectIdList) {
		this.selectIdList = selectIdList;
	}

	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

}
