package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流流转信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class LogisticsStepInfo extends AlipayObject {

	private static final long serialVersionUID = 8886826485948153882L;

	/**
	 * 流转信息的备注，此备注信息直接来自物流公司，备注信息的详细程度视个物流公司的不同而不同
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 流转信息发生事件
	 */
	@ApiField("occur_date")
	private Date occurDate;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getOccurDate() {
		return this.occurDate;
	}
	public void setOccurDate(Date occurDate) {
		this.occurDate = occurDate;
	}

}
