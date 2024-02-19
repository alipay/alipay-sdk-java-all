package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批次明细数据
 *
 * @author auto create
 * @since 1.0, 2018-07-20 12:10:02
 */
public class BatchDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 4134555435715399565L;

	/**
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 明细批次号
	 */
	@ApiField("detail_no")
	private String detailNo;

	/**
	 * 调用方扩充参数
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 失败原因：在status为fail时此字段不为空
	 */
	@ApiField("fail_message")
	private String failMessage;

	/**
	 * 最后修改时间，指失败时间、成功时间、创建时间等，明细最后一次变更状态的时间
	 */
	@ApiField("last_modified")
	private Date lastModified;

	/**
	 * 付款人留言
	 */
	@ApiField("message")
	private String message;

	/**
	 * 付款金额，单位为元，有两位小数
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 支付成功时间
	 */
	@ApiField("pay_success_date")
	private Date paySuccessDate;

	/**
	 * 批次明细状态
AVAILABLE：可付款
SUCCESS：付款成功
	 */
	@ApiField("status")
	private String status;

	/**
	 * 付款订单号
	 */
	@ApiField("transfer_no")
	private String transferNo;

	/**
	 * 付款人UID
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public Date getPaySuccessDate() {
		return this.paySuccessDate;
	}
	public void setPaySuccessDate(Date paySuccessDate) {
		this.paySuccessDate = paySuccessDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransferNo() {
		return this.transferNo;
	}
	public void setTransferNo(String transferNo) {
		this.transferNo = transferNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
