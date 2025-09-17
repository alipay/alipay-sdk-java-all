package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘联盟zy测试
 *
 * @author auto create
 * @since 1.0, 2020-09-14 10:21:37
 */
public class AlipayOpenMiniResourcePromotionsourceNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 6658752552968711123L;

	/**
	 * 媒体唤起时传入的支付宝id
	 */
	@ApiField("author_id")
	private String authorId;

	/**
	 * 媒体唤起时提供的额外参数值列表，这里可能有多个值，打平以后拼入。即url_decode(authcbparams)
	 */
	@ApiField("params")
	private String params;

	/**
	 * 推广位id
	 */
	@ApiField("promotion_id")
	private String promotionId;

	/**
	 * 推广位名称
	 */
	@ApiField("promotion_name")
	private String promotionName;

	/**
	 * 媒体来源，标识调用方
	 */
	@ApiField("source")
	private String source;

	public String getAuthorId() {
		return this.authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

	public String getPromotionId() {
		return this.promotionId;
	}
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}

	public String getPromotionName() {
		return this.promotionName;
	}
	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
