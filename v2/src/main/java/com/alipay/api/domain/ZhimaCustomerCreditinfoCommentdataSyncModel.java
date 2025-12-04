package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 客户评价数据回传
 *
 * @author auto create
 * @since 1.0, 2025-09-02 21:41:24
 */
public class ZhimaCustomerCreditinfoCommentdataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1132479454126247129L;

	/**
	 * 高德侧传入的本次评价单号
	 */
	@ApiField("comment_no")
	private String commentNo;

	/**
	 * 评价的状态标签值
	 */
	@ApiField("comment_tag")
	private String commentTag;

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

	public String getCommentNo() {
		return this.commentNo;
	}
	public void setCommentNo(String commentNo) {
		this.commentNo = commentNo;
	}

	public String getCommentTag() {
		return this.commentTag;
	}
	public void setCommentTag(String commentTag) {
		this.commentTag = commentTag;
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
