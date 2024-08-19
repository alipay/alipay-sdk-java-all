package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RewardDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.welfareforest.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:10
 */
public class AlipaySocialAntforestWelfareforestTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 5169326272653393167L;

	/** 
	 * 本次实际浇水能量g数
	 */
	@ApiField("effect_energy")
	private Long effectEnergy;

	/** 
	 * 如果入参bizNo发生幂等，则森林侧不会进行写入操作，本字段会被标记为true，同时返回用户当前公益林已经获得的所有奖励
	 */
	@ApiField("idempotent")
	private Boolean idempotent;

	/** 
	 * 用户在本次浇水操作新获得的奖励id列表（如果幂等，这个为空）
	 */
	@ApiListField("reward_code_list_after_water")
	@ApiField("string")
	private List<String> rewardCodeListAfterWater;

	/** 
	 * 公益林所有的奖励信息（幂等也会正常返回数据）
	 */
	@ApiListField("reward_info_list")
	@ApiField("reward_d_t_o")
	private List<RewardDTO> rewardInfoList;

	/** 
	 * 已经获得的奖励列表（如果幂等，如果有数据的话这个也会返回数据）
	 */
	@ApiListField("rewarded_code_list")
	@ApiField("string")
	private List<String> rewardedCodeList;

	public void setEffectEnergy(Long effectEnergy) {
		this.effectEnergy = effectEnergy;
	}
	public Long getEffectEnergy( ) {
		return this.effectEnergy;
	}

	public void setIdempotent(Boolean idempotent) {
		this.idempotent = idempotent;
	}
	public Boolean getIdempotent( ) {
		return this.idempotent;
	}

	public void setRewardCodeListAfterWater(List<String> rewardCodeListAfterWater) {
		this.rewardCodeListAfterWater = rewardCodeListAfterWater;
	}
	public List<String> getRewardCodeListAfterWater( ) {
		return this.rewardCodeListAfterWater;
	}

	public void setRewardInfoList(List<RewardDTO> rewardInfoList) {
		this.rewardInfoList = rewardInfoList;
	}
	public List<RewardDTO> getRewardInfoList( ) {
		return this.rewardInfoList;
	}

	public void setRewardedCodeList(List<String> rewardedCodeList) {
		this.rewardedCodeList = rewardedCodeList;
	}
	public List<String> getRewardedCodeList( ) {
		return this.rewardedCodeList;
	}

}
