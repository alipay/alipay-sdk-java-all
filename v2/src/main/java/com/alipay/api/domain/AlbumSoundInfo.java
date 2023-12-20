package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 专辑内声音信息
 *
 * @author auto create
 * @since 1.0, 2023-01-04 19:12:31
 */
public class AlbumSoundInfo extends AlipayObject {

	private static final long serialVersionUID = 5796487493165253423L;

	/**
	 * 该声音完整播放时长，单位秒
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 若声音支持试听，该字段传入可试听时长，单位秒
	 */
	@ApiField("sample_duration")
	private Long sampleDuration;

	/**
	 * 收费专辑必传，该字段表示收费专辑下，声音是否可免费完整畅听。（例如前3集可免费听）
	 */
	@ApiField("sound_free")
	private Boolean soundFree;

	/**
	 * 声音ID，合作方内部可唯一标识一个声音。
	 */
	@ApiField("sound_id")
	private String soundId;

	/**
	 * 声音名称，可对C端用户展示
	 */
	@ApiField("sound_name")
	private String soundName;

	/**
	 * 1，默认ADD，专辑新增录入时可不填
2，仅用于专辑内声音变更时传入，例如专辑A内声音1需删除，则album_operate_type传入UPDATE，sound_operate_type传入DELETE，同时传入sound_id=1；
	 */
	@ApiField("sound_operate_type")
	private String soundOperateType;

	/**
	 * 专辑内声音排序，数字越小越靠前。
	 */
	@ApiField("sound_order")
	private Long soundOrder;

	/**
	 * 声音标签列表，有则填入
	 */
	@ApiListField("sound_tags")
	@ApiField("string")
	private List<String> soundTags;

	/**
	 * 收费专辑必填，该字段表示收费专辑下，未购买的声音是否支持试听（例如试听2分钟）
	 */
	@ApiField("support_sample")
	private Boolean supportSample;

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Long getSampleDuration() {
		return this.sampleDuration;
	}
	public void setSampleDuration(Long sampleDuration) {
		this.sampleDuration = sampleDuration;
	}

	public Boolean getSoundFree() {
		return this.soundFree;
	}
	public void setSoundFree(Boolean soundFree) {
		this.soundFree = soundFree;
	}

	public String getSoundId() {
		return this.soundId;
	}
	public void setSoundId(String soundId) {
		this.soundId = soundId;
	}

	public String getSoundName() {
		return this.soundName;
	}
	public void setSoundName(String soundName) {
		this.soundName = soundName;
	}

	public String getSoundOperateType() {
		return this.soundOperateType;
	}
	public void setSoundOperateType(String soundOperateType) {
		this.soundOperateType = soundOperateType;
	}

	public Long getSoundOrder() {
		return this.soundOrder;
	}
	public void setSoundOrder(Long soundOrder) {
		this.soundOrder = soundOrder;
	}

	public List<String> getSoundTags() {
		return this.soundTags;
	}
	public void setSoundTags(List<String> soundTags) {
		this.soundTags = soundTags;
	}

	public Boolean getSupportSample() {
		return this.supportSample;
	}
	public void setSupportSample(Boolean supportSample) {
		this.supportSample = supportSample;
	}

}
