package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券信息
 *
 * @author auto create
 * @since 1.0, 2018-07-06 17:36:30
 */
public class MerchantActivityVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 5133656788722349697L;

	/**
	 * 券logo
券logo最大字符数不能超过64
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 子标题
券子标题最大字符数不能超过256
券子标题最小字符数不能低于2
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 使用须知
券使用须知最大字符数不能超过1000
	 */
	@ApiField("user_introductions")
	private String userIntroductions;

	/**
	 * 领取后, 第几天开始生效
valid_time_type=RELATIVE时有效且必填
	 */
	@ApiField("valid_days_range_from")
	private Long validDaysRangeFrom;

	/**
	 * 领取后, 第几天失效
valid_time_type=RELATIVE时有效且必填
	 */
	@ApiField("valid_days_range_to")
	private Long validDaysRangeTo;

	/**
	 * 有效期开始时间
valid_time_type=FIXED时有效且必填
券有效开始时间格式必须为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("valid_time_range_from")
	private String validTimeRangeFrom;

	/**
	 * 有效期截止时间
valid_time_type=FIXED时有效且必填
券有效结束时间格式必须为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("valid_time_range_to")
	private String validTimeRangeTo;

	/**
	 * 有效期类型
	 */
	@ApiField("valid_time_type")
	private String validTimeType;

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getUserIntroductions() {
		return this.userIntroductions;
	}
	public void setUserIntroductions(String userIntroductions) {
		this.userIntroductions = userIntroductions;
	}

	public Long getValidDaysRangeFrom() {
		return this.validDaysRangeFrom;
	}
	public void setValidDaysRangeFrom(Long validDaysRangeFrom) {
		this.validDaysRangeFrom = validDaysRangeFrom;
	}

	public Long getValidDaysRangeTo() {
		return this.validDaysRangeTo;
	}
	public void setValidDaysRangeTo(Long validDaysRangeTo) {
		this.validDaysRangeTo = validDaysRangeTo;
	}

	public String getValidTimeRangeFrom() {
		return this.validTimeRangeFrom;
	}
	public void setValidTimeRangeFrom(String validTimeRangeFrom) {
		this.validTimeRangeFrom = validTimeRangeFrom;
	}

	public String getValidTimeRangeTo() {
		return this.validTimeRangeTo;
	}
	public void setValidTimeRangeTo(String validTimeRangeTo) {
		this.validTimeRangeTo = validTimeRangeTo;
	}

	public String getValidTimeType() {
		return this.validTimeType;
	}
	public void setValidTimeType(String validTimeType) {
		this.validTimeType = validTimeType;
	}

}
