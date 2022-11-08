package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 选点策略
 *
 * @author auto create
 * @since 1.0, 2022-01-10 20:25:04
 */
public class SiteStrategy extends AlipayObject {

	private static final long serialVersionUID = 4359397656859689552L;

	/**
	 * 点位距离，单位km
	 */
	@ApiField("distance")
	private Long distance;

	/**
	 * 市场屏投放类型
0-自投
1-互投
	 */
	@ApiField("market_screen_biz_type")
	private Long marketScreenBizType;

	/**
	 * 点位数量
	 */
	@ApiField("site_num")
	private Long siteNum;

	/**
	 * 互投场景下的指定不投放的点位列表（如自家屏幕），如果为空，投放点位不做限制
	 */
	@ApiListField("sn_black_list")
	@ApiField("string")
	private List<String> snBlackList;

	/**
	 * 自投场景下的指定投放的点位列表，如果为空，投放点位不做限制
	 */
	@ApiListField("sn_white_list")
	@ApiField("string")
	private List<String> snWhiteList;

	public Long getDistance() {
		return this.distance;
	}
	public void setDistance(Long distance) {
		this.distance = distance;
	}

	public Long getMarketScreenBizType() {
		return this.marketScreenBizType;
	}
	public void setMarketScreenBizType(Long marketScreenBizType) {
		this.marketScreenBizType = marketScreenBizType;
	}

	public Long getSiteNum() {
		return this.siteNum;
	}
	public void setSiteNum(Long siteNum) {
		this.siteNum = siteNum;
	}

	public List<String> getSnBlackList() {
		return this.snBlackList;
	}
	public void setSnBlackList(List<String> snBlackList) {
		this.snBlackList = snBlackList;
	}

	public List<String> getSnWhiteList() {
		return this.snWhiteList;
	}
	public void setSnWhiteList(List<String> snWhiteList) {
		this.snWhiteList = snWhiteList;
	}

}
