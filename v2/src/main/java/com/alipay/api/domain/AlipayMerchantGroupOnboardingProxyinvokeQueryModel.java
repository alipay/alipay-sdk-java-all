package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 神券服务商代调用迈进申请查询
 *
 * @author auto create
 * @since 1.0, 2026-10-17 19:37:54
 */
public class AlipayMerchantGroupOnboardingProxyinvokeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7115499949188458139L;

	/**
	 * 由神券分配给服务商的线索 ID
	 */
	@ApiField("leads_id")
	private String leadsId;

	/**
	 * 待迈进商家的支付宝 PID，须已完成神券入驻
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 服务商侧业务标识，原样回传于消息与查询
	 */
	@ApiField("unique_biz_id")
	private String uniqueBizId;

	public String getLeadsId() {
		return this.leadsId;
	}
	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
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
