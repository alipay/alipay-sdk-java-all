package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询EDGE设备染色风险信息
 *
 * @author auto create
 * @since 1.0, 2021-05-20 14:34:42
 */
public class AlipaySecurityProdEdgeColorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1465964794219296252L;

	/**
	 * 该参数为业务需要验签的报文的哈希值
	 */
	@ApiField("biz_param")
	private String bizParam;

	/**
	 * 该参数为终端安全分配给业务的token字符串，业务需要妥善保存token并且在查询请求时传入
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 该字段为客户端风险信息接口返回的设备风险信息
	 */
	@ApiField("sec_info")
	private String secInfo;

	/**
	 * 该参数为支付宝客户端分配的小程序Id
	 */
	@ApiField("tinyapp_id")
	private String tinyappId;

	/**
	 * 该参数为客户端风险信息接口返回的traceId
	 */
	@ApiField("trace_id")
	private String traceId;

	public String getBizParam() {
		return this.bizParam;
	}
	public void setBizParam(String bizParam) {
		this.bizParam = bizParam;
	}

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getSecInfo() {
		return this.secInfo;
	}
	public void setSecInfo(String secInfo) {
		this.secInfo = secInfo;
	}

	public String getTinyappId() {
		return this.tinyappId;
	}
	public void setTinyappId(String tinyappId) {
		this.tinyappId = tinyappId;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
