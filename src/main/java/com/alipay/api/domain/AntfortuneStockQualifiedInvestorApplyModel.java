package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请获取用户合格投资者认证材料
 *
 * @author auto create
 * @since 1.0, 2022-01-20 11:15:24
 */
public class AntfortuneStockQualifiedInvestorApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1261816628419261757L;

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
