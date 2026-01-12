package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询职业培训用户证书信息
 *
 * @author auto create
 * @since 1.0, 2025-08-18 14:27:37
 */
public class AlipayEbppIndustryCareertrainingUsercertificateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3216827761674274354L;

	/**
	 * 证书MDM的证书编码
	 */
	@ApiField("certificate_code")
	private String certificateCode;

	/**
	 * 用户Id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 用户证书编码
	 */
	@ApiField("user_certificate_code")
	private String userCertificateCode;

	/**
	 * 用户Id
	 */
	@ApiField("user_id")
	private String userId;

	public String getCertificateCode() {
		return this.certificateCode;
	}
	public void setCertificateCode(String certificateCode) {
		this.certificateCode = certificateCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getUserCertificateCode() {
		return this.userCertificateCode;
	}
	public void setUserCertificateCode(String userCertificateCode) {
		this.userCertificateCode = userCertificateCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
