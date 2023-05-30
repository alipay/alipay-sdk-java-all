package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 码值信息
 *
 * @author auto create
 * @since 1.0, 2022-11-14 15:53:44
 */
public class BenefitCodeInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8227991297321427825L;

	/**
	 * 码值文件在oss中的key;secret_voucher_type==CODE_POOL时必填
	 */
	@ApiField("secret_voucher_file_key")
	private String secretVoucherFileKey;

	/**
	 * 一人多码的码值,secret_voucher_type==GENERAL_CODE时必填
	 */
	@ApiField("secret_voucher_general_code")
	private String secretVoucherGeneralCode;

	/**
	 * 码值展示样式;BARCODE：条形码;QRCODE ： 二维码;TEXT : 直接展示码值
	 */
	@ApiField("secret_voucher_style")
	private String secretVoucherStyle;

	/**
	 * GENERAL_CODE ： 通用码，所有人共用同一个码值，多人一码; CODE_POOL ： 码池，一人一码，发码时随机从码池中取一个码值给用户
	 */
	@ApiField("secret_voucher_type")
	private String secretVoucherType;

	public String getSecretVoucherFileKey() {
		return this.secretVoucherFileKey;
	}
	public void setSecretVoucherFileKey(String secretVoucherFileKey) {
		this.secretVoucherFileKey = secretVoucherFileKey;
	}

	public String getSecretVoucherGeneralCode() {
		return this.secretVoucherGeneralCode;
	}
	public void setSecretVoucherGeneralCode(String secretVoucherGeneralCode) {
		this.secretVoucherGeneralCode = secretVoucherGeneralCode;
	}

	public String getSecretVoucherStyle() {
		return this.secretVoucherStyle;
	}
	public void setSecretVoucherStyle(String secretVoucherStyle) {
		this.secretVoucherStyle = secretVoucherStyle;
	}

	public String getSecretVoucherType() {
		return this.secretVoucherType;
	}
	public void setSecretVoucherType(String secretVoucherType) {
		this.secretVoucherType = secretVoucherType;
	}

}
