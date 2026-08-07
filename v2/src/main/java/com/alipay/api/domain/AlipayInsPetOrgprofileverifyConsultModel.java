package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物保险机构档案获取同宠校验结果
 *
 * @author auto create
 * @since 1.0, 2026-07-31 15:10:02
 */
public class AlipayInsPetOrgprofileverifyConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6897287848673389566L;

	/**
	 * 认证接口返回的校验结果编号
	 */
	@ApiField("check_record_no")
	private String checkRecordNo;

	public String getCheckRecordNo() {
		return this.checkRecordNo;
	}
	public void setCheckRecordNo(String checkRecordNo) {
		this.checkRecordNo = checkRecordNo;
	}

}
