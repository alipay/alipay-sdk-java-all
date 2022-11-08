package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动报名
 *
 * @author auto create
 * @since 1.0, 2021-12-20 13:52:15
 */
public class AlipayOfflineProviderIndirectisvActivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5296275515447822165L;

	/**
	 * 商户的其他备注信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 设备信息
	 */
	@ApiListField("indirect_isv_terminal_info")
	@ApiField("indirect_isv_terminal_info")
	private List<IndirectIsvTerminalInfo> indirectIsvTerminalInfo;

	/**
	 * 商户收单账号
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public List<IndirectIsvTerminalInfo> getIndirectIsvTerminalInfo() {
		return this.indirectIsvTerminalInfo;
	}
	public void setIndirectIsvTerminalInfo(List<IndirectIsvTerminalInfo> indirectIsvTerminalInfo) {
		this.indirectIsvTerminalInfo = indirectIsvTerminalInfo;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
