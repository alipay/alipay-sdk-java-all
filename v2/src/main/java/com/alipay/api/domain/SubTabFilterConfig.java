package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * SubTabFilterConfig
 *
 * @author auto create
 * @since 1.0, 2024-05-21 15:12:24
 */
public class SubTabFilterConfig extends AlipayObject {

	private static final long serialVersionUID = 4382372583535436391L;

	/**
	 * 版本
	 */
	@ApiField("min_version_code")
	private String minVersionCode;

	/**
	 * 排行榜数据类型
	 */
	@ApiField("rank_data_type")
	private String rankDataType;

	/**
	 * 子排行类型列表
	 */
	@ApiListField("sub_rank_type_list")
	@ApiField("sub_rank_tab_filter_config")
	private List<SubRankTabFilterConfig> subRankTypeList;

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

	public List<SubRankTabFilterConfig> getSubRankTypeList() {
		return this.subRankTypeList;
	}
	public void setSubRankTypeList(List<SubRankTabFilterConfig> subRankTypeList) {
		this.subRankTypeList = subRankTypeList;
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
