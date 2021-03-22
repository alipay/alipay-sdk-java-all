package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康卡实体数据
 *
 * @author auto create
 * @since 1.0, 2020-09-15 14:26:00
 */
public class HealthCard extends AlipayObject {

	private static final long serialVersionUID = 7667841162942225221L;

	/**
	 * 用户出生日期
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * 用户健康卡对应身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 由卫健委机构统一生成的健康卡卡号
	 */
	@ApiField("health_card_no")
	private String healthCardNo;

	/**
	 * 健康卡所属用户的真实姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用户性别，其中1代表男性，2代表女性
	 */
	@ApiField("sex")
	private String sex;

	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getHealthCardNo() {
		return this.healthCardNo;
	}
	public void setHealthCardNo(String healthCardNo) {
		this.healthCardNo = healthCardNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

}
