package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资源上报
 *
 * @author auto create
 * @since 1.0, 2023-01-30 19:35:54
 */
public class AlipayOpenServicemarketResourceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3294291432683327358L;

	/**
	 * 资源消耗记录
	 */
	@ApiListField("ability_resource_consume")
	@ApiField("ability_resource_consume")
	private List<AbilityResourceConsume> abilityResourceConsume;

	/**
	 * 资源执行的结束时间
	 */
	@ApiField("execution_time_end")
	private String executionTimeEnd;

	/**
	 * 上报的时候计量的开始时间
	 */
	@ApiField("execution_time_start")
	private String executionTimeStart;

	/**
	 * 描述
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 资源上报接口,订单消息里面的商品code
	 */
	@ApiField("outer_code")
	private String outerCode;

	/**
	 * isv每次上报的id
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * Frequency：使用次数（次）
      Period：使用时长（秒）
     Storage：使用存储空间（Byte）
     NetworkOut：上行使用流量（Bit/s）
     NetworkIn：下行使用流量（Bit/s）
      Character：字符数（个）
     DailyActiveUser：日活跃用户数（DAU）
     PeriodMin：使用时长（分钟）
	 */
	@ApiField("record_unit")
	private String recordUnit;

	/**
	 * 描述
	 */
	@ApiField("uid")
	private String uid;

	public List<AbilityResourceConsume> getAbilityResourceConsume() {
		return this.abilityResourceConsume;
	}
	public void setAbilityResourceConsume(List<AbilityResourceConsume> abilityResourceConsume) {
		this.abilityResourceConsume = abilityResourceConsume;
	}

	public String getExecutionTimeEnd() {
		return this.executionTimeEnd;
	}
	public void setExecutionTimeEnd(String executionTimeEnd) {
		this.executionTimeEnd = executionTimeEnd;
	}

	public String getExecutionTimeStart() {
		return this.executionTimeStart;
	}
	public void setExecutionTimeStart(String executionTimeStart) {
		this.executionTimeStart = executionTimeStart;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOuterCode() {
		return this.outerCode;
	}
	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getRecordUnit() {
		return this.recordUnit;
	}
	public void setRecordUnit(String recordUnit) {
		this.recordUnit = recordUnit;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
