package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人群扩展接口
 *
 * @author auto create
 * @since 1.0, 2025-03-17 10:35:41
 */
public class AlipayMerchantQipanCrowdSpreadModel extends AlipayObject {

	private static final long serialVersionUID = 3128925759332364798L;

	/**
	 * 安全应用范围，参考文档 <a href="https://opendocs.alipay.com/open/04zfa9?pathHash=f4809e98">安全应用范围枚举</a>
未传值或传入渠道均非法时 采用默认渠道，默认渠道：支付结果页AA、繁星激励。
传入值时，以商户入参为准。
	 */
	@ApiListField("apply_channel_list")
	@ApiField("string")
	private List<String> applyChannelList;

	/**
	 * 扩展人群
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 是否包含种子人群
	 */
	@ApiField("is_include_seed")
	private Boolean isIncludeSeed;

	/**
	 * 种子人群编号
	 */
	@ApiField("seed_crowd_code")
	private String seedCrowdCode;

	/**
	 * 扩展数量
	 */
	@ApiField("spread_count")
	private String spreadCount;

	public List<String> getApplyChannelList() {
		return this.applyChannelList;
	}
	public void setApplyChannelList(List<String> applyChannelList) {
		this.applyChannelList = applyChannelList;
	}

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public Boolean getIsIncludeSeed() {
		return this.isIncludeSeed;
	}
	public void setIsIncludeSeed(Boolean isIncludeSeed) {
		this.isIncludeSeed = isIncludeSeed;
	}

	public String getSeedCrowdCode() {
		return this.seedCrowdCode;
	}
	public void setSeedCrowdCode(String seedCrowdCode) {
		this.seedCrowdCode = seedCrowdCode;
	}

	public String getSpreadCount() {
		return this.spreadCount;
	}
	public void setSpreadCount(String spreadCount) {
		this.spreadCount = spreadCount;
	}

}
