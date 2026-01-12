package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生排班列表查询接口
 *
 * @author auto create
 * @since 1.0, 2025-08-25 13:39:29
 */
public class AlipayCommerceMedicalLargermodelDoctorscheduleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1527636211519332322L;

	/**
	 * 来源渠道，健康管家渠道码：HEALTH_BUTLER_REGISTER
安诊儿：
AN_ZHEN_ER_REGISTER
挂号频道：
CHANNEL_SEARCH_REGISTER
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 会话id
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 灵知医生id
	 */
	@ApiField("doctor_inner_id")
	private String doctorInnerId;

	/**
	 * 降级兜底标记：
默认：false
true: 若query召回不到，走兜底召回策略
false: 不使用兜底召回策略
	 */
	@ApiField("downgrade_flag")
	private Boolean downgradeFlag;

	/**
	 * 筛选项
	 */
	@ApiField("filter_item")
	private FilterItem filterItem;

	/**
	 * 浙江省xxx医院
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * LBS纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * LBS精度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 分页key
	 */
	@ApiField("page_key")
	private String pageKey;

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
	 * 用户意图识别指定的出诊时间
	 */
	@ApiField("register_date")
	private RegisterDate registerDate;

	/**
	 * 场景编码，枚举值
管家APP: HEALTH_BUTLER_APP 
管家小程序：HEALTH_BUTLER
安诊儿APP:
AN_ZHEN_ER_APP
安诊儿小程序
AN_ZHEN_ER
挂号频道小程序
CHANNEL_SEARCH
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 回传缓存的key
	 */
	@ApiField("second_page_key")
	private String secondPageKey;

	/**
	 * 标准科室名称
	 */
	@ApiField("univ_department_name")
	private String univDepartmentName;

	/**
	 * 用户定位城市编码
	 */
	@ApiField("user_city_code")
	private String userCityCode;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户定位省份编码
	 */
	@ApiField("user_province_code")
	private String userProvinceCode;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getChatId() {
		return this.chatId;
	}
	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getDoctorInnerId() {
		return this.doctorInnerId;
	}
	public void setDoctorInnerId(String doctorInnerId) {
		this.doctorInnerId = doctorInnerId;
	}

	public Boolean getDowngradeFlag() {
		return this.downgradeFlag;
	}
	public void setDowngradeFlag(Boolean downgradeFlag) {
		this.downgradeFlag = downgradeFlag;
	}

	public FilterItem getFilterItem() {
		return this.filterItem;
	}
	public void setFilterItem(FilterItem filterItem) {
		this.filterItem = filterItem;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPageKey() {
		return this.pageKey;
	}
	public void setPageKey(String pageKey) {
		this.pageKey = pageKey;
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

	public RegisterDate getRegisterDate() {
		return this.registerDate;
	}
	public void setRegisterDate(RegisterDate registerDate) {
		this.registerDate = registerDate;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSecondPageKey() {
		return this.secondPageKey;
	}
	public void setSecondPageKey(String secondPageKey) {
		this.secondPageKey = secondPageKey;
	}

	public String getUnivDepartmentName() {
		return this.univDepartmentName;
	}
	public void setUnivDepartmentName(String univDepartmentName) {
		this.univDepartmentName = univDepartmentName;
	}

	public String getUserCityCode() {
		return this.userCityCode;
	}
	public void setUserCityCode(String userCityCode) {
		this.userCityCode = userCityCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserProvinceCode() {
		return this.userProvinceCode;
	}
	public void setUserProvinceCode(String userProvinceCode) {
		this.userProvinceCode = userProvinceCode;
	}

}
