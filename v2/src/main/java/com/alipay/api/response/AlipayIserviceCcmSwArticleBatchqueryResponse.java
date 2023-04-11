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
 * @since 1.0, 2023-04-03 10:06:46
 */
public class AlipayIserviceCcmSwArticleBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5193797538972296675L;

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
