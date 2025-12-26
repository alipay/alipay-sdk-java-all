package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 供应链生产指令反馈
 *
 * @author auto create
 * @since 1.0, 2025-08-07 14:43:13
 */
public class AntProdpaasProductProduceCompleteCallbackModel extends AlipayObject {

	private static final long serialVersionUID = 6531844693893335551L;

	/**
	 * 是否异常反馈，如果该字段为 Y , 则其余必填字段可不填.如果供应商由于客关原因，认为该任务无法正常完成, 则可以通过完成反馈接口异常完结。
	 */
	@ApiField("abnormal_feedback")
	private String abnormalFeedback;

	/**
	 * 异常完结反馈原因
	 */
	@ApiField("abnormal_reason")
	private String abnormalReason;

	/**
	 * 实际已完成生产数量，可以为0.
	 */
	@ApiField("actual_amount")
	private Long actualAmount;

	/**
	 * 供应链需求生产实际完成时间
	 */
	@ApiField("actual_end_time")
	private Date actualEndTime;

	/**
	 * 验码附件信息
	 */
	@ApiListField("appendix_urls")
	@ApiField("supplier_appendix_url")
	private List<SupplierAppendixUrl> appendixUrls;

	/**
	 * 是否最后一个批次, Y/N (默认为Y)
	 */
	@ApiField("batch_flag")
	private String batchFlag;

	/**
	 * 批次号, 用于生产分批反馈完成.批次号由供应商自行定义,只能用于标识当前反馈指令的某一个批次。批次号和批次列表不可同时为空。
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 批次列表数据。批次号和批次列表不可同时为空。
	 */
	@ApiListField("batchs")
	@ApiField("supplier_produce_batch")
	private List<SupplierProduceBatch> batchs;

	/**
	 * 附加参数集合
	 */
	@ApiListField("extend_pros")
	@ApiField("supplier_item_attr_field")
	private List<SupplierItemAttrField> extendPros;

	/**
	 * 是否最后一个批次, Y/N (默认为Y)
	 */
	@ApiField("last_batch_flag")
	private String lastBatchFlag;

	/**
	 * 计划生产完成时间, 如果是批次反馈，该参数为供应商计划全部完成的时间.
	 */
	@ApiField("plan_end_time")
	private Date planEndTime;

	/**
	 * 计划生产开始时间,如果是批次反馈，该参数是供应商计划生产开始时间.
	 */
	@ApiField("plan_start_time")
	private Date planStartTime;

	/**
	 * 生产指令编号
	 */
	@ApiField("produce_order_code")
	private String produceOrderCode;

	public String getAbnormalFeedback() {
		return this.abnormalFeedback;
	}
	public void setAbnormalFeedback(String abnormalFeedback) {
		this.abnormalFeedback = abnormalFeedback;
	}

	public String getAbnormalReason() {
		return this.abnormalReason;
	}
	public void setAbnormalReason(String abnormalReason) {
		this.abnormalReason = abnormalReason;
	}

	public Long getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(Long actualAmount) {
		this.actualAmount = actualAmount;
	}

	public Date getActualEndTime() {
		return this.actualEndTime;
	}
	public void setActualEndTime(Date actualEndTime) {
		this.actualEndTime = actualEndTime;
	}

	public List<SupplierAppendixUrl> getAppendixUrls() {
		return this.appendixUrls;
	}
	public void setAppendixUrls(List<SupplierAppendixUrl> appendixUrls) {
		this.appendixUrls = appendixUrls;
	}

	public String getBatchFlag() {
		return this.batchFlag;
	}
	public void setBatchFlag(String batchFlag) {
		this.batchFlag = batchFlag;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public List<SupplierProduceBatch> getBatchs() {
		return this.batchs;
	}
	public void setBatchs(List<SupplierProduceBatch> batchs) {
		this.batchs = batchs;
	}

	public List<SupplierItemAttrField> getExtendPros() {
		return this.extendPros;
	}
	public void setExtendPros(List<SupplierItemAttrField> extendPros) {
		this.extendPros = extendPros;
	}

	public String getLastBatchFlag() {
		return this.lastBatchFlag;
	}
	public void setLastBatchFlag(String lastBatchFlag) {
		this.lastBatchFlag = lastBatchFlag;
	}

	public Date getPlanEndTime() {
		return this.planEndTime;
	}
	public void setPlanEndTime(Date planEndTime) {
		this.planEndTime = planEndTime;
	}

	public Date getPlanStartTime() {
		return this.planStartTime;
	}
	public void setPlanStartTime(Date planStartTime) {
		this.planStartTime = planStartTime;
	}

	public String getProduceOrderCode() {
		return this.produceOrderCode;
	}
	public void setProduceOrderCode(String produceOrderCode) {
		this.produceOrderCode = produceOrderCode;
	}

}
