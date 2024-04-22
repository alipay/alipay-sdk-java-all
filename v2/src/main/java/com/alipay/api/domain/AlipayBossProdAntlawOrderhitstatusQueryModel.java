package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询业务单号是否存在纸质用印或者纸质用印流程是否正常
 *
 * @author auto create
 * @since 1.0, 2022-07-28 20:13:37
 */
public class AlipayBossProdAntlawOrderhitstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3474548283267145252L;

	/**
	 * 请求来源系统英文名称
	 */
	@ApiField("request_app_name")
	private String requestAppName;

	/**
	 * 关联业务数据编号
	 */
	@ApiField("request_biz_num")
	private String requestBizNum;

	/**
	 * 请求token
	 */
	@ApiField("request_hash_value")
	private String requestHashValue;

	/**
	 * 请求时间戳（请求时间的毫秒值）
	 */
	@ApiField("request_time_stamp")
	private String requestTimeStamp;

	public String getRequestAppName() {
		return this.requestAppName;
	}
	public void setRequestAppName(String requestAppName) {
		this.requestAppName = requestAppName;
	}

	public String getRequestBizNum() {
		return this.requestBizNum;
	}
	public void setRequestBizNum(String requestBizNum) {
		this.requestBizNum = requestBizNum;
	}

	public String getRequestHashValue() {
		return this.requestHashValue;
	}
	public void setRequestHashValue(String requestHashValue) {
		this.requestHashValue = requestHashValue;
	}

	public String getRequestTimeStamp() {
		return this.requestTimeStamp;
	}
	public void setRequestTimeStamp(String requestTimeStamp) {
		this.requestTimeStamp = requestTimeStamp;
	}

}
