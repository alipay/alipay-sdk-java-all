package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 随身贷还款试算
 *
 * @author auto create
 * @since 1.0, 2025-04-25 15:45:24
 */
public class AlipayPcreditLoanSideloanrepayBudgetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5528634559275526487L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 申请还款金额，单位元，小数点后保留两位。
为空或为0时，对借据做结清预算不做分摊；大于0时，对申请还款金额做分摊。
	 */
	@ApiField("apply_repay_amount")
	private String applyRepayAmount;

	/**
	 * 扩展参数，预留字段
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 淘宝支用申请单号集合。提前还款场景下强制校验不为空，并基于传入的支用申请单号做试算；到期逾期还款场景下为空，基于还款场景进行试算。
	 */
	@ApiListField("loan_apply_no_list")
	@ApiField("string")
	private List<String> loanApplyNoList;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 产品码, 信贷产品码销售外标 加 渠道编码组成，固定为: SL_PD_SALE_CODE-TAOTIAN
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 还款场景
PREPAY-提前还款
DUE_REPAY-到期逾期还款
	 */
	@ApiField("repayment_scene")
	private String repaymentScene;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getApplyRepayAmount() {
		return this.applyRepayAmount;
	}
	public void setApplyRepayAmount(String applyRepayAmount) {
		this.applyRepayAmount = applyRepayAmount;
	}

	public String getExtension() {
		return this.extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}

	public List<String> getLoanApplyNoList() {
		return this.loanApplyNoList;
	}
	public void setLoanApplyNoList(List<String> loanApplyNoList) {
		this.loanApplyNoList = loanApplyNoList;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRepaymentScene() {
		return this.repaymentScene;
	}
	public void setRepaymentScene(String repaymentScene) {
		this.repaymentScene = repaymentScene;
	}

}
