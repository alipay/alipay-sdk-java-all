package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询设备指纹信息
 *
 * @author auto create
 * @since 1.0, 2018-11-19 21:01:20
 */
public class ZolozIdentificationDeviceinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1575965856134864489L;

	/**
	 * 服务端生成的设备码（由我方提供的sdk或JS(H5)生成）
	 */
	@ApiField("apdid_token")
	private String apdidToken;

	/**
	 * 业务流水号
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * apdid_token对应的设备终端类型,根据生成方式来确定。若使用设备指纹SDK生成则填写APP，若用H5生成则填写PC。若不填写，则默认使用APP
	 */
	@ApiField("terminal_type")
	private String terminalType;

	public String getApdidToken() {
		return this.apdidToken;
	}
	public void setApdidToken(String apdidToken) {
		this.apdidToken = apdidToken;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getTerminalType() {
		return this.terminalType;
	}
	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

}
