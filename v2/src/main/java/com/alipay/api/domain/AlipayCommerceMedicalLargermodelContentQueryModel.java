package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗大模型服务对外推荐和承接页接口
 *
 * @author auto create
 * @since 1.0, 2025-02-26 22:43:17
 */
public class AlipayCommerceMedicalLargermodelContentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5834141535468325381L;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 01:身份证,02:护照,03:军官证,04:士兵证,05:户口本,06:警官证,07:台湾居民来往大陆通行证（简称“回乡证”）,08:港澳居民来往内地通行证（简称“回乡证”）,09:临时身份证,10:港澳通行证,11:营业执照,13:香港身份证,15:组织机构代码证,16:行政机关,17:社会团体,19:台湾居民来往大陆通行证,20:港澳居民居住证,21:台湾居民居住证,22:外国人永久居留证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 参保城市编码
	 */
	@ApiField("insured_city_code")
	private String insuredCityCode;

	/**
	 * 纬度 无需携带单位符号
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度 无需携带单位符号
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用于区分同一个app下的机构
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 当out_user_id为2088uid时，需将这个值设置为：ALIPAY_UID；当out_user_id为其他值时，可将这个值设置为：OTHER_UID；若是open_id时，设置为ALIPAY_OPENID
	 */
	@ApiField("out_user_type")
	private String outUserType;

	/**
	 * 页面id，指定哪个页面模板来获取数据
	 */
	@ApiField("page_id")
	private String pageId;

	/**
	 * ADB查询adb的数据
LLM表示查询大模型的数据
	 */
	@ApiField("query_stage")
	private String queryStage;

	/**
	 * 区分当前对话场景意图 待分配后传入固定值
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 用户姓名
	 */
	@ApiField("username")
	private String username;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
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

	public String getInsuredCityCode() {
		return this.insuredCityCode;
	}
	public void setInsuredCityCode(String insuredCityCode) {
		this.insuredCityCode = insuredCityCode;
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

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getOutUserType() {
		return this.outUserType;
	}
	public void setOutUserType(String outUserType) {
		this.outUserType = outUserType;
	}

	public String getPageId() {
		return this.pageId;
	}
	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String getQueryStage() {
		return this.queryStage;
	}
	public void setQueryStage(String queryStage) {
		this.queryStage = queryStage;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

}
