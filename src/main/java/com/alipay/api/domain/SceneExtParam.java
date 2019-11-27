package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融扩展字段
 *
 * @author auto create
 * @since 1.0, 2019-03-26 16:36:21
 */
public class SceneExtParam extends AlipayObject {

	private static final long serialVersionUID = 7238764721915561613L;

	/**
	 * B流程申请准入原因
	 */
	@ApiField("apply_reason")
	private String applyReason;

	/**
	 * 机构的合约编号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 贴息金额，单位：分
	 */
	@ApiField("discountamt")
	private String discountamt;

	/**
	 * 首付款，单位：分
	 */
	@ApiField("firstpayamt")
	private String firstpayamt;

	/**
	 * 上传的客户的身份证号，做同人校验使用，机构上传
	 */
	@ApiField("input_cust_id_card")
	private String inputCustIdCard;

	/**
	 * 客户姓名，用于做同人校验，机构上传
	 */
	@ApiField("input_cust_real_name")
	private String inputCustRealName;

	/**
	 * 利率，xx%格式
	 */
	@ApiField("interestrate")
	private String interestrate;

	/**
	 * 尾款，单位：分
	 */
	@ApiField("lastpayamt")
	private String lastpayamt;

	/**
	 * 月供，单位：分，需要大于等于0
	 */
	@ApiField("monthpayamt")
	private String monthpayamt;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	public String getApplyReason() {
		return this.applyReason;
	}
	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getDiscountamt() {
		return this.discountamt;
	}
	public void setDiscountamt(String discountamt) {
		this.discountamt = discountamt;
	}

	public String getFirstpayamt() {
		return this.firstpayamt;
	}
	public void setFirstpayamt(String firstpayamt) {
		this.firstpayamt = firstpayamt;
	}

	public String getInputCustIdCard() {
		return this.inputCustIdCard;
	}
	public void setInputCustIdCard(String inputCustIdCard) {
		this.inputCustIdCard = inputCustIdCard;
	}

	public String getInputCustRealName() {
		return this.inputCustRealName;
	}
	public void setInputCustRealName(String inputCustRealName) {
		this.inputCustRealName = inputCustRealName;
	}

	public String getInterestrate() {
		return this.interestrate;
	}
	public void setInterestrate(String interestrate) {
		this.interestrate = interestrate;
	}

	public String getLastpayamt() {
		return this.lastpayamt;
	}
	public void setLastpayamt(String lastpayamt) {
		this.lastpayamt = lastpayamt;
	}

	public String getMonthpayamt() {
		return this.monthpayamt;
	}
	public void setMonthpayamt(String monthpayamt) {
		this.monthpayamt = monthpayamt;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
