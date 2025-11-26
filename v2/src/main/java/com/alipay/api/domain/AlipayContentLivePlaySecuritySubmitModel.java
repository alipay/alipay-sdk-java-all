package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 直播间玩法内容送审
 *
 * @author auto create
 * @since 1.0, 2025-11-13 15:43:38
 */
public class AlipayContentLivePlaySecuritySubmitModel extends AlipayObject {

	private static final long serialVersionUID = 8365547923544354317L;

	/**
	 * 支付宝直播id
	 */
	@ApiField("alipay_live_id")
	private String alipayLiveId;

	/**
	 * 行业标识
	 */
	@ApiField("domain")
	private String domain;

	/**
	 * 用于标识业务请求的id
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 小蓝车内容
	 */
	@ApiListField("pocket_item_list")
	@ApiField("live_play_security_pocket_info")
	private List<LivePlaySecurityPocketInfo> pocketItemList;

	public String getAlipayLiveId() {
		return this.alipayLiveId;
	}
	public void setAlipayLiveId(String alipayLiveId) {
		this.alipayLiveId = alipayLiveId;
	}

	public String getDomain() {
		return this.domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public List<LivePlaySecurityPocketInfo> getPocketItemList() {
		return this.pocketItemList;
	}
	public void setPocketItemList(List<LivePlaySecurityPocketInfo> pocketItemList) {
		this.pocketItemList = pocketItemList;
	}

}
