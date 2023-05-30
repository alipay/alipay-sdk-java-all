package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ape搜索的上下文
 *
 * @author auto create
 * @since 1.0, 2023-05-06 16:23:20
 */
public class ApeSearchContext extends AlipayObject {

	private static final long serialVersionUID = 1252234743178241571L;

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
	 * 召回个数
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 召回起始位置
	 */
	@ApiField("start_index")
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

	public Long getStartIndex() {
		return this.startIndex;
	}
	public void setStartIndex(Long startIndex) {
		this.startIndex = startIndex;
	}

}
