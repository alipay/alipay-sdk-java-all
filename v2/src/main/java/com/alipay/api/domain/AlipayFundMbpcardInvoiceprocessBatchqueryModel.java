package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回票事件处理列表查询
 *
 * @author auto create
 * @since 1.0, 2024-02-01 16:38:35
 */
public class AlipayFundMbpcardInvoiceprocessBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8452995194142477723L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 外部单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 流程状态
	 */
	@ApiField("process_status")
	private String processStatus;

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

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getProcessStatus() {
		return this.processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
