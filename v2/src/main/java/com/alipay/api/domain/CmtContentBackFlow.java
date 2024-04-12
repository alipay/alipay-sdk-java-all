package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查询某appid订单评价，返回值list中的复杂对象
 *
 * @author auto create
 * @since 1.0, 2023-04-24 23:27:37
 */
public class CmtContentBackFlow extends AlipayObject {

	private static final long serialVersionUID = 4433182257278119769L;

	/**
	 * 订单的评价状态 ,此处只返回评价的基础状态
	 */
	@ApiField("cmt_status")
	private String cmtStatus;

	/**
	 * 订单主观评价内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 外部订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 内容评价图片链接列表
	 */
	@ApiListField("pictures")
	@ApiField("string")
	private List<String> pictures;

	/**
	 * 若拉取兜底模版则无子维度评价明细列表
	 */
	@ApiListField("score_details")
	@ApiField("score_detail_info")
	private List<ScoreDetailInfo> scoreDetails;

	/**
	 * 评级总分
	 */
	@ApiField("total_score")
	private Long totalScore;

	/**
	 * 评价总分对应用户选择标签
	 */
	@ApiListField("total_score_label")
	@ApiField("string")
	private List<String> totalScoreLabel;

	public String getCmtStatus() {
		return this.cmtStatus;
	}
	public void setCmtStatus(String cmtStatus) {
		this.cmtStatus = cmtStatus;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public List<String> getPictures() {
		return this.pictures;
	}
	public void setPictures(List<String> pictures) {
		this.pictures = pictures;
	}

	public List<ScoreDetailInfo> getScoreDetails() {
		return this.scoreDetails;
	}
	public void setScoreDetails(List<ScoreDetailInfo> scoreDetails) {
		this.scoreDetails = scoreDetails;
	}

	public Long getTotalScore() {
		return this.totalScore;
	}
	public void setTotalScore(Long totalScore) {
		this.totalScore = totalScore;
	}

	public List<String> getTotalScoreLabel() {
		return this.totalScoreLabel;
	}
	public void setTotalScoreLabel(List<String> totalScoreLabel) {
		this.totalScoreLabel = totalScoreLabel;
	}

}
