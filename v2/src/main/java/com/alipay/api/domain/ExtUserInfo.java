package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部指定买家
 *
 * @author auto create
 * @since 1.0, 2023-01-09 19:28:26
 */
public class ExtUserInfo extends AlipayObject {

	private static final long serialVersionUID = 4388677372614784356L;

	/**
	 * 买家证件号。
注：need_check_info=T或fix_buyer=T时该参数才有效，支付宝会比较买家在支付宝留存的证件号码与该参数传入的值是否匹配。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 指定买家证件类型。
枚举值：
IDENTITY_CARD：身份证；
PASSPORT：护照；
OFFICER_CARD：军官证；
SOLDIER_CARD：士兵证；
HOKOU：户口本。如有其它类型需要支持，请与蚂蚁金服工作人员联系。
注： need_check_info=T或fix_buyer=T时该参数才有效，支付宝会比较买家在支付宝留存的证件类型与该参数传入的值是否匹配。
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 是否强制校验买家身份。
需要强制校验传：T;
不需要强制校验传：F或者不传；
当传T时，接口上必须指定cert_type、cert_no和name信息且支付宝会校验传入的信息跟支付买家的信息都匹配，否则报错。
默认为不校验。
	 */
	@ApiField("fix_buyer")
	private String fixBuyer;

	/**
	 * 买家加密身份信息。当指定了此参数且指定need_check_info=T时，支付宝会对买家身份进行校验，校验逻辑为买家姓名、买家证件号拼接后的字符串，以sha256算法utf-8编码计算hash，若与传入的值不匹配则会拦截本次支付。注意：如果同时指定了用户明文身份信息（name，cert_type，cert_no中任意一个），则忽略identity_hash以明文参数校验。
	 */
	@ApiField("identity_hash")
	private String identityHash;

	/**
	 * 允许的最小买家年龄。
买家年龄必须大于等于所传数值 
注：
1. need_check_info=T时该参数才有效
2. min_age为整数，必须大于等于0
	 */
	@ApiField("min_age")
	private String minAge;

	/**
	 * 指定买家手机号。
注：该参数暂不校验
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 指定买家姓名。
注： need_check_info=T或fix_buyer=T时该参数才有效
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否强制校验买家信息；
需要强制校验传：T;
不需要强制校验传：F或者不传；
当传T时，支付宝会校验支付买家的信息与接口上传递的cert_type、cert_no、name或age是否匹配，只有接口传递了信息才会进行对应项的校验；只要有任何一项信息校验不匹配交易都会失败。如果传递了need_check_info，但是没有传任何校验项，则不进行任何校验。
默认为不校验。
	 */
	@ApiField("need_check_info")
	private String needCheckInfo;

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

	public String getFixBuyer() {
		return this.fixBuyer;
	}
	public void setFixBuyer(String fixBuyer) {
		this.fixBuyer = fixBuyer;
	}

	public String getIdentityHash() {
		return this.identityHash;
	}
	public void setIdentityHash(String identityHash) {
		this.identityHash = identityHash;
	}

	public String getMinAge() {
		return this.minAge;
	}
	public void setMinAge(String minAge) {
		this.minAge = minAge;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNeedCheckInfo() {
		return this.needCheckInfo;
	}
	public void setNeedCheckInfo(String needCheckInfo) {
		this.needCheckInfo = needCheckInfo;
	}

}
