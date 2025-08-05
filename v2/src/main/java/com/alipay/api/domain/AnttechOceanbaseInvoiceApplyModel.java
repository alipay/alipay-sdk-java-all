package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开票申请
 *
 * @author auto create
 * @since 1.0, 2025-06-20 10:11:33
 */
public class AnttechOceanbaseInvoiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7657699137464282821L;

	/**
	 * 业务唯一键，可做幂等
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务类型，需要向OB申请业务接入分配业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 发票抬头信息，购买方信息
	 */
	@ApiField("buyer")
	private ObcInvoiceIssuerRequest buyer;

	/**
	 * 申请人id
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 币种code，例如CNY
	 */
	@ApiField("currency_code")
	private String currencyCode;

	/**
	 * 开票金额,CNY币种下单位为元
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 该备注会直接在发票中备注一栏展示，一般由购方填写或销方取得购方许可后填写购方要求的内容
	 */
	@ApiField("invoice_remarks")
	private String invoiceRemarks;

	/**
	 * 发票明细行信息，可开多行发票，但原则上不超过20行
	 */
	@ApiListField("objects")
	@ApiField("obc_invoice_apply_line_request")
	private List<ObcInvoiceApplyLineRequest> objects;

	/**
	 * 发票申请单的备注，可选，不会展示到发票中。仅做申请时的描述和说明
	 */
	@ApiField("remarks")
	private String remarks;

	/**
	 * 销方主体OU，默认ZN7
	 */
	@ApiField("seller_inst_id")
	private String sellerInstId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public ObcInvoiceIssuerRequest getBuyer() {
		return this.buyer;
	}
	public void setBuyer(ObcInvoiceIssuerRequest buyer) {
		this.buyer = buyer;
	}

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceRemarks() {
		return this.invoiceRemarks;
	}
	public void setInvoiceRemarks(String invoiceRemarks) {
		this.invoiceRemarks = invoiceRemarks;
	}

	public List<ObcInvoiceApplyLineRequest> getObjects() {
		return this.objects;
	}
	public void setObjects(List<ObcInvoiceApplyLineRequest> objects) {
		this.objects = objects;
	}

	public String getRemarks() {
		return this.remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSellerInstId() {
		return this.sellerInstId;
	}
	public void setSellerInstId(String sellerInstId) {
		this.sellerInstId = sellerInstId;
	}

}
