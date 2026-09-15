package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 短剧信息编辑接口
 *
 * @author auto create
 * @since 1.0, 2026-09-04 10:58:40
 */
public class AlipaySocialBaseLifecreationShortplayModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4262134745391896982L;

	/**
	 * 短剧唯一标识（剧库ID）
	 */
	@ApiField("album_id")
	private String albumId;

	/**
	 * 封面媒资ID
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 剧集信息。如果不修改剧集信息，无需传入
	 */
	@ApiListField("episode_info_list")
	@ApiField("short_play_episode_info")
	private List<ShortPlayEpisodeInfo> episodeInfoList;

	/**
	 * 备案材料
注意： 短剧审核通过后，将不可修改
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

	public String getAlbumId() {
		return this.albumId;
	}
	public void setAlbumId(String albumId) {
		this.albumId = albumId;
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
