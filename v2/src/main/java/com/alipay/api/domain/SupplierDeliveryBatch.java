package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发货批次信息
 *
 * @author auto create
 * @since 1.0, 2023-11-20 16:06:27
 */
public class SupplierDeliveryBatch extends AlipayObject {

	private static final long serialVersionUID = 5154395458259734358L;

	/**
	 * 实发数量
	 */
	@ApiField("actual_amount")
	private Long actualAmount;

	/**
	 * 批次编号, 20190721001
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 过期日期(YYYY-MM-DD)
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 生产批号
	 */
	@ApiField("produce_code")
	private String produceCode;

	/**
	 * 生产日期(YYYY-MM-DD)
	 */
	@ApiField("produce_date")
	private Date produceDate;

	public Long getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(Long actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getProduceCode() {
		return this.produceCode;
	}
	public void setProduceCode(String produceCode) {
		this.produceCode = produceCode;
	}

	public Date getProduceDate() {
		return this.produceDate;
	}
	public void setProduceDate(Date produceDate) {
		this.produceDate = produceDate;
	}

}
