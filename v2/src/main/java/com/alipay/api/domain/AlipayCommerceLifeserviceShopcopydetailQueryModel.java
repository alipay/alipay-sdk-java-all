package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店副本详情查询
 *
 * @author auto create
 * @since 1.0, 2026-08-18 17:07:56
 */
public class AlipayCommerceLifeserviceShopcopydetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5848556191273554167L;

	/**
	 * 副本业务ID
	 */
	@ApiField("copy_id")
	private String copyId;

	public String getCopyId() {
		return this.copyId;
	}
	public void setCopyId(String copyId) {
		this.copyId = copyId;
	}

}
