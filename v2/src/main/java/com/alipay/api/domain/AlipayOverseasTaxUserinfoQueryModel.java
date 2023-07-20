package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退税用户信息查询
 *
 * @author auto create
 * @since 1.0, 2023-07-18 20:57:28
 */
public class AlipayOverseasTaxUserinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1553575598994169213L;

	/**
	 * 支付宝账号标识号,由identify_account_type指定类型:
identify_account_type为barcode表示支付宝钱包付款码,退税公司通过扫描用户支付宝钱包付款码获取,17位到32位的数字.
identify_account_type为logonId表示支付宝钱包登录号,需用户自己提供.
	 */
	@ApiField("identify_account_no")
	private String identifyAccountNo;

	/**
	 * 支付宝账号标识类型，
条码退税,取值:barcode
登录号退税,取值:logonId
	 */
	@ApiField("identify_account_type")
	private String identifyAccountType;

	public String getIdentifyAccountNo() {
		return this.identifyAccountNo;
	}
	public void setIdentifyAccountNo(String identifyAccountNo) {
		this.identifyAccountNo = identifyAccountNo;
	}

	public String getIdentifyAccountType() {
		return this.identifyAccountType;
	}
	public void setIdentifyAccountType(String identifyAccountType) {
		this.identifyAccountType = identifyAccountType;
	}

}
