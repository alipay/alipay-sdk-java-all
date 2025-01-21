package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询小程序本地商品订单对账列表信息
 *
 * @author auto create
 * @since 1.0, 2024-07-30 16:23:52
 */
public class AlipayOpenMiniOrderSelfitembillBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2882894374594486281L;

	/**
	 * 凭证号，商家可入参具体凭证号查询单个凭证的明细
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 商家订单凭证的核销状态，下钻到次序号维度
	 */
	@ApiField("certificate_status")
	private String certificateStatus;

	/**
	 * 小程序ID，必填
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 分页页码，从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 凭证核销的次序号
例：商品为次卡，可使用三次，则一个凭证能够进行三次核销，生成三个核销次序号
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 当前凭证的结算状态，下钻到次序号维度
	 */
	@ApiField("settle_status")
	private String settleStatus;

	/**
	 * 小程序订单结算日期，格式为"yyyy-MM-dd"，如"2023-03-22"
	 */
	@ApiField("settlement_date")
	private String settlementDate;

	/**
	 * 当前凭证核销门店的ID
	 */
	@ApiField("verification_shop_id")
	private String verificationShopId;

	/**
	 * 小程序订单核销日期，格式为"yyyy-MM-dd"，如"2023-03-22"
	 */
	@ApiField("verify_date")
	private String verifyDate;

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateStatus() {
		return this.certificateStatus;
	}
	public void setCertificateStatus(String certificateStatus) {
		this.certificateStatus = certificateStatus;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSettleStatus() {
		return this.settleStatus;
	}
	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}

	public String getSettlementDate() {
		return this.settlementDate;
	}
	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}

	public String getVerificationShopId() {
		return this.verificationShopId;
	}
	public void setVerificationShopId(String verificationShopId) {
		this.verificationShopId = verificationShopId;
	}

	public String getVerifyDate() {
		return this.verifyDate;
	}
	public void setVerifyDate(String verifyDate) {
		this.verifyDate = verifyDate;
	}

}
