package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交互式风控用户交互记录详情
 *
 * @author auto create
 * @since 1.0, 2022-10-28 10:37:39
 */
public class InteractiveServiceRecordDetail extends AlipayObject {

	private static final long serialVersionUID = 3748566531997923441L;

	/**
	 * 批量任务id
	 */
	@ApiField("batch_biz_id")
	private String batchBizId;

	/**
	 * 业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 商品id
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * 场景名
	 */
	@ApiField("commodity_scene")
	private String commodityScene;

	/**
	 * 内容code
	 */
	@ApiField("content_code")
	private String contentCode;

	/**
	 * 对话详情
	 */
	@ApiField("dialogue")
	private String dialogue;

	/**
	 * 音视频下载链接，oss地址
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * 终止时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 流程标签，代表调用或交互结果
	 */
	@ApiField("interact_result")
	private String interactResult;

	/**
	 * open id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 手机号
	 */
	@ApiField("phone_number")
	private String phoneNumber;

	/**
	 * 产品code
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 风险标签
	 */
	@ApiListField("risk_labels")
	@ApiField("string")
	private List<String> riskLabels;

	/**
	 * 风险程度
	 */
	@ApiListField("risk_types")
	@ApiField("string")
	private List<String> riskTypes;

	/**
	 * 起始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 交互轮数
	 */
	@ApiField("total_round")
	private Long totalRound;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBatchBizId() {
		return this.batchBizId;
	}
	public void setBatchBizId(String batchBizId) {
		this.batchBizId = batchBizId;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getCommodityScene() {
		return this.commodityScene;
	}
	public void setCommodityScene(String commodityScene) {
		this.commodityScene = commodityScene;
	}

	public String getContentCode() {
		return this.contentCode;
	}
	public void setContentCode(String contentCode) {
		this.contentCode = contentCode;
	}

	public String getDialogue() {
		return this.dialogue;
	}
	public void setDialogue(String dialogue) {
		this.dialogue = dialogue;
	}

	public String getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getInteractResult() {
		return this.interactResult;
	}
	public void setInteractResult(String interactResult) {
		this.interactResult = interactResult;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<String> getRiskLabels() {
		return this.riskLabels;
	}
	public void setRiskLabels(List<String> riskLabels) {
		this.riskLabels = riskLabels;
	}

	public List<String> getRiskTypes() {
		return this.riskTypes;
	}
	public void setRiskTypes(List<String> riskTypes) {
		this.riskTypes = riskTypes;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Long getTotalRound() {
		return this.totalRound;
	}
	public void setTotalRound(Long totalRound) {
		this.totalRound = totalRound;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
