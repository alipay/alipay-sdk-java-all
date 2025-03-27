package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多步转账创建并支付
 *
 * @author auto create
 * @since 1.0, 2025-03-26 19:52:21
 */
public class AlipayFundTransMultistepTransferModel extends AlipayObject {

	private static final long serialVersionUID = 3773168184711146936L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * JSON格式，传递业务扩展参数。
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 多步转账明细
	 */
	@ApiListField("order_details")
	@ApiField("multi_step_trans_order_detail_request")
	private List<MultiStepTransOrderDetailRequest> orderDetails;

	/**
	 * 保证外部单号的唯一幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 公用回传参数，如果请求时传递了该参数，则异步通知商户时会回传该参数。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 用于备注单据一些使用功能或是额外的一些标记
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 转账的金额 (单位：元)
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 总数量，单位是条
	 */
	@ApiField("total_count")
	private String totalCount;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
	}

	public List<MultiStepTransOrderDetailRequest> getOrderDetails() {
		return this.orderDetails;
	}
	public void setOrderDetails(List<MultiStepTransOrderDetailRequest> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPassbackParams() {
		return this.passbackParams;
	}
	public void setPassbackParams(String passbackParams) {
		this.passbackParams = passbackParams;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

}
