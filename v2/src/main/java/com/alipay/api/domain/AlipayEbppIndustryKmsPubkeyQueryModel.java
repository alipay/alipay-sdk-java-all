package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区块链票据用户公钥查询
 *
 * @author auto create
 * @since 1.0, 2020-05-20 15:48:43
 */
public class AlipayEbppIndustryKmsPubkeyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8311358613324173856L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 证件号码的hash值，使用MD5算法获取的hash
	 */
	@ApiField("cert_no_hash")
	private String certNoHash;

	/**
	 * 证件类型
可选值（身份证：IDENTITY_CARD）
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 子业务类型
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCertNoHash() {
		return this.certNoHash;
	}
	public void setCertNoHash(String certNoHash) {
		this.certNoHash = certNoHash;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
