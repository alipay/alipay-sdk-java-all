package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.order.batchcreate response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-03 15:30:18
 */
public class AlipayCommerceIotDapplyOrderBatchcreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2753529338738116995L;

	/** 
	 * 下单成功后返回批次订单号可以利用批订单号查询子单信息
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * Excel校验明细
	 */
	@ApiField("excel_validate_detail_file")
	private String excelValidateDetailFile;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

	public void setExcelValidateDetailFile(String excelValidateDetailFile) {
		this.excelValidateDetailFile = excelValidateDetailFile;
	}
	public String getExcelValidateDetailFile( ) {
		return this.excelValidateDetailFile;
	}

}
