package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 免押订单风控查询
 *
 * @author auto create
 * @since 1.0, 2021-10-27 17:12:03
 */
public class ZhimaCreditEpFreedepositOrderriskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1791525211285135616L;

	/**
	 * 本次使用免押金额，分
	 */
	@ApiField("current_use_limit")
	private Long currentUseLimit;

	/**
	 * 企业证件号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业证件类型
	 */
	@ApiField("ep_cert_type")
	private String epCertType;

	/**
	 * 企业名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 首笔租金金额，分
	 */
	@ApiField("first_rent_amount")
	private Long firstRentAmount;

	/**
	 * 租期期数
	 */
	@ApiField("lease_periods")
	private Long leasePeriods;

	/**
	 * 租赁设备信息列表
	 */
	@ApiListField("machine_info_list")
	@ApiField("machine_info")
	private List<MachineInfo> machineInfoList;

	/**
	 * 订单风控业务流水号，商户生成，每次业务保证唯一
	 */
	@ApiField("merchant_lease_order_no")
	private String merchantLeaseOrderNo;

	/**
	 * 超出免押额度部分的应交押金(人民币分)
	 */
	@ApiField("need_pay_deposit_amount")
	private Long needPayDepositAmount;

	/**
	 * 芝麻企业免押额度申请业务流水号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 付款日
	 */
	@ApiField("pay_date")
	private String payDate;

	/**
	 * 每期租金金额，分
	 */
	@ApiField("period_lease_amount")
	private Long periodLeaseAmount;

	/**
	 * 产品ID
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 收货地址
	 */
	@ApiField("rec_address")
	private String recAddress;

	/**
	 * 收货人手机号
	 */
	@ApiField("rec_mobile")
	private String recMobile;

	/**
	 * 收货人姓名
	 */
	@ApiField("rec_name")
	private String recName;

	/**
	 * 剩余可用免押金额，分
	 */
	@ApiField("remain_limit")
	private Long remainLimit;

	/**
	 * 租赁总金额，分
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	public Long getCurrentUseLimit() {
		return this.currentUseLimit;
	}
	public void setCurrentUseLimit(Long currentUseLimit) {
		this.currentUseLimit = currentUseLimit;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpCertType() {
		return this.epCertType;
	}
	public void setEpCertType(String epCertType) {
		this.epCertType = epCertType;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public Long getFirstRentAmount() {
		return this.firstRentAmount;
	}
	public void setFirstRentAmount(Long firstRentAmount) {
		this.firstRentAmount = firstRentAmount;
	}

	public Long getLeasePeriods() {
		return this.leasePeriods;
	}
	public void setLeasePeriods(Long leasePeriods) {
		this.leasePeriods = leasePeriods;
	}

	public List<MachineInfo> getMachineInfoList() {
		return this.machineInfoList;
	}
	public void setMachineInfoList(List<MachineInfo> machineInfoList) {
		this.machineInfoList = machineInfoList;
	}

	public String getMerchantLeaseOrderNo() {
		return this.merchantLeaseOrderNo;
	}
	public void setMerchantLeaseOrderNo(String merchantLeaseOrderNo) {
		this.merchantLeaseOrderNo = merchantLeaseOrderNo;
	}

	public Long getNeedPayDepositAmount() {
		return this.needPayDepositAmount;
	}
	public void setNeedPayDepositAmount(Long needPayDepositAmount) {
		this.needPayDepositAmount = needPayDepositAmount;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPayDate() {
		return this.payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public Long getPeriodLeaseAmount() {
		return this.periodLeaseAmount;
	}
	public void setPeriodLeaseAmount(Long periodLeaseAmount) {
		this.periodLeaseAmount = periodLeaseAmount;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRecAddress() {
		return this.recAddress;
	}
	public void setRecAddress(String recAddress) {
		this.recAddress = recAddress;
	}

	public String getRecMobile() {
		return this.recMobile;
	}
	public void setRecMobile(String recMobile) {
		this.recMobile = recMobile;
	}

	public String getRecName() {
		return this.recName;
	}
	public void setRecName(String recName) {
		this.recName = recName;
	}

	public Long getRemainLimit() {
		return this.remainLimit;
	}
	public void setRemainLimit(Long remainLimit) {
		this.remainLimit = remainLimit;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

}
