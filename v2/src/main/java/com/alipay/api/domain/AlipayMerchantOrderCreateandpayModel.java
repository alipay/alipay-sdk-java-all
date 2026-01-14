package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单创建并支付
 *
 * @author auto create
 * @since 1.0, 2023-02-13 13:25:32
 */
public class AlipayMerchantOrderCreateandpayModel extends AlipayObject {

	private static final long serialVersionUID = 7113437997849221566L;

	/**
	 * 不同的业务类型有不同的状态推进逻辑，同时对于支付的驱动有不同的处理方法。如阿里云的现金支付不需要订单驱动，阿里云的纯积分支付需要等待代扣成功消息才算支付成功。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 买家身份。当issuer=ALIPAY &&type=USERID时，identity表示的是支付宝用户ID，此时identity和open_id至少传一个。其他情况，不用传oepn_id
	 */
	@ApiField("buyer")
	private UserIdentity buyer;

	/**
	 * 业务扩展参数（键值对列表，有重复的键后者覆盖前者，建议唯一，以免出现不可预期的结果），比如在阿里云购买场景下可以传[{"ext_key":"aliyun_order_id","ext_value":"20196478824390"}]
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 商品信息，包括alipay商品skuId、购买数量等信息
	 */
	@ApiListField("goods_infos")
	@ApiField("goods_information")
	private List<GoodsInformation> goodsInfos;

	/**
	 * 订单金额，比如[{"type":"MONEY","amount":88.66},{"type":"FAMILY_POINT","amount":2000}]，代表订单中所有商品需要支付的总金额是88.66元+2000家庭积分。
	 */
	@ApiListField("order_amount")
	@ApiField("price_information")
	private List<PriceInformation> orderAmount;

	/**
	 * 外部业务号，用于幂等控制，64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付请求，比如下面的请求代表在这次下单中支付2000家庭积分[{"request_no":"2019678438","action":"PAY","amount":{"type":"FAMILY_POINT","amount":2000}}]，如果是现金单位元。之所以是一个list是为了支持多笔支付，支付失败重试请不要更换request_no
	 */
	@ApiListField("payment_request")
	@ApiField("payment_information")
	private List<PaymentInformation> paymentRequest;

	/**
	 * 卖家身份，openid字段不用传递，依旧使用原有的identity字段
	 */
	@ApiField("seller")
	private UserIdentity seller;

	/**
	 * service_type是基于biz_scene的，biz_scene+service_type唯一标识了一个业务场景
	 */
	@ApiField("service_type")
	private String serviceType;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public UserIdentity getBuyer() {
		return this.buyer;
	}
	public void setBuyer(UserIdentity buyer) {
		this.buyer = buyer;
	}

	public List<OrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<OrderExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public List<GoodsInformation> getGoodsInfos() {
		return this.goodsInfos;
	}
	public void setGoodsInfos(List<GoodsInformation> goodsInfos) {
		this.goodsInfos = goodsInfos;
	}

	public List<PriceInformation> getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(List<PriceInformation> orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<PaymentInformation> getPaymentRequest() {
		return this.paymentRequest;
	}
	public void setPaymentRequest(List<PaymentInformation> paymentRequest) {
		this.paymentRequest = paymentRequest;
	}

	public UserIdentity getSeller() {
		return this.seller;
	}
	public void setSeller(UserIdentity seller) {
		this.seller = seller;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

}
