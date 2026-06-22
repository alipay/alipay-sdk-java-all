package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果对象
 *
 * @author auto create
 * @since 1.0, 2026-06-02 17:37:50
 */
public class SalesForcePartnerQueryResponseDTO extends AlipayObject {

	private static final long serialVersionUID = 2119371235422681585L;

	/**
	 * 伙伴bid
	 */
	@ApiField("bid")
	private String bid;

	/**
	 * 社会统一信用代码
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 伙伴名称
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

	/**
	 * 伙伴pid
	 */
	@ApiField("pid")
	private String pid;

	public String getBid() {
		return this.bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
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

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
