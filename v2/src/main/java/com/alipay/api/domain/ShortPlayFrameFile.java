package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 短剧视频截帧内容
 *
 * @author auto create
 * @since 1.0, 2025-05-09 13:05:22
 */
public class ShortPlayFrameFile extends AlipayObject {

	private static final long serialVersionUID = 6873533944546782663L;

	/**
	 * 第几季的第几集，例如第一季第15集记作1S_15
	 */
	@ApiField("episode_num")
	private String episodeNum;

	/**
	 * 每一集的截帧图片压缩后将压缩文件上传得到的文件Id，每一集一个文件，同一集多次上传会被覆盖更新
	 */
	@ApiField("file_id")
	private String fileId;

	public String getEpisodeNum() {
		return this.episodeNum;
	}
	public void setEpisodeNum(String episodeNum) {
		this.episodeNum = episodeNum;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

}
