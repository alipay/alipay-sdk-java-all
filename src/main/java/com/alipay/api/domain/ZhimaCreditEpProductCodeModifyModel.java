package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用企业征信产品推广码下线
 *
 * @author auto create
 * @since 1.0, 2021-03-30 15:10:42
 */
public class ZhimaCreditEpProductCodeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1874672445385949579L;

	/**
	 * 二维码唯一标识id
	 */
	@ApiField("code_id")
	private String codeId;

	public String getCodeId() {
		return this.codeId;
	}
	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

}
