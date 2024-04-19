package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 变更物业小区信息
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:34:01
 */
public class AlipayEcoCplifeCommunityModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2335627656639911951L;

	/**
	 * 若开发者录入的物业小区需要精确对应地图上多个小区（比如物业系统中的小区包含类似一期二期、或东区西区的组团结构），以便后续线上推广时覆盖到对应小区的住户，可以指定关联的高德地图中住宅、住宿或地名地址等小区相关类型的POI（地图兴趣点）ID列表。
若传入该参数且参数值合法，则该参数的优先级高于传入的地理位置经纬度。

注：最多包含10组poiid。

高德POI ID的获取接口：
http://lbs.amap.com/api/webservice/guide/api/search/
	 */
	@ApiListField("associated_pois")
	@ApiField("string")
	private List<String> associatedPois;

	/**
	 * 地级市编码，国标码，详见国家统计局数据 <a href="https://gw.alipayobjects.com/os/bmw-prod/ecac67e2-ff88-4b74-8dbe-33a6cbecfee0.xls">点此下载</a>。
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 小区主要详细地址，不需要包含省市区名称。
	 */
	@ApiField("community_address")
	private String communityAddress;

	/**
	 * 支付宝社区小区统一编号，必须在物业账号名下存在。
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 小区所在的经纬度列表（注：需要是高德坐标系），每对经纬度用"|"分隔，经度在前，纬度在后，经纬度小数点后不超过6位。

注：若新建的小区覆盖多个片区，最多包含5组经纬度，其中第一组作为主经纬度。

经纬度是小区搜索和用户推广的重要参数，录入时请确保经纬度参数准确。
高德经纬度查询接口：http://lbs.amap.com/api/webservice/guide/api/search/

高德坐标系转换接口：http://lbs.amap.com/api/webservice/guide/api/convert/
	 */
	@ApiListField("community_locations")
	@ApiField("string")
	private List<String> communityLocations;

	/**
	 * 小区名称，最长不超过32个字符。
	 */
	@ApiField("community_name")
	private String communityName;

	/**
	 * 区县编码，国标码，详见国家统计局数据 <a href="https://gw.alipayobjects.com/os/bmw-prod/ecac67e2-ff88-4b74-8dbe-33a6cbecfee0.xls">点此下载</a>。
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 需要提供物业服务热线或联系电话，便于用户在需要时联系物业。
	 */
	@ApiField("hotline")
	private String hotline;

	/**
	 * 小区在物业系统中的唯一编号。
	 */
	@ApiField("out_community_id")
	private String outCommunityId;

	/**
	 * 省份编码，国标码，详见国家统计局数据 <a href="https://gw.alipayobjects.com/os/bmw-prod/ecac67e2-ff88-4b74-8dbe-33a6cbecfee0.xls">点此下载</a>。
	 */
	@ApiField("province_code")
	private String provinceCode;

	public List<String> getAssociatedPois() {
		return this.associatedPois;
	}
	public void setAssociatedPois(List<String> associatedPois) {
		this.associatedPois = associatedPois;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCommunityAddress() {
		return this.communityAddress;
	}
	public void setCommunityAddress(String communityAddress) {
		this.communityAddress = communityAddress;
	}

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public List<String> getCommunityLocations() {
		return this.communityLocations;
	}
	public void setCommunityLocations(List<String> communityLocations) {
		this.communityLocations = communityLocations;
	}

	public String getCommunityName() {
		return this.communityName;
	}
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getHotline() {
		return this.hotline;
	}
	public void setHotline(String hotline) {
		this.hotline = hotline;
	}

	public String getOutCommunityId() {
		return this.outCommunityId;
	}
	public void setOutCommunityId(String outCommunityId) {
		this.outCommunityId = outCommunityId;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
