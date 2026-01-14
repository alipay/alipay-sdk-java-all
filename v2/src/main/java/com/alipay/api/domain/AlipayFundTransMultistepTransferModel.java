package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多步转账创建并支付
 *
 * @author auto create
 * @since 1.0, 2025-11-17 16:11:19
 */
public class AlipayFundTransMultistepTransferModel extends AlipayObject {

	private static final long serialVersionUID = 1854853151347591711L;

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

	/**
	 * 该笔转账使用的转账场景，商户可前往【<a href="https://b.alipay.com/page/bizfund/transferScene/list">支付宝商家平台-资金管理-转账场景</a>】中查看/申明转账场景。<br>
目前支持以下枚举值：现金营销、企业退款、佣金报酬、业务结算、二手回收、公益补助、行政补贴和退款、保险理赔
	 */
	@ApiField("transfer_scene_name")
	private String transferSceneName;

	/**
	 * 转账场景信息，包含转账场景信息类型和转账场景信息描述。需按该笔转账使用的转账场景准确填写
	 */
	@ApiListField("transfer_scene_report_infos")
	@ApiField("transfer_scene_report_info")
	private List<TransferSceneReportInfo> transferSceneReportInfos;

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

	public String getTransferSceneName() {
		return this.transferSceneName;
	}
	public void setTransferSceneName(String transferSceneName) {
		this.transferSceneName = transferSceneName;
	}

	public List<TransferSceneReportInfo> getTransferSceneReportInfos() {
		return this.transferSceneReportInfos;
	}
	public void setTransferSceneReportInfos(List<TransferSceneReportInfo> transferSceneReportInfos) {
		this.transferSceneReportInfos = transferSceneReportInfos;
	}

}
