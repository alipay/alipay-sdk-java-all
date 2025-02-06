package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发薪转账申请
 *
 * @author auto create
 * @since 1.0, 2024-11-15 10:22:27
 */
public class AlipayCommerceSalaryTransferApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8276631675454436147L;

	/**
	 * 转账关联的业务单据列表
	 */
	@ApiListField("biz_salary_order")
	@ApiField("biz_salary_order")
	private List<BizSalaryOrder> bizSalaryOrder;

	/**
	 * 转账申请场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 转账申请的外部单号，参与幂等的关键参数。多次请求相同场景下的相同的外部单号会命中幂等，返回上次成功的结果。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 转账申请产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 转账详情
	 */
	@ApiField("transfer_info")
	private SalaryTransferInfo transferInfo;

	public List<BizSalaryOrder> getBizSalaryOrder() {
		return this.bizSalaryOrder;
	}
	public void setBizSalaryOrder(List<BizSalaryOrder> bizSalaryOrder) {
		this.bizSalaryOrder = bizSalaryOrder;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public SalaryTransferInfo getTransferInfo() {
		return this.transferInfo;
	}
	public void setTransferInfo(SalaryTransferInfo transferInfo) {
		this.transferInfo = transferInfo;
	}

}
