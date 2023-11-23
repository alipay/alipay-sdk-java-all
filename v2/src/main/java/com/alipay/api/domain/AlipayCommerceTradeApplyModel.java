package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业代理收单接口
 *
 * @author auto create
 * @since 1.0, 2023-01-06 19:58:51
 */
public class AlipayCommerceTradeApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5732871526527383971L;

	/**
	 * 订单费用详情，用于在订单确认页面展示
	 */
	@ApiField("amount_detail")
	private String amountDetail;

	/**
	 * 接口请求渠道编码，由支付宝提供
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 接口版本号
	 */
	@ApiField("interface_version")
	private String interfaceVersion;

	/**
	 * 用于标识操作模型，由支付宝配置提供
	 */
	@ApiField("op_code")
	private String opCode;

	/**
	 * 网关openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 场景的数据表示. json 数组格式，根据场景不同的模型传入不同参数，由支付宝负责提供参数集合
	 */
	@ApiField("order_detail")
	private String orderDetail;

	/**
	 * 用于标识数据模型，由支付宝配置提供
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 场景覆盖的目标人群标识，支持支付宝userId、身份证号、支付宝登录号、支付宝绑定手机号；
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 场景覆盖人群id类型
	 */
	@ApiField("target_id_type")
	private String targetIdType;

	/**
	 * 交易请求参数
	 */
	@ApiField("trade_apply_params")
	private TradeApplyParams tradeApplyParams;

	public String getAmountDetail() {
		return this.amountDetail;
	}
	public void setAmountDetail(String amountDetail) {
		this.amountDetail = amountDetail;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getInterfaceVersion() {
		return this.interfaceVersion;
	}
	public void setInterfaceVersion(String interfaceVersion) {
		this.interfaceVersion = interfaceVersion;
	}

	public String getOpCode() {
		return this.opCode;
	}
	public void setOpCode(String opCode) {
		this.opCode = opCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderDetail() {
		return this.orderDetail;
	}
	public void setOrderDetail(String orderDetail) {
		this.orderDetail = orderDetail;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetIdType() {
		return this.targetIdType;
	}
	public void setTargetIdType(String targetIdType) {
		this.targetIdType = targetIdType;
	}

	public TradeApplyParams getTradeApplyParams() {
		return this.tradeApplyParams;
	}
	public void setTradeApplyParams(TradeApplyParams tradeApplyParams) {
		this.tradeApplyParams = tradeApplyParams;
	}

}
