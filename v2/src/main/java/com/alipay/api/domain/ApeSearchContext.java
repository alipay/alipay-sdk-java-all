package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ape搜索的上下文
 *
 * @author auto create
 * @since 1.0, 2023-07-03 21:29:54
 */
public class ApeSearchContext extends AlipayObject {

	private static final long serialVersionUID = 6336616837618545766L;

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
	 * 用户设备id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 已经曝光的item列表，用于曝光去重，多个itemid用,分割，这部分item不会出现在推荐结果中。
	 */
	@ApiListField("expose_item_list")
	@ApiField("string")
	private List<String> exposeItemList;

	/**
	 * 搜索的过滤条件
	 */
	@ApiField("filter_condition")
	private String filterCondition;

	/**
	 * 用户当前位置纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 用户当前位置经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 召回个数 当前字段已废弃(接口有另外定义，不在需要此处定义)
	 */
	@ApiField("size")
	@Deprecated
	private Long size;

	/**
	 * 排序类型，传的结构为字段+"#"+顺序，比如需要价格倒叙 current_price#desc,价格顺序 current_price#asc,销量倒叙 sale_number#desc
	 */
	@ApiField("sort_type")
	private String sortType;

	/**
	 * 召回起始位置( 当前字段已废弃(接口有另外定义，不在需要此处定义)
	 */
	@ApiField("start_index")
	@Deprecated
	private Long startIndex;

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

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public List<String> getExposeItemList() {
		return this.exposeItemList;
	}
	public void setExposeItemList(List<String> exposeItemList) {
		this.exposeItemList = exposeItemList;
	}

	public String getFilterCondition() {
		return this.filterCondition;
	}
	public void setFilterCondition(String filterCondition) {
		this.filterCondition = filterCondition;
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

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public String getSortType() {
		return this.sortType;
	}
	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

	public Long getStartIndex() {
		return this.startIndex;
	}
	public void setStartIndex(Long startIndex) {
		this.startIndex = startIndex;
	}

}
