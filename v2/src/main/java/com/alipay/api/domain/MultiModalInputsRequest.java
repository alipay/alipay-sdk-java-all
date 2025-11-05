package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝士饼对话多模态输入参数类
 *
 * @author auto create
 * @since 1.0, 2025-07-11 14:46:41
 */
public class MultiModalInputsRequest extends AlipayObject {

	private static final long serialVersionUID = 2459677721966774614L;

	/**
	 * 当前对话音频信息
	 */
	@ApiField("current_chat_audio")
	private CurrentChatAudio currentChatAudio;

	/**
	 * 当前对话多个音频
	 */
	@ApiField("current_chat_audios")
	private CurrentChatAudios currentChatAudios;

	/**
	 * 当前对话单个文件信息
	 */
	@ApiField("current_chat_file")
	private CurrentChatFile currentChatFile;

	/**
	 * 当前对话多个文件信息
	 */
	@ApiField("current_chat_files")
	private CurrentChatFiles currentChatFiles;

	/**
	 * 当前对话单个视频信息
	 */
	@ApiField("current_chat_video")
	private CurrentChatVideo currentChatVideo;

	/**
	 * 当前对话多个视频信息
	 */
	@ApiField("current_chat_videos")
	private CurrentChatVideos currentChatVideos;

	/**
	 * 上传到atfs后的图片文件 ID 列表
	 */
	@ApiListField("images")
	@ApiField("string")
	private List<String> images;

	public CurrentChatAudio getCurrentChatAudio() {
		return this.currentChatAudio;
	}
	public void setCurrentChatAudio(CurrentChatAudio currentChatAudio) {
		this.currentChatAudio = currentChatAudio;
	}

	public CurrentChatAudios getCurrentChatAudios() {
		return this.currentChatAudios;
	}
	public void setCurrentChatAudios(CurrentChatAudios currentChatAudios) {
		this.currentChatAudios = currentChatAudios;
	}

	public CurrentChatFile getCurrentChatFile() {
		return this.currentChatFile;
	}
	public void setCurrentChatFile(CurrentChatFile currentChatFile) {
		this.currentChatFile = currentChatFile;
	}

	public CurrentChatFiles getCurrentChatFiles() {
		return this.currentChatFiles;
	}
	public void setCurrentChatFiles(CurrentChatFiles currentChatFiles) {
		this.currentChatFiles = currentChatFiles;
	}

	public CurrentChatVideo getCurrentChatVideo() {
		return this.currentChatVideo;
	}
	public void setCurrentChatVideo(CurrentChatVideo currentChatVideo) {
		this.currentChatVideo = currentChatVideo;
	}

	public CurrentChatVideos getCurrentChatVideos() {
		return this.currentChatVideos;
	}
	public void setCurrentChatVideos(CurrentChatVideos currentChatVideos) {
		this.currentChatVideos = currentChatVideos;
	}

	public List<String> getImages() {
		return this.images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}

}
