package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子商户信息添加
 *
 * @author auto create
 * @since 1.0, 2023-01-05 16:06:18
 */
public class ZhimaMerchantSubsidiariesApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3222494244618894195L;

	/**
	 * 商户pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 信用服务id
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 二级商户进件id
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 子商户联系电话
	 */
	@ApiField("sub_merchant_contact_number")
	private String subMerchantContactNumber;

	/**
	 * 子商户跳转链接
	 */
	@ApiField("sub_merchant_jump_link")
	private String subMerchantJumpLink;

	/**
	 * 子商户logo地址
	 */
	@ApiField("sub_merchant_logo_url")
	private String subMerchantLogoUrl;

	/**
	 * 子商户名
	 */
	@ApiField("sub_merchant_name")
	private String subMerchantName;

	/**
	 * 子商户id
	 */
	@ApiField("sub_pid")
	private String subPid;

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getSubMerchantContactNumber() {
		return this.subMerchantContactNumber;
	}
	public void setSubMerchantContactNumber(String subMerchantContactNumber) {
		this.subMerchantContactNumber = subMerchantContactNumber;
	}

	public String getSubMerchantJumpLink() {
		return this.subMerchantJumpLink;
	}
	public void setSubMerchantJumpLink(String subMerchantJumpLink) {
		this.subMerchantJumpLink = subMerchantJumpLink;
	}

	public String getSubMerchantLogoUrl() {
		return this.subMerchantLogoUrl;
	}
	public void setSubMerchantLogoUrl(String subMerchantLogoUrl) {
		this.subMerchantLogoUrl = subMerchantLogoUrl;
	}

	public String getSubMerchantName() {
		return this.subMerchantName;
	}
	public void setSubMerchantName(String subMerchantName) {
		this.subMerchantName = subMerchantName;
	}

	public String getSubPid() {
		return this.subPid;
	}
	public void setSubPid(String subPid) {
		this.subPid = subPid;
	}

}
