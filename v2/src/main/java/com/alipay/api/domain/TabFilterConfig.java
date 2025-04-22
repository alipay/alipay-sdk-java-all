package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * TabFilterConfig
 *
 * @author auto create
 * @since 1.0, 2024-05-21 16:15:22
 */
public class TabFilterConfig extends AlipayObject {

	private static final long serialVersionUID = 5877638587578517357L;

	/**
	 * 背景图
	 */
	@ApiField("background_img")
	private String backgroundImg;

	/**
	 * banner
	 */
	@ApiField("banner")
	private Banner banner;

	/**
	 * 数据统计
	 */
	@ApiField("data_count")
	private DataCount dataCount;

	/**
	 * 最小版本
	 */
	@ApiField("min_version_code")
	private String minVersionCode;

	/**
	 * 排行类型
	 */
	@ApiField("rank_data_type")
	private String rankDataType;

	/**
	 * 子tag列表
	 */
	@ApiListField("sub_tab_list")
	@ApiField("sub_tab_filter_config")
	private List<SubTabFilterConfig> subTabList;

	/**
	 * 子tab数据列表2
	 */
	@ApiListField("sub_tab_list_v2")
	@ApiField("sub_tab_filter_config")
	private List<SubTabFilterConfig> subTabListV2;

	/**
	 * 标签
	 */
	@ApiField("tag")
	private TabFilterTag tag;

	/**
	 * 标题
	 */
	@ApiField("title")
	private String title;

	public String getBackgroundImg() {
		return this.backgroundImg;
	}
	public void setBackgroundImg(String backgroundImg) {
		this.backgroundImg = backgroundImg;
	}

	public Banner getBanner() {
		return this.banner;
	}
	public void setBanner(Banner banner) {
		this.banner = banner;
	}

	public DataCount getDataCount() {
		return this.dataCount;
	}
	public void setDataCount(DataCount dataCount) {
		this.dataCount = dataCount;
	}

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

	public List<SubTabFilterConfig> getSubTabList() {
		return this.subTabList;
	}
	public void setSubTabList(List<SubTabFilterConfig> subTabList) {
		this.subTabList = subTabList;
	}

	public List<SubTabFilterConfig> getSubTabListV2() {
		return this.subTabListV2;
	}
	public void setSubTabListV2(List<SubTabFilterConfig> subTabListV2) {
		this.subTabListV2 = subTabListV2;
	}

	public TabFilterTag getTag() {
		return this.tag;
	}
	public void setTag(TabFilterTag tag) {
		this.tag = tag;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
