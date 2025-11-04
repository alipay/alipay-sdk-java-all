package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同撰写更新合同编号
 *
 * @author auto create
 * @since 1.0, 2022-01-04 20:45:08
 */
public class AlipayBossProdAntlawSmartcontractcodeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4425824136896472723L;

	/**
	 * 业务编号
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 合同编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 鉴权token
	 */
	@ApiField("request_token")
	private String requestToken;

	/**
	 * 来源系统
	 */
	@ApiField("source_sys")
	private String sourceSys;

	/**
	 * 请求时间戳
	 */
	@ApiField("time_stamp")
	private String timeStamp;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getRequestToken() {
		return this.requestToken;
	}
	public void setRequestToken(String requestToken) {
		this.requestToken = requestToken;
	}

	public String getSourceSys() {
		return this.sourceSys;
	}
	public void setSourceSys(String sourceSys) {
		this.sourceSys = sourceSys;
	}

	public String getTimeStamp() {
		return this.timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

}
