package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资源消耗记录
 *
 * @author auto create
 * @since 1.0, 2020-08-12 16:37:52
 */
public class AbilityResourceConsume extends AlipayObject {

	private static final long serialVersionUID = 6164856359154441932L;

	/**
	 * 业务标记
	 */
	@ApiListField("ability_resource_biz_mark")
	@ApiField("ability_resource_biz_mark")
	private List<AbilityResourceBizMark> abilityResourceBizMark;

	/**
	 * isv提供的资源消耗code,是单次上报的全局唯一code
	 */
	@ApiField("consume_code")
	private String consumeCode;

	/**
	 * 资源计量的结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * isv资源被使用的时候,商户绑定的appid
	 */
	@ApiField("m_app_id")
	private String mAppId;

	/**
	 * 计量值,当前时间段类消耗了多少
	 */
	@ApiField("record_val")
	private String recordVal;

	/**
	 * 资源计量的开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	public List<AbilityResourceBizMark> getAbilityResourceBizMark() {
		return this.abilityResourceBizMark;
	}
	public void setAbilityResourceBizMark(List<AbilityResourceBizMark> abilityResourceBizMark) {
		this.abilityResourceBizMark = abilityResourceBizMark;
	}

	public String getConsumeCode() {
		return this.consumeCode;
	}
	public void setConsumeCode(String consumeCode) {
		this.consumeCode = consumeCode;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getmAppId() {
		return this.mAppId;
	}
	public void setmAppId(String mAppId) {
		this.mAppId = mAppId;
	}

	public String getRecordVal() {
		return this.recordVal;
	}
	public void setRecordVal(String recordVal) {
		this.recordVal = recordVal;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
