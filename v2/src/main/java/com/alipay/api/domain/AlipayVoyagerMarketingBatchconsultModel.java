package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * voyager营销批量咨询接口
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:47:54
 */
public class AlipayVoyagerMarketingBatchconsultModel extends AlipayObject {

	private static final long serialVersionUID = 5351486599164822188L;

	/**
	 * AGENT / GUI，为空默认 GUI
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 环境信息
	 */
	@ApiField("env_info")
	private VoyagerEnvInfo envInfo;

	/**
	 * null
	 */
	@ApiListField("goods_info_list")
	@ApiField("voyager_goods_info")
	private List<VoyagerGoodsInfo> goodsInfoList;

	/**
	 * 行业标识
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 多语言
	 */
	@ApiField("language")
	private String language;

	/**
	 * 用户 openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户 2088 UID
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public VoyagerEnvInfo getEnvInfo() {
		return this.envInfo;
	}
	public void setEnvInfo(VoyagerEnvInfo envInfo) {
		this.envInfo = envInfo;
	}

	public List<VoyagerGoodsInfo> getGoodsInfoList() {
		return this.goodsInfoList;
	}
	public void setGoodsInfoList(List<VoyagerGoodsInfo> goodsInfoList) {
		this.goodsInfoList = goodsInfoList;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getLanguage() {
		return this.language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
