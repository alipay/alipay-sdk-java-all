package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁售后单
 *
 * @author auto create
 * @since 1.0, 2025-08-22 20:57:19
 */
public class RentAftersaleOrderVO extends AlipayObject {

	private static final long serialVersionUID = 2155268459159823567L;

	/**
	 * 支付宝售后单ID
	 */
	@ApiField("aftersale_id")
	private String aftersaleId;

	/**
	 * 售后单状态
	 */
	@ApiField("aftersale_status")
	private String aftersaleStatus;

	/**
	 * 售后类型
	 */
	@ApiField("aftersale_type")
	private String aftersaleType;

	/**
	 * 申请时间
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/**
	 * 售后单是否完结
	 */
	@ApiField("finished")
	private Boolean finished;

	/**
	 * 售后单操作记录列表
	 */
	@ApiListField("operation_records")
	@ApiField("rent_aftersale_operation_record_v_o")
	private List<RentAftersaleOperationRecordVO> operationRecords;

	/**
	 * 商户外部售后单号
	 */
	@ApiField("out_aftersale_id")
	private String outAftersaleId;

	/**
	 * 发起来源
	 */
	@ApiField("source_type")
	private String sourceType;

	public String getAftersaleId() {
		return this.aftersaleId;
	}
	public void setAftersaleId(String aftersaleId) {
		this.aftersaleId = aftersaleId;
	}

	public String getAftersaleStatus() {
		return this.aftersaleStatus;
	}
	public void setAftersaleStatus(String aftersaleStatus) {
		this.aftersaleStatus = aftersaleStatus;
	}

	public String getAftersaleType() {
		return this.aftersaleType;
	}
	public void setAftersaleType(String aftersaleType) {
		this.aftersaleType = aftersaleType;
	}

	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public Boolean getFinished() {
		return this.finished;
	}
	public void setFinished(Boolean finished) {
		this.finished = finished;
	}

	public List<RentAftersaleOperationRecordVO> getOperationRecords() {
		return this.operationRecords;
	}
	public void setOperationRecords(List<RentAftersaleOperationRecordVO> operationRecords) {
		this.operationRecords = operationRecords;
	}

	public String getOutAftersaleId() {
		return this.outAftersaleId;
	}
	public void setOutAftersaleId(String outAftersaleId) {
		this.outAftersaleId = outAftersaleId;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

}
