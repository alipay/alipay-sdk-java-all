package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量代发转账接口
 *
 * @author auto create
 * @since 1.0, 2024-12-21 19:33:52
 */
public class AlipayFundBatchUniTransferModel extends AlipayObject {

	private static final long serialVersionUID = 2522957148198631328L;

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
	 * 转账订单的标题，用于在收银台和消费记录展示
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 关联的资金单据ID，非必需。特定业务场景需要关联历史单据进行推进，如当前业务接入指南未标注此字段则可忽略。
	 */
	@ApiField("original_order_id")
	private String originalOrderId;

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
	 * 批次总金额，单位为元，精确到小数点后两位，取值范围[1.00,9999999999999.99]
	 */
	@ApiField("total_trans_amount")
	private String totalTransAmount;

	/**
	 * 收款信息列表。实际集合可以添加多个收款方信息，最多可以添加1000个收款方信息，如方案接入文档有特别说明，优先以接入文档为准
	 */
	@ApiListField("trans_order_list")
	@ApiField("trans_order_detail")
	private List<TransOrderDetail> transOrderList;

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

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOriginalOrderId() {
		return this.originalOrderId;
	}
	public void setOriginalOrderId(String originalOrderId) {
		this.originalOrderId = originalOrderId;
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

	public List<TransOrderDetail> getTransOrderList() {
		return this.transOrderList;
	}
	public void setTransOrderList(List<TransOrderDetail> transOrderList) {
		this.transOrderList = transOrderList;
	}

}
