package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请获取用户合格投资者认证材料
 *
 * @author auto create
 * @since 1.0, 2021-11-25 14:20:14
 */
public class AntfortuneStockQualifiedInvestorApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3533891633314168137L;

	/**
	 * 身份证号的md5值 32位 大写
	 */
	@ApiField("id_number_encrypt")
	private String idNumberEncrypt;

	public String getIdNumberEncrypt() {
		return this.idNumberEncrypt;
	}
	public void setIdNumberEncrypt(String idNumberEncrypt) {
		this.idNumberEncrypt = idNumberEncrypt;
	}

}
