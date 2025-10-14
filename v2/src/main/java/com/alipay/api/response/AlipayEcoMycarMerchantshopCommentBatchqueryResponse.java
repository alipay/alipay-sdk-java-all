package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantshopCommentResult;
import com.alipay.api.domain.MerchantshopCommentStatistic;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.merchantshop.comment.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-08 10:17:40
 */
public class AlipayEcoMycarMerchantshopCommentBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7459476964829574134L;

	/** 
	 * 评论信息
	 */
	@ApiListField("comment_result")
	@ApiField("merchantshop_comment_result")
	private List<MerchantshopCommentResult> commentResult;

	/** 
	 * 评论统计信息
	 */
	@ApiField("comment_statistic")
	private MerchantshopCommentStatistic commentStatistic;

	public void setCommentResult(List<MerchantshopCommentResult> commentResult) {
		this.commentResult = commentResult;
	}
	public List<MerchantshopCommentResult> getCommentResult( ) {
		return this.commentResult;
	}

	public void setCommentStatistic(MerchantshopCommentStatistic commentStatistic) {
		this.commentStatistic = commentStatistic;
	}
	public MerchantshopCommentStatistic getCommentStatistic( ) {
		return this.commentStatistic;
	}

}
