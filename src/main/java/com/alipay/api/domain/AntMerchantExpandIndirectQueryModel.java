package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连商户查询
 *
 * @author auto create
 * @since 1.0, 2022-10-13 10:09:37
 */
public class AntMerchantExpandIndirectQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6832561121611732819L;

	/**
	 * 商户编号，由机构定义，需要保证在机构下唯一，如果未传sub_merchant_id ，则必传 external_id 和 org_pid
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 机构pid，根据org_pid + external_id 可以唯一确定商户，如果未传sub_merchant_id ，则必传 external_id 和 org_pid
	 */
	@ApiField("org_pid")
	private String orgPid;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号，如果未传 external_id 和 org_pid，则必传sub_merchant_id
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getOrgPid() {
		return this.orgPid;
	}
	public void setOrgPid(String orgPid) {
		this.orgPid = orgPid;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
