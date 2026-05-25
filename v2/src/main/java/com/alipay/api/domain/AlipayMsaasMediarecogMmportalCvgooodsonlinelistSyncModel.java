package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 正在销售的货柜商品清单变更同步接口
 *
 * @author auto create
 * @since 1.0, 2026-03-30 14:52:23
 */
public class AlipayMsaasMediarecogMmportalCvgooodsonlinelistSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5181896892953691956L;

	/**
	 * 行业的补货业务id,唯一键, 用来做幂等和业务追踪
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 机柜序列号
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 商品变更影响交易
	 */
	@ApiListField("effect_transaction_ids")
	@ApiField("string")
	private List<String> effectTransactionIds;

	/**
	 * 存放扩展信息, 用于未来接口信息的扩展
	 */
	@ApiField("external_info")
	private String externalInfo;

	/**
	 * 商品清单信息
	 */
	@ApiListField("goods_infos")
	@ApiField("good_info")
	private List<GoodInfo> goodsInfos;

	/**
	 * 清单中商品的算法id的数组
	 */
	@ApiListField("goods_list")
	@ApiField("string")
	private List<String> goodsList;

	/**
	 * isv的pid号, 不能为空
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 单pad双门柜标识
	 */
	@ApiField("single_pad_door_pos")
	private String singlePadDoorPos;

	/**
	 * 清单提交时间
	 */
	@ApiField("submit_time")
	private Date submitTime;

	/**
	 * 行业商品清单唯一ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 用来未来业务扩展. 目前为动态补货类型
DYNAMIC_ADDING
	 */
	@ApiField("type")
	private String type;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public List<String> getEffectTransactionIds() {
		return this.effectTransactionIds;
	}
	public void setEffectTransactionIds(List<String> effectTransactionIds) {
		this.effectTransactionIds = effectTransactionIds;
	}

	public String getExternalInfo() {
		return this.externalInfo;
	}
	public void setExternalInfo(String externalInfo) {
		this.externalInfo = externalInfo;
	}

	public List<GoodInfo> getGoodsInfos() {
		return this.goodsInfos;
	}
	public void setGoodsInfos(List<GoodInfo> goodsInfos) {
		this.goodsInfos = goodsInfos;
	}

	public List<String> getGoodsList() {
		return this.goodsList;
	}
	public void setGoodsList(List<String> goodsList) {
		this.goodsList = goodsList;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getSinglePadDoorPos() {
		return this.singlePadDoorPos;
	}
	public void setSinglePadDoorPos(String singlePadDoorPos) {
		this.singlePadDoorPos = singlePadDoorPos;
	}

	public Date getSubmitTime() {
		return this.submitTime;
	}
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
