package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询特定签约记录
 *
 * @author auto create
 * @since 1.0, 2020-09-03 01:23:09
 */
public class AlipayBossProdAntlegalchainNotaryprocsumQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2885358349477562349L;

	/**
	 * 法链签约业务ID，发起签约会返回对应的ID值
	 */
	@ApiField("bas_data_id")
	private String basDataId;

	/**
	 * 请求来源系统英文名称
	 */
	@ApiField("request_app_name")
	private String requestAppName;

	/**
	 * 请求时间戳（请求时间的毫秒值）
	 */
	@ApiField("request_time_stamp")
	private String requestTimeStamp;

	/**
	 * 请求token
	 */
	@ApiField("request_token")
	private String requestToken;

	public String getBasDataId() {
		return this.basDataId;
	}
	public void setBasDataId(String basDataId) {
		this.basDataId = basDataId;
	}

	public String getRequestAppName() {
		return this.requestAppName;
	}
	public void setRequestAppName(String requestAppName) {
		this.requestAppName = requestAppName;
	}

	public String getRequestTimeStamp() {
		return this.requestTimeStamp;
	}
	public void setRequestTimeStamp(String requestTimeStamp) {
		this.requestTimeStamp = requestTimeStamp;
	}

	public String getRequestToken() {
		return this.requestToken;
	}
	public void setRequestToken(String requestToken) {
		this.requestToken = requestToken;
	}

}
