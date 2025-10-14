package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-08-07 10:42:37
 */
public class CommunityInfoVO extends AlipayObject {

	private static final long serialVersionUID = 5121164761437966499L;

	/**
	 * 市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 项目ID
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 项目名称
	 */
	@ApiField("community_name")
	private String communityName;

	/**
	 * 联系电话
	 */
	@ApiField("contact_number")
	private String contactNumber;

	/**
	 * 自定义配置
	 */
	@ApiField("custom_config")
	private CustomConfigQueryVO customConfig;

	/**
	 * 详细地址
	 */
	@ApiField("detail")
	private String detail;

	/**
	 * 区编码
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 区名称
	 */
	@ApiField("district_name")
	private String districtName;

	/**
	 * 是否启用消控室 true|false
true:创建消控室
false:删除消控室
	 */
	@ApiField("enable_monitor_room")
	private Boolean enableMonitorRoom;

	/**
	 * 位置授权配置
	 */
	@ApiField("location_auth_config")
	private LocationAuthConfigQueryVO locationAuthConfig;

	/**
	 * 外部项目ID
	 */
	@ApiField("out_community_id")
	private String outCommunityId;

	/**
	 * 一方报事配置
	 */
	@ApiField("patrol_report_config")
	private PatrolReportConfigVO patrolReportConfig;

	/**
	 * 省编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 省名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 门禁视频配置 enableMonitorRoom=true必填
	 */
	@ApiField("visitor_config")
	private VisitorConfigQueryVO visitorConfig;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public String getCommunityName() {
		return this.communityName;
	}
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public CustomConfigQueryVO getCustomConfig() {
		return this.customConfig;
	}
	public void setCustomConfig(CustomConfigQueryVO customConfig) {
		this.customConfig = customConfig;
	}

	public String getDetail() {
		return this.detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return this.districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Boolean getEnableMonitorRoom() {
		return this.enableMonitorRoom;
	}
	public void setEnableMonitorRoom(Boolean enableMonitorRoom) {
		this.enableMonitorRoom = enableMonitorRoom;
	}

	public LocationAuthConfigQueryVO getLocationAuthConfig() {
		return this.locationAuthConfig;
	}
	public void setLocationAuthConfig(LocationAuthConfigQueryVO locationAuthConfig) {
		this.locationAuthConfig = locationAuthConfig;
	}

	public String getOutCommunityId() {
		return this.outCommunityId;
	}
	public void setOutCommunityId(String outCommunityId) {
		this.outCommunityId = outCommunityId;
	}

	public PatrolReportConfigVO getPatrolReportConfig() {
		return this.patrolReportConfig;
	}
	public void setPatrolReportConfig(PatrolReportConfigVO patrolReportConfig) {
		this.patrolReportConfig = patrolReportConfig;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public VisitorConfigQueryVO getVisitorConfig() {
		return this.visitorConfig;
	}
	public void setVisitorConfig(VisitorConfigQueryVO visitorConfig) {
		this.visitorConfig = visitorConfig;
	}

}
