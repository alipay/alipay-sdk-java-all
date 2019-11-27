package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金池预警配置
 *
 * @author auto create
 * @since 1.0, 2017-06-09 02:50:15
 */
public class KoubeiMarketingToolCapitalpoolAlarmSetModel extends AlipayObject {

	private static final long serialVersionUID = 5271243483593679786L;

	/**
	 * 预警金额
	 */
	@ApiField("alarm_amount")
	private String alarmAmount;

	/**
	 * 预警通知接收人手机号，多个手机号之间用逗号分隔
	 */
	@ApiField("alarm_receiver")
	private String alarmReceiver;

	/**
	 * 失效金额
	 */
	@ApiField("invalid_amount")
	private String invalidAmount;

	/**
	 * 资金池ID
	 */
	@ApiField("pool_id")
	private String poolId;

	public String getAlarmAmount() {
		return this.alarmAmount;
	}
	public void setAlarmAmount(String alarmAmount) {
		this.alarmAmount = alarmAmount;
	}

	public String getAlarmReceiver() {
		return this.alarmReceiver;
	}
	public void setAlarmReceiver(String alarmReceiver) {
		this.alarmReceiver = alarmReceiver;
	}

	public String getInvalidAmount() {
		return this.invalidAmount;
	}
	public void setInvalidAmount(String invalidAmount) {
		this.invalidAmount = invalidAmount;
	}

	public String getPoolId() {
		return this.poolId;
	}
	public void setPoolId(String poolId) {
		this.poolId = poolId;
	}

}
