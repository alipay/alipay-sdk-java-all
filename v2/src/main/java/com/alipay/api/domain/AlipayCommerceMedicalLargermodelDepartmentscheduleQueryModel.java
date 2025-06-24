package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 科室医生排班列表推荐接口
 *
 * @author auto create
 * @since 1.0, 2025-04-27 11:49:03
 */
public class AlipayCommerceMedicalLargermodelDepartmentscheduleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8128487478332349718L;

	/**
	 * 来源渠道
健康管家渠道码：HEALTH_BUTLER_REGISTER
安诊儿：AN_ZHEN_ER_REGISTER
挂号频道：CHANNEL_SEARCH_REGISTER
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 会话id
	 */
	@ApiField("chat_id")
	private String chatId;

	/**
	 * 意图识别城市编码列表
	 */
	@ApiListField("city_code_list")
	@ApiField("string")
	private List<String> cityCodeList;

	/**
	 * 意图识别区域编码列表
	 */
	@ApiListField("district_code_list")
	@ApiField("string")
	private List<String> districtCodeList;

	/**
	 * 降级兜底标记：
默认：false
true: 若query召回不到，走兜底召回策略
false: 不使用兜底召回策略
	 */
	@ApiField("downgrade_flag")
	private Boolean downgradeFlag;

	/**
	 * {}
	 */
	@ApiField("extract_item_score_info")
	private ExtractItemScoreInfo extractItemScoreInfo;

	/**
	 * {}
	 */
	@ApiField("filter_item")
	private FilterItem filterItem;

	/**
	 * 意图识别医院级别列表
	 */
	@ApiListField("hos_grade_list")
	@ApiField("string")
	private List<String> hosGradeList;

	/**
	 * 意图识别医院名称列表
	 */
	@ApiListField("hos_name_list")
	@ApiField("string")
	private List<String> hosNameList;

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
	 * 意图识别省份编码列表
	 */
	@ApiListField("province_code_list")
	@ApiField("string")
	private List<String> provinceCodeList;

	/**
	 * 用户输入文本
	 */
	@ApiField("query")
	private String query;

	/**
	 * {"startDate":"2025-03-28","endDate":"2025-03-29"}
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
	 * 意图识别标准科室名称列表
	 */
	@ApiListField("univ_department_name_list")
	@ApiField("string")
	private List<String> univDepartmentNameList;

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

	public List<String> getCityCodeList() {
		return this.cityCodeList;
	}
	public void setCityCodeList(List<String> cityCodeList) {
		this.cityCodeList = cityCodeList;
	}

	public List<String> getDistrictCodeList() {
		return this.districtCodeList;
	}
	public void setDistrictCodeList(List<String> districtCodeList) {
		this.districtCodeList = districtCodeList;
	}

	public Boolean getDowngradeFlag() {
		return this.downgradeFlag;
	}
	public void setDowngradeFlag(Boolean downgradeFlag) {
		this.downgradeFlag = downgradeFlag;
	}

	public ExtractItemScoreInfo getExtractItemScoreInfo() {
		return this.extractItemScoreInfo;
	}
	public void setExtractItemScoreInfo(ExtractItemScoreInfo extractItemScoreInfo) {
		this.extractItemScoreInfo = extractItemScoreInfo;
	}

	public FilterItem getFilterItem() {
		return this.filterItem;
	}
	public void setFilterItem(FilterItem filterItem) {
		this.filterItem = filterItem;
	}

	public List<String> getHosGradeList() {
		return this.hosGradeList;
	}
	public void setHosGradeList(List<String> hosGradeList) {
		this.hosGradeList = hosGradeList;
	}

	public List<String> getHosNameList() {
		return this.hosNameList;
	}
	public void setHosNameList(List<String> hosNameList) {
		this.hosNameList = hosNameList;
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

	public List<String> getProvinceCodeList() {
		return this.provinceCodeList;
	}
	public void setProvinceCodeList(List<String> provinceCodeList) {
		this.provinceCodeList = provinceCodeList;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
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

	public List<String> getUnivDepartmentNameList() {
		return this.univDepartmentNameList;
	}
	public void setUnivDepartmentNameList(List<String> univDepartmentNameList) {
		this.univDepartmentNameList = univDepartmentNameList;
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
