package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销活动限制
 *
 * @author auto create
 * @since 1.0, 2020-09-14 15:48:38
 */
public class ActivityLimitationDTO extends AlipayObject {

	private static final long serialVersionUID = 2696986796614913428L;

	/**
	 * 限制份数，与限制类型对应的数量，必须是数字格式，且与限制类型的位置要对应。
多个用英文逗号分隔
	 */
	@ApiField("limit_num")
	private String limitNum;

	/**
	 * 限制类型，每天、每人、总量。
枚举值:oneday,oneperson,totalamount
多个限制类型，用英文逗号分隔
	 */
	@ApiField("limit_type")
	private String limitType;

	/**
	 * 是否限购：Y/N
枚举值:Y/N
	 */
	@ApiField("limited")
	private String limited;

	public String getLimitNum() {
		return this.limitNum;
	}
	public void setLimitNum(String limitNum) {
		this.limitNum = limitNum;
	}

	public String getLimitType() {
		return this.limitType;
	}
	public void setLimitType(String limitType) {
		this.limitType = limitType;
	}

	public String getLimited() {
		return this.limited;
	}
	public void setLimited(String limited) {
		this.limited = limited;
	}

}
