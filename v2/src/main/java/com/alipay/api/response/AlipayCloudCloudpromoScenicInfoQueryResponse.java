package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ScenicAudioCardDTO;
import com.alipay.api.domain.MarkDTO;
import com.alipay.api.domain.ScenicAllBaseDTO;
import com.alipay.api.domain.SuggestScenicVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.scenic.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:27
 */
public class AlipayCloudCloudpromoScenicInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3765862283123196816L;

	/** 
	 * 租户ID
	 */
	@ApiField("agent_id")
	private String agentId;

	/** 
	 * 音频介绍卡片1
	 */
	@ApiField("audio_card_vo")
	private ScenicAudioCardDTO audioCardVo;

	/** 
	 * null
	 */
	@ApiListField("cdn_video_url")
	@ApiField("string")
	private List<String> cdnVideoUrl;

	/** 
	 * null
	 */
	@ApiListField("fun_exploration")
	@ApiField("string")
	private List<String> funExploration;

	/** 
	 * null
	 */
	@ApiListField("historical_curiosities")
	@ApiField("string")
	private List<String> historicalCuriosities;

	/** 
	 * 印记
	 */
	@ApiField("mark_vo")
	private MarkDTO markVo;

	/** 
	 * null
	 */
	@ApiListField("photo_suggest_image_list")
	@ApiField("string")
	private List<String> photoSuggestImageList;

	/** 
	 * 场景id
	 */
	@ApiField("scene_id")
	private String sceneId;

	/** 
	 * 景区基础信息
	 */
	@ApiField("scenic_base_vo")
	private ScenicAllBaseDTO scenicBaseVo;

	/** 
	 * null
	 */
	@ApiListField("suggest_scenic_vos")
	@ApiField("suggest_scenic_v_o")
	private List<SuggestScenicVO> suggestScenicVos;

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getAgentId( ) {
		return this.agentId;
	}

	public void setAudioCardVo(ScenicAudioCardDTO audioCardVo) {
		this.audioCardVo = audioCardVo;
	}
	public ScenicAudioCardDTO getAudioCardVo( ) {
		return this.audioCardVo;
	}

	public void setCdnVideoUrl(List<String> cdnVideoUrl) {
		this.cdnVideoUrl = cdnVideoUrl;
	}
	public List<String> getCdnVideoUrl( ) {
		return this.cdnVideoUrl;
	}

	public void setFunExploration(List<String> funExploration) {
		this.funExploration = funExploration;
	}
	public List<String> getFunExploration( ) {
		return this.funExploration;
	}

	public void setHistoricalCuriosities(List<String> historicalCuriosities) {
		this.historicalCuriosities = historicalCuriosities;
	}
	public List<String> getHistoricalCuriosities( ) {
		return this.historicalCuriosities;
	}

	public void setMarkVo(MarkDTO markVo) {
		this.markVo = markVo;
	}
	public MarkDTO getMarkVo( ) {
		return this.markVo;
	}

	public void setPhotoSuggestImageList(List<String> photoSuggestImageList) {
		this.photoSuggestImageList = photoSuggestImageList;
	}
	public List<String> getPhotoSuggestImageList( ) {
		return this.photoSuggestImageList;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}
	public String getSceneId( ) {
		return this.sceneId;
	}

	public void setScenicBaseVo(ScenicAllBaseDTO scenicBaseVo) {
		this.scenicBaseVo = scenicBaseVo;
	}
	public ScenicAllBaseDTO getScenicBaseVo( ) {
		return this.scenicBaseVo;
	}

	public void setSuggestScenicVos(List<SuggestScenicVO> suggestScenicVos) {
		this.suggestScenicVos = suggestScenicVos;
	}
	public List<SuggestScenicVO> getSuggestScenicVos( ) {
		return this.suggestScenicVos;
	}

}
