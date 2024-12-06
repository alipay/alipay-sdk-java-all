package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公交od 用户画像
 *
 * @author auto create
 * @since 1.0, 2020-04-01 13:03:38
 */
public class CloudbusUserInfo extends AlipayObject {

	private static final long serialVersionUID = 5225449787366822284L;

	/**
	 * 小孩
	 */
	@ApiField("age_chrild")
	private Long ageChrild;

	/**
	 * 中年人
	 */
	@ApiField("age_mider")
	private Long ageMider;

	/**
	 * 老年人
	 */
	@ApiField("age_older")
	private Long ageOlder;

	/**
	 * 年前人
	 */
	@ApiField("age_youth")
	private Long ageYouth;

	/**
	 * 男性人数
	 */
	@ApiField("sex_man")
	private Long sexMan;

	/**
	 * 女性人数
	 */
	@ApiField("sex_woman")
	private Long sexWoman;

	/**
	 * 上班族
	 */
	@ApiField("w_officer")
	private Long wOfficer;

	/**
	 * 非上班族
	 */
	@ApiField("w_unofficer")
	private Long wUnofficer;

	public Long getAgeChrild() {
		return this.ageChrild;
	}
	public void setAgeChrild(Long ageChrild) {
		this.ageChrild = ageChrild;
	}

	public Long getAgeMider() {
		return this.ageMider;
	}
	public void setAgeMider(Long ageMider) {
		this.ageMider = ageMider;
	}

	public Long getAgeOlder() {
		return this.ageOlder;
	}
	public void setAgeOlder(Long ageOlder) {
		this.ageOlder = ageOlder;
	}

	public Long getAgeYouth() {
		return this.ageYouth;
	}
	public void setAgeYouth(Long ageYouth) {
		this.ageYouth = ageYouth;
	}

	public Long getSexMan() {
		return this.sexMan;
	}
	public void setSexMan(Long sexMan) {
		this.sexMan = sexMan;
	}

	public Long getSexWoman() {
		return this.sexWoman;
	}
	public void setSexWoman(Long sexWoman) {
		this.sexWoman = sexWoman;
	}

	public Long getwOfficer() {
		return this.wOfficer;
	}
	public void setwOfficer(Long wOfficer) {
		this.wOfficer = wOfficer;
	}

	public Long getwUnofficer() {
		return this.wUnofficer;
	}
	public void setwUnofficer(Long wUnofficer) {
		this.wUnofficer = wUnofficer;
	}

}
