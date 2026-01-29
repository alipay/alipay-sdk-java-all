package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 客户评价数据回传
 *
 * @author auto create
 * @since 1.0, 2026-01-08 10:43:28
 */
public class ZhimaCustomerCreditinfoCommentdataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1672494519844382675L;

	/**
	 * 针对评价字数、评价图片数据、评价视频时长的质量描述
	 */
	@ApiField("comment_desc")
	private String commentDesc;

	/**
	 * 高德侧传入的本次评价单号
	 */
	@ApiField("comment_no")
	private String commentNo;

	/**
	 * 评价来源信息，业务接入分配
	 */
	@ApiField("comment_source")
	private String commentSource;

	/**
	 * 评价的状态标签值
	 */
	@ApiField("comment_tag")
	private String commentTag;

	/**
	 * true代表包含真实标签，false标签不包含真实标签
	 */
	@ApiField("has_real_label")
	private Boolean hasRealLabel;

	/**
	 * 商户外部单号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	/**
	 * 真实性标签
	 */
	@ApiListField("real_label")
	@ApiField("string")
	private List<String> realLabel;

	/**
	 * 总分100分制，具体的打分分数
	 */
	@ApiField("user_score")
	private String userScore;

	public String getCommentDesc() {
		return this.commentDesc;
	}
	public void setCommentDesc(String commentDesc) {
		this.commentDesc = commentDesc;
	}

	public String getCommentNo() {
		return this.commentNo;
	}
	public void setCommentNo(String commentNo) {
		this.commentNo = commentNo;
	}

	public String getCommentSource() {
		return this.commentSource;
	}
	public void setCommentSource(String commentSource) {
		this.commentSource = commentSource;
	}

	public String getCommentTag() {
		return this.commentTag;
	}
	public void setCommentTag(String commentTag) {
		this.commentTag = commentTag;
	}

	public Boolean getHasRealLabel() {
		return this.hasRealLabel;
	}
	public void setHasRealLabel(Boolean hasRealLabel) {
		this.hasRealLabel = hasRealLabel;
	}

	public String getOutAgreementNo() {
		return this.outAgreementNo;
	}
	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}

	public List<String> getRealLabel() {
		return this.realLabel;
	}
	public void setRealLabel(List<String> realLabel) {
		this.realLabel = realLabel;
	}

	public String getUserScore() {
		return this.userScore;
	}
	public void setUserScore(String userScore) {
		this.userScore = userScore;
	}

}
