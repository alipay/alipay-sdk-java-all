package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多媒体视觉付交易初始化接口
 *
 * @author auto create
 * @since 1.0, 2022-10-11 16:16:14
 */
public class AlipayMsaasMediarecogMmtcaftscvTransactionInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 1278164887857924738L;

	/**
	 * 货柜类型，static为静态柜，dynamic为动态柜
	 */
	@ApiField("device_identify_type")
	private String deviceIdentifyType;

	/**
	 * 商品信息列表
	 */
	@ApiListField("goods_infos")
	@ApiField("good_info")
	private List<GoodInfo> goodsInfos;

	/**
	 * 一键开柜链路唯一识别id
	 */
	@ApiField("req_id")
	private String reqId;

	/**
	 * 标识是什么场景下的视觉识别请求
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 售卖设备编号
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 云平台请求唯一标示,保证用户请求的幂等性.
	 */
	@ApiField("transaction_id")
	private String transactionId;

	/**
	 * 用户uid
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 货柜重力商品配置列表信息
	 */
	@ApiListField("weight_template")
	@ApiField("weight_floor")
	private List<WeightFloor> weightTemplate;

	public String getDeviceIdentifyType() {
		return this.deviceIdentifyType;
	}
	public void setDeviceIdentifyType(String deviceIdentifyType) {
		this.deviceIdentifyType = deviceIdentifyType;
	}

	public List<GoodInfo> getGoodsInfos() {
		return this.goodsInfos;
	}
	public void setGoodsInfos(List<GoodInfo> goodsInfos) {
		this.goodsInfos = goodsInfos;
	}

	public String getReqId() {
		return this.reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public List<WeightFloor> getWeightTemplate() {
		return this.weightTemplate;
	}
	public void setWeightTemplate(List<WeightFloor> weightTemplate) {
		this.weightTemplate = weightTemplate;
	}

}
