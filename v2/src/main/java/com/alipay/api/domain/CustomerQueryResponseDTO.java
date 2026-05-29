package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-22 17:17:45
 */
public class CustomerQueryResponseDTO extends AlipayObject {

	private static final long serialVersionUID = 7696965829427398252L;

	/**
	 * 客户bid
	 */
	@ApiField("bid")
	private String bid;

	/**
	 * 海图客户编码
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 海图客户社会统一信用代码
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 客户名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 归属BD姓名
	 */
	@ApiField("owner_bd_name")
	private String ownerBdName;

	/**
	 * 归属BD工号
	 */
	@ApiField("owner_bd_work_no")
	private String ownerBdWorkNo;

	public String getBid() {
		return this.bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getOwnerBdName() {
		return this.ownerBdName;
	}
	public void setOwnerBdName(String ownerBdName) {
		this.ownerBdName = ownerBdName;
	}

	public String getOwnerBdWorkNo() {
		return this.ownerBdWorkNo;
	}
	public void setOwnerBdWorkNo(String ownerBdWorkNo) {
		this.ownerBdWorkNo = ownerBdWorkNo;
	}

}
