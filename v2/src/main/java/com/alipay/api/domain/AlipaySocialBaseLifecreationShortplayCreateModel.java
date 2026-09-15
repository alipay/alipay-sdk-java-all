package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 短剧创建接口
 *
 * @author auto create
 * @since 1.0, 2026-09-04 10:59:14
 */
public class AlipaySocialBaseLifecreationShortplayCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7664873431243892172L;

	/**
	 * 广电备案号。
真人制作费用 ≥ 100 万，或 AI/动画类制作费用 ≥ 30 万时 必填
上线商家小程序 必填
注意：备案号有值提交后，将不可修改
	 */
	@ApiField("broadcast_record_number")
	private String broadcastRecordNumber;

	/**
	 * 封面媒资ID（支付宝 alipay.open.file.upload 接口返回的 file_id）
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 剧集列表
	 */
	@ApiListField("episode_info_list")
	@ApiField("short_play_episode_info")
	private List<ShortPlayEpisodeInfo> episodeInfoList;

	/**
	 * 备案材料
	 */
	@ApiField("record_material")
	private ShortPlayRecordMaterial recordMaterial;

	/**
	 * 标签列表，如 ["甜宠", "逆袭", "都市"]
	 */
	@ApiListField("tag_list")
	@ApiField("string")
	private List<String> tagList;

	/**
	 * 短剧名称，2~20 个字（英文和符号计 0.5 字）
	 */
	@ApiField("title")
	private String title;

	public String getBroadcastRecordNumber() {
		return this.broadcastRecordNumber;
	}
	public void setBroadcastRecordNumber(String broadcastRecordNumber) {
		this.broadcastRecordNumber = broadcastRecordNumber;
	}

	public String getCover() {
		return this.cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}

	public List<ShortPlayEpisodeInfo> getEpisodeInfoList() {
		return this.episodeInfoList;
	}
	public void setEpisodeInfoList(List<ShortPlayEpisodeInfo> episodeInfoList) {
		this.episodeInfoList = episodeInfoList;
	}

	public ShortPlayRecordMaterial getRecordMaterial() {
		return this.recordMaterial;
	}
	public void setRecordMaterial(ShortPlayRecordMaterial recordMaterial) {
		this.recordMaterial = recordMaterial;
	}

	public List<String> getTagList() {
		return this.tagList;
	}
	public void setTagList(List<String> tagList) {
		this.tagList = tagList;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
