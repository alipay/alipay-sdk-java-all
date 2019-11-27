package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询业务缓存
 *
 * @author auto create
 * @since 1.0, 2017-10-17 15:29:47
 */
public class SsdataFindataFundunionBizcacheQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7439373698949342729L;

	/**
	 * 业务缓存有限期，单位：天，默认值：1
	 */
	@ApiField("cache_expiry_date")
	private String cacheExpiryDate;

	/**
	 * C端用户身份证号码
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/**
	 * 商户业务流水号，有商户的系统生成的商户业务唯一标识，如果不传，则有上数系统生成一个32位的商户业务流水号并返回
	 */
	@ApiField("org_biz_no")
	private String orgBizNo;

	/**
	 * 用户授权标识
	 */
	@ApiField("user_authorize_flag")
	private String userAuthorizeFlag;

	public String getCacheExpiryDate() {
		return this.cacheExpiryDate;
	}
	public void setCacheExpiryDate(String cacheExpiryDate) {
		this.cacheExpiryDate = cacheExpiryDate;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getOrgBizNo() {
		return this.orgBizNo;
	}
	public void setOrgBizNo(String orgBizNo) {
		this.orgBizNo = orgBizNo;
	}

	public String getUserAuthorizeFlag() {
		return this.userAuthorizeFlag;
	}
	public void setUserAuthorizeFlag(String userAuthorizeFlag) {
		this.userAuthorizeFlag = userAuthorizeFlag;
	}

}
