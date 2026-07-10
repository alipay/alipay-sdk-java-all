package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 网商数字货币批量代发接口
 *
 * @author auto create
 * @since 1.0, 2026-05-14 10:17:45
 */
public class MybankEcnyFundBatchtransferCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2839288424212722551L;

	/**
	 * 不可使用特殊字符，如 /，=，& ，<，>等
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 由双方约定分配值
	 */
	@ApiField("out_request_from")
	private String outRequestFrom;

	/**
	 * 仅支持字母、数字，作为幂等字段，需保证在调用方内部不重复
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 付款钱包实名信息姓名
	 */
	@ApiField("payer_name")
	private String payerName;

	/**
	 * 数字人民币钱包编号
	 */
	@ApiField("payer_wallet_id")
	private String payerWalletId;

	/**
	 * 单位为元，精确到小数点后两位
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 代发总笔数
	 */
	@ApiField("total_num")
	private Long totalNum;

	/**
	 * null
	 */
	@ApiListField("transfer_detail_list")
	@ApiField("transfer_detail")
	private List<TransferDetail> transferDetailList;

	/**
	 * 不可使用特殊字符，如 /，=，& ，<，>等
	 */
	@ApiField("transfer_purpose")
	private String transferPurpose;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutRequestFrom() {
		return this.outRequestFrom;
	}
	public void setOutRequestFrom(String outRequestFrom) {
		this.outRequestFrom = outRequestFrom;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPayerName() {
		return this.payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	public String getPayerWalletId() {
		return this.payerWalletId;
	}
	public void setPayerWalletId(String payerWalletId) {
		this.payerWalletId = payerWalletId;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getTotalNum() {
		return this.totalNum;
	}
	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	public List<TransferDetail> getTransferDetailList() {
		return this.transferDetailList;
	}
	public void setTransferDetailList(List<TransferDetail> transferDetailList) {
		this.transferDetailList = transferDetailList;
	}

	public String getTransferPurpose() {
		return this.transferPurpose;
	}
	public void setTransferPurpose(String transferPurpose) {
		this.transferPurpose = transferPurpose;
	}

}
