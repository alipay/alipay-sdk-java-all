package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 神券服务商代调用迈进申请创建
 *
 * @author auto create
 * @since 1.0, 2026-10-17 16:47:57
 */
public class AlipayMerchantGroupOnboardingProxyinvokeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4883797277588634315L;

	/**
	 * 服务商三方应用appid，须与调用方app_id一致
	 */
	@ApiField("isv_app_id")
	private String isvAppId;

	/**
	 * 服务商主体PID，须与调用方应用归属一致
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 神券分配给服务商的线索ID
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 迈进方式枚举，当前仅支持PROXY_INVOKE-代调用
	 */
	@ApiField("march_type")
	private String marchType;

	/**
	 * 待迈进商家的支付宝PID，须已完成神券入驻
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 服务商侧业务标识，原样回传于消息与查询
	 */
	@ApiField("unique_biz_id")
	private String uniqueBizId;

	public String getIsvAppId() {
		return this.isvAppId;
	}
	public void setIsvAppId(String isvAppId) {
		this.isvAppId = isvAppId;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}

	public String getMarchType() {
		return this.marchType;
	}
	public void setMarchType(String marchType) {
		this.marchType = marchType;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getUniqueBizId() {
		return this.uniqueBizId;
	}
	public void setUniqueBizId(String uniqueBizId) {
		this.uniqueBizId = uniqueBizId;
	}

}
