package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益兑换状态同步
 *
 * @author auto create
 * @since 1.0, 2025-09-28 17:27:32
 */
public class AnttechNftBenefitNftidExchangeModel extends AlipayObject {

	private static final long serialVersionUID = 8656568274332618531L;

	/**
	 * nftId藏品的账号id
	 */
	@ApiField("nft_id")
	private String nftId;

	/**
	 * 请求幂等id
	 */
	@ApiField("req_msg_id")
	private String reqMsgId;

	/**
	 * 租户id(该字段已废弃)
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getNftId() {
		return this.nftId;
	}
	public void setNftId(String nftId) {
		this.nftId = nftId;
	}

	public String getReqMsgId() {
		return this.reqMsgId;
	}
	public void setReqMsgId(String reqMsgId) {
		this.reqMsgId = reqMsgId;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
