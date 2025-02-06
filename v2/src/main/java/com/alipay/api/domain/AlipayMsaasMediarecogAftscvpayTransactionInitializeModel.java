package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 多媒体afts平台视觉付交易初始化接口
 *
 * @author auto create
 * @since 1.0, 2024-11-08 11:22:55
 */
public class AlipayMsaasMediarecogAftscvpayTransactionInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 1246373847747248391L;

	/**
	 * 货柜类型
	 */
	@ApiField("device_identify_type")
	private String deviceIdentifyType;

	/**
	 * 商品信息,列表
	 */
	@ApiListField("goods_infos")
	@ApiField("good_info")
	private List<GoodInfo> goodsInfos;

	/**
	 * 视觉货柜机型信息
	 */
	@ApiField("machine_type")
	private String machineType;

	/**
	 * 用户uid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 是否录制视频
	 */
	@ApiField("record_video")
	private Boolean recordVideo;

	/**
	 * 标识是什么场景下的视觉识别请求
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 二级商户ID
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	/**
	 * 二级商户名称
	 */
	@ApiField("sub_merchant_name")
	private String subMerchantName;

	/**
	 * 售卖设备编号
	 */
	@ApiField("terminal_id")
	private String terminalId;

	/**
	 * 视觉货柜设备总层数
	 */
	@ApiField("total_floors")
	private Long totalFloors;

	/**
	 * 云平台请求唯一标示,保证用户请求的幂等性.
	 */
	@ApiField("transaction_id")
	private String transactionId;

	/**
	 * 货柜类型，1:友宝货柜, 2:产品化货柜
	 */
	@ApiField("type")
	private Long type;

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

	public String getMachineType() {
		return this.machineType;
	}
	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Boolean getRecordVideo() {
		return this.recordVideo;
	}
	public void setRecordVideo(Boolean recordVideo) {
		this.recordVideo = recordVideo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

	public String getSubMerchantName() {
		return this.subMerchantName;
	}
	public void setSubMerchantName(String subMerchantName) {
		this.subMerchantName = subMerchantName;
	}

	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public Long getTotalFloors() {
		return this.totalFloors;
	}
	public void setTotalFloors(Long totalFloors) {
		this.totalFloors = totalFloors;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
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
