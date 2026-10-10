package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫二要素认证
 *
 * @author auto create
 * @since 1.0, 2026-09-29 15:27:52
 */
public class AlipayCommerceMedicalHdfFactorCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 7777428461151844471L;

	/**
	 * 192不带人像验证194带人像验证
isChineseIdCard为false比填
	 */
	@ApiField("auth_mode")
	private String authMode;

	/**
	 * 缓存有效期（秒），<=0 直接外部取数并刷新缓存，默认0
	 */
	@ApiField("cache_interval")
	private String cacheInterval;

	/**
	 * 证件号码
	 */
	@ApiField("id_number")
	private String idNumber;

	/**
	 * 华侨护照、大陆护照414；
港澳居民来往内地通行证516（中国籍）；
港澳居民来往内地通行证526（非中国籍）；
外国人永久居留身份证553；
台湾居民来往大陆通行证511；isChineseIdCard为false比填
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 是否中国身份证true是false否
	 */
	@ApiField("is_chinese_id_card")
	private Boolean isChineseIdCard;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 国籍，如："CHN"；
isChineseIdCard为false比填
	 */
	@ApiField("nation")
	private String nation;

	/**
	 * 图片大小
	 */
	@ApiField("photo_data")
	private String photoData;

	public String getAuthMode() {
		return this.authMode;
	}
	public void setAuthMode(String authMode) {
		this.authMode = authMode;
	}

	public String getCacheInterval() {
		return this.cacheInterval;
	}
	public void setCacheInterval(String cacheInterval) {
		this.cacheInterval = cacheInterval;
	}

	public String getIdNumber() {
		return this.idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public Boolean getIsChineseIdCard() {
		return this.isChineseIdCard;
	}
	public void setIsChineseIdCard(Boolean isChineseIdCard) {
		this.isChineseIdCard = isChineseIdCard;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNation() {
		return this.nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getPhotoData() {
		return this.photoData;
	}
	public void setPhotoData(String photoData) {
		this.photoData = photoData;
	}

}
