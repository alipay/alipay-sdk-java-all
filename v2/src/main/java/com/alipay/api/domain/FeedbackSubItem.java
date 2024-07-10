package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 评分子项
 *
 * @author auto create
 * @since 1.0, 2019-10-23 19:03:02
 */
public class FeedbackSubItem extends AlipayObject {

	private static final long serialVersionUID = 3891296218738466984L;

	/**
	 * 评价子项的评分
	 */
	@ApiField("score")
	private String score;

	/**
	 * 评价子项的描述
	 */
	@ApiField("sub_item_desc")
	private String subItemDesc;

	/**
	 * 评价子项的key
	 */
	@ApiField("sub_item_key")
	private String subItemKey;

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	public String getSubItemDesc() {
		return this.subItemDesc;
	}
	public void setSubItemDesc(String subItemDesc) {
		this.subItemDesc = subItemDesc;
	}

	public String getSubItemKey() {
		return this.subItemKey;
	}
	public void setSubItemKey(String subItemKey) {
		this.subItemKey = subItemKey;
	}

}
