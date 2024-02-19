package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户回票事件提交
 *
 * @author auto create
 * @since 1.0, 2024-02-01 16:30:24
 */
public class AlipayFundMbpcardInvoiceprocessSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 1585861864147374115L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 发票详情信息列表
	 */
	@ApiListField("invoice_list")
	@ApiField("invoice_base_info")
	private List<InvoiceBaseInfo> invoiceList;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 回票外部事件请求号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 关联的任务ID列表
	 */
	@ApiListField("task_id_list")
	@ApiField("string")
	private List<String> taskIdList;

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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<String> getTaskIdList() {
		return this.taskIdList;
	}
	public void setTaskIdList(List<String> taskIdList) {
		this.taskIdList = taskIdList;
	}

}
