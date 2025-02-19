package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自然月维度用量信息
 *
 * @author auto create
 * @since 1.0, 2024-05-11 11:49:33
 */
public class AlipayCloudCloudbaseResourceusageMonthlyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2239498624223133439L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 结束月份
	 */
	@ApiField("end_month")
	private String endMonth;

	/**
	 * 计费项编码
	 */
	@ApiField("fee_item_code")
	private String feeItemCode;

	/**
	 * 起始月份
	 */
	@ApiField("start_month")
	private String startMonth;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public String getEndMonth() {
		return this.endMonth;
	}
	public void setEndMonth(String endMonth) {
		this.endMonth = endMonth;
	}

	public String getFeeItemCode() {
		return this.feeItemCode;
	}
	public void setFeeItemCode(String feeItemCode) {
		this.feeItemCode = feeItemCode;
	}

	public String getStartMonth() {
		return this.startMonth;
	}
	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}

}
