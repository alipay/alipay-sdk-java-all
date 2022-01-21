package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构开户信息
 *
 * @author auto create
 * @since 1.0, 2021-09-17 21:05:46
 */
public class InstInfo extends AlipayObject {

	private static final long serialVersionUID = 6284769683371931294L;

	/**
	 * 机构号
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * ISV在机构测的唯一编号
	 */
	@ApiField("isv_inst_no")
	private String isvInstNo;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getIsvInstNo() {
		return this.isvInstNo;
	}
	public void setIsvInstNo(String isvInstNo) {
		this.isvInstNo = isvInstNo;
	}

}
