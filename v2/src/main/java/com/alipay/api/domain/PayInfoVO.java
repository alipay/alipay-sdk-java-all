package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付信息模型
 *
 * @author auto create
 * @since 1.0, 2023-04-05 10:53:41
 */
public class PayInfoVO extends AlipayObject {

	private static final long serialVersionUID = 5134952498888816168L;

	/**
	 * 0: 支付类型
	 */
	@ApiField("pay_method_type")
	private String payMethodType;

	/**
	 * 付款时间，yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 支付流水单号
	 */
	@ApiField("transaction_id")
	private String transactionId;

	/**
	 * 券明细
	 */
	@ApiListField("voucher_detail_list")
	@ApiField("voucher_detail_info_d_t_o")
	private List<VoucherDetailInfoDTO> voucherDetailList;

	public String getPayMethodType() {
		return this.payMethodType;
	}
	public void setPayMethodType(String payMethodType) {
		this.payMethodType = payMethodType;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public List<VoucherDetailInfoDTO> getVoucherDetailList() {
		return this.voucherDetailList;
	}
	public void setVoucherDetailList(List<VoucherDetailInfoDTO> voucherDetailList) {
		this.voucherDetailList = voucherDetailList;
	}

}
