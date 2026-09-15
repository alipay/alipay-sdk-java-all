package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户维度账单下载任务创建请求
 *
 * @author auto create
 * @since 1.0, 2026-08-21 14:42:51
 */
public class AnttechMorseMarketingEquityCustbilldownloadtaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8799874621123359666L;

	/**
	 * 账单交易开始结束时间yyyyMMdd 的格式
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 摩斯机构id
	 */
	@ApiField("inst_morse_id")
	private String instMorseId;

	/**
	 * 账单交易开始时间 yyyyMMdd的格式
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getInstMorseId() {
		return this.instMorseId;
	}
	public void setInstMorseId(String instMorseId) {
		this.instMorseId = instMorseId;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
