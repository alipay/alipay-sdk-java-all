package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 统一结算发票查询
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:26:34
 */
public class AlipayBossFncGfsettleprodInvoiceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6687879488196398581L;

	/**
	 * 开票号
	 */
	@ApiField("kp_no")
	private String kpNo;

	/**
	 * 蚂蚁供应商2088账号PID
	 */
	@ApiListField("seller_ip_role_ids")
	@ApiField("string")
	private List<String> sellerIpRoleIds;

	public String getKpNo() {
		return this.kpNo;
	}
	public void setKpNo(String kpNo) {
		this.kpNo = kpNo;
	}

	public List<String> getSellerIpRoleIds() {
		return this.sellerIpRoleIds;
	}
	public void setSellerIpRoleIds(List<String> sellerIpRoleIds) {
		this.sellerIpRoleIds = sellerIpRoleIds;
	}

}
