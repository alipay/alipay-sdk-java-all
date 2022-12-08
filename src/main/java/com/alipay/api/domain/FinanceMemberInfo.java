package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区块链金融业务的标准会员信息(由dchaincustomer应用定义)
 *
 * @author auto create
 * @since 1.0, 2020-02-18 09:19:19
 */
public class FinanceMemberInfo extends AlipayObject {

	private static final long serialVersionUID = 2671658697143551893L;

	/**
	 * 金融资产链的会员地址
	 */
	@ApiField("acct_address")
	private String acctAddress;

	/**
	 * 对应于证件类型的会员证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 会员证件类型，如：100-居民身份证，231-统一社会信用代码
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 金融平台会员memberId，由dchaincustomer应用生成
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 会员名称
	 */
	@ApiField("name")
	private String name;

	public String getAcctAddress() {
		return this.acctAddress;
	}
	public void setAcctAddress(String acctAddress) {
		this.acctAddress = acctAddress;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
