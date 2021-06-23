package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量代发转账接口
 *
 * @author auto create
 * @since 1.0, 2021-05-08 11:03:03
 */
public class AlipayFundBatchUniTransferModel extends AlipayObject {

	private static final long serialVersionUID = 2575295385965488863L;

	/**
	 * 业务场景。不同场景值不同，具体值联系支付宝确认。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * JSON格式，传递业务扩展参数。
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 商户的批次号
	 */
	@ApiField("out_batch_no")
	private String outBatchNo;

	/**
	 * 付款方信息
	 */
	@ApiField("payer_info")
	private Participant payerInfo;

	/**
	 * 业务产品码。不同产品值不同，具体值联系支付宝确认。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 批次备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 批次总笔数
	 */
	@ApiField("total_count")
	private String totalCount;

	/**
	 * 批次总金额，单位为元，精确到小数点后两位，取值范围[0.01,9999999999999.99]
	 */
	@ApiField("total_trans_amount")
	private String totalTransAmount;

	/**
	 * 收款信息列表
	 */
	@ApiField("trans_order_list")
	private TransOrderDetail transOrderList;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
	}

	public String getOutBatchNo() {
		return this.outBatchNo;
	}
	public void setOutBatchNo(String outBatchNo) {
		this.outBatchNo = outBatchNo;
	}

	public Participant getPayerInfo() {
		return this.payerInfo;
	}
	public void setPayerInfo(Participant payerInfo) {
		this.payerInfo = payerInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getTotalTransAmount() {
		return this.totalTransAmount;
	}
	public void setTotalTransAmount(String totalTransAmount) {
		this.totalTransAmount = totalTransAmount;
	}

	public TransOrderDetail getTransOrderList() {
		return this.transOrderList;
	}
	public void setTransOrderList(TransOrderDetail transOrderList) {
		this.transOrderList = transOrderList;
	}

}
