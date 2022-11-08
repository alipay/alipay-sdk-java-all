package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关联交易公司咨询
 *
 * @author auto create
 * @since 1.0, 2022-04-26 19:50:04
 */
public class AlipayBossRelatedCompanyConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5887792887196255178L;

	/**
	 * 咨询发生时间（单位；毫秒）
若无指定时间，使用系统当前时间。
	 */
	@ApiField("biz_time_in_mills")
	private Long bizTimeInMills;

	/**
	 * 咨询的关联方公司生效时间是否按照整月生效。
若无关联方识别整月对齐需求，传false。
	 */
	@ApiField("is_whole_month_valid")
	private Boolean isWholeMonthValid;

	/**
	 * 咨询类型：PID/UID/MID/CID/NAME/OU
	 */
	@ApiField("type")
	private String type;

	/**
	 * 根据咨询类型传入相应的咨询值
	 */
	@ApiField("value")
	private String value;

	public Long getBizTimeInMills() {
		return this.bizTimeInMills;
	}
	public void setBizTimeInMills(Long bizTimeInMills) {
		this.bizTimeInMills = bizTimeInMills;
	}

	public Boolean getIsWholeMonthValid() {
		return this.isWholeMonthValid;
	}
	public void setIsWholeMonthValid(Boolean isWholeMonthValid) {
		this.isWholeMonthValid = isWholeMonthValid;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
