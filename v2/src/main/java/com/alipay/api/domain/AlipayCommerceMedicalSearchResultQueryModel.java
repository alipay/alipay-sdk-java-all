package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 好大夫app综合搜索
 *
 * @author auto create
 * @since 1.0, 2026-04-16 17:47:45
 */
public class AlipayCommerceMedicalSearchResultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1613529727758277457L;

	/**
	 * 账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 账号类型，0:支付宝/1:好大夫
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 渠道编码
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 出诊时间
	 */
	@ApiField("consultation_hours")
	private String consultationHours;

	/**
	 * 科室ID
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 医生标签
	 */
	@ApiField("doctor_tag")
	private String doctorTag;

	/**
	 * null
	 */
	@ApiListField("hos_category")
	@ApiField("string")
	private List<String> hosCategory;

	/**
	 * 医院性质：public/private
	 */
	@ApiField("hos_character")
	private String hosCharacter;

	/**
	 * null
	 */
	@ApiListField("hos_grade")
	@ApiField("string")
	private List<String> hosGrade;

	/**
	 * null
	 */
	@ApiListField("hos_tag")
	@ApiField("string")
	private List<String> hosTag;

	/**
	 * 医生所属医院等级：三甲/三级
	 */
	@ApiField("hospital_grade")
	private String hospitalGrade;

	/**
	 * null
	 */
	@ApiListField("key_list")
	@ApiField("key_info")
	private List<KeyInfo> keyList;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 价格，单位：元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 是	用户输入文本
	 */
	@ApiField("query")
	private String query;

	/**
	 * 接诊速度，单位：人/小时
	 */
	@ApiField("reception_speed")
	private String receptionSpeed;

	/**
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 搜索类型
	 */
	@ApiField("search_type")
	private String searchType;

	/**
	 * 服务类型
	 */
	@ApiField("service")
	private String service;

	/**
	 * 排序条件
	 */
	@ApiField("sort_condition")
	private String sortCondition;

	/**
	 * 医生职称：主任医师、主治医师
	 */
	@ApiField("title")
	private String title;

	/**
	 * 用户定位城市编码
	 */
	@ApiField("user_city_code")
	private String userCityCode;

	/**
	 * 用户lbs，单位：degrees
	 */
	@ApiField("user_latitude")
	private String userLatitude;

	/**
	 * 用户lbs，单位：degrees
	 */
	@ApiField("user_longitude")
	private String userLongitude;

	/**
	 * 用户定位省份编码
	 */
	@ApiField("user_province_code")
	private String userProvinceCode;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getConsultationHours() {
		return this.consultationHours;
	}
	public void setConsultationHours(String consultationHours) {
		this.consultationHours = consultationHours;
	}

	public String getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDoctorTag() {
		return this.doctorTag;
	}
	public void setDoctorTag(String doctorTag) {
		this.doctorTag = doctorTag;
	}

	public List<String> getHosCategory() {
		return this.hosCategory;
	}
	public void setHosCategory(List<String> hosCategory) {
		this.hosCategory = hosCategory;
	}

	public String getHosCharacter() {
		return this.hosCharacter;
	}
	public void setHosCharacter(String hosCharacter) {
		this.hosCharacter = hosCharacter;
	}

	public List<String> getHosGrade() {
		return this.hosGrade;
	}
	public void setHosGrade(List<String> hosGrade) {
		this.hosGrade = hosGrade;
	}

	public List<String> getHosTag() {
		return this.hosTag;
	}
	public void setHosTag(List<String> hosTag) {
		this.hosTag = hosTag;
	}

	public String getHospitalGrade() {
		return this.hospitalGrade;
	}
	public void setHospitalGrade(String hospitalGrade) {
		this.hospitalGrade = hospitalGrade;
	}

	public List<KeyInfo> getKeyList() {
		return this.keyList;
	}
	public void setKeyList(List<KeyInfo> keyList) {
		this.keyList = keyList;
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

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getReceptionSpeed() {
		return this.receptionSpeed;
	}
	public void setReceptionSpeed(String receptionSpeed) {
		this.receptionSpeed = receptionSpeed;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSearchType() {
		return this.searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getService() {
		return this.service;
	}
	public void setService(String service) {
		this.service = service;
	}

	public String getSortCondition() {
		return this.sortCondition;
	}
	public void setSortCondition(String sortCondition) {
		this.sortCondition = sortCondition;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserCityCode() {
		return this.userCityCode;
	}
	public void setUserCityCode(String userCityCode) {
		this.userCityCode = userCityCode;
	}

	public String getUserLatitude() {
		return this.userLatitude;
	}
	public void setUserLatitude(String userLatitude) {
		this.userLatitude = userLatitude;
	}

	public String getUserLongitude() {
		return this.userLongitude;
	}
	public void setUserLongitude(String userLongitude) {
		this.userLongitude = userLongitude;
	}

	public String getUserProvinceCode() {
		return this.userProvinceCode;
	}
	public void setUserProvinceCode(String userProvinceCode) {
		this.userProvinceCode = userProvinceCode;
	}

}
