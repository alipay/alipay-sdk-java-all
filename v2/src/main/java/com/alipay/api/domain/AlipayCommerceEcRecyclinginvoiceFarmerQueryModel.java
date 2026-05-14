package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向农户信息查询
 *
 * @author auto create
 * @since 1.0, 2026-04-29 14:58:45
 */
public class AlipayCommerceEcRecyclinginvoiceFarmerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8712775378482852828L;

	/**
	 * 农户身份证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 农户ID
	 */
	@ApiField("farmer_id")
	private String farmerId;

	/**
	 * 代卖?身份证件号
	 */
	@ApiField("proxy_cert_no")
	private String proxyCertNo;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getFarmerId() {
		return this.farmerId;
	}
	public void setFarmerId(String farmerId) {
		this.farmerId = farmerId;
	}

	public String getProxyCertNo() {
		return this.proxyCertNo;
	}
	public void setProxyCertNo(String proxyCertNo) {
		this.proxyCertNo = proxyCertNo;
	}

}
