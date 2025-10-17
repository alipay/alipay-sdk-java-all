package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 明细的查询结果
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class QueryDetailAopResult extends AlipayObject {

	private static final long serialVersionUID = 6619975976889267545L;

	/**
	 * 批次编号；此单据对应的批次编号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 明细编号
	 */
	@ApiField("detail_no")
	private String detailNo;

	/**
	 * 扩展属性；创建付款单时传入的数据
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 失败原因：在status为fail时此字段不为空
	 */
	@ApiField("fail_message")
	private String failMessage;

	/**
	 * 明细最后一次变更的时间
	 */
	@ApiField("last_modified")
	private Date lastModified;

	/**
	 * 单据号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 收／付款金额；单位为元
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 收款人userId
	 */
	@ApiField("payee_id")
	private String payeeId;

	/**
	 * 付款人userId
	 */
	@ApiField("payer_id")
	private String payerId;

	/**
	 * 服务费，单位为元
	 */
	@ApiField("service_charge")
	private String serviceCharge;

	/**
	 * 批次明细状态；注：AVAILABLE：可付款；SUCCESS：付款成功；FAIL：失败
	 */
	@ApiField("status")
	private String status;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getDetailNo() {
		return this.detailNo;
	}
	public void setDetailNo(String detailNo) {
		this.detailNo = detailNo;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getFailMessage() {
		return this.failMessage;
	}
	public void setFailMessage(String failMessage) {
		this.failMessage = failMessage;
	}

	public Date getLastModified() {
		return this.lastModified;
	}
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayeeId() {
		return this.payeeId;
	}
	public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}

	public String getPayerId() {
		return this.payerId;
	}
	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}

	public String getServiceCharge() {
		return this.serviceCharge;
	}
	public void setServiceCharge(String serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
