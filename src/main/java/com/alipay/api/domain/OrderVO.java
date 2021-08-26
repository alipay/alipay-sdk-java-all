package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单详情
 *
 * @author auto create
 * @since 1.0, 2020-07-15 16:59:09
 */
public class OrderVO extends AlipayObject {

	private static final long serialVersionUID = 1845611616313328311L;

	/**
	 * 订单金额-单位为分
	 */
	@ApiField("apply_amount")
	private String applyAmount;

	/**
	 * 订单申请时间
	 */
	@ApiField("apply_date")
	private Date applyDate;

	/**
	 * 交易来源传递的交易编号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 币种
	 */
	@ApiField("ccy")
	private String ccy;

	/**
	 * 订单生效时间
	 */
	@ApiField("effect_date")
	private Date effectDate;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 订单到期时间
	 */
	@ApiField("repay_date")
	private Date repayDate;

	/**
	 * CREATE(投标中)/CANCEL(未中标)/VALID(中标)/PAYING(支付中)
	 */
	@ApiField("status")
	private String status;

	public String getApplyAmount() {
		return this.applyAmount;
	}
	public void setApplyAmount(String applyAmount) {
		this.applyAmount = applyAmount;
	}

	public Date getApplyDate() {
		return this.applyDate;
	}
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getCcy() {
		return this.ccy;
	}
	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public Date getEffectDate() {
		return this.effectDate;
	}
	public void setEffectDate(Date effectDate) {
		this.effectDate = effectDate;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Date getRepayDate() {
		return this.repayDate;
	}
	public void setRepayDate(Date repayDate) {
		this.repayDate = repayDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
