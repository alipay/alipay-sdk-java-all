package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 随身贷还款提交
 *
 * @author auto create
 * @since 1.0, 2024-12-02 17:42:40
 */
public class AlipayPcreditLoanSideloanrepayRepayApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2284638197723269584L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 申请还款金额，强制校验不为空且大于0
	 */
	@ApiField("apply_repay_amount")
	private String applyRepayAmount;

	/**
	 * 扩展字段, 还款试算时会放入借据号列表和应还金额信息，还款提交时透传。
	 */
	@ApiField("extension")
	private String extension;

	/**
	 * 支用申请单号集合
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
	 * 还款申请单号，业务幂等用
	 */
	@ApiField("repay_apply_no")
	private String repayApplyNo;

	/**
	 * 还款场景 PREPAY-提前还款 DUE_REPAY-到期逾期还款
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

	public String getRepayApplyNo() {
		return this.repayApplyNo;
	}
	public void setRepayApplyNo(String repayApplyNo) {
		this.repayApplyNo = repayApplyNo;
	}

	public String getRepaymentScene() {
		return this.repaymentScene;
	}
	public void setRepaymentScene(String repaymentScene) {
		this.repaymentScene = repaymentScene;
	}

}
