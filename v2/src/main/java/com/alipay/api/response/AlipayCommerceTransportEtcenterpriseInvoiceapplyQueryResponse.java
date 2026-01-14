package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EtcCorpInvoiceList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etcenterprise.invoiceapply.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-19 14:03:07
 */
public class AlipayCommerceTransportEtcenterpriseInvoiceapplyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8845317651344835953L;

	/** 
	 * 虚拟运单编码
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 换票申请id,已被换票才有
	 */
	@ApiField("change_apply_id")
	private String changeApplyId;

	/** 
	 * 发票金额,单位:分
	 */
	@ApiField("fee")
	private String fee;

	/** 
	 * 发票申请列表
	 */
	@ApiField("invoice_list")
	private EtcCorpInvoiceList invoiceList;

	/** 
	 * 发票张数
	 */
	@ApiField("invoice_num")
	private String invoiceNum;

	/** 
	 * 运单发票整体状态
	 */
	@ApiField("waybill_invoice_status")
	private String waybillInvoiceStatus;

	/** 
	 * 外部企业运单号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	/** 
	 * 打包下载地址,运单完全开完才有
	 */
	@ApiField("waybill_oss_url")
	private String waybillOssUrl;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

	public void setChangeApplyId(String changeApplyId) {
		this.changeApplyId = changeApplyId;
	}
	public String getChangeApplyId( ) {
		return this.changeApplyId;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getFee( ) {
		return this.fee;
	}

	public void setInvoiceList(EtcCorpInvoiceList invoiceList) {
		this.invoiceList = invoiceList;
	}
	public EtcCorpInvoiceList getInvoiceList( ) {
		return this.invoiceList;
	}

	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}
	public String getInvoiceNum( ) {
		return this.invoiceNum;
	}

	public void setWaybillInvoiceStatus(String waybillInvoiceStatus) {
		this.waybillInvoiceStatus = waybillInvoiceStatus;
	}
	public String getWaybillInvoiceStatus( ) {
		return this.waybillInvoiceStatus;
	}

	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}
	public String getWaybillNo( ) {
		return this.waybillNo;
	}

	public void setWaybillOssUrl(String waybillOssUrl) {
		this.waybillOssUrl = waybillOssUrl;
	}
	public String getWaybillOssUrl( ) {
		return this.waybillOssUrl;
	}

}
