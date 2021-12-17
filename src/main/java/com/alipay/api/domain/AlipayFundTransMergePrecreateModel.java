package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 合并转账预下单接口
 *
 * @author auto create
 * @since 1.0, 2020-08-27 11:47:39
 */
public class AlipayFundTransMergePrecreateModel extends AlipayObject {

	private static final long serialVersionUID = 4461513841266169457L;

	/**
	 * 业务场景。
DINGTALK_MERCHANT_PAY：钉钉企业付款
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 转账请求的扩展参数，具体请与支付宝工程师联系。
merchant_op_id：商户所属的操作员id
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 用于收银台展示标题，必填
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 付款方信息。如果指定了，在某些场景下以指定的付款方为准，在某些场景下会做一致性校验。
	 */
	@ApiField("payer_info")
	private Participant payerInfo;

	/**
	 * 合并付款的业务产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 绝对超时时间，格式为yyyy-MM-dd HH:mm。
	 */
	@ApiField("time_expire")
	private String timeExpire;

	/**
	 * 转账订单列表，最多支持10条。
	 */
	@ApiListField("trans_order_list")
	@ApiField("trans_order_detail")
	private List<TransOrderDetail> transOrderList;

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

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public Participant getPayerInfo() {
		return this.payerInfo;
	}
	public void setPayerInfo(Participant payerInfo) {
		this.payerInfo = payerInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTimeExpire() {
		return this.timeExpire;
	}
	public void setTimeExpire(String timeExpire) {
		this.timeExpire = timeExpire;
	}

	public List<TransOrderDetail> getTransOrderList() {
		return this.transOrderList;
	}
	public void setTransOrderList(List<TransOrderDetail> transOrderList) {
		this.transOrderList = transOrderList;
	}

}
