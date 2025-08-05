package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动修改
 *
 * @author auto create
 * @since 1.0, 2025-04-25 16:17:08
 */
public class AlipayUserDtbankActivityModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7672447684434835243L;

	/**
	 * 数字分行活动唯一id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 外部业务号
	 */
	@ApiField("api_out_biz_no")
	private String apiOutBizNo;

	/**
	 * 修改类型：APPEND表示追加预算、DELAY表示活动延期
	 */
	@ApiField("modify_type")
	private String modifyType;

	/**
	 * 追加金额：单位分； 活动结束时间：精确到秒，格式为2020-01-01 00:00:00
	 */
	@ApiField("modify_value")
	private String modifyValue;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getApiOutBizNo() {
		return this.apiOutBizNo;
	}
	public void setApiOutBizNo(String apiOutBizNo) {
		this.apiOutBizNo = apiOutBizNo;
	}

	public String getModifyType() {
		return this.modifyType;
	}
	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
	}

	public String getModifyValue() {
		return this.modifyValue;
	}
	public void setModifyValue(String modifyValue) {
		this.modifyValue = modifyValue;
	}

}
