package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户回票事件的发票信息修改
 *
 * @author auto create
 * @since 1.0, 2024-02-01 17:00:11
 */
public class AlipayFundMbpcardInvoiceprocessModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2756845158513714196L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 待修改的发票列表
	 */
	@ApiListField("invoice_list")
	@ApiField("invoice_base_info")
	private List<InvoiceBaseInfo> invoiceList;

	/**
	 * 回票商户的ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 指定需要修改的流程ID
	 */
	@ApiField("process_id")
	private String processId;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public List<InvoiceBaseInfo> getInvoiceList() {
		return this.invoiceList;
	}
	public void setInvoiceList(List<InvoiceBaseInfo> invoiceList) {
		this.invoiceList = invoiceList;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getProcessId() {
		return this.processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
