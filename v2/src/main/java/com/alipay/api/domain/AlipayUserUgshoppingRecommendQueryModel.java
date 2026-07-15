package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品推荐
 *
 * @author auto create
 * @since 1.0, 2026-07-02 14:17:56
 */
public class AlipayUserUgshoppingRecommendQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8567847546472287771L;

	/**
	 * 渠道号
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * null
	 */
	@ApiListField("filter_item_ids")
	@ApiField("string")
	private List<String> filterItemIds;

	/**
	 * 开放平台用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 请求页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public List<String> getFilterItemIds() {
		return this.filterItemIds;
	}
	public void setFilterItemIds(List<String> filterItemIds) {
		this.filterItemIds = filterItemIds;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
