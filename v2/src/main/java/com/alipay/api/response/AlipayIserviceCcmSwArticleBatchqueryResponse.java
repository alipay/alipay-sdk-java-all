package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ArticleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.article.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:00:56
 */
public class AlipayIserviceCcmSwArticleBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5312654362537636541L;

	/** 
	 * 文章信息
	 */
	@ApiListField("articles")
	@ApiField("article_info")
	private List<ArticleInfo> articles;

	public void setArticles(List<ArticleInfo> articles) {
		this.articles = articles;
	}
	public List<ArticleInfo> getArticles( ) {
		return this.articles;
	}

}
