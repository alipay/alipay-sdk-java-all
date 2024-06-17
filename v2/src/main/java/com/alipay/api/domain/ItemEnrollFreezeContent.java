package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报名活动状态及文案
 *
 * @author auto create
 * @since 1.0, 2024-05-22 14:47:18
 */
public class ItemEnrollFreezeContent extends AlipayObject {

	private static final long serialVersionUID = 3342448863645944131L;

	/**
	 * 是否参与直播秒杀
	 */
	@ApiField("in_live")
	private Boolean inLive;

	/**
	 * 是否投放招商
	 */
	@ApiField("item_enroll_flag")
	private Boolean itemEnrollFlag;

	/**
	 * 不允许编辑字段列表
	 */
	@ApiListField("no_edit_key_list")
	@ApiField("string")
	private List<String> noEditKeyList;

	/**
	 * 用于对外透出文案
	 */
	@ApiListField("no_edit_tip_list")
	@ApiField("string")
	private List<String> noEditTipList;

	/**
	 * 提示信息&跳转链接
	 */
	@ApiListField("tips_and_urls")
	@ApiField("tips_and_url")
	private List<TipsAndUrl> tipsAndUrls;

	public Boolean getInLive() {
		return this.inLive;
	}
	public void setInLive(Boolean inLive) {
		this.inLive = inLive;
	}

	public Boolean getItemEnrollFlag() {
		return this.itemEnrollFlag;
	}
	public void setItemEnrollFlag(Boolean itemEnrollFlag) {
		this.itemEnrollFlag = itemEnrollFlag;
	}

	public List<String> getNoEditKeyList() {
		return this.noEditKeyList;
	}
	public void setNoEditKeyList(List<String> noEditKeyList) {
		this.noEditKeyList = noEditKeyList;
	}

	public List<String> getNoEditTipList() {
		return this.noEditTipList;
	}
	public void setNoEditTipList(List<String> noEditTipList) {
		this.noEditTipList = noEditTipList;
	}

	public List<TipsAndUrl> getTipsAndUrls() {
		return this.tipsAndUrls;
	}
	public void setTipsAndUrls(List<TipsAndUrl> tipsAndUrls) {
		this.tipsAndUrls = tipsAndUrls;
	}

}
