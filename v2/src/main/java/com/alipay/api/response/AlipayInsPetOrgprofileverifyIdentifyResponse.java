package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.pet.orgprofileverify.identify response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-31 15:12:54
 */
public class AlipayInsPetOrgprofileverifyIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6335631884494133812L;

	/** 
	 * 校验结果编号，需要通过校验结果编号查询同宠校验结果
	 */
	@ApiField("check_record_no")
	private String checkRecordNo;

	public void setCheckRecordNo(String checkRecordNo) {
		this.checkRecordNo = checkRecordNo;
	}
	public String getCheckRecordNo( ) {
		return this.checkRecordNo;
	}

}
