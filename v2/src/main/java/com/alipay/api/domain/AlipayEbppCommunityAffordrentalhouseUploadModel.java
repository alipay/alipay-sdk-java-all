package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保租房源上报
 *
 * @author auto create
 * @since 1.0, 2024-11-04 19:57:18
 */
public class AlipayEbppCommunityAffordrentalhouseUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5317616372453391513L;

	/**
	 * 详细地址信息
	 */
	@ApiField("address")
	private String address;

	/**
	 * 6位城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 房源详情链接,可以使用h5链接或者支付宝小程序链接
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 户型列表
	 */
	@ApiListField("house_mode_list")
	@ApiField("house_mode")
	private List<HouseMode> houseModeList;

	/**
	 * 户型数量，小区一共有多少种户型
	 */
	@ApiField("house_mode_num")
	private Long houseModeNum;

	/**
	 * 当前保租房源可租房子数
	 */
	@ApiField("house_num")
	private Long houseNum;

	/**
	 * 纬度
	 */
	@ApiField("lat")
	private String lat;

	/**
	 * 经度
	 */
	@ApiField("lng")
	private String lng;

	/**
	 * 房源所属平台编码
	 */
	@ApiField("source")
	private String source;

	/**
	 * 房源所属平台唯一编码
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 房源所属名称
	 */
	@ApiField("source_name")
	private String sourceName;

	/**
	 * 房源状态 0 上线 1下线
	 */
	@ApiField("status")
	private String status;

	/**
	 * 房源联系电话号码，支持11位数字手机号码，和座机号码
	 */
	@ApiField("tel")
	private String tel;

	/**
	 * 房源标题
	 */
	@ApiField("title")
	private String title;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public List<HouseMode> getHouseModeList() {
		return this.houseModeList;
	}
	public void setHouseModeList(List<HouseMode> houseModeList) {
		this.houseModeList = houseModeList;
	}

	public Long getHouseModeNum() {
		return this.houseModeNum;
	}
	public void setHouseModeNum(Long houseModeNum) {
		this.houseModeNum = houseModeNum;
	}

	public Long getHouseNum() {
		return this.houseNum;
	}
	public void setHouseNum(Long houseNum) {
		this.houseNum = houseNum;
	}

	public String getLat() {
		return this.lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return this.lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceName() {
		return this.sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTel() {
		return this.tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
