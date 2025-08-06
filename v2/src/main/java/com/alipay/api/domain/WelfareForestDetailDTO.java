package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 公益林详情信息
 *
 * @author auto create
 * @since 1.0, 2024-05-22 15:27:14
 */
public class WelfareForestDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 8891982668114679471L;

	/**
	 * 公益林奖励详情信息
	 */
	@ApiListField("reward_info_list")
	@ApiField("reward_d_t_o")
	private List<RewardDTO> rewardInfoList;

	/**
	 * 用户在该公益林下已经获得的奖励信息，本列表仅存储奖励编码，奖励详情请看reward_infos
	 */
	@ApiListField("rewarded_code_list")
	@ApiField("string")
	private List<String> rewardedCodeList;

	/**
	 * 公益林实体信息，包含该公益林所有配置相关内容
	 */
	@ApiField("welfare_forest_entity")
	private WelfareForestEntityDTO welfareForestEntity;

	/**
	 * 公益林个人浇水信息
	 */
	@ApiField("welfare_forest_person_water_info")
	private WelfareForestPersonWaterDTO welfareForestPersonWaterInfo;

	/**
	 * 公益林浇水统计数据，查询该林子相关的统计信息
	 */
	@ApiField("welfare_forest_water_summary_info")
	private WelfareForestWaterSummaryDTO welfareForestWaterSummaryInfo;

	public List<RewardDTO> getRewardInfoList() {
		return this.rewardInfoList;
	}
	public void setRewardInfoList(List<RewardDTO> rewardInfoList) {
		this.rewardInfoList = rewardInfoList;
	}

	public List<String> getRewardedCodeList() {
		return this.rewardedCodeList;
	}
	public void setRewardedCodeList(List<String> rewardedCodeList) {
		this.rewardedCodeList = rewardedCodeList;
	}

	public WelfareForestEntityDTO getWelfareForestEntity() {
		return this.welfareForestEntity;
	}
	public void setWelfareForestEntity(WelfareForestEntityDTO welfareForestEntity) {
		this.welfareForestEntity = welfareForestEntity;
	}

	public WelfareForestPersonWaterDTO getWelfareForestPersonWaterInfo() {
		return this.welfareForestPersonWaterInfo;
	}
	public void setWelfareForestPersonWaterInfo(WelfareForestPersonWaterDTO welfareForestPersonWaterInfo) {
		this.welfareForestPersonWaterInfo = welfareForestPersonWaterInfo;
	}

	public WelfareForestWaterSummaryDTO getWelfareForestWaterSummaryInfo() {
		return this.welfareForestWaterSummaryInfo;
	}
	public void setWelfareForestWaterSummaryInfo(WelfareForestWaterSummaryDTO welfareForestWaterSummaryInfo) {
		this.welfareForestWaterSummaryInfo = welfareForestWaterSummaryInfo;
	}

}
