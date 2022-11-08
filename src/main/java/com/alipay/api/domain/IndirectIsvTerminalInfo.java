package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连服务商设备信息
 *
 * @author auto create
 * @since 1.0, 2021-12-20 13:52:15
 */
public class IndirectIsvTerminalInfo extends AlipayObject {

	private static final long serialVersionUID = 7661138965555427137L;

	/**
	 * terminal_id+不唯一+间连服务商活动报名设备品牌+无枚举+外部传入+无特殊说明
	 */
	@ApiField("terminal_brand")
	private String terminalBrand;

	/**
	 * terminal_id+唯一+间连服务商活动报名设备id+无枚举+外部传入+无特殊说明
	 */
	@ApiField("terminal_id")
	private String terminalId;

	public String getTerminalBrand() {
		return this.terminalBrand;
	}
	public void setTerminalBrand(String terminalBrand) {
		this.terminalBrand = terminalBrand;
	}

	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

}
