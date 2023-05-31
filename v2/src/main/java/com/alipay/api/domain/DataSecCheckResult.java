package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑返回数据安全信息
 *
 * @author auto create
 * @since 1.0, 2018-06-20 11:16:26
 */
public class DataSecCheckResult extends AlipayObject {

	private static final long serialVersionUID = 5873831999393755311L;

	/**
	 * 口碑校验时间
	 */
	@ApiField("check_date")
	private String checkDate;

	/**
	 * 保证传入唯一，用于标识唯一文本或图片
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 数据返回状态 PASSED--数据识别通过，DELETE--删除，SYNCNOTICE--异步通知，RETRY--需要重试
	 */
	@ApiField("data_status")
	private String dataStatus;

	public String getCheckDate() {
		return this.checkDate;
	}
	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDataStatus() {
		return this.dataStatus;
	}
	public void setDataStatus(String dataStatus) {
		this.dataStatus = dataStatus;
	}

}
