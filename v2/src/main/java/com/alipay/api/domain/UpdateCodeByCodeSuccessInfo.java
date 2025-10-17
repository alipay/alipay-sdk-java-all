package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改code成功对象
 *
 * @author auto create
 * @since 1.0, 2025-01-14 14:27:40
 */
public class UpdateCodeByCodeSuccessInfo extends AlipayObject {

	private static final long serialVersionUID = 5838358452739565175L;

	/**
	 * 原itemcode
	 */
	@ApiField("source_item_code")
	private String sourceItemCode;

	public String getSourceItemCode() {
		return this.sourceItemCode;
	}
	public void setSourceItemCode(String sourceItemCode) {
		this.sourceItemCode = sourceItemCode;
	}

}
