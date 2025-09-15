package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用购机商品信息
 *
 * @author auto create
 * @since 1.0, 2025-06-10 11:23:40
 */
public class CreditPhoneInfo extends AlipayObject {

	private static final long serialVersionUID = 1141472142749698778L;

	/**
	 * 套餐编号
	 */
	@ApiField("busi_id")
	private String busiId;

	/**
	 * 单位是元。套餐每月保底金额
	 */
	@ApiField("busi_level")
	private String busiLevel;

	/**
	 * 套餐名称
	 */
	@ApiField("busi_name")
	private String busiName;

	/**
	 * 套餐类型
	 */
	@ApiField("busi_type")
	private String busiType;

	/**
	 * 申请人备用手机号
	 */
	@ApiField("contace_mobile_no")
	private String contaceMobileNo;

	/**
	 * 每个月份的逾期日期
	 */
	@ApiField("due_date")
	private Long dueDate;

	/**
	 * 首月价格，单位 元
	 */
	@ApiField("first_month_price")
	private String firstMonthPrice;

	/**
	 * 分期数，决定了最大的分期扣款数。注意，提前结清认为是一笔特殊的分期扣款。
	 */
	@ApiField("installment_numbers")
	private Long installmentNumbers;

	/**
	 * 办理合约手机号对应的运营商
	 */
	@ApiField("isp_abbr_cn")
	private String ispAbbrCn;

	/**
	 * 运营商订单号
	 */
	@ApiField("isp_order_no")
	private String ispOrderNo;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 单位是元。单期最大扣款金额。注意单期最大扣款金额*分期数不得超过订单总金额
	 */
	@ApiField("max_amount_per_installment")
	private String maxAmountPerInstallment;

	/**
	 * 连续欠费达【overdue_days】天
	 */
	@ApiField("overdue_days")
	private Long overdueDays;

	/**
	 * 于【pay_date】日扣除本月已享优惠
	 */
	@ApiField("pay_date")
	private Long payDate;

	/**
	 * 单位是元。原套餐每月保底金额
	 */
	@ApiField("pre_busi_level")
	private String preBusiLevel;

	/**
	 * 办理合约手机号对应的省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 省份账单日
	 */
	@ApiField("province_bill_date")
	private Long provinceBillDate;

	/**
	 * 要求在网月数，单位 月
	 */
	@ApiField("require_month_count")
	private Long requireMonthCount;

	/**
	 * 签约合约机套餐的手机号
	 */
	@ApiField("service_mobile")
	private String serviceMobile;

	/**
	 * 机构只允许传入事先已通过审批的套餐类目ID。套餐类目中中包含信用购机套餐的基本属性。
	 */
	@ApiField("spu_id")
	private String spuId;

	/**
	 * 单位是元。套餐优总惠金额是用户享受的全部优惠金额。同时用于计算服务手续费（冻结金额-套餐总优惠金额）
	 */
	@ApiField("total_bonus")
	private String totalBonus;

	public String getBusiId() {
		return this.busiId;
	}
	public void setBusiId(String busiId) {
		this.busiId = busiId;
	}

	public String getBusiLevel() {
		return this.busiLevel;
	}
	public void setBusiLevel(String busiLevel) {
		this.busiLevel = busiLevel;
	}

	public String getBusiName() {
		return this.busiName;
	}
	public void setBusiName(String busiName) {
		this.busiName = busiName;
	}

	public String getBusiType() {
		return this.busiType;
	}
	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}

	public String getContaceMobileNo() {
		return this.contaceMobileNo;
	}
	public void setContaceMobileNo(String contaceMobileNo) {
		this.contaceMobileNo = contaceMobileNo;
	}

	public Long getDueDate() {
		return this.dueDate;
	}
	public void setDueDate(Long dueDate) {
		this.dueDate = dueDate;
	}

	public String getFirstMonthPrice() {
		return this.firstMonthPrice;
	}
	public void setFirstMonthPrice(String firstMonthPrice) {
		this.firstMonthPrice = firstMonthPrice;
	}

	public Long getInstallmentNumbers() {
		return this.installmentNumbers;
	}
	public void setInstallmentNumbers(Long installmentNumbers) {
		this.installmentNumbers = installmentNumbers;
	}

	public String getIspAbbrCn() {
		return this.ispAbbrCn;
	}
	public void setIspAbbrCn(String ispAbbrCn) {
		this.ispAbbrCn = ispAbbrCn;
	}

	public String getIspOrderNo() {
		return this.ispOrderNo;
	}
	public void setIspOrderNo(String ispOrderNo) {
		this.ispOrderNo = ispOrderNo;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getMaxAmountPerInstallment() {
		return this.maxAmountPerInstallment;
	}
	public void setMaxAmountPerInstallment(String maxAmountPerInstallment) {
		this.maxAmountPerInstallment = maxAmountPerInstallment;
	}

	public Long getOverdueDays() {
		return this.overdueDays;
	}
	public void setOverdueDays(Long overdueDays) {
		this.overdueDays = overdueDays;
	}

	public Long getPayDate() {
		return this.payDate;
	}
	public void setPayDate(Long payDate) {
		this.payDate = payDate;
	}

	public String getPreBusiLevel() {
		return this.preBusiLevel;
	}
	public void setPreBusiLevel(String preBusiLevel) {
		this.preBusiLevel = preBusiLevel;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public Long getProvinceBillDate() {
		return this.provinceBillDate;
	}
	public void setProvinceBillDate(Long provinceBillDate) {
		this.provinceBillDate = provinceBillDate;
	}

	public Long getRequireMonthCount() {
		return this.requireMonthCount;
	}
	public void setRequireMonthCount(Long requireMonthCount) {
		this.requireMonthCount = requireMonthCount;
	}

	public String getServiceMobile() {
		return this.serviceMobile;
	}
	public void setServiceMobile(String serviceMobile) {
		this.serviceMobile = serviceMobile;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

	public String getTotalBonus() {
		return this.totalBonus;
	}
	public void setTotalBonus(String totalBonus) {
		this.totalBonus = totalBonus;
	}

}
