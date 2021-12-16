package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询消费记录详情
 *
 * @author auto create
 * @since 1.0, 2021-05-19 16:44:50
 */
public class AlipayUserBillDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1552466974593286988L;

	/**
	 * 账单内部业务流水号，是查询单条账单的必传参数
	 */
	@ApiField("biz_in_no")
	private String bizInNo;

	public String getBizInNo() {
		return this.bizInNo;
	}
	public void setBizInNo(String bizInNo) {
		this.bizInNo = bizInNo;
	}

}
