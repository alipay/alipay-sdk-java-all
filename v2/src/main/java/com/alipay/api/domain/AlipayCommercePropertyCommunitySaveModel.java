package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 项目创建或更新接口
 *
 * @author auto create
 * @since 1.0, 2025-06-25 15:22:32
 */
public class AlipayCommercePropertyCommunitySaveModel extends AlipayObject {

	private static final long serialVersionUID = 7539165452241834336L;

	/**
	 * 执行动作
新增：ADD
更新：UPDATE
	 */
	@ApiField("action")
	private String action;

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
	 * 项目ID,新增时非必填，更新时与外部项目ID二选一
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
	private CustomConfigVO customConfig;

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
	private LocationAuthConfigVO locationAuthConfig;

	/**
	 * 外部项目ID，新增时必填，更新时与项目ID二选一
	 */
	@ApiField("out_community_id")
	private String outCommunityId;

	/**
	 * 一方报事配置
	 */
	@ApiField("patrol_report_config")
	private SavePatrolReportConfigVO patrolReportConfig;

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
	private VisitorConfigVO visitorConfig;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

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

	public CustomConfigVO getCustomConfig() {
		return this.customConfig;
	}
	public void setCustomConfig(CustomConfigVO customConfig) {
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

	public LocationAuthConfigVO getLocationAuthConfig() {
		return this.locationAuthConfig;
	}
	public void setLocationAuthConfig(LocationAuthConfigVO locationAuthConfig) {
		this.locationAuthConfig = locationAuthConfig;
	}

	public String getOutCommunityId() {
		return this.outCommunityId;
	}
	public void setOutCommunityId(String outCommunityId) {
		this.outCommunityId = outCommunityId;
	}

	public SavePatrolReportConfigVO getPatrolReportConfig() {
		return this.patrolReportConfig;
	}
	public void setPatrolReportConfig(SavePatrolReportConfigVO patrolReportConfig) {
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

	public VisitorConfigVO getVisitorConfig() {
		return this.visitorConfig;
	}
	public void setVisitorConfig(VisitorConfigVO visitorConfig) {
		this.visitorConfig = visitorConfig;
	}

}
