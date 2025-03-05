package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AvatarVO;
import com.alipay.api.domain.AvatarAnimationVO;
import com.alipay.api.domain.StageSceneryVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.account.zavatar.avatar.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:33
 */
public class AlipayUserAccountZavatarAvatarQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7689891843817476756L;

	/** 
	 * 用户保存数字形象信息
	 */
	@ApiField("cust_avatar_vo")
	private AvatarVO custAvatarVo;

	/** 
	 * 场景中的默认动画信息
	 */
	@ApiListField("default_animation_v_os")
	@ApiField("avatar_animation_v_o")
	private List<AvatarAnimationVO> defaultAnimationVOs;

	/** 
	 * 场景的默认布景信息
	 */
	@ApiListField("default_stage_scenery_v_os")
	@ApiField("stage_scenery_v_o")
	private List<StageSceneryVO> defaultStageSceneryVOs;

	/** 
	 * 用户数字人id
	 */
	@ApiField("digital_human_id")
	private String digitalHumanId;

	/** 
	 * 场景下的默认虚拟形象信息
	 */
	@ApiListField("init_avatar_v_os")
	@ApiField("avatar_v_o")
	private List<AvatarVO> initAvatarVOs;

	/** 
	 * 返回的形象模型层级
	 */
	@ApiField("model_level")
	private String modelLevel;

	/** 
	 * 场景中可以选择的动画信息
	 */
	@ApiListField("optional_animation_v_os")
	@ApiField("avatar_animation_v_o")
	private List<AvatarAnimationVO> optionalAnimationVOs;

	/** 
	 * 数字人场景可选布景
	 */
	@ApiListField("optional_stage_scenery_v_os")
	@ApiField("stage_scenery_v_o")
	private List<StageSceneryVO> optionalStageSceneryVOs;

	public void setCustAvatarVo(AvatarVO custAvatarVo) {
		this.custAvatarVo = custAvatarVo;
	}
	public AvatarVO getCustAvatarVo( ) {
		return this.custAvatarVo;
	}

	public void setDefaultAnimationVOs(List<AvatarAnimationVO> defaultAnimationVOs) {
		this.defaultAnimationVOs = defaultAnimationVOs;
	}
	public List<AvatarAnimationVO> getDefaultAnimationVOs( ) {
		return this.defaultAnimationVOs;
	}

	public void setDefaultStageSceneryVOs(List<StageSceneryVO> defaultStageSceneryVOs) {
		this.defaultStageSceneryVOs = defaultStageSceneryVOs;
	}
	public List<StageSceneryVO> getDefaultStageSceneryVOs( ) {
		return this.defaultStageSceneryVOs;
	}

	public void setDigitalHumanId(String digitalHumanId) {
		this.digitalHumanId = digitalHumanId;
	}
	public String getDigitalHumanId( ) {
		return this.digitalHumanId;
	}

	public void setInitAvatarVOs(List<AvatarVO> initAvatarVOs) {
		this.initAvatarVOs = initAvatarVOs;
	}
	public List<AvatarVO> getInitAvatarVOs( ) {
		return this.initAvatarVOs;
	}

	public void setModelLevel(String modelLevel) {
		this.modelLevel = modelLevel;
	}
	public String getModelLevel( ) {
		return this.modelLevel;
	}

	public void setOptionalAnimationVOs(List<AvatarAnimationVO> optionalAnimationVOs) {
		this.optionalAnimationVOs = optionalAnimationVOs;
	}
	public List<AvatarAnimationVO> getOptionalAnimationVOs( ) {
		return this.optionalAnimationVOs;
	}

	public void setOptionalStageSceneryVOs(List<StageSceneryVO> optionalStageSceneryVOs) {
		this.optionalStageSceneryVOs = optionalStageSceneryVOs;
	}
	public List<StageSceneryVO> getOptionalStageSceneryVOs( ) {
		return this.optionalStageSceneryVOs;
	}

}
