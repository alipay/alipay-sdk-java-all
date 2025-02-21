package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * SubRankTabFilterConfig
 *
 * @author auto create
 * @since 1.0, 2024-05-21 15:04:26
 */
public class SubRankTabFilterConfig extends AlipayObject {

	private static final long serialVersionUID = 2423273959194611158L;

	/**
	 * 版本
	 */
	@ApiField("min_version_code")
	private String minVersionCode;

	/**
	 * 排行数据类型
	 */
	@ApiField("rank_data_type")
	private String rankDataType;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 冬测
	 */
	@ApiField("winter_eval")
	private String winterEval;

	public String getMinVersionCode() {
		return this.minVersionCode;
	}
	public void setMinVersionCode(String minVersionCode) {
		this.minVersionCode = minVersionCode;
	}

	public String getRankDataType() {
		return this.rankDataType;
	}
	public void setRankDataType(String rankDataType) {
		this.rankDataType = rankDataType;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getWinterEval() {
		return this.winterEval;
	}
	public void setWinterEval(String winterEval) {
		this.winterEval = winterEval;
	}

}
