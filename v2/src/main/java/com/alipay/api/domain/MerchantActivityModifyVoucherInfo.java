package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品券可修改字段模型
 *
 * @author auto create
 * @since 1.0, 2018-07-06 17:36:54
 */
public class MerchantActivityModifyVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 6129187981567186718L;

	/**
	 * 券logo
券logo最大字符数不能超过64
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 使用须知
券使用须知最大字符数不能超过256
	 */
	@ApiField("user_introductions")
	private String userIntroductions;

	/**
	 * 领取后, 第几天失效
valid_time_type=RELATIVE时有效且必填
只允许增加领取后可用天数
	 */
	@ApiField("valid_days_range_to")
	private Long validDaysRangeTo;

	/**
	 * 有效期截止时间
valid_time_type=FIXED时有效且必填
券有效结束时间格式必须为yyyy-MM-dd HH:mm:ss
只允许延长固定时间的结束时间（支持到分）
	 */
	@ApiField("valid_time_range_to")
	private String validTimeRangeTo;

	/**
	 * 有效期类型：
枚举值：RELATIVE/FIXED
	 */
	@ApiField("valid_time_type")
	private String validTimeType;

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getUserIntroductions() {
		return this.userIntroductions;
	}
	public void setUserIntroductions(String userIntroductions) {
		this.userIntroductions = userIntroductions;
	}

	public Long getValidDaysRangeTo() {
		return this.validDaysRangeTo;
	}
	public void setValidDaysRangeTo(Long validDaysRangeTo) {
		this.validDaysRangeTo = validDaysRangeTo;
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
