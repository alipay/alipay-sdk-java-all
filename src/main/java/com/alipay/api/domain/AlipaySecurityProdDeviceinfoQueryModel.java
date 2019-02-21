package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据tokenID查询设备数据字段
 *
 * @author auto create
 * @since 1.0, 2018-10-15 17:22:53
 */
public class AlipaySecurityProdDeviceinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2154782693298176234L;

	/**
	 * terminal_type，用于标识当前所属的终端类型，目前支持APP这种终端类型
	 */
	@ApiField("terminal_type")
	private String terminalType;

	/**
	 * tokenID，客户端对应的token值：token由应用系统生成，缓存在业务模块，业务可以通过token反查到设备数据信息
	 */
	@ApiField("token_id")
	private String tokenId;

	public String getTerminalType() {
		return this.terminalType;
	}
	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

	public String getTokenId() {
		return this.tokenId;
	}
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

}
