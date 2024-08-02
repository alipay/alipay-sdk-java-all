package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商生产批次信息数据
 *
 * @author auto create
 * @since 1.0, 2023-11-20 16:06:17
 */
public class SupplierProduceBatch extends AlipayObject {

	private static final long serialVersionUID = 1383159298529125186L;

	/**
	 * 生产数量
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 批次编号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 过期日期
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 生产批号
	 */
	@ApiField("produce_code")
	private String produceCode;

	/**
	 * 生产日期
	 */
	@ApiField("produce_date")
	private Date produceDate;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
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
