package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务评价待评价列表算法打分
 *
 * @author auto create
 * @since 1.0, 2020-04-29 21:37:46
 */
public class AlipayOpenAppAraterWaitratealgorankQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8566919385843768541L;

	/**
	 * 业务扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 集团统一会员ID
	 */
	@ApiField("havana_id")
	private String havanaId;

	/**
	 * 算法打分列表
	 */
	@ApiListField("item_list")
	@ApiField("wait_rate_algo_item")
	private List<WaitRateAlgoItem> itemList;

	/**
	 * 支付宝userId倒数2-3位
	 */
	@ApiField("route_uid")
	private String routeUid;

	/**
	 * 本次session已点击的itemIds
	 */
	@ApiListField("session_click_item_ids")
	@ApiField("string")
	private List<String> sessionClickItemIds;

	/**
	 * 本次session已曝光的itemIds
	 */
	@ApiListField("session_expo_item_ids")
	@ApiField("string")
	private List<String> sessionExpoItemIds;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getHavanaId() {
		return this.havanaId;
	}
	public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
	}

	public List<WaitRateAlgoItem> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<WaitRateAlgoItem> itemList) {
		this.itemList = itemList;
	}

	public String getRouteUid() {
		return this.routeUid;
	}
	public void setRouteUid(String routeUid) {
		this.routeUid = routeUid;
	}

	public List<String> getSessionClickItemIds() {
		return this.sessionClickItemIds;
	}
	public void setSessionClickItemIds(List<String> sessionClickItemIds) {
		this.sessionClickItemIds = sessionClickItemIds;
	}

	public List<String> getSessionExpoItemIds() {
		return this.sessionExpoItemIds;
	}
	public void setSessionExpoItemIds(List<String> sessionExpoItemIds) {
		this.sessionExpoItemIds = sessionExpoItemIds;
	}

}
